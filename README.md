# Creating-username-and-password-input-with-JFrame-form- and connecting to SQL  
  server and call SQL server username and password.

# Firstly right click on your project where you want to create your JFrame form.
# Choose new and click JFrame form and name your class and Finish.
# Open your class and in the desing pane will see the GUI panel.
# We need to add one text field,one password field and two button.
# Text field is for username,password field is for password.
# One of two button is for sign in button,other one is for clear for clearing
  the inputted username and password.For example give variable name as reset.
# After adding the fields and buttons we should name them.
# We should right click the field and button then edit text.Give a name for   
  appearance.
# Right click the field and button then change variable name.
# Lets give username filed variable name as username.We will use this variable   
  name in our code.
# Lets give password field variable name as password.We will use this variable 
  name in our code.
# Give a variable name for sign in button and reset botton also same like above.
# After giving the name two-click every of four.(Fields and buttons) then you 
  will see the code.
# Current codes generates by Java when you add the button and fields.

# In the code you will see the ActionPerformed method names.Your button variable 
  name + ActionPerformed name. For example signinActionPerformed and resetActionPerformed
# You will see the method like below
# private void signinActionPerformed(java.awt.event.ActionEvent evt) { }
# Go to blog and write your code.
# In the signinActionPerformed method blog paste the signinActionPerformed.java  
  class code.
# in the resetActionPerformed method blog paste the resetActionPerformed.java  
  class code.This code helps you to reset wrong inputted value.For example if your username is Garib but you wrote Hajib wrongly.This button help you to remove all.No need to use backspace key.

# in the begining of the signinActionPerformed.java code you will see the label  
  code until try function.That code notify message if user click sign in button when username and password field is empty.in the design field add two label under the username and password then give variable name like label_username and label_password.Begining of the signinActionPerformed code will connect that labels.
  So if you want to desappear the message when user write username and password then you should do like below.
  # Right click on username and password field and choose event > key > keyreleased.in the code you will see method the below

  # private void usernameKeyReleased(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
      
    }                                    

 # private void passwordKeyReleased(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        
    } 

 # You can see usernameKeyReleased and passwordKeyReleased
   method blog in usernameKeyReleased.java and passwordKeyReleased.java file.


 Lets to try our JFrame form GUI and call our SQL Server username and password.If everything succeed then we will get MATCHED! message otherwise NOT MATCHED!

 # Right click on the Class and click run file.The username and password GUI   
   will appear.Write your SQL Server username and password.
   I hope you get MATCHED !
