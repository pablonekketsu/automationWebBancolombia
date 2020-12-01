#Autor: Pablo Andres Hernandez Morales
# language:en
@stories
Feature: Create user on Utest.com
  As a new user, I want to create a new profile on the page

  @scenario1
  Scenario Outline:Create a new profile complying with all the page requirements
    Given that Pablo wants create a new profile on Utest
    When he complying all the require steps
    |name  |lastName  |email  |month  |day  |year  |city  |zip_code  |user  |password  |
    |<name>|<lastName>|<email>|<month>|<day>|<year>|<city>|<zip_code>|<user>|<password>|

    Then  the profile is create successful


    Examples:
      |name|lastName|email|month|day|year|city|zip_code|user|password|
      |Pablo Andres|Hernandez|pablonekketsu@gmail.com|May|17|1992|Bogota|110111|pablo|example123|

