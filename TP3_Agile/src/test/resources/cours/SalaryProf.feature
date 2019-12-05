#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#"" 
#
#	pdf, code, junit, 
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Gestion de salaire de prof
  En tant que un prof, il voudrait calculer la salaire d'un prof

  Scenario: Calculer la salaire d'un prof en fonction de ses cours
    Given Un professeur possède une liste des cours
    When Affectation de nouveau_cours au professeur
    Then La salaire de professeur est calcule


