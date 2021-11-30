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
public class User {
    private String name;
    private String password;
    private String ic;
    private String nationality;
    private String phonenumber;
    private String emailaddress;
    private String gender;
    
    public User(String name, String gender, String nationality, String ic, String phonenumber, String email, String password) {
        this.name = name;
        this.ic = ic;
        this.nationality = nationality;
        this.phonenumber = phonenumber;
        this.emailaddress = email;
        this.password = password;
        this.gender = gender;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getIC(){
        return ic;
    }
    
    public void setIC(String ic){
        this.ic = ic;
    }
    
    public String getPassword(){
        return password;
    }
    
    public void setPassword(String password){
        this.password = password;
    }
    
    public String getnationality(){
        return nationality;
    }
    
    public void setnationality(){
        this.nationality = nationality;
    }
    
    public String getemail(){
        return emailaddress;
    }
    
    public void setemail(){
        this.emailaddress = emailaddress;
    }
    
    public String getphonenumber(){
        return phonenumber;
    }
    
    public void setphonenumber(){
        this.phonenumber = phonenumber;    
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(){
        this.gender = gender;
    }
}
