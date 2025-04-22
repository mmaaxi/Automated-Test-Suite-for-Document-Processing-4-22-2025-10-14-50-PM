Feature: Validar generación de 'Slip de salida' y almacenamiento en historial

  Scenario: Completar la carga y procesamiento de documentos
    Given El usuario ha iniciado sesión en el sistema
    When Completa la carga y procesamiento de documentos
    Then El sistema genera el 'Slip de salida'
    And Guarda tanto los documentos originales como los datos extraídos en el historial de la solicitud