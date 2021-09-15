# Autor: Juan

@stories
Feature: Academy choucair
  as a user, I want to learn how to automate in screemplay at the Choucair Academy with the automation course
  @scenario1
  Scenario:  Search for a automation course
    Given than Juanes want to learn automation at the Academy choucair
    | strUser    | strPassword   |
    | 1037618451 | Choucair2021* |
    When  he search for the course on the choucair academy platform
    | strCourse                  |
    | Workshop de Automatizacion |
    Then he finds the course called
    | strCourse                  |
    | Workshop de Automatizacion |