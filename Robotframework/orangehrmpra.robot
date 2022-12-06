*** Settings ***
Library  SeleniumLibrary

*** Variables ***
${url} =  https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
${browser} =  chrome
${username} =  xpath =  //*[@class='oxd-input oxd-input--active']
${password} =  xpath =  //*[@type='password']
${data1} =  Admin
${data2} =  admin123
${login} =  xpath =  //*[@type='submit']
${recriutment} =  xpath =  //*[@href='/web/index.php/recruitment/viewRecruitmentModule']
${checkbox} =  xpath =  //*[@class='oxd-table-card'][3]/div/div/div/div/label/span/i


*** Keywords ***
Open UrL
   Open Browser  ${url}  ${browser}
   Sleep  10
   Maximize Browser Window
Login page
   Wait Until Page Contains Element     ${username}  10
   Click Element  ${username}
   Input Text  ${username}  ${data1}
   Click Element  ${password}
   Input Password  ${password}  ${data2}
   Wait Until Page Contains Element  ${login}  10
   Click Button  ${login}
   Log To Console  user loggged in
Recruitment link
  Click on Side menu    ${recriutment} 
  Log To Console  Recritment clicked
  
  Wait Until Page Contains Element  ${checkbox}  30
  Click Element   ${checkbox}
  Sleep  30
 



Click on Side menu
  [Arguments]  ${element}
  Wait Until Page Contains Element    ${element}  
  Click Link  ${element} 
For loop
  FOR  ${i}  IN RANGE  1  20
   Press Keys  none  ARROW_DOWN
   ${ELE} =  Run Keyword And Return Status  Element Should Be Visible  ${text}
    IF  ${ELE}
     Wait Until Element Is Visible    ${text}
     Press Keys    ${text}  ENTER
     Exit For Loop
    ELSE
      Log  continue 

       
   END
   



  
  END
    



*** Test Cases ***
User able to login page
  Open UrL
  Login page
Recriutment
  Recruitment link  
