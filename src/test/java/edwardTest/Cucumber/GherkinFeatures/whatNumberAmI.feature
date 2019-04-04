Feature: What number I am thinking of?

Scenario: Guess what number
  Given number is equal to 3
  When I guess it is 4
  Then my guess is wrong

Scenario: Guess what number
  Given number is equal to 3
  When I guess it is 3
  Then my guess is right