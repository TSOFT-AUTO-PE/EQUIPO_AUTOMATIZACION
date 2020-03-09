Feature: FlujoWEB_DELIVERY

  @Test1
  Scenario Outline: Login WEB DELIVERY

    Given Ingreso a la url de WEB DELIVERY "<caso_prueba>"
    When Ingreso el usuario de WEB DELIVERY"<caso_prueba>"
    And La contraseña de WEB DELIVERY"<caso_prueba>"
    Then se da clic en el boton login de WEB DELIVERY ingresando correctamente



    Examples:
      | caso_prueba |
      |           1 |


  @Test2
  Scenario Outline: BUSCAR ORDEN WEB DELIVERY

    Given Ingreso a la url de WEB DELIVERY "<caso_prueba>"
    When Ingreso el usuario de WEB DELIVERY"<caso_prueba>"
    And La contraseña de WEB DELIVERY"<caso_prueba>"
    Then se da clic en el boton login de WEB DELIVERY ingresando correctamente
    Given Se da click en el boton IR A en WEB DELIVERY "<caso_prueba>"
    When Seleccionar auditoria de pedidos en WEB DELIVERY "<caso_prueba>"
    And Ingresar y buscar el numero de orden en WEB DELIVERY "<caso_prueba>"
    Then Se encontrara la orden "<caso_prueba>"

    Examples:
      | caso_prueba |
      |           1 |

  @Test3
  Scenario Outline: SELECCIONAR AGENDAMIENTO WEB DELIVERY

    Given Ingreso a la url de WEB DELIVERY "<caso_prueba>"
    When Ingreso el usuario de WEB DELIVERY"<caso_prueba>"
    And La contraseña de WEB DELIVERY"<caso_prueba>"
    Then se da clic en el boton login de WEB DELIVERY ingresando correctamente
    Given Se da click en el boton IR A en WEB DELIVERY "<caso_prueba>"
    When Seleccionar auditoria de pedidos en WEB DELIVERY "<caso_prueba>"
    And Ingresar y buscar el numero de orden en WEB DELIVERY "<caso_prueba>"
    Then Se encontrara la orden "<caso_prueba>"
    Given Se da click en el boton agendar pedido "<caso_prueba>"
    When Seleccionar fecha del pedido "<caso_prueba>"
    And se da click en el boton aceptar "<caso_prueba>"
    Then se verifica que el estado del pedido sea agendado "<caso_prueba>"


    Examples:
      | caso_prueba |
      |           1 |