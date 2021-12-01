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
public class VaccinationSystem {
    public static Login first = new Login();
    public static User login;
    public static Admin loginc;
    public static void main(String[] args){
        UserIO.read();
        AdminIO.read();
        AppointmentIO.read();
        VaccineIO.read();
//        GetDataIO.read();
        new MainPage().setVisible(true);
    }
    

    
}

