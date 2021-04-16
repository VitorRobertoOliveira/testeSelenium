import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class OlaMundoTest {

    @Test
    public void testOlaMundo() {
        Response response = request(Method.GET, "http://restapi.wcaquino.me/ola");
        assertTrue(response.getBody().asString().equals("Ola Mundo!"));
        assertTrue(response.statusCode() == 200);
        assertTrue("O status deveria ser 200", response.statusCode() == 200);
        assertEquals(200, response.statusCode());

        ValidatableResponse validacao = response.then();
        validacao.statusCode(200);
    }

    @Test
    public void devoConhecerOutrasFormasRestAssured() {
        given()
                // Pré condições
                .when()
                    .get("http://restapi.wcaquino.me/ola")
                .then()
                    .statusCode(200);
    }

    @Test
    public void devoConhecerMatchersHamcrest() {
        assertThat("Maria", is("Maria"));
        assertThat(128, is(128));
        assertThat(128, isA(Integer.class));
        assertThat(128d, isA(Double.class));
        assertThat(128d, greaterThan(120d));
        assertThat(128d, lessThan(130d));

        // Trabalhando com listas
        List<Integer> impares = Arrays.asList(1,3,5,7,9);
        assertThat(impares, hasSize(5)); // Verifica o tamanho da coleção
        assertThat(impares, contains(1,3,5,7,9)); // Verifica os itens que estão contidos na lista
        assertThat(impares, containsInAnyOrder(1,5,3,7,9)); // Verifica os itens que estão contidos na lista independente da ordem
        assertThat(impares, hasItem(1)); // Verifica se o item pertence está na lista de forma separada.
        assertThat(impares, hasItems(1,3)); // Verifica se os itens pertencem a lista de forma separada.

        assertThat("Maria", is(not("Joao"))); // Verifica se o valor "Maria" não é o valor "Joao"
        assertThat("Maria", not("Joao")); // Posso usar em o is antes do not o código fica mais limpo.
        assertThat("Joaquina", anyOf(is("Joao"), is("Joaquina"))); // Utilizando o operador "OU/OR"
        // Utilizando o operador "E/END" acrescido de "começa com" e "termina com" e "contém"
        assertThat("Joaquina", allOf(startsWith("Joa"), endsWith("ina"), containsString("qui")));
    }

    @Test
    public void devoValidarBody() {
        given()
        .when()
            .get("http://restapi.wcaquino.me/ola")
        .then()
            .statusCode(200)
        .body(is("Ola Mundo!"))
        .body(containsString("Mundo"))
        .body(not(nullValue()));
    }
}
