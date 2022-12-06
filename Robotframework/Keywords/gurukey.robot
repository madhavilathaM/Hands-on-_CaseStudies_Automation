*** Settings ***
Library  SeleniumLibrary
Resource   C:/2#MadhaviLatha/Robotframework/Variables/guruvari.robot

*** Keywords ***
user should open browser
  Open Browser  ${url}  ${browser}
  Maximize Browser Window
user should enter username
  Wait Until Page Contains Element  ${username}
  Click Element  ${username}
  Input Text    ${username}  user
user should enter password
  Wait Until Page Contains Element  ${password}
  Click Element  ${password}
  Input Text    ${password}  user
click the submit button
  Wait Until Page Contains Element  ${sumbit}
  Click Button  ${sumbit}
user click on register button
  Wait Until Page Contains Element  ${register}
  Click Link  ${register}
  
    