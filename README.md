# itbootcamp_final_selenium_project
Demonstration of software testing process using Selenium and TestNG libraries.
Pages: Basic Page - extended by:
       1.Login Page
       2.Nav Page
       3.Signup Page
       4.Cities Page
       5.Message Pop Up Page
       6.Profile Page
       
Tests: 
Basic Test that contains:
baseUrl - the URL of the website https://vue-demo.daniel-avellaneda.com
beforeClass - where the driver with implicit wait and page loading wait is set up and all necessary pages for testing are created
afterClass - where the driver is shut down
beforeMethod - where the baseUrl page is loaded before each test
afterMethod - where a screenshot of the page is taken in case the test fails.

Basic Test is extended by:

       1.Login Tests: 
       
Test case ID:        Test case name:           Actions:                                                  Expected result:                          Inputs:
TC1                  Visits the login page     Click on the Language navigation button                   Language manu list appeared                 /
                                               Set page language to EN                                   Page language set to EN                     /
                                               Click on the login button from the navigation bar         Login page is opened                        /
                                               Verify that the page URL contains the /login route        Page URL contains the /login route          /     

TC2                  Checks input types        Click on the login button from the navigation bar         Login page is opened                        /                                                                Wait until the page title becomes  
                                               "Login - My Awesome App"                                  The page title is correct                   /
                                               Verify that the email input field has the attribute       
                                               type with the "email" value.                              The attribute type has the "email" value    /
                                               Verify that the password input field has the attribute                       
                                               type with the "password" value.                           The attribute type has the "password" value /
                                               
TC3                  Displays errors when      Click on the login button from the navigation bar         Login page is opened                        /
                     user does not exist       Wait until the page title becomes 
                                               "Login - My Awesome App"                                  The page title is correct                   /
                                               Fill in the email input field using provided         
                                               email adresss.                                            Email entered and visible.                  mario12@gmail.com                                                Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       password123 
                                               Click on the login button.                                Submission completed.                       /
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the error message contains
                                               the text "User does not exist"                            The error message contains
                                                                                                         the text "User does not exist"              /
                                               Verify that the page URL contains the /login route        Page URL contains the /login route          / 
                                               
TC4                  Displays errors when      Click on the login button from the navigation bar         Login page is opened                        /
                     password is wrong         Wait until the page title becomes 
                                               "Login - My Awesome App"                                  The page title is correct                   /
                                               Fill in the email input field using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com                                                  Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       password123 
                                               Click on the login button.                                Submission completed.                       /   
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the error message contains
                                               the text "Wrong password"                                 The error message contains
                                                                                                         the text "Wrong password"                   /
                                               Verify that the page URL contains the /login route        Page URL contains the /login route          / 
                                               
TC5                  Login                     Click on the login button from the navigation bar         Login page is opened                        /
                                               Wait until the page title becomes "Login-My Awesome App"  The page title is correct                   /
                                               Fill in the email input field using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com                                                  Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Click on the login button                                 The Admin is logged in.
                                               Verify that the page URL contains the /home route         Page URL contains the /home route           /
                                              
TC6                  Logout                    Verify that the logout button is visible on the page.     Logout button is visible.                   /
                                               Click on the logout button from the navigation bar.       The user is logged out and                  
                                                                                                         the login page is opened.                   /
          2.Signup Tests:    
          
Test case ID:        Test case name:           Actions:                                                  Expected result:                            Inputs:     
TC1                  Visits the signup page    Click on the sign up button from the navigation bar.      Signup page is opened.                      /
                                               Verify that the page URL contains the /signup route       Page URL contains the /signup route         /
                                               
TC2                  Checks input types        Click on the sign up button from the navigation bar.      Signup page is opened.                      /
                                               Wait until the page title becomes
                                              "Signup - My Awesome App"                                  The page title is correct                   /
                                               Verify that the email input field has the attribute       
                                               type with the "email" value.                              The attribute type has the "email" value    /
                                               Verify that the password input field has the attribute                       
                                               type with the "password" value.                           The attribute type has the "password" value /
                                               Verify that the Confirm password input field has 
                                               the attribute type with the "password" value.             The attribute type has the "password" value /
                                               
TC3                 Displays errors when       Click on the sign up button from the navigation bar.      Signup page is opened.                      /
                    user already exists        Wait until the page title becomes
                                               "Signup - My Awesome App"                                 The page title is correct                   /
                                               Verify that the page URL contains the /signup route       Page URL contains the /signup route         /
                                               Fill in the name input field using provided name.         Name entered and visible.                   Another User
                                               Fill in the email input field using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com 
                                               Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Fill in the Confirm password input field using 
                                               provided password.                                        Password entered and covered in dots.       12345 
                                               Click on the sign up button                               The user is not signed up.                  /
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the error message contains
                                               the text "E-mail already exists"                          The error message contains
                                                                                                         the text "E-mail already exists"            /
                                               Verify that the page URL contains the /signup route       Page URL contains the /signup route         /    
                                               
TC4                 Signup                     Click on the signo up button from the navigation bar.     Signup page is opened.                      /
                                               Wait until the page title becomes
                                               "Signup - My Awesome App"                                 The page title is correct                   /
                                               Fill in the name input field using provided name.         Name entered and visible.               Pavle Pavlovic
                                               Fill in the email input field using provided         
                                               email adress.                                             Email entered and visible.        pavlepavlovic@itbootcamp.rs 
                                               Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Fill in the Confirm password input field using 
                                               provided password.                                        Password entered and covered in dots.       12345 
                                               Click on the sign up button                               The user is signed up successfully.          /
                                               Verify that the page URL contains the /home route         Page URL contains the /home route            /
                                               Verify that the message dialog contains                   The message dialog contains
                                               "IMPORTANT: Verify your account"                          "IMPORTANT: Verify your account".            /
                                               Click on the Verify Your Account button                   The User is on the home page.                /
                                               Click on the logout button from the navigation bar.       The user is logged out and                  
                                                                                                         the login page is opened.                    /
                                                                                                          
          3. Admin Cities Tests: 
          
Test case ID:        Test case name:           Actions:                                                  Expected result:                          Inputs:    
TC1                  Visits the admin cities   Click on the login button from the navigation bar         Login page is opened                        /
                     page and list cities      Wait until the page title becomes 
                                               "Login - My Awesome App"                                  The page title is correct                   /      
                                               Fill in the email input field using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com                                                  Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Click on the login button                                 The Admin is logged in.                     /
                                               Wait until the page title becomes 
                                               "Protected Home - My Awesome App"                         The page title is correct                   /        
                                               Click on the Admin button from the navigation bar         The Admin dropdown menu appeared.           /
                                               Click on the Cities button from the dropdown menu         Admin/cities page is opened.                /
                                               Verify that the page URL contains the 
                                               /admin/cities route                                       Page URL contains the /home route           /
                                               
TC2                  Checks input types for    Click on the Admin button from the navigation bar         The Admin dropdown menu appeared.           /
                     create/edit new city      Click on the Cities button from the dropdown menu         Admin/cities page is opened.                /
                                               Wait until the page title becomes
                                               "Cities - My Awesome App"                                 The page title is correct                   /
                                               Click on the New Item Button                              Edit dialog appeared                        /
                                               Wait until the Edit dialog is visible.                    Edit dialog is visible.                     /
                                               Verify that the name input field has the attribute       
                                               type with the "text" value.                              The attribute type has the "text" value      /     
                                               
TC3                  Create new city           Click on the Admin button from the navigation bar         The Admin dropdown menu appeared.           /
                                               Click on the Cities button from the dropdown menu         Admin/cities page is opened.                /  
                                               Click on the New Item Button                              Edit dialog appeared                        /
                                               Wait until the Edit dialog is visible.                    Edit dialog is visible.                     /
                                               Fill in the name input field using provided name format   City name entered and visible          Jovana Milojević's city
                                               Click on the Save button                                  New city name appeared in the table.        /
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the pop up message contains
                                               the text "Saved successfully"                             The message contains
                                                                                                         the text "Saved successfully"               /                 TC4                  Edit city                 Click on the Admin button from the navigation bar         The Admin dropdown menu appeared.           /
                                               Click on the Cities button from the dropdown menu         Admin/cities page is opened.                /
                                               Wait until the page title becomes
                                               "Cities - My Awesome App"                                 The page title is correct                   /                                                                Fill in the Search input field using the old city name    The old city name entered and visible  Jovana Milojević's city
                                               Wait until the number of visible rows is 1                Number of the visible rows is 1             /
                                               Click on the Edit button from the first row.              Edit Item dialog appeared.                  /
                                               Type "Edited" next to the old city name in the name
                                               input field of the Edit Item dialog.                      "Edited" added to the city name           Edited
                                               Click on the Save button                                  City name updated.                          /
                                               
TC5                  Search city               Click on the Admin button from the navigation bar         The Admin dropdown menu appeared.           /
                                               Click on the Cities button from the dropdown menu         Admin/cities page is opened.                /
                                               Wait until the page title becomes
                                               "Cities - My Awesome App"                                 The page title is correct                   /                                                                Fill in the Search input field using 
                                               the updated city name                                     City name entered and visible   Jovana Milojević's city Edited
                                               Wait until the number of visible rows is 1                Number of the visible rows is 1             /   
                                               Verify that the name field of the first row contains
                                               the text entered into the search input field              The two texts are equal.                    /
                                               
TC6                  Delete city               Click on the Admin button from the navigation bar         The Admin dropdown menu appeared.           /
                                               Click on the Cities button from the dropdown menu         Admin/cities page is opened.                /
                                               Fill in the Search input field using 
                                               the updated city name                                     City name entered and visible   Jovana Milojević's city Edited
                                               Wait until the number of visible rows is 1                Number of the visible rows is 1             /   
                                               Verify that the name field of the first row contains
                                               the text entered into the search input field              The two texts are equal.                    /
                                               Click on the Delete button from the first row.            Warning dialog appeared.                    /
                                               Wait until the warning dialog is visible.                 Warning dialog is visible.                  /
                                               Click on the delete button of the warning dialog          City deleted.                               /
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the pop up message contains
                                               the text "Deleted successfully"                           The message contains
                                                                                                         the text "Deleted successfully"             /   
                                                                                                         
              4. Auth Routes Tests:
              
TC1                Forbids visits to home      Go to /home page                                          The User cannot get to /home page.          / 
                   url if not authenticated    Verify that the page URL contains the /login route        Page URL contains the /login route          /  
                   
TC2                Forbids visits to profile   Go to /profile page                                       The User cannot get to /home page.          / 
                   url if not authenticated    Verify that the page URL contains the /login route        Page URL contains the /login route          /  
                   
TC3                Forbids visits to
                   /admin/cities url           Go to /admin/cities page                                  The User cannot get to /admin/cities page.  / 
                   if not authenticated        Verify that the page URL contains the /login route        Page URL contains the /login route          /     
                   
TC4                Forbids visits to 
                   /admin/users url            Go to /admin/users page                                   The User cannot get to /admin/users page.   / 
                   if not authenticated        Verify that the page URL contains the /login route        Page URL contains the /login route          /   
                   
               5. Locale Tests:
               
TC1                Set locale to ES            Click on the Language navigation button                   Language manu list appeared                 /
                                               Clicking on the ES language button                        Page language set to Spanish                /     
                                               Verify that the page header contains 
                                               text "Página de aterrizaje"                               Page header text contains provided text.    /
                                               
TC2                Set locale to EN            Click on the Language navigation button                   Language manu list appeared                 /
                                               Clicking on the EN language button                        Page language set to English                /     
                                               Verify that the page header contains 
                                               text "Landing"                                            Page header text contains provided text.    /   
                                               
TC3                Set locale to CN            Click on the Language navigation button                   Language manu list appeared                 /
                                               Clicking on the CN language button                        Page language set to Chineese               /     
                                               Verify that the page header contains 
                                               text "首页"                                               Page header text contains provided text.    /   
                                               
TC4                Set locale to FR            Click on the Language navigation button                   Language manu list appeared                 /
                                               Clicking on the FR language button                        Page language set to Chineese               /     
                                               Verify that the page header contains 
                                               text "Page d'atterrissage"                                Page header text contains provided text.    /   
                                                                                              
                  
                6. Profile Tests:
                  
TC1                Visits the profile page     Click on the login button from the navigation bar         Login page is opened                        /
                                               Wait until the page title becomes 
                                               "Login - My Awesome App"                                  The page title is correct                   /      
                                               Fill in the email input field using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com                                                  Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Click on the login button                                 The Admin is logged in.                     /                 
                                               Wait until the page title becomes 
                                               "Protected Home - My Awesome App"                         The page title is correct                   /                                                                Click on the My Profile button from the navigation bar    My Profile page is opened                   /
                                               Wait until the page title becomes 
                                               "My profile - My Awesome App"                             The page title is correct                   /                                                                Verify that the page URL contains the /profile route      Page URL contains the /profile route        / 
                                               Verify that the email input field has the attribute       
                                               value with the "admin@admin.com" value.                   The attribute type has provided value       /
                                               Click on the logout button from the navigation bar.       The user is logged out and                  
                                                                                                         the login page is opened.                   /
                                                                                                         
TC2                Checks input types          Click on the login button from the navigation bar         Login page is opened                        /     
                                               Wait until the page title becomes 
                                               "Login - My Awesome App"                                  The page title is correct                   /      
                                               Fill in the email input field using provided         
                                               email adress.                                             Email entered and visible.                  admin@admin.com                                                  Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Click on the login button                                 The Admin is logged in.                     /      
                                               Wait until the page title becomes 
                                               "Protected Home - My Awesome App"                         The page title is correct                   /                                                                Click on the My Profile button from the navigation bar    My Profile page is opened                   /
                                               Wait until the page title becomes 
                                               "My profile - My Awesome App"                             The page title is correct                   /       
                                               Verify that the email input field has the attribute       
                                               type with the "email" value.                              The attribute type has provided value       /       
                                               Verify that the name input field has the attribute       
                                               type with the "text" value.                               The attribute type has provided value       / 
                                               Verify that the city input field has the attribute       
                                               type with the "text" value.                               The attribute type has provided value       /     
                                               Verify that the country input field has the attribute       
                                               type with the "text" value.                               The attribute type has provided value       /  
                                               Verify that the url Twitter input field has the
                                               attribute type with the "url" value.                      The attribute type has provided value       /       
                                               Verify that the url gitHub input field has the
                                               attribute type with the "url" value.                      The attribute type has provided value       /   
                                               Verify that the phone input field has the attribute
                                               type with the "phone" value.                              The attribute type has provided value       /  
                                               Click on the logout button from the navigation bar.       The user is logged out and                  
                                                                                                         the login page is opened.                   /
                                                                                                         
TC3            Edits profile                   Click on the login button from the navigation bar         Login page is opened                        /     
                                               Wait until the page title becomes 
                                               "Login - My Awesome App"                                  The page title is correct                   /      
                                               Fill in the email input field using provided         
                                               email adress.                                             Email entered and visible.                 admin@admin.com                                                    Fill in the password input field using provided         
                                               password.                                                 Password entered and covered in dots.       12345 
                                               Click on the login button                                 The Admin is logged in.                     /      
                                               Wait until the page title becomes 
                                               "Protected Home - My Awesome App"                         The page title is correct                   /                                                                Click on the My Profile button from the navigation bar    My Profile page is opened                   /
                                               Wait until the page title becomes 
                                               "My profile - My Awesome App"                             The page title is correct                   /      
                                               Delete the existing text from 
                                               the name input field                                      Name input field is empty.                  /
                                               Fill in the name input field using provided name format   Name is entered and visible.               Jovana Milojević
                                               Delete the existing text from 
                                               the phone input field                                     Phone input field is empty.                 /
                                               Fill in the phone input field using valid phone format    Phone is entered and visible.              063333333
                                               Delete the existing text from 
                                               the city input field                                      City input field is empty.                  /
                                               Fill in the city input field using provided city name     City is entered and visible.               Bucaramanga
                                               Delete the existing text from 
                                               the country input field                                   Country input field is empty.               /
                                               Fill in the city input field using provided country name  Country is entered and visible.            Spain
                                               Delete the existing text from 
                                               the Url Twitter input field                               Url Twitter input field is empty.           /
                                               Fill in the Url Twitter input field using
                                               provided Twitter Url.                                     Url is entered
                                                                                                         and visible             https://twitter.com/profile/milan1232
                                               Delete the existing text from 
                                               the Url gitHub input field                                Url gitHub input field is empty.            /
                                               Fill in the Url gitHub input field using
                                               valid gitHub Url format                                   Url is entered
                                                                                                         and visible                 https://github.com/jovanamil88   
                                               Wait until the message pop up appears.                    Pop up message is visible.                  /
                                               Verify that the pop up message contains
                                               the text "Profile saved successfully"                     The message contains
                                                                                                         the text "Profile saved successfully"       / 
                                               Verify that the name input field contains the text        
                                               entered into the form.                                    The both texts are equal.                   /
                                               Verify that the phone input field contains the phone         
                                               number entered into the form.                             The both phone numbers are equal.           /
                                               Verify that the city input field contains the text        
                                               entered into the form.                                    The both texts are equal.                   /
                                               Verify that the country input field contains the text        
                                               entered into the form.                                    The both texts are equal.                   /
                                               Verify that the Url Twitter input field contains the
                                               url entered into the form.                                The both Urls are equal.                    / 
                                               Verify that the Url gitHub input field contains the
                                               url entered into the form.                                The both Urls are equal.                    / 
                                               Click on the logout button from the navigation bar.       The user is logged out and                  
                                                                                                         the login page is opened.                   /
                                                          
                                               
         
