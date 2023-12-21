Feature: Placing the order with multiple item
@Regression @RunNow
Scenario: Verify User can login the application then place the order with multiple item

Given User can login the application
When User can add the books into the cart
And User can go to cart and checkout the added items
And User can enter the shipping address and place the order
Then Verigy user get successfully message for placed order