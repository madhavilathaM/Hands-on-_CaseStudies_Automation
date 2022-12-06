*** Settings ***
Library  SeleniumLibrary
Resource  C:/2#MadhaviLatha/Robotframework/Keywords/gurukey.robot

*** Test Cases ***
to test guru99
  user should open browser
  user should enter username
  user should enter password
  click the submit button
  user click on register button