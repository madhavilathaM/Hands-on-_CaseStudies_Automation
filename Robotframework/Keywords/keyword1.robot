*** Settings ***
Library  SeleniumLibrary
Resource  C:/2#MadhaviLatha/Robotframework/Variables/variable1.robot

*** Keywords ***
browser should open
  Open Browser  ${url}  ${browser}
  Maximize Browser Window
  Wait Until Page Contains Element  ${search}  5
  Click Element  ${search}
  Input Text  ${search}  robotframework
  
  
  
  