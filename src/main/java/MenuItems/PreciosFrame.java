/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MenuItems;

import static MenuItems.ListadoMateriaPrimaFrame.Id_mp;
import com.mycompany.intersisacotizador_ver2.Conexion;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PreciosFrame extends javax.swing.JFrame {

    private static Connection con;
    private static Conexion conexion;
    public static int Id_mp2 = 0;
    
    public PreciosFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setLocation(getX(), 75);
        conexion = new Conexion();
        cargarDatos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        JPanelDatosGenerales = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        txtbusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dgvprecios = new javax.swing.JTable();
        JPanelDatosGenerales1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnModSacosInter = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txt20inter = new javax.swing.JTextField();
        txt30inter = new javax.swing.JTextField();
        txtsuperinter = new javax.swing.JTextField();
        JPanelDatosGenerales3 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        btnModSacosTer = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txt20ter = new javax.swing.JTextField();
        txt30ter = new javax.swing.JTextField();
        txtsuperter = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        JPanelDatosGenerales.setBackground(new java.awt.Color(252, 252, 252));
        JPanelDatosGenerales.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel2.setText("Materias Primas");

        jLabel5.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel5.setText("Nombre");

        btnModificar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModificarMouseClicked(evt);
            }
        });
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        txtbusqueda.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtbusqueda.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtbusqueda.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtbusqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbusquedaActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelDatosGeneralesLayout = new javax.swing.GroupLayout(JPanelDatosGenerales);
        JPanelDatosGenerales.setLayout(JPanelDatosGeneralesLayout);
        JPanelDatosGeneralesLayout.setHorizontalGroup(
            JPanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanelDatosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanelDatosGeneralesLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addGap(245, 245, 245)
                        .addComponent(btnModificar))
                    .addComponent(jLabel2))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        JPanelDatosGeneralesLayout.setVerticalGroup(
            JPanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosGeneralesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addGroup(JPanelDatosGeneralesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(jLabel5)
                    .addComponent(txtbusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Precios");

        dgvprecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "#MP", "Nombre", "N_Parte", "Precio", "Moneda", "Densidad"
            }
        ));
        jScrollPane1.setViewportView(dgvprecios);

        JPanelDatosGenerales1.setBackground(new java.awt.Color(252, 252, 252));
        JPanelDatosGenerales1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel3.setText("Sacos Intersisa");

        jLabel6.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel6.setText("Saco 20");

        btnModSacosInter.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnModSacosInter.setText("Modificar");
        btnModSacosInter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModSacosInterActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel7.setText("Saco 30");

        jLabel12.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel12.setText("Supersaco");
        jLabel12.setToolTipText("");

        txt20inter.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txt20inter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt20inter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt20inter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt20interActionPerformed(evt);
            }
        });

        txt30inter.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txt30inter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt30inter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt30inter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt30interActionPerformed(evt);
            }
        });

        txtsuperinter.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtsuperinter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtsuperinter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtsuperinter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsuperinterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelDatosGenerales1Layout = new javax.swing.GroupLayout(JPanelDatosGenerales1);
        JPanelDatosGenerales1.setLayout(JPanelDatosGenerales1Layout);
        JPanelDatosGenerales1Layout.setHorizontalGroup(
            JPanelDatosGenerales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosGenerales1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDatosGenerales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addGap(26, 26, 26)
                .addGroup(JPanelDatosGenerales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelDatosGenerales1Layout.createSequentialGroup()
                        .addComponent(btnModSacosInter)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelDatosGenerales1Layout.createSequentialGroup()
                        .addGroup(JPanelDatosGenerales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt20inter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt30inter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsuperinter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(JPanelDatosGenerales1Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelDatosGenerales1Layout.setVerticalGroup(
            JPanelDatosGenerales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosGenerales1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelDatosGenerales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt20inter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(JPanelDatosGenerales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt30inter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(JPanelDatosGenerales1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtsuperinter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnModSacosInter)
                .addContainerGap())
        );

        JPanelDatosGenerales3.setBackground(new java.awt.Color(252, 252, 252));
        JPanelDatosGenerales3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel19.setFont(new java.awt.Font("Segoe UI Light", 1, 14)); // NOI18N
        jLabel19.setText("Sacos Terciaria");

        jLabel20.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel20.setText("Saco 20");

        btnModSacosTer.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        btnModSacosTer.setText("Modificar");
        btnModSacosTer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModSacosTerActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel21.setText("Saco 30");

        jLabel22.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        jLabel22.setText("Supersaco");
        jLabel22.setToolTipText("");

        txt20ter.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txt20ter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt20ter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt20ter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt20terActionPerformed(evt);
            }
        });

        txt30ter.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txt30ter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txt30ter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txt30ter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt30terActionPerformed(evt);
            }
        });

        txtsuperter.setFont(new java.awt.Font("Segoe UI Light", 0, 12)); // NOI18N
        txtsuperter.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtsuperter.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtsuperter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsuperterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanelDatosGenerales3Layout = new javax.swing.GroupLayout(JPanelDatosGenerales3);
        JPanelDatosGenerales3.setLayout(JPanelDatosGenerales3Layout);
        JPanelDatosGenerales3Layout.setHorizontalGroup(
            JPanelDatosGenerales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosGenerales3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanelDatosGenerales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jLabel20))
                .addGap(26, 26, 26)
                .addGroup(JPanelDatosGenerales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelDatosGenerales3Layout.createSequentialGroup()
                        .addComponent(btnModSacosTer)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPanelDatosGenerales3Layout.createSequentialGroup()
                        .addGroup(JPanelDatosGenerales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt20ter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt30ter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsuperter, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(20, Short.MAX_VALUE))))
            .addGroup(JPanelDatosGenerales3Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel19)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        JPanelDatosGenerales3Layout.setVerticalGroup(
            JPanelDatosGenerales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanelDatosGenerales3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JPanelDatosGenerales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txt20ter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(JPanelDatosGenerales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(txt30ter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(JPanelDatosGenerales3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtsuperter, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(btnModSacosTer)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1)
                            .addComponent(JPanelDatosGenerales, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(15, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(JPanelDatosGenerales1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(JPanelDatosGenerales3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(100, 100, 100))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addComponent(JPanelDatosGenerales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JPanelDatosGenerales1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPanelDatosGenerales3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnModificarMouseClicked

    private void txtbusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbusquedaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbusquedaActionPerformed

    private void txt20interActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt20interActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20interActionPerformed

    private void txt30interActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt30interActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt30interActionPerformed

    private void txtsuperinterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsuperinterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsuperinterActionPerformed

    private void txt20terActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt20terActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt20terActionPerformed

    private void txt30terActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt30terActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt30terActionPerformed

    private void txtsuperterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsuperterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsuperterActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        if(txtbusqueda.getText().equals(null))
            cargarTabla("");
        else
            cargarTabla("Full");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModSacosInterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModSacosInterActionPerformed
        // TODO add your handling code here:
        BigDecimal precio1 = new BigDecimal(txtsuperinter.getText());
        BigDecimal precio2 = new BigDecimal(txt20inter.getText());
        BigDecimal precio3 = new BigDecimal(txt30inter.getText());
        if(!txtsuperinter.equals("") && !txt20inter.equals("") && !txt30inter.equals("")){
            try{
                con = conexion.establecerConexion();
                PreparedStatement superinter = con.prepareStatement("update Sacos set precio=? where Id_Saco = ?");
                superinter.setBigDecimal(1,precio1);
                superinter.setInt(2,1);
                superinter.executeUpdate();
                
                PreparedStatement veinteinter = con.prepareStatement("update Sacos set precio=? where Id_Saco = ?");
                veinteinter.setBigDecimal(1,precio2);
                veinteinter.setInt(2,2);
                veinteinter.executeUpdate();
                
                PreparedStatement treintainter = con.prepareStatement("update Sacos set precio=? where Id_Saco = ?");
                treintainter.setBigDecimal(1,precio3);
                treintainter.setInt(2,3);
                treintainter.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Sacos Interisa modificados");

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
            else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos antes de guardar");
        }
    }//GEN-LAST:event_btnModSacosInterActionPerformed

    private void btnModSacosTerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModSacosTerActionPerformed
        // TODO add your handling code here:
        BigDecimal precio1 = new BigDecimal(txtsuperter.getText());
        BigDecimal precio2 = new BigDecimal(txt20ter.getText());
        BigDecimal precio3 = new BigDecimal(txt30ter.getText());
        if(!txtsuperter.equals("") && !txt20ter.equals("") && !txt30ter.equals("")){
            try{
                con = conexion.establecerConexion();
                PreparedStatement superter = con.prepareStatement("update Sacos set precio=? where Id_Saco = ?");
                superter.setBigDecimal(1,precio1);
                superter.setInt(2,4);
                superter.executeUpdate();
                
                PreparedStatement veinteter = con.prepareStatement("update Sacos set precio=? where Id_Saco = ?");
                veinteter.setBigDecimal(1,precio2);
                veinteter.setInt(2,5);
                veinteter.executeUpdate();
                
                PreparedStatement treintater = con.prepareStatement("update Sacos set precio=? where Id_Saco = ?");
                treintater.setBigDecimal(1,precio3);
                treintater.setInt(2,6);
                treintater.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "Sacos Terciaria modificados");

            }catch(SQLException e){
                JOptionPane.showMessageDialog(null, e.toString());
            }
        }
            else{
            JOptionPane.showMessageDialog(null, "Ingrese todos los datos antes de guardar");
        }
    }//GEN-LAST:event_btnModSacosTerActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        int selectedRow = dgvprecios.getSelectedRow();
        if(selectedRow != -1){
            int valor = Integer.parseInt(dgvprecios.getValueAt(selectedRow, 0).toString());
            Id_mp2 = valor;
            PrecioMPFrame pmpf = new PrecioMPFrame();
            pmpf.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(null,"Seleccione una fila para modificar");
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    /**
     * @param args the command line arguments
     */
    public void cargarDatos(){
        ResultSet rs;
        
        try{
            con = conexion.establecerConexion();
            PreparedStatement superinter = con.prepareStatement("select * from Sacos where Id_Saco=1 order by Id_Saco Asc");
            rs = superinter.executeQuery();
            while (rs.next())
                {
                    txtsuperinter.setText(rs.getString("precio"));
                }
            rs.close();
            
            PreparedStatement veinteinter = con.prepareStatement("select * from Sacos where Id_Saco=2 order by Id_Saco Asc");
            rs = veinteinter.executeQuery();
            while (rs.next())
                {
                    txt20inter.setText(rs.getString("precio"));
                }
            rs.close();
            
            PreparedStatement treintainter = con.prepareStatement("select * from Sacos where Id_Saco=3 order by Id_Saco Asc");
            rs = treintainter.executeQuery();
            while (rs.next())
                {
                    txt30inter.setText(rs.getString("precio"));
                }
            rs.close();
            
            PreparedStatement superter = con.prepareStatement("select * from Sacos where Id_Saco=4 order by Id_Saco Asc");
            rs = superter.executeQuery();
            while (rs.next())
                {
                    txtsuperter.setText(rs.getString("precio"));
                }
            rs.close();
            
            PreparedStatement veinteter = con.prepareStatement("select * from Sacos where Id_Saco=5 order by Id_Saco Asc");
            rs = veinteter.executeQuery();
            while (rs.next())
                {
                    txt20ter.setText(rs.getString("precio"));
                }
            rs.close();
            
            PreparedStatement treintater = con.prepareStatement("select * from Sacos where Id_Saco=6 order by Id_Saco Asc");
            rs = treintater.executeQuery();
            while (rs.next())
                {
                    txt30ter.setText(rs.getString("precio"));
                }
            rs.close();
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.toString());
        }  
    }
    
    public void cargarTabla(String sqlQ){
        DefaultTableModel modeloTabla = (DefaultTableModel) dgvprecios.getModel();
        modeloTabla.setRowCount(0);
        
        String codsql = "";
        if (sqlQ.equals(null)){            
            codsql = "select Id_MP as #MP,Nombre,N_Parte,Precio,Moneda,Densidad from MP where Activo = 1";
        }
        else{
            codsql = "select Id_MP as #MP,Nombre,N_Parte,Precio,Moneda,Densidad from MP where Activo = 1 and Nombre like '%"+txtbusqueda.getText()+"%'";
        }
        
        PreparedStatement ps;
        ResultSet rs;
        ResultSetMetaData rsmd;
        int columnas;
        
        int[]anchos = {20,200,20,20,20,20};
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
    }
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
            java.util.logging.Logger.getLogger(PreciosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PreciosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PreciosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PreciosFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PreciosFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanelDatosGenerales;
    private javax.swing.JPanel JPanelDatosGenerales1;
    private javax.swing.JPanel JPanelDatosGenerales3;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnModSacosInter;
    private javax.swing.JButton btnModSacosTer;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTable dgvprecios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt20inter;
    private javax.swing.JTextField txt20ter;
    private javax.swing.JTextField txt30inter;
    private javax.swing.JTextField txt30ter;
    private javax.swing.JTextField txtbusqueda;
    private javax.swing.JTextField txtsuperinter;
    private javax.swing.JTextField txtsuperter;
    // End of variables declaration//GEN-END:variables
}