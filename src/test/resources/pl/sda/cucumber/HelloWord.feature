Feature: Powitanie w różnych językach
  Scenario Outline: Powitanie w języku polskim
    Given  Srworzona instalacja klasy obiektu HelloWord
    When Wprowdzono jęnzyk <jenzyk>
    Then Wyświetlony zostal komunikat <powitanie>

    Examples:
    |jenzyk| powitanie|
    |"pl" | "Witaj Świecie!"|
    |"en" | "Hello world!"  |
    |"cs" | "cos"           |
    | "de"| "Język nieznany!" |