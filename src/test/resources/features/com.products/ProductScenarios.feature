Feature: Validation of Products
  @productproject


  Scenario: Validation of New Product Creation
    Given The user navigates to product website homepage and click orderButton
    When The user enter the product information  "MyMoney" and "4"
    And  The user enters the address information "Techtorial","2200 E Devon","Des Plaines","IL","60018"

    And The user enters the card information "Visa","132423324432","08/24"
    Then  the user validates success message
    And The user validates product details "Techtorial","MyMoney","4","2200 E Devon","Des Plaines","IL","60018","Visa","132423324432","08/24"


#   @productprojectOutline
#  Scenario Outline: Validation of New Product Creation
#
#    Given The user navigates to product website homepage and click orderButton
#    When The user enter the product information  "<productName>" and "<quantity>"
#    And The user enters the address information "<customerName>","<street>","<city>","<state>"," <zipcode>"
#    And The user enters the card information "<cardType>","<cardNumber>","<expireDate>"
#    Then the user validates success message
#    And The user validates product details "<customerName>","<productName>","<quantity>","<street>","<city>","<state>","<zipcode>","<cardType>","<cardNumber>","<expireDate>"
#
#
#  Examples:
#  | productName  | quantity | customerName | street         | city        | state | zipcode | cardType            | cardNumber   | expireDate |
#  | MyMoney      | 4        | Techtorial   | 2200 E Devon   | Des Plaines | IL    | 60018   |  Visa               | 132423324432 | 08/24      |
#  | FamilyAlbum  | 7        | Ahmet        | 560 Michigan   | Michigan    | MI    | 60637   |  MasterCard         | 132423324488 | 07/22      |
#  | Screensaver  | 8        | Sait         | 707 Michigan   | Michigan    | WI    | 53215   |  AmericanExpress    | 132423324456 | 09/28      |