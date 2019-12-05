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
Feature: Operation_003
 En tant que Client-Professeur je souhaite effectuer un virement 
 de mon compte à un autre compte bancaire qui sont identifiés par deux numéros de compte

  @tag1
  Scenario: Virement
    Given Je veux transferer l’argent à un autre compte sachant que le montant est inférieur ou égale à mon solde
    When Je valide l’opération 
    Then Le solde de mon compte est décrémenté et le solde de compte de destinataire est incrémenté
 


 
