*** Settings ***
Library  SeleniumLibrary
Resource  C:/2#MadhaviLatha/Robotframework/Keywords/orderpizza.robot

*** Test Cases ***

User Should open Browser
  Opening Broswer
User Should click on Login
  Enter Username
  Enter Password
  Click on login  
User Should Select Pizza 

  Select pizza size
  Select flavour
  Select Sauce
  Select Toppings
  Select Quantity
User Should Click on Addto cart
  Click on Addto Cart
  Printing Meassage  