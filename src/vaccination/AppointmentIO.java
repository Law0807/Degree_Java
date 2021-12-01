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
import static vaccination.UserIO.allUser;
import static vaccination.UserIO.read;

/**
 *
 * @author Keith
 */
public class AppointmentIO {
    
    public static ArrayList<UserAppointment> allAppointment = new ArrayList<UserAppointment>();
    public static void read(){
        try{
            Scanner s = new Scanner(new File("Appointment.txt"));
            allAppointment.clear();
            while(s.hasNextLine()){
                String data = s.nextLine();
                String [] arrData = data.split(Pattern.quote("|"),12);
                String name = arrData[0];
                String gender = arrData[1];
                String nationality = arrData[2];
                String ic = arrData[3];
                String phonenumber = arrData[4];
                String email = arrData[5];
                String password = arrData[6]; 
                String date = arrData[7];
                String Centre = arrData[8];
                String type = arrData[9];
                String dose = arrData[10];
                String status = arrData[11];
                
                //for testing purpose REMOVE IT BEFORE SUBMIT
                /*System.out.println(id+' '+name+' '+citizen+' '+phone+' '+email+' '+gender+' '+street+' '+city+
                        ' '+postcode+' '+state+' '+password+' '+securityQuestion+' '+securityAns);*/
                UserAppointment a = new UserAppointment(name, gender, nationality, ic, phonenumber, email, password, date, Centre, type, dose, status);
                allAppointment.add(a);
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
            FileReader modifypass = new FileReader("Appointment.txt");
            Scanner s = new Scanner(modifypass);
            String line;
            while(s.hasNextLine()){
                line=s.nextLine();
                //need to split it and match the column/variable name
                String [] arrData = line.split(Pattern.quote("|"),12);
                if(x.equals(arrData[0])){
                    //if the id is present, add the old info + new info into
                    //the tempArray
                    tempArray.add(arrData[0]+"|"+arrData[1]+"|"+arrData[2]+"|"+arrData[3]+
                    "|"+arrData[4]+"|"+arrData[5]+"|"+arrData[6]+"|"+arrData[7]+"|"+arrData[8]+"|"+arrData[9]+"|"+arrData[10]+"|"+arrData[11]+"|");
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
            PrintWriter pr = new PrintWriter("Appointment.txt");
            for(int i=0; i<allAppointment.size();i++){           
                pr.println(allAppointment.get(i).getName()+"|"+allAppointment.get(i).getGender()+"|"+allAppointment.get(i).getNationality()+allAppointment.get(i).getIc()+"|"
                +"|"+allAppointment.get(i).getEmailaddress()+"|"+allAppointment.get(i).getPhonenumber()+"|"+allAppointment.get(i).getPassword()+"|"+allAppointment.get(i).getDate()
                +"|"+allAppointment.get(i).getCentre()+"|"+allAppointment.get(i).getType()+"|"+allAppointment.get(i).getDose()+"|"+allAppointment.get(i).getStatus());
            }
            pr.close();
            
        } catch (Exception e){
            System.out.println("Error in write!");
        }
    }
    
    public static UserAppointment checking(String x){
        //Appointment found = null;
        AppointmentIO.read();
        for(UserAppointment c:allAppointment){
            if(x.equals(c.getIc())){
            return c;
            }
        }
        return null;
    }
       
}
