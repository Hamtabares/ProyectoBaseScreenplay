Feature: ingresar al traductor de google

  Scenario: ingresar al traductor de google
    Given que elkin quiere usar el traductor de google
    When el traduce la palabra house de ingles a espanol
    Then el deberia visualizar la palabra casa en la pantalla
