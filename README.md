# itbootcamp_final_selenium_project
Demonstration of software testing process using Selenium and TestNG libraries.
Pages: Basic Page - extended by:
       1.Login Page
       2.Nav Page
       3.Signup Page
       4.Cities Page
       5.Message Pop Up Page
       6.Profile Page
Tests: Basic Test - extended by:
       1.Login Tests: 
       
Test case ID:        Test case name:           Actions:                                                  Expected result:                          Inputs:
TC1                  Visits the login page     Click on the Language navigation button                   Language manu list appeared                 /
                                               Set page language to EN                                   Page language set to EN                     /
                                               Click on the login button from the navigation bar         Login page opened                           /
                                               Verify that the page URL contains the /login route        Page URL contains the /login route          /     

TC2                  Checks input types        Click on the login button from the navigation bar         Login page opened                           /                                                                Wait until the page title becomes "Login-My Awesome App"  The page title is verified                  /
                                               Verify that the email input field has the attribute       
                                               type with the "email" value.                              The attribute type has the "email" value    /
                                               Verify that the password input field has the attribute                       
                                               type with the "password" value.                           The attribute type has the "password" value /
                                               
TC3                  Displays errors when      Click on the login button from the navigation bar         Login page opened                           /
                     user does not exist       Wait until the page title becomes "Login-My Awesome App"  The page title is verified                  /
                                               Fill in the email input field with using provided         
                                               email adresss.                                            Email entered and visible.                  mario12@gmail.com                                                Fill in the password input field with using provided         
                                               password.                                                 Password entered and covered in dots.       password123 
                                               Click on the login button.                                Submission completed.                       /
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the error message contains
                                               the text "User does not exist"                            The error message contains
                                                                                                         the text "User does not exist"              /
                                               Verify that the page URL contains the /login route        Page URL contains the /login route          / 
                                               
TC4                  Displays errors when      Click on the login button from the navigation bar         Login page opened                           /
                     password is wrong         Wait until the page title becomes "Login-My Awesome App"  The page title is verified                  /
                                               Fill in the email input field with using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com                                                  Fill in the password input field with using provided         
                                               password.                                                 Password entered and covered in dots.       password123 
                                               Click on the login button.                                Submission completed.                       /   
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the error message contains
                                               the text "Wrong password"                                 The error message contains
                                                                                                         the text "Wrong password"                   /
                                               Verify that the page URL contains the /login route        Page URL contains the /login route          / 
                                               
TC5                  Login                     Click on the login button from the navigation bar         Login page opened                           /
                                               Wait until the page title becomes "Login-My Awesome App"  The page title is verified                  /
                                               Fill in the email input field with using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com                                                  Fill in the password input field with using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Verify that the page URL contains the /home route         Page URL contains the /home route           /
                                              
TC6                  Logout                    Verify that the logout button is visible on the page.     Logout button is visible.                   /
                                               Click on the logout button from the navigation bar.       The user is logged out and                  
                                                                                                         the login page is opened.                   /
          2.Signup Tests:    
          
Test case ID:        Test case name:           Actions:                                                  Expected result:                            Inputs:     
TC1                  Visits the signup page    Click on the signout button from the navigation bar.      Signup page is opened.                      /
                                               Verify that the page URL contains the /signup route       Page URL contains the /signup route         /
                                               
TC2                  Checks input types        Click on the signout button from the navigation bar.      Signup page is opened.                      /
                                               Wait until the page title becomes "Signup-My Awesome App" The page title is verified                  /
                                               Verify that the email input field has the attribute       
                                               type with the "email" value.                              The attribute type has the "email" value    /
                                               Verify that the password input field has the attribute                       
                                               type with the "password" value.                           The attribute type has the "password" value /
                                               Verify that the Confirm password input field has 
                                               the attribute type with the "password" value.             The attribute type has the "password" value /
                                               
TC3                 Displays errors when       Click on the signout button from the navigation bar.      Signup page is opened.                      /
                    user already exists        Wait until the page title becomes "Signup-My Awesome App" The page title is verified                  /
                                               Verify that the page URL contains the /signup route       Page URL contains the /signup route         /
                                               Fill in the name input field with using provided         
                                               name.                                                     Name entered and visible.                   Another User
                                               Fill in the email input field with using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com 
                                               Fill in the password input field with using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Fill in the Confirm password input field with using 
                                               provided password.                                        Password entered and covered in dots.       12345 
                                               Click on the signout button                               The user is not signed up.                  /
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the error message contains
                                               the text "E-mail already exists"                          The error message contains
                                                                                                         the text "E-mail already exists"            /
                                               Verify that the page URL contains the /signup route       Page URL contains the /signup route         /    
                                               
TC4                 Signup                     Click on the signout button from the navigation bar.      Signup page is opened.                       /
                                               Wait until the page title becomes "Signup-My Awesome App" The page title is verified                   /
                                               Fill in the name input field with using provided         
                                               name.                                                     Name entered and visible.                   Pavle Pavlovic
                                               Fill in the email input field with using provided         
                                               email adress.                                             Email entered and visible.        pavlepavlovic@itbootcamp.rs 
                                               Fill in the password input field with using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Fill in the Confirm password input field with using 
                                               provided password.                                        Password entered and covered in dots.       12345 
                                               Click on the signout button                               The user is signed up successfully.          /
                                               Verify that the page URL contains the /home route         Page URL contains the /home route            /
                                               Verify that the message dialog contains                   The message dialog contains
                                               "IMPORTANT: Verify your account"                          "IMPORTANT: Verify your account".            /
                                               Click on the Verify Your Account button                   The User is on the home page.                /
                                               Click on the logout button from the navigation bar.       The user is logged out and                  
                                                                                                         the login page is opened.                    /
                                                                                                          
