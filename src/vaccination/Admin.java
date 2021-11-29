/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccination;

/**
 *
 * @author Keith
 */
public class Admin{
    private String username;
    private String password;
    
    public Admin(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    public String getusername(){
        return username;
    }
    
    public void setusername(String username){
        this.username = username;
    }
    
    public String getpassword(){
        return password;
    }
    
    public void setpassword(){
        this.password = password;
    }
}
