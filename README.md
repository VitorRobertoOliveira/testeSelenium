# testeSelenium
Projeto em Java com Selenium Web Driver e Cucumber, usando o padrão Page Objects.

# Configuraçãoes: 

jdk 1.8, 

selenium-java 3.141.59,

junit 4.13.1,

cucumber-java 6.9.1,

cucumber-junit 6.9.1.

# Passo a passo para o teste automático:

==>	Entrar no site http://sampleapp.tricentis.com/101/app.php

==>	Preencher o formulário, aba “Enter Vehicle Data” e pressione next

==>	Preencher o formulário, aba “Enter Insurant Data” e pressione next

==>	Preencher o formulário, aba “Enter Product Data” e pressione next

==>	Preencher o formulário, aba “Select Price Option” e pressione next

==>	Preencher o formulário, aba “Send Quote” e pressione Send

==>	Verificar a mensagem “Sending e-mail success!” na tela
