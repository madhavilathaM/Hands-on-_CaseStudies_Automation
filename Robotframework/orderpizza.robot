*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${url} =  https://dineshvelhal.github.io/testautomation-playground/login.html
${browser} =  chrome
${username} =  xpath =  //*[@id='user']
${password} =  xpath =  //*[@id='password']
${Login} =  xpath =  //*[@id='login']
${userdata} =  admin
${passwordata} =  admin
${pizzasize} =  xpath =  //*[@value='MEDIUM']
${sauce} =  xpath =  //*[@id='rad_buffalo']
${Toppings} =  xpath =  //*[@id='onions']
${quantity} =  xpath =  //*[@id='quantity']
${addtocart} =  xpath =  //*[@id='submit_button']
${message} =   Pizza added to the cart!
${flavor} =  xpath =  //*[@id='select_flavor']


*** Keywords ***

Opening Broswer
  Open Browser  ${url}  ${browser}
  Maximize Browser Window
  Sleep  10

Enter Username
  Wait Until Page Contains Element  ${username}  10
  Click Element  ${username}
  Input Text  ${username}  ${userdata}
  Log To Console  username entered

Enter Password
  Wait Until Page Contains Element  ${password}  10
  Click Element  ${password}
  Input Password  ${password}  ${passwordata}
  Log To Console  password entered

Click on login
  Wait Until Page Contains Element  ${Login}  10
  Click Button  ${Login}
  Log To Console  Login Clicked

Select pizza size
  Wait Until Page Contains Element  ${pizzasize}  10
  Click Button  ${pizzasize}
  Log To Console  Medium size Slected

Select flavour
  Wait Until Page Contains Element  ${flavor}  10
  Click Element   ${flavor}
  Select From List By Index  ${flavor}  2
  

Select Sauce
  Wait Until Page Contains Element  ${sauce}  10
  Click Button  ${sauce}
  Log To Console  Sauce selected

Select Toppings
  Wait Until Page Contains Element  ${Toppings}  10
  Click Button  ${Toppings}
  Log To Console  Toppings 

Select Quantity
  Wait Until Page Contains Element  ${quantity}  10
  Click Button  ${quantity}
  Input Text  ${quantity}  3

Click on Addto Cart
  Wait Until Page Contains Element  ${addtocart}  10
  Click Button  ${addtocart}
  Log To Console  Add to cart Cicked

Printing Meassage
   Wait Until Page Contains Element  ${message}   10
   Log To Console  ${message} 
   sleep  30
  
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
