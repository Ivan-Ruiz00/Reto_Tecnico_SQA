#encoding:UTF-8
#Author: Ivan Dario Ruiz Bernal

  Feature: Escribir una nota de texto enriquecida
    Yo como usuario de bloc de notas online
    Quiero escribir una nota enriquecida
    Para poder hacerlo en negrita

  Scenario: Escribir nota en negrita
    Given estoy en la pagina bloc de notas online
    When hago una nota con negrita
    Then la note debe contener lo escrito y se ve al lado derecho