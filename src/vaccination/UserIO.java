/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccination;

import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserIO {
    public static ArrayList<User> allUser = new ArrayList<User>();
    public static void read(){
        try{
            Scanner s = new Scanner(new File("Users.txt"));
            allUser.clear();
            while(s.hasNextLine()){
                String data = s.nextLine();
                //need to split it and match the column/variable name
                String [] arrData = data.split(Pattern.quote("|"),7);
                String name = arrData[0];
                String password = arrData[1];
                String ic = arrData[2];
                String gender = arrData[3];
                String nationality = arrData[4];
                String phone = arrData[5];
                String email = arrData[6];
                
                User c = new User(name, password, ic, gender, nationality, phone, email);
                allUser.add(c);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    
    public static void write(){
        try{
            PrintWriter pr = new PrintWriter("Users.txt");
            for(int i=0; i<allUser.size();i++){
                pr.println(
                        allUser.get(i).getName()+"|"
                                +allUser.get(i).getPassword()+"|"
                                +allUser.get(i).getIc()+"|"
                                +allUser.get(i).getGender()+"|"
                                +allUser.get(i).getNationality()+"|"
                                +allUser.get(i).getPhonenumber()+"|"
                                +allUser.get(i).getEmailaddress());
            }
            System.out.println(allUser.toString()); 
            pr.close();
            //forgot password -> modify password
//            PrintWriter prpass = new PrintWriter("Users.txt");
//            for(String str: tempArray){
//                //write back the data to the file line by line
//                prpass.println(str);
//            }
//            prpass.close();
        } catch (Exception e){
            System.out.println(e);
        }
    }
    
    //to check the account is existing or not
    public static User checking(String x){
        //User found = null;
        UserIO.read();
        for(User c:allUser){
            if(x.equals(c.getIc())){
            return c;
            }
        }
        return null;
    }
       
}
