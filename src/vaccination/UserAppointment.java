/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccination;

import java.util.ArrayList;

/**
 *
 * @author Keith
 */
public class UserAppointment extends User{
    private String date;
    private String Centre;
    private String type;
    private String dose;
    private ArrayList<Appointment> myAppointment = new ArrayList<Appointment>();

    public UserAppointment(String name, String gender, String nationality, String ic, String phonenumber, String email, String password, String date, String Center, String type, String dose) {
        super(name, gender, nationality, ic, phonenumber, email, password);
        this.date = date;
        this.Centre = Centre;
        this.type = type;
        this.dose = dose;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCentre() {
        return Centre;
    }

    public void setCentre(String Centre) {
        this.Centre = Centre;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDose() {
        return dose;
    }

    public void setDose(String dose) {
        this.dose = dose;
    }

    public ArrayList<Appointment> getMyAppointment() {
        return myAppointment;
    }

    public void setMyAppointment(ArrayList<Appointment> myAppointment) {
        this.myAppointment = myAppointment;
    }
}
