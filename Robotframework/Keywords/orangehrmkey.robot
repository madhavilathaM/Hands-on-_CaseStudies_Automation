*** Settings ***
Library  SeleniumLibrary
Resource  C:/2#MadhaviLatha/Robotframework/Variables/orangehrmvariable.robot

*** Keywords ***
user should open browser
  Open Browser  ${url}  ${browser}
  Maximize Browser Window
     
  Sleep  10
  Page Should Contain  Login
  Log To Console  textfound
user ble to enter username
  Wait Until Page Contains Element  ${username}  10
  Click Element  ${username}
  Log To Console  Element clicked
  Input Text  ${username}  ${data1}
  Log To Console  username entered
user able to enter password
  Click Element  ${password}
  Log To Console  password clicked
  Input Password  ${password}  ${data2}
  Log To Console  password enterd
user able to login
  Wait Until Page Contains Element  ${login}  10
  Click Button  ${login}
  Log To Console  clicked on login
timelink method
    click on link  ${timelink}
    Sleep   3
recruitment method
  click on link  ${recriutment}
  Sleep  5
  Click Element  ${dropdown}
  jobtitle dropdown
  Sleep  10

#navigating to dropdown
jobtitle dropdown
  FOR  ${i}  IN RANGE  1  25
    Press Keys  none  ARROW_DOWN
    ${element2} =  Run Keyword And Return Status  Element Should Be Visible  ${text}
    IF  ${element2}
      Wait Until Element Is Visible  ${text}
      Press Keys  ${text}  ENTER
      Exit For Loop
    ELSE
      Log  continue

        
    END
    
  
  END
  

#clicking on side menu(user define method)
click on link
  [Arguments]   ${element} 
  Wait Until Page Contains Element  ${element}  10
  Click Element  ${element}
  Log To Console  clicked on link

user able to click on leave
  Wait Until Page Contains Element  ${leave}  10
  Click Element  ${leave}
  
user able to click on leavelist
  Wait Until Page Contains Element  ${leavelist}  15
  Click Element    ${leavelist}
user able to click userdropdown
  Wait Until Page Contains Element  ${userdropdown}  10
  Click Element  ${userdropdown}
user able to click logout
  Wait Until Page Contains Element  ${logout}  5
  Click Element  ${logout}


 

