/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccination;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import static vaccination.UserIO.allUser;
import static vaccination.UserIO.read;

/**
 *
 * @author liyaw
 */
public class VaccineIO {
    public static ArrayList<Vaccination> allVaccine = new ArrayList<Vaccination>();
    public static void read(){
        try{
            Scanner s = new Scanner(new File("Vaccines.txt"));
            allVaccine.clear();
            while(s.hasNextLine()){
                String data = s.nextLine();
                //need to split it and match the column/variable name
                String [] arrData = data.split(Pattern.quote(" "),3);
                String vaccinename = arrData[0];
                String vaccinequantity = arrData[1];
                String vaccinesupplier = arrData[2];
                
                //for testing purpose REMOVE IT BEFORE SUBMIT
                /*System.out.println(id+' '+name+' '+citizen+' '+phone+' '+email+' '+gender+' '+street+' '+city+
                        ' '+postcode+' '+state+' '+password+' '+securityQuestion+' '+securityAns);*/
                Vaccination v = new Vaccination(vaccinename, vaccinequantity, vaccinesupplier);
                allVaccine.add(v);
            }
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void write(){
        try{
            PrintWriter pr = new PrintWriter("Vaccines.txt");
            for(int i=0; i<allVaccine.size();i++){
                pr.println(allVaccine.get(i).getVaccine()+" "+allVaccine.get(i).getQuantity()+" "+allVaccine.get(i).getSupplier());
            }
            pr.close();
        } catch (Exception e){
            System.out.println("Error in write!");
        }
    }
    
    //to check the account is existing or not
    public static Vaccination checking(String x){
        //Vaccination found = null;
        VaccineIO.read();
        for(Vaccination v:allVaccine){
            if(x.equals(v.getVaccine())){
            return v;
            }
        }
        return null;
    }
}
