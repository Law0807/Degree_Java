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
            Scanner s = new Scanner(new File("user.txt"));
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
                
                //for testing purpose REMOVE IT BEFORE SUBMIT
                /*System.out.println(id+' '+name+' '+citizen+' '+phone+' '+email+' '+gender+' '+street+' '+city+
                        ' '+postcode+' '+state+' '+password+' '+securityQuestion+' '+securityAns);*/
                User c = new User(name, password, ic, gender, nationality, phone, email);
                allUser.add(c);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    //forgot password read data
    public static ArrayList<String> tempArray = new ArrayList<>();
    public static void read(String x, String y){
        //read data
        try{
            FileReader modifypass = new FileReader("userdetail.txt");
            Scanner s = new Scanner(modifypass);
            String line;
            while(s.hasNextLine()){
                line=s.nextLine();
                //need to split it and match the column/variable name
                String [] arrData = line.split(Pattern.quote("|"),7);
                if(x.equals(arrData[0])){
                    //if the id is present, add the old info + new info into
                    //the tempArray
                    tempArray.add(arrData[0]+"|"+arrData[1]+"|"+arrData[2]+"|"+arrData[3]+
                    "|"+arrData[4]+"|"+arrData[5]+"|"+arrData[6]+"|");
                }else{
                    //if the id doesn't match, add the line
                    tempArray.add(line);
                }
            }
            s.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void write(){
        try{
            PrintWriter pr = new PrintWriter("userdetail.txt");
            for(int i=0; i<allUser.size();i++){
                pr.println(allUser.get(i).getName()+"|"+allUser.get(i).getIC()+"|"+allUser.get(i).getPassword()+allUser.get(i).getGender()+"|"
                +"|"+allUser.get(i).getnationality()+"|"+allUser.get(i).getemail()+"|"+allUser.get(i).getphonenumber());
            }
            pr.close();
            //forgot password -> modify password
            PrintWriter prpass = new PrintWriter("userdetail.txt");
            for(String str: tempArray){
                //write back the data to the file line by line
                prpass.println(str);
            }
            prpass.close();
        } catch (Exception e){
            System.out.println("Error in write!");
        }
    }
    
    //to check the account is existing or not
    public static User checking(String x){
        User found = null;
        for(User c:allUser){
            if(x.equals(c.getIC())){
            return c;
            }
        }
        return null;
    }
       
}
