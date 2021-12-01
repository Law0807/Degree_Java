/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccination;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;

public class AdminIO {
    public static ArrayList<Admin> allStaff = new ArrayList<Admin>();
    
    public static void read(){
        try{
            Scanner s = new Scanner(new File("Staffs.txt"));
            while(s.hasNextLine()){
                String data = s.nextLine();
                String [] staffdetail = data.split(Pattern.quote(" "),3);
                String username = staffdetail[0];
                String password = staffdetail[1];
                
                Admin c = new Admin(username,password);
                System.out.println(c);
                allStaff.add(c);
                
            }
        } catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static Admin check(String x){
        Admin found = null;
        for(Admin c:allStaff){
            if(x.equals(c.getusername())){
            return c;
            }
        }
        return null;
    }
}

