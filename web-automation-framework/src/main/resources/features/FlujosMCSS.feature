Feature: FlujoMCSS

  @LoginMCSS
  Scenario Outline: Login MCSS

    Given Ingreso a la url de MCSS "<caso_prueba>"
    When Ingreso el usuario de MCSS"<caso_prueba>"
    And La contraseña de MCSS"<caso_prueba>"
    Then se da clic en el boton login de MCSS ingresando correctamente



    Examples:
      | caso_prueba |
      |           1 |

  @BuscarClienteMCSS
  Scenario Outline: Buscar Cliente MCSS

    Given Seleccionar tipo de alta MCSS "<caso_prueba>"
    When Seleccionamos tipo de cliente MCSS"<caso_prueba>"
    And Ingresamos tipo de documento a MCSS"<caso_prueba>"
    And Ingresamos numero de documento "<caso_prueba>"
    Then se da clic en el boton siguiente ingresando correctamente



    Examples:
      | caso_prueba |
      |           1 |