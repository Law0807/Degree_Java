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
public class Vaccination {

    private String Vaccine;
    private String Quantity;
    private String Supplier;
    /**
     * @param args the command line arguments
     */
    
    public Vaccination(String Vaccine, String Quantity, String Supplier){
        this.Vaccine = Vaccine;
        this.Quantity = Quantity;
        this.Supplier = Supplier;
    }

    public String getVaccine() {
        return Vaccine;
    }

    public void setVaccine(String Vaccine) {
        this.Vaccine = Vaccine;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String Quantity) {
        this.Quantity = Quantity;
    }

    public String getSupplier() {
        return Supplier;
    }

    public void setSupplier(String Supplier) {
        this.Supplier = Supplier;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
