/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vaccination;

import java.io.*;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author liyaw
 */
public class ManageVaccine extends javax.swing.JFrame {

    /**
     * Creates new form ManageVaccine
     */
    DefaultListModel listModel = new DefaultListModel();
    
    public ManageVaccine() {
        initComponents();
        initList();
    }
    
    public void initList(){
        listVaccine.setModel(listModel);
        File archivo = new File("Vaccines.txt");
        FileReader fr = null;
        try {
                fr = new FileReader(archivo);
        } catch (FileNotFoundException e3) {
                e3.printStackTrace();
        }
        BufferedReader br = new BufferedReader(fr);

        String line = null;
        try {
                while ((line = br.readLine()) != null) {
                    listModel.addElement(line);
                }
                 fr.close();
        } catch (IOException e2) {
                e2.printStackTrace();
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtVaccine = new javax.swing.JTextField();
        txtQuantity = new javax.swing.JTextField();
        txtSupplier = new javax.swing.JTextField();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnGeneratePdf = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listVaccine = new javax.swing.JList<>();
        lblCentre = new javax.swing.JLabel();
        txtCentre = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuAppointment = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vaccine");

        jLabel2.setText("Quantity");

        jLabel3.setText("Supplier");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnGeneratePdf.setText("Generate PDF");
        btnGeneratePdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneratePdfActionPerformed(evt);
            }
        });

        listVaccine.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listVaccineMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listVaccine);

        lblCentre.setText("Centre");

        jMenu1.setText("Go To...");

        menuAppointment.setText("Manage Appointment");
        menuAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAppointmentActionPerformed(evt);
            }
        });
        jMenu1.add(menuAppointment);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblCentre)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtVaccine)
                            .addComponent(txtQuantity)
                            .addComponent(txtSupplier)
                            .addComponent(txtCentre)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(btnGeneratePdf, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnUpdate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDelete)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnSave)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCentre)
                    .addComponent(txtCentre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtSupplier, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnGeneratePdf)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnAdd)
                    .addComponent(btnSave))
                .addGap(27, 27, 27))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        //DefaultListModel listModel = new DefaultListModel();
        int index = listVaccine.getSelectedIndex();
        {
            String a = txtVaccine.getText() + " " + txtCentre.getText() + " " +txtQuantity.getText() + " " + txtSupplier.getText();
            listModel.setElementAt(a, index);
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try { // trying to save file
            BufferedWriter bw = new BufferedWriter(new FileWriter("Vaccines.txt"));
            for (int i = 0; i < listVaccine.getModel().getSize(); i++) { // opens a cycle to automatically
                // store data of all items
                bw.write(listVaccine.getModel().getElementAt(i)); // writing a line from jList1
                bw.newLine(); // making a new line for the next item (by removing this line, You will write
                                                    // only one line of all items in file)
            }
            bw.close();
            JOptionPane.showMessageDialog(null, "Records successfully updated.");
            } catch (IOException e1) {
            e1.printStackTrace();
            }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int index = listVaccine.getSelectedIndex();
        DefaultListModel listModel = new DefaultListModel();
        if (index >= 0) { // Remove only if a particular item is selected
                int result = JOptionPane.showConfirmDialog(null, "Confirm delete this record?", "Delete",
                                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (result == JOptionPane.YES_OPTION) {
                        listModel.removeElementAt(index);
                        JOptionPane.showMessageDialog(null, "Record successfully deleted.");
                } else if (result == JOptionPane.NO_OPTION) {
                        JOptionPane.getRootFrame().dispose();
                }
        } else {
                JOptionPane.showMessageDialog(null, "Please select the specific row to be delete.");
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String vaccine = txtVaccine.getText();
        String centre = txtCentre.getText();
        String quantity = txtQuantity.getText();
        String supplier = txtSupplier.getText();

        if (vaccine.isEmpty() || quantity.isEmpty() || supplier.isEmpty() || centre.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please do not leave any empty field.");
        } else if(quantity.contains("-")){
            JOptionPane.showMessageDialog(null, "Please do not input negative number.");
        }else {
                FileReader rfv = null;
                BufferedReader brv = null;

                try {
                        rfv = new FileReader("Vaccines.txt");
                } catch (FileNotFoundException e1) {
                        System.out.println("File not found.");
                }
                brv = new BufferedReader(rfv);
                String line = null;
                Boolean check = false;
                String s = "0,0";
                String[] details = s.split(" ");
                try {

                        while ((line = brv.readLine()) != null) {
                                if (line.contains(vaccine) && line.contains(centre)) {
                                        check = true;
                                        s = line;
                                        details = s.split(" ");
                                }
                        }
                } catch (IOException e1) {
                        System.out.println("Error on reading lines.");
                }
                if (check = true) {
                        JOptionPane.showMessageDialog(null, "Vaccine already existed in database.");
                        txtVaccine.setText("");
                        txtCentre.setText("");
                        txtQuantity.setText("");
                        txtSupplier.setText("");

                } else if (check = false) {

                        File file = new File("Vaccines.txt");

                        if (!file.exists()) {
                                try {
                                        file.createNewFile();
                                } catch (IOException e1) {
                                        System.out.println("Unable to create new file.");
                                }
                                PrintWriter pw = null;
                                try {
                                        pw = new PrintWriter(file);
                                } catch (FileNotFoundException e1) {
                                        System.out.println("file not found.");
                                }
                                pw.println(vaccine + " " + quantity + " " + supplier + " ");
                                // get value from text box
                                JOptionPane.showMessageDialog(null, "Vaccine successfully created.");
                                pw.flush();
                                pw.close();
                                txtVaccine.setText("");
                                txtCentre.setText("");
                                txtQuantity.setText("");
                                txtSupplier.setText("");

                        } else if (file.exists()) { // save the data into existing file
                                PrintWriter pw = null;
                                try {
                                        pw = new PrintWriter(new FileWriter(file, true));
                                } catch (IOException e1) {
                                        e1.printStackTrace();
                                }
                                pw.println(vaccine + " " + quantity + " " + supplier + " ");
                                // get value from text box
                                JOptionPane.showMessageDialog(null, "Vaccine successfully created.");
                                pw.flush();
                                pw.close();
                                txtVaccine.setText("");
                                txtCentre.setText("");
                                txtQuantity.setText("");
                                txtSupplier.setText("");

                        }
                }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void menuAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAppointmentActionPerformed
        // TODO add your handling code here:
        new AdminMainPage().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_menuAppointmentActionPerformed

    private void btnGeneratePdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneratePdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGeneratePdfActionPerformed

    private void listVaccineMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listVaccineMouseClicked
        // TODO add your handling code here:
        String selected = listVaccine.getSelectedValue().toString();
        String[] details = selected.split(" ");
        txtVaccine.setText(details[0]);
        txtCentre.setText(details[1]);
        txtQuantity.setText(details[2]);
        txtSupplier.setText(details[3]);
    }//GEN-LAST:event_listVaccineMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManageVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageVaccine.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageVaccine().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGeneratePdf;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCentre;
    private javax.swing.JList<String> listVaccine;
    private javax.swing.JMenuItem menuAppointment;
    private javax.swing.JTextField txtCentre;
    private javax.swing.JTextField txtQuantity;
    private javax.swing.JTextField txtSupplier;
    private javax.swing.JTextField txtVaccine;
    // End of variables declaration//GEN-END:variables
}
