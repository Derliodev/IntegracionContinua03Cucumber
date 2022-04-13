Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: Verificacion de ingreso de session
Given Abrir Chrome
When Ingresa Nombre de Usuario "leo" y Contraseña "123123"
Then inicia session
