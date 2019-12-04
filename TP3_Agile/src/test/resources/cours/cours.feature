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
Feature: Gestion de cours de prof
  Je voudrais géger les cours d'un prof

  Scenario: Ajouter un cours pour un prof
    Given Affecter un cours Math pour professeur Benoit
    When Un cours est ajouté dans le prof
    Then Le prof possèdes un cours

  Scenario: Supprimer tous les cours d'un prof
    Given Une liste de cours pour un professeur
    When Supprimer tous les cours de prof
    Then Le nombre de cours est zero

 