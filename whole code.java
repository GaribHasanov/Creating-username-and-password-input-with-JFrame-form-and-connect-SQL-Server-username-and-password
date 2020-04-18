private void signinActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        
        if (username.getText().trim().isEmpty() && password.getText().trim().isEmpty()){
        label_username.setText("username is empty");
        label_password.setText("password is empty"); 
        }
        else if (username.getText().trim().isEmpty()){
        label_username.setText("username is empty");    
        }
        else if (password.getText().trim().isEmpty()){
        label_password.setText("password is empty");    
        }
        else
        try {
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
     String connectionURL = "jdbc:sqlserver://SERVERNAME:1433;databaseName=TEST;
     user=testuser;password=Test123";
     Connection conn = DriverManager.getConnection(connectionURL);
     String sqlselect = "Select * from HR where login=? and password=?";
PreparedStatement st = conn.prepareStatement(sqlselect);
st.setString(1,username.getText());
st.setString(2,password.getText());
ResultSet rs = st.executeQuery();
if(rs.next()){
    JOptionPane.showMessageDialog(null,"Matched");
}
else{
    JOptionPane.showMessageDialog(null,"Not Matched");
    username.setText("");
    password.setText("");

}
conn.close();
}
catch(Exception e){
    JOptionPane.showMessageDialog(null,e);
} 
        
        
    }        


    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        username.setText("");
        password.setText("");

    }     


    private void usernameKeyReleased(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        label_username.setText("");
    }  


    private void passwordKeyReleased(java.awt.event.KeyEvent evt) {                                     
        // TODO add your handling code here:
        label_password.setText("");
    }                                    
