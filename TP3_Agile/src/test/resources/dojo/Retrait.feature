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
Feature: Operation_001
  En tant que client je souhaite effectuer l'operation de retrait 
   d’argent dans mon compte bancaire identifié par un numéro de compte.

  @tag1
  Scenario: Debiter le compte 
    Given je veux retirer l'argent sachant que le montant est inférieur au solde
    When je valide l'operation du premier retrait
    Then le solde est décrémenté suite au retrait du montant 

 @tag2
  Scenario Outline: Débiter le compte par un montant dépassant le solde
    Given je veux retirer l'argent sachant que le montant est supérieur au solde du compte
    When je valide l'operation du deuxieme retrait
    Then le solde n'a pas changé

    Examples: 
      |Solde| Montant | status  |
      | 2000 |   1000 | success |
      | 2000 |   2000 | suceess |
