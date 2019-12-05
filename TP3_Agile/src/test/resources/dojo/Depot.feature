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
## (Comments)
#Sample Feature Definition Template
@tag
Feature: Operation_002
  En tant que client je souhaite effectuer l'operation de dépôt
   d’argent dans mon compte bancaire identifié par un numéro de compte.

  @tag1
  Scenario: Crediter le compte 
    Given je veux deposer un montant dans mon compte 
    When je valide l'operation 
    Then le solde est incrémenté suite au depot d'argent



      
