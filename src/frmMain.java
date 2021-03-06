
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Siti Afiyah
 */
public class frmMain extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    public frmMain() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNIS = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtKelas = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtAlamat = new java.awt.TextArea();
        rdLaki = new javax.swing.JRadioButton();
        rdPerempuan = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        Reset = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBackground(new java.awt.Color(255, 51, 51));
        jPanel5.setLayout(null);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("FORM BIODATA SISWA SMK TELKOM ");
        jPanel5.add(jLabel8);
        jLabel8.setBounds(48, 16, 480, 40);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("The Real Informatic School");
        jPanel5.add(jLabel9);
        jLabel9.setBounds(50, 50, 240, 30);

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));
        jPanel2.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NIS");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(20, 60, 50, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Nama");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(20, 120, 50, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Jenis Kelamin");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 180, 110, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Kelas");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(20, 230, 70, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Email");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 290, 60, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("Alamat");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(20, 350, 80, 20);
        jPanel2.add(txtNIS);
        txtNIS.setBounds(20, 80, 200, 30);
        jPanel2.add(txtNama);
        txtNama.setBounds(20, 140, 200, 30);
        jPanel2.add(txtKelas);
        txtKelas.setBounds(20, 250, 200, 30);
        jPanel2.add(txtEmail);
        txtEmail.setBounds(20, 310, 200, 30);
        jPanel2.add(txtAlamat);
        txtAlamat.setBounds(20, 370, 260, 100);

        buttonGroup1.add(rdLaki);
        rdLaki.setText("Laki-Laki");
        jPanel2.add(rdLaki);
        rdLaki.setBounds(20, 200, 90, 23);

        buttonGroup1.add(rdPerempuan);
        rdPerempuan.setText("Perempuan");
        jPanel2.add(rdPerempuan);
        rdPerempuan.setBounds(120, 200, 100, 23);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel1.setText("ISIAN DATA SISWA");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(80, 10, 180, 30);
        jPanel2.add(jSeparator1);
        jSeparator1.setBounds(0, 42, 330, 10);

        jPanel4.setBackground(new java.awt.Color(102, 255, 102));
        jPanel4.setLayout(null);

        tblData.setBackground(new java.awt.Color(153, 255, 153));
        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NIS", "NamaSiswa", "JenisKelamin", "Kelas", "Email", "Alamat"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jPanel4.add(jScrollPane1);
        jScrollPane1.setBounds(20, 20, 470, 400);

        jPanel3.setBackground(new java.awt.Color(102, 255, 102));
        jPanel3.setLayout(null);

        btnAdd.setText("Save");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel3.add(btnAdd);
        btnAdd.setBounds(30, 10, 80, 30);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel3.add(btnDelete);
        btnDelete.setBounds(120, 10, 80, 30);

        Reset.setText("Clear");
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        jPanel3.add(Reset);
        Reset.setBounds(210, 10, 80, 30);

        btnRefresh.setText("Refresh");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        jPanel3.add(btnRefresh);
        btnRefresh.setBounds(300, 10, 80, 30);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel3.add(btnEdit);
        btnEdit.setBounds(390, 10, 80, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 639, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 9, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(0, 10, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        int baris =tblData.getSelectedRow();
        if (baris != -1){
            txtNIS.setText(tblData.getValueAt(baris, 0).toString());
            txtNama.setText(tblData.getValueAt(baris, 1).toString());

            if("Laki-laki".equals(tblData.getValueAt(baris, 2).toString())){
                rdLaki.setSelected(true);
            }else{
                rdPerempuan.setSelected(true);
            }
            txtKelas.setText(tblData.getValueAt(baris, 3).toString());
            txtEmail.setText(tblData.getValueAt(baris, 4).toString());
            txtAlamat.setText(tblData.getValueAt(baris, 5).toString());
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if ("".equals(txtNIS.getText())|| "".equals(txtAlamat.getText())||
            "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            String JK = "";
            if (rdLaki.isSelected()){
                JK = "L";
            }else{
                JK = "P";
            }

            String SQL = "INSERT INTO t_siswa (NIS,NamaSiswa,JenisKelamin,Kelas,Email,Alamat) "
            + "VALUES ('"+txtNIS.getText()+"', '"+txtNama.getText()+"', '"+JK+"',"
            +"'"+txtKelas.getText()+"','"+txtEmail.getText()+"','"+txtAlamat.getText()+"')";

            int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }

        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        int baris = tblData.getSelectedRow();
        if(baris != -1){
            String NIS = tblData.getValueAt(baris, 0).toString();
            String SQL = "DELETE FROM t_siswa WHERE NIS='"+NIS+"'";
            int status = KoneksiDB.execute(SQL);
            if(status==1){
                JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Sukses", JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal dihapus", "Gagal", JOptionPane.WARNING_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "Pilih Baris Data Terlebih dahulu", "Error", JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
        txtNama.setText("");
        txtNIS.setText("");
        txtKelas.setText("");
        buttonGroup1.clearSelection();
        txtEmail.setText("");
        txtAlamat.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_ResetActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        selectData();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRefreshActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        if ("".equals(txtNIS.getText())|| "".equals(txtAlamat.getText())||
            "".equals(txtKelas.getText()) || "".equals(txtNama.getText()) || "".equals(txtEmail.getText())) {
            JOptionPane.showMessageDialog(this, "Harap Lengkapi Data", "Error", JOptionPane.WARNING_MESSAGE);
        }else{
            String JK = "";
            if (rdLaki.isSelected()){
                JK = "L";
            }else{
                JK = "P";
            }

            String SQL = "UPDATE t_siswa.SET "
            + "WHERE NamaSiswa='"+txtNama.getText()+"',"+"WHERE JenisKelamin='"+JK+"'"
            + "WHERE Kelas='"+txtKelas.getText()+"',"+ "WHERE Email='" +txtEmail.getText()+"'"
            + "WHERE Alamat='"+txtAlamat.getText()+"'"
            + "WHERE NIS='"+txtNIS.getText()+"'";

            int status = KoneksiDB.execute(SQL);
            if(status == 1){
                JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Sukses", JOptionPane.INFORMATION_MESSAGE);
                selectData();
            }else{
                JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Sukses", JOptionPane.WARNING_MESSAGE);
            }}
            // TODO add your handling code here:
    }//GEN-LAST:event_btnEditActionPerformed

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
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Reset;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRefresh;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton rdLaki;
    private javax.swing.JRadioButton rdPerempuan;
    private javax.swing.JTable tblData;
    private java.awt.TextArea txtAlamat;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtKelas;
    private javax.swing.JTextField txtNIS;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables

    private void selectData() {
        String kolom[] = {"NIS","NamaSiswa","JenisKelamin","Kelas","Email","Alamat"};
        DefaultTableModel dtm = new DefaultTableModel(null, kolom);
        String SQL = "SELECT * FROM t_siswa";
        ResultSet rs = KoneksiDB.executeQuery(SQL);
        
        try{
            while(rs.next()){
                String NIS = rs.getString(1);
                String NamaSiswa = rs.getString(2);
                String JenisKelamin = "";
                if("L".equals(rs.getString(3))){
                    JenisKelamin = "Laki-Laki";
                }else {
                    JenisKelamin = "Peremuan";
                }
                String Kelas = rs.getString(4);
                String Email = rs.getString(5);
                String Alamat = rs.getString(6);
                String data[] = {NIS, NamaSiswa, JenisKelamin, Kelas, Email, Alamat};
                dtm.addRow(data);
            }
        }catch (SQLException ex){
            Logger.getLogger(frmMain.class.getName()).log(Level.SEVERE, null, ex);
        }
        tblData.setModel(dtm);
    }
}
