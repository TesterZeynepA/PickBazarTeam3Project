@urunBulundu
Feature: Sayfada Urun Arama



  Scenario Outline: Sayfada urun arama
    Given kullanici Clothing sayfasina gider
    When kullanici text alanina "<kelime>" girer
    Then kullanici Search butonunu tiklar
    And kullanici urunun sayfada oldugunu dogrular
    And kullanici sayfayi kapatir

    Examples:
     | kelime |
     | Dress |
     | Skirts |


