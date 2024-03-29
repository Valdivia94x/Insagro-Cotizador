/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;

import com.mycompany.intersisacotizador_ver2.Conexion;
import java.awt.Toolkit;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Asus
 */
public class EtapasFrame extends javax.swing.JFrame {

    /**
     * Creates new form EtapasFrame
     */
   
    private static Connection con;
    private static Conexion conexion;
    public EtapasFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setLocation(getX(), 75);
        conexion = new Conexion();
        cargarDatos();
        
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/appicon.png")));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        btnguardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        cbetapas = new javax.swing.JComboBox<>();
        txtNombreMod = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel1.setText("Nombre");

        txtnombre.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtnombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtnombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/guardar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnguardar)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(btnguardar)
                .addGap(32, 32, 32))
        );

        jTabbedPane1.addTab("Alta", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel2.setText("Seleccione");

        cbetapas.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        cbetapas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbetapasItemStateChanged(evt);
            }
        });

        txtNombreMod.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtNombreMod.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombreMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombreMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreModActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel3.setText("Nombre");

        btnEliminar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(19, 19, 19)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(cbetapas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombreMod, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(50, 50, 50)
                .addComponent(btnEliminar)
                .addGap(90, 90, 90))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbetapas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombreMod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnModificar))
                .addGap(24, 24, 24))
        );

        jTabbedPane1.addTab("Modificar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtNombreModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreModActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        String nombre = txtnombre.getText();
        if(!nombre.equals(null))
        {
            try{
                con = conexion.establecerConexion(); 
                if (!nombreExists(con, nombre)){
                    PreparedStatement ps = con.prepareStatement("INSERT INTO Etapa (Nombre,Activo) VALUES (?,?)");
                    ps.setString(1, nombre);
                    ps.setInt(2, 1);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Etapa guardada");
                    limpiar();
                    cargarDatos();
                }else{
                    JOptionPane.showMessageDialog(null, "Ya existe una etapa con este nombre");
                }
            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos antes de guardar");
        }
    }//GEN-LAST:event_btnguardarActionPerformed

    private void cbetapasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbetapasItemStateChanged
        // TODO add your handling code here:
        if(!cbetapas.getSelectedItem().equals(null)){
            Object nombreOb = cbetapas.getSelectedItem();
            String nombre = nombreOb.toString();
            txtNombreMod.setText(nombre);
        }
    }//GEN-LAST:event_cbetapasItemStateChanged

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        Object nombreOb = cbetapas.getSelectedItem();
        String nombre = nombreOb.toString();
        String nombreMod = txtNombreMod.getText();
        
        if(!nombreMod.equals("")){
            try{
                con = conexion.establecerConexion();
                int id = obtenerIdPorNombre(con, nombre);
                PreparedStatement ps = con.prepareStatement("UPDATE Etapa SET Nombre=? WHERE id_Etapa=?");
                ps.setString(1, nombreMod);
                ps.setInt(2, id);
                ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Etapa modificada");
                limpiar2();
                cargarDatos();
                cbetapas.setSelectedItem(nombreMod);

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
            else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos antes de guardar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        Object nombreOb = cbetapas.getSelectedItem();
        String nombre = nombreOb.toString();
        
            try{
                con = conexion.establecerConexion();
                int id = obtenerIdPorNombre(con, nombre);
                PreparedStatement ps = con.prepareStatement("UPDATE Etapa SET Activo=0 WHERE id_Etapa=?");
                ps.setInt(1, id);
                ps.executeUpdate();
                DefaultComboBoxModel model = (DefaultComboBoxModel) cbetapas.getModel();
                model.removeElement(nombre);
                JOptionPane.showMessageDialog(null, "Etapa eliminada");
                limpiar2();
                cargarDatos();

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private boolean nombreExists(Connection con, String nombre) throws SQLException {
        String query = "SELECT COUNT(*) FROM Etapa WHERE Nombre = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, nombre);
            try (ResultSet rs = ps.executeQuery()) {
                rs.next();
                int count = rs.getInt(1);
                return count > 0;
            }
        }
    }
    
    private void limpiar(){
        txtnombre.setText("");
    }
    
    private void limpiar2(){
        txtNombreMod.setText("");
    }
    
    private void cargarDatos(){
        
        /*DefaultComboBoxModel model = (DefaultComboBoxModel) cbetapas.getModel();
        model.removeAllElements();*/
        
        PreparedStatement ps;
        ResultSet rs;
        
        try{
            
            con = conexion.establecerConexion();
            
            if (cbetapas != null){
                ps = con.prepareStatement("SELECT * FROM Etapa WHERE Activo = 1 ORDER BY Nombre ASC");
                rs = ps.executeQuery();
                
                // Create a new DefaultComboBoxModel to replace the existing one
                DefaultComboBoxModel<String> newModel = new DefaultComboBoxModel<>();
                
                while(rs.next()){
                    newModel.addElement(rs.getString("Nombre"));
                }
                cbetapas.setModel(newModel);
                
                rs.close();
            }else {
                JOptionPane.showMessageDialog(null, "Error: cbetapas is null");
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }
    }
    
    private int obtenerIdPorNombre(Connection con, String nombre) throws SQLException {
        int id = -1;

        String query = "SELECT id_Etapa FROM Etapa WHERE Nombre = ?";
        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, nombre);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    id = rs.getInt("id_Etapa");
                }
            }
        }
        return id;
    }
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
            java.util.logging.Logger.getLogger(EtapasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EtapasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EtapasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EtapasFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EtapasFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JComboBox<String> cbetapas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtNombreMod;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
