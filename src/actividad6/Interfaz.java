package actividad6;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.NumberFormatException;

public class Interfaz extends javax.swing.JFrame {

    /**
     * Creates new form Interfaz
     */
    public Interfaz() {
        initComponents();
        setTitle("Friends List");
        setSize(400,200);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jDialog1 = new javax.swing.JDialog();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        btnCreate = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        name = new javax.swing.JLabel();
        number = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtNumber = new javax.swing.JTextField();
        answer = new javax.swing.JLabel();
        btnClean = new javax.swing.JButton();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCreate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnRead.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        name.setText("Name:");

        number.setText("Number:");

        txtNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumberActionPerformed(evt);
            }
        });

        answer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        answer.setText(" ");

        btnClean.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnClean.setText("Clean");
        btnClean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCleanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(answer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(btnCreate)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnRead)
                                .addGap(12, 12, 12)
                                .addComponent(btnUpdate)
                                .addGap(12, 12, 12)
                                .addComponent(btnDelete))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(number)
                                    .addComponent(name))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                    .addComponent(txtNumber))
                                .addGap(18, 18, 18)
                                .addComponent(btnClean)))
                        .addGap(0, 92, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(number)
                            .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(btnClean)))
                .addGap(18, 18, 18)
                .addComponent(answer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnRead)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try {
                    String newName = txtName.getText();
                    String nameNumberString;
                    String name;
                    long number;
                    int index;
                    File file = new File("C:\\Users\\romer\\Documents\\UNIVERSITY\\POO-Programación Orientada a Objetos\\Actividad 6\\Actividad6\\files\\A6friendsContact.txt");
                    if (!file.exists()) {
                            file.createNewFile();
                    }
                    RandomAccessFile raf = new RandomAccessFile(file, "rw");
                    boolean found = false;
                    while (raf.getFilePointer() < raf.length()) {
                            nameNumberString = raf.readLine();
                            String[] lineSplit = nameNumberString.split("!");
                            name = lineSplit[0];
                            number = Long.parseLong(lineSplit[1]);
                            if (name.equals(newName)) {
                                    found = true;
                                    break;
                            }
                    }
                    if (found == true) {
                            File tmpFile = new File("temp.txt");
                            RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
                            raf.seek(0);
                            while (raf.getFilePointer() < raf.length()) {
                                    nameNumberString = raf.readLine();
                                    index = nameNumberString.indexOf('!');
                                    name = nameNumberString.substring( 0, index);
                                    if (name.equals(newName)) {
                                            continue;
                                    }
                                    tmpraf.writeBytes(nameNumberString);
                                    tmpraf.writeBytes(System.lineSeparator());
                            }
                            raf.seek(0);
                            tmpraf.seek(0);
                            while (tmpraf.getFilePointer()
                                    < tmpraf.length()) {
                                    raf.writeBytes(tmpraf.readLine());
                                    raf.writeBytes(System.lineSeparator());
                            }
                            raf.setLength(tmpraf.length());
                            tmpraf.close();
                            raf.close();
                            tmpFile.delete();
                            answer.setText(" Friend deleted. ");
                    }
                    else {
                            raf.close();
                            answer.setText(" Friend does not exist. ");
                    }
            }
            catch (IOException ioe) {
                    answer.setText(String.valueOf(ioe));
            }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
                    String newName = txtName.getText() ;
                    long newNumber = Long.parseLong(txtNumber.getText());
                    String nameNumberString;
                    String name;
                    long number;
                    int index; 
                    File file = new File("C:\\Users\\romer\\Documents\\UNIVERSITY\\POO-Programación Orientada a Objetos\\Actividad 6\\Actividad6\\files\\A6friendsContact.txt");
                    if (!file.exists()) {
                            file.createNewFile();
                    }
                    RandomAccessFile raf= new RandomAccessFile(file, "rw");
                    boolean found = false;
                    while (raf.getFilePointer() < raf.length()) {
                            nameNumberString = raf.readLine();
                            String[] lineSplit= nameNumberString.split("!");
                            name = lineSplit[0];
                            number = Long.parseLong(lineSplit[1]);
                            if ( (name.equals( newName))||(number == newNumber)) {
                                    found = true;
                                    break;
                            }
                    }
                    if (found == false) {
                            nameNumberString= newName + "!"+ String.valueOf(newNumber);
                            raf.writeBytes(nameNumberString);
                            raf.writeBytes(System.lineSeparator());
                            answer.setText(" Friend added. ");
                            raf.close();
                    }
                    else {
                            raf.close();
                            answer.setText(" Friend already exists. ");
                    }
            }
            catch (IOException ioe) {
                    answer.setText(String.valueOf(ioe));
            }
            catch (NumberFormatException nef) {
                    answer.setText(String.valueOf(nef));
            }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumberActionPerformed

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        try {
                    String nameNumberString;
                    String name, newName=txtName.getText();
                    long number;
                    int index;
                    File file = new File("C:\\Users\\romer\\Documents\\UNIVERSITY\\POO-Programación Orientada a Objetos\\Actividad 6\\Actividad6\\files\\A6friendsContact.txt");
                    if (!file.exists()) {
                            file.createNewFile();
                    }
                    RandomAccessFile raf = new RandomAccessFile(file, "rw");
                    boolean found = false;
                    answer.setText("Friend not found.");
                    while (raf.getFilePointer() < raf.length()) {
                            nameNumberString = raf.readLine();
                            String[] lineSplit = nameNumberString.split("!");
                            name = lineSplit[0];
                            number = Long.parseLong(lineSplit[1]);
                            if (name.equals(newName)){
                                txtName.setText(name);
                                txtNumber.setText(String.valueOf(number));
                                answer.setText("Friend was found.");
                            } 
                    }
        }
                    catch (IOException ioe)
                    {
                            answer.setText(String.valueOf(ioe));
                    }
                    catch (NumberFormatException nef)
                    {
                            answer.setText(String.valueOf(nef));
                    }
    }//GEN-LAST:event_btnReadActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        try {
                    String newName = txtName.getText();
                    long newNumber = Long.parseLong(txtNumber.getText());
                    String nameNumberString;
                    String name;
                    long number;
                    int index;
                    File file = new File("C:\\Users\\romer\\Documents\\UNIVERSITY\\POO-Programación Orientada a Objetos\\Actividad 6\\Actividad6\\files\\A6friendsContact.txt");
                    if (!file.exists()) {
                            file.createNewFile();
                    }
                    RandomAccessFile raf = new RandomAccessFile(file, "rw");
                    boolean found = false;
                    while (raf.getFilePointer() < raf.length()) {
                            nameNumberString = raf.readLine();
                            String[] lineSplit = nameNumberString.split("!");
                            name = lineSplit[0];
                            number = Long.parseLong(lineSplit[1]);
                            if (name.equals( newName) ) {
                                    found = true;
                                    break;
                            }
                    }
                    if (found == true) {
                            File tmpFile = new File("temp.txt");
                            RandomAccessFile tmpraf = new RandomAccessFile(tmpFile, "rw");
                            raf.seek(0);
                            while (raf.getFilePointer() < raf.length()) {
                                    nameNumberString = raf.readLine();
                                    index = nameNumberString.indexOf('!');
                                    name = nameNumberString.substring(0, index);
                                    if (name.equals(newName)) {
                                            nameNumberString = name + "!"+ String.valueOf(newNumber);
                                    }
                                    tmpraf.writeBytes(nameNumberString);
                                    tmpraf.writeBytes(
                                            System.lineSeparator());
                            }
                            raf.seek(0);
                            tmpraf.seek(0);
                            while (tmpraf.getFilePointer() < tmpraf.length()) {
                                    raf.writeBytes(tmpraf.readLine());
                                    raf.writeBytes(System.lineSeparator());
                            }
                            raf.setLength(tmpraf.length());
                            tmpraf.close();
                            raf.close();
                            tmpFile.delete();
                            answer.setText(" Friend updated. ");
                    }
                    else {
                            raf.close();
                            answer.setText("Friend does not exist. ");
                    }
            }
            catch (IOException ioe) {
                    answer.setText(String.valueOf(ioe));
            }
            catch (NumberFormatException nef) {
                    answer.setText(String.valueOf(nef));
            }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnCleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCleanActionPerformed
        txtName.setText("");
        txtNumber.setText("");
        answer.setText("");
    }//GEN-LAST:event_btnCleanActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel answer;
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel name;
    private javax.swing.JLabel number;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNumber;
    // End of variables declaration//GEN-END:variables
}
