/*
Exercise 2.4: Login check
Create LoginCheck.
Compare a username and password stored in String variables with expected values.
Display Login successful or Invalid credentials.
Important: Use .equals() to compare String contents rather than ==.
 */
package org.example;

import javax.xml.transform.Result;

public class LoginCheck {
    public String username = "Keitu-rams";
    public String password = "ilovemo";

    public void checkLogin(){

        LoginCheck checker = new LoginCheck();

        if(username.equals(checker.username) && (password.equals(checker.password))){
            System.out.println("You have logged in successfully");
        }
        else{
            System.out.println( "Invalid credentials");
        }
    }
}
