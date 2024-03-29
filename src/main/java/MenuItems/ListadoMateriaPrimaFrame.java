/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;

import com.mycompany.intersisacotizador_ver2.Conexion;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Asus
 */
public class ListadoMateriaPrimaFrame extends javax.swing.JFrame {

    private static Connection con;
    private static Conexion conexion;
    public static int Id_mp = 0;
    
    public ListadoMateriaPrimaFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setLocation(getX(), 75);
        conexion = new Conexion();
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        rbActivas = new javax.swing.JRadioButton();
        rbInactivas = new javax.swing.JRadioButton();
        btnFiltrar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvprecios = new javax.swing.JTable();
        btnActivar = new javax.swing.JButton();
        btnInactivar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1057, 477));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Listado Materia Prima");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        jLabel4.setText("Materia Prima");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        jLabel5.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbActivas);
        rbActivas.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        rbActivas.setSelected(true);
        rbActivas.setText("ACTIVAS");
        rbActivas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbActivasItemStateChanged(evt);
            }
        });

        buttonGroup1.add(rbInactivas);
        rbInactivas.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        rbInactivas.setForeground(new java.awt.Color(204, 0, 0));
        rbInactivas.setText("INACTIVAS");
        rbInactivas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbInactivasItemStateChanged(evt);
            }
        });

        btnFiltrar.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        btnFiltrar.setText("Filtrar");
        btnFiltrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiltrarActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
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
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(44, 44, 44)
                .addComponent(rbActivas)
                .addGap(18, 18, 18)
                .addComponent(rbInactivas)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFiltrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 296, Short.MAX_VALUE)
                .addComponent(btnModificar)
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbActivas)
                    .addComponent(rbInactivas)
                    .addComponent(btnFiltrar)
                    .addComponent(btnModificar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgvprecios.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        dgvprecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#MP", "Nombre", "Proveedor", "Precio", "Moneda", "Densidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(dgvprecios);

        btnActivar.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        btnActivar.setText("Reactivar");
        btnActivar.setEnabled(false);
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        btnInactivar.setFont(new java.awt.Font("Segoe UI Light", 0, 10)); // NOI18N
        btnInactivar.setText("Inactivar");
        btnInactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInactivarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logoinsa.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(315, 315, 315)
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnActivar)
                        .addGap(63, 63, 63)
                        .addComponent(btnInactivar)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActivar)
                    .addComponent(btnInactivar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void rbActivasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbActivasItemStateChanged
        // TODO add your handling code here:      
        if(rbActivas.isSelected()){
            btnInactivar.setEnabled(true);
        }else
        {
            btnInactivar.setEnabled(false);
        }
    }//GEN-LAST:event_rbActivasItemStateChanged

    private void rbInactivasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbInactivasItemStateChanged
        // TODO add your handling code here:
        if(rbInactivas.isSelected()){
            btnActivar.setEnabled(true);
            btnModificar.setEnabled(false);
        }else
        {
            btnActivar.setEnabled(false);
            btnModificar.setEnabled(true);
        }
    }//GEN-LAST:event_rbInactivasItemStateChanged

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int selectedRow = dgvprecios.getSelectedRow();
        if(selectedRow != -1){
            int valor = Integer.parseInt(dgvprecios.getValueAt(selectedRow, 0).toString());
            Id_mp = valor;
            ModificarMateriaPrimaFrame mmpf = new ModificarMateriaPrimaFrame();
            mmpf.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione una fila para modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnFiltrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiltrarActionPerformed
        // TODO add your handling code here:
        DefaultTableModel modeloTabla = (DefaultTableModel) dgvprecios.getModel();
        modeloTabla.setRowCount(0);
        
        // Agrega los nombres de las columnas
        //modeloTabla.setColumnIdentifiers(new Object[]{"NCot", "Fecha", "Cliente", "Etapa", "Descripción"});
        
        String codsql = "";
        Object nombre = txtNombre.getText();
        
        //-----ACTIVAS-----
        if (rbActivas.isSelected() && !txtNombre.equals("")){
            codsql = "select Id_MP as #MP,Nombre,Proveedor,Precio,Moneda,Densidad from MP where Activo = 1 and Nombre like '%"+nombre+"%' ORDER BY Id_MP Desc";
        }
        else if (rbActivas.isSelected()){
            codsql = "select Id_MP as #MP,Nombre,Proveedor,Precio,Moneda,Densidad from MP where Activo = 1 ORDER BY Id_MP Desc";
        }
        //-----INACTIVAS-----
        else if (rbInactivas.isSelected() && !txtNombre.equals("")){
            codsql = "select Id_MP as #MP,Nombre,Proveedor,Precio,Moneda,Densidad from MP where Activo = 0 and Nombre like '%"+nombre+"%' ORDER BY Id_MP Desc";
        }
        else if (rbInactivas.isSelected()){
            codsql = "select Id_MP as #MP,Nombre,Proveedor,Precio,Moneda,Densidad from MP where Activo = 0 ORDER BY Id_MP Desc";
        }
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        int[]anchos = {10,300,150,10,10,10};
        for(int i = 0; i < dgvprecios.getColumnCount(); i++){
            dgvprecios.getColumnModel().getColumn(i).setPreferredWidth(anchos[i]);
        }
        
        try{
            con = conexion.establecerConexion();
            ps = con.prepareStatement(codsql);
            rs = ps.executeQuery();
            rsmd = rs.getMetaData();
            columnas = rsmd.getColumnCount();
            
            while(rs.next()){
                Object[] fila = new Object[columnas];
                for(int i = 0; i < columnas; i++){
                    fila[i] = rs.getObject(i+1);
                }
                modeloTabla.addRow(fila);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
            
        }
    }//GEN-LAST:event_btnFiltrarActionPerformed

    private void btnInactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInactivarActionPerformed
        // TODO add your handling code here:
        int selectedRow = dgvprecios.getSelectedRow();
        int selectedId = (int) dgvprecios.getValueAt(selectedRow, 0);
        
        try{
                con = conexion.establecerConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE MP SET Activo=0 WHERE Id_Mp=?");
                ps.setInt(1, selectedId);
                ps.executeUpdate();
                // Remove the row from the table
                ((DefaultTableModel) dgvprecios.getModel()).removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Materia prima eliminada");

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
    }//GEN-LAST:event_btnInactivarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        // TODO add your handling code here:
        int selectedRow = dgvprecios.getSelectedRow();
        int selectedId = (int) dgvprecios.getValueAt(selectedRow, 0);
        
        try{
                con = conexion.establecerConexion();
                PreparedStatement ps = con.prepareStatement("UPDATE MP SET Activo=1 WHERE Id_Mp=?");
                ps.setInt(1, selectedId);
                ps.executeUpdate();
                // Remove the row from the table
                ((DefaultTableModel) dgvprecios.getModel()).removeRow(selectedRow);
                JOptionPane.showMessageDialog(null, "Materia prima activada");

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
    }//GEN-LAST:event_btnActivarActionPerformed

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
            java.util.logging.Logger.getLogger(ListadoMateriaPrimaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListadoMateriaPrimaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListadoMateriaPrimaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListadoMateriaPrimaFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListadoMateriaPrimaFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnFiltrar;
    private javax.swing.JButton btnInactivar;
    private javax.swing.JButton btnModificar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable dgvprecios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbActivas;
    private javax.swing.JRadioButton rbInactivas;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
