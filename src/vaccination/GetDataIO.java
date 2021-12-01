/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vaccination;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 *
 * @author liyaw
 */
public class GetDataIO {
    private static final String people = "Users.txt";
    private static final String appointment = "Appointment.txt";

    public static String[] getAppointment() {
        List<String> data = null;
        try {
            data = Files.readAllLines(Paths.get(appointment));
        } catch (IOException a) {
           System.out.println(a);
        }

        String[] container = new String[data.size()];
        container = data.toArray(container);
        return container;
    }

    public static String[] getPeople() {
        List<String> data = null;
        try {
            data = Files.readAllLines(Paths.get(people));
        } catch (IOException a) {
           System.out.println(a);
        }

        String[] container = new String[data.size()];
        container = data.toArray(container);
        return container;
    }
}
