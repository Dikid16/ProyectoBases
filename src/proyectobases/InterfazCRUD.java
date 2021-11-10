/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectobases;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class InterfazCRUD extends javax.swing.JFrame implements ActionListener
{
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox8 = new javax.swing.JCheckBox();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jCheckBox17 = new javax.swing.JCheckBox();
        jButton5 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setExtendedState(6);

        jButton1.setText("Crear");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Buscar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Paises");

        jLabel2.setText("Ciudades");

        jLabel3.setText("Idiomas");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTable3);

        jCheckBox4.setText("Código");
        jCheckBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox4ActionPerformed(evt);
            }
        });

        jCheckBox5.setText("Nombre");
        jCheckBox5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox5ActionPerformed(evt);
            }
        });

        jCheckBox6.setText("Región");
        jCheckBox6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox6ActionPerformed(evt);
            }
        });

        jCheckBox7.setText("Continente");
        jCheckBox7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox7ActionPerformed(evt);
            }
        });

        jLabel4.setText("Información Países");

        jCheckBox8.setText("Superficie");
        jCheckBox8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox8ActionPerformed(evt);
            }
        });

        jCheckBox9.setText("Año de Independencia");
        jCheckBox9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox9ActionPerformed(evt);
            }
        });

        jCheckBox10.setText("Población");
        jCheckBox10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox10ActionPerformed(evt);
            }
        });

        jCheckBox11.setText("GNP");
        jCheckBox11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox11ActionPerformed(evt);
            }
        });

        jCheckBox12.setText("GNPold");
        jCheckBox12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox12ActionPerformed(evt);
            }
        });

        jCheckBox13.setText("Nombre Local");
        jCheckBox13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox13ActionPerformed(evt);
            }
        });

        jCheckBox14.setText("Tipo de Gobierno");
        jCheckBox14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox14ActionPerformed(evt);
            }
        });

        jCheckBox15.setText("Cabeza de Estado");
        jCheckBox15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox15ActionPerformed(evt);
            }
        });

        jCheckBox16.setText("Capital");
        jCheckBox16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox16ActionPerformed(evt);
            }
        });

        jCheckBox17.setText("Code 2");
        jCheckBox17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox17ActionPerformed(evt);
            }
        });

        jButton5.setText("Listar tabla completa");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel6.setText("Tablas de la Base \"World\"");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Paises");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Ciudades");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Idiomas");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Esperanza de Vida");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jCheckBox10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox9, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                                .addComponent(jCheckBox1)
                                .addComponent(jCheckBox13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jCheckBox11))
                            .addComponent(jRadioButton1)
                            .addComponent(jRadioButton2)
                            .addComponent(jRadioButton3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton5)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 620, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 796, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox6)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jCheckBox8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox15)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jCheckBox17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBox17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox17ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox17ActionPerformed

    private void jCheckBox16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox16ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox16ActionPerformed

    private void jCheckBox15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox15ActionPerformed

    private void jCheckBox14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox14ActionPerformed

    private void jCheckBox13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox13ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox13ActionPerformed

    private void jCheckBox12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox12ActionPerformed

    private void jCheckBox11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox11ActionPerformed

    private void jCheckBox10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox10ActionPerformed

    private void jCheckBox9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox9ActionPerformed

    private void jCheckBox8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox8ActionPerformed

    private void jCheckBox7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox7ActionPerformed

    private void jCheckBox6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox6ActionPerformed

    private void jCheckBox5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox5ActionPerformed

    private void jCheckBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(this.jRadioButton1.isSelected())
            this.buscarPais();
        if(this.jRadioButton2.isSelected())
            this.buscarCiudad();
        if(this.jRadioButton3.isSelected())
            this.buscarIdioma();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(this.jRadioButton1.isSelected()){
            this.jLabel4.setVisible(true);
            this.jLabel4.setText("Información de Paises");
            this.jCheckBox4.setVisible(true);
            this.jCheckBox4.setText("Código");
            this.jCheckBox5.setVisible(true);                
            this.jCheckBox5.setText("Nombre");                
            this.jCheckBox6.setVisible(true);
            this.jCheckBox6.setText("Continente");                
            this.jCheckBox7.setVisible(true);
            this.jCheckBox7.setText("Región");                
            this.jCheckBox8.setVisible(true);
            this.jCheckBox8.setText("Superficie");                
            this.jCheckBox9.setVisible(true);
            this.jCheckBox9.setText("Año de Independencia");                
            this.jCheckBox10.setVisible(true);
            this.jCheckBox10.setText("Población");  
            this.jCheckBox1.setVisible(true);
            this.jCheckBox1.setText("Esperanza de Vida");     
            this.jCheckBox11.setVisible(true);
            this.jCheckBox11.setText("GNP");                
            this.jCheckBox12.setVisible(true);
            this.jCheckBox12.setText("GNPOld");
            this.jCheckBox13.setVisible(true);
            this.jCheckBox13.setText("Nombre Local");                
            this.jCheckBox14.setVisible(true);
            this.jCheckBox14.setText("Tipo de Gobierno");                
            this.jCheckBox15.setVisible(true);
            this.jCheckBox15.setText("Cabeza de Estado");                
            this.jCheckBox16.setVisible(true);
            this.jCheckBox16.setText("Capital");                
            this.jCheckBox17.setVisible(true);
            this.jCheckBox17.setText("Code 2");
        }
        else{
        this.jTable1.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jCheckBox4.setVisible(false);
        this.jCheckBox5.setVisible(false);
        this.jCheckBox6.setVisible(false);
        this.jCheckBox7.setVisible(false);
        this.jCheckBox8.setVisible(false);
        this.jCheckBox9.setVisible(false);
        this.jCheckBox10.setVisible(false);
        this.jCheckBox11.setVisible(false);
        this.jCheckBox12.setVisible(false);
        this.jCheckBox13.setVisible(false);
        this.jCheckBox14.setVisible(false);
        this.jCheckBox15.setVisible(false);
        this.jCheckBox16.setVisible(false);
        this.jCheckBox17.setVisible(false);
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(this.jRadioButton2.isSelected()){
                this.jLabel4.setVisible(true);
                this.jLabel4.setText("Información Ciudades");
                this.jCheckBox4.setVisible(true);
                this.jCheckBox4.setText("Id");
                this.jCheckBox5.setVisible(true);
                this.jCheckBox5.setText("Nombre");
                this.jCheckBox6.setVisible(true);
                this.jCheckBox6.setText("Código de País");
                this.jCheckBox7.setVisible(true);
                this.jCheckBox7.setText("Distrito");
                this.jCheckBox8.setVisible(true);
                this.jCheckBox8.setText("Población");
                this.jCheckBox9.setVisible(false);
                this.jCheckBox10.setVisible(false);
                this.jCheckBox1.setVisible(false);
                this.jCheckBox11.setVisible(false);
                this.jCheckBox12.setVisible(false);
                this.jCheckBox13.setVisible(false);
                this.jCheckBox14.setVisible(false);
                this.jCheckBox15.setVisible(false);
                this.jCheckBox16.setVisible(false);
                this.jCheckBox17.setVisible(false);                
            }
            else{
            this.jTable2.setVisible(false);
            this.jLabel4.setVisible(false);
            this.jCheckBox4.setVisible(false);
            this.jCheckBox5.setVisible(false);
            this.jCheckBox6.setVisible(false);
            this.jCheckBox7.setVisible(false);
            this.jCheckBox8.setVisible(false);
            this.jCheckBox9.setVisible(false);
            this.jCheckBox10.setVisible(false);
            this.jCheckBox1.setVisible(false);
            this.jCheckBox11.setVisible(false);
            this.jCheckBox12.setVisible(false);
            this.jCheckBox13.setVisible(false);
            this.jCheckBox14.setVisible(false);
            this.jCheckBox15.setVisible(false);
            this.jCheckBox16.setVisible(false);
            this.jCheckBox17.setVisible(false);
            }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(this.jRadioButton3.isSelected()){
                this.jLabel4.setVisible(true);
                this.jLabel4.setText("Información Idiomas");
                this.jCheckBox4.setVisible(true);
                this.jCheckBox4.setText("Código de País");
                this.jCheckBox5.setVisible(true);
                this.jCheckBox5.setText("Idioma");
                this.jCheckBox6.setVisible(true);
                this.jCheckBox6.setText("¿Es Oficial?");
                this.jCheckBox7.setVisible(true);
                this.jCheckBox7.setText("Porcentaje Idioma Hablado");
                this.jCheckBox8.setVisible(false);
                this.jCheckBox9.setVisible(false);
                this.jCheckBox10.setVisible(false);
                this.jCheckBox1.setVisible(false);
                this.jCheckBox11.setVisible(false);
                this.jCheckBox12.setVisible(false);
                this.jCheckBox13.setVisible(false);
                this.jCheckBox14.setVisible(false);
                this.jCheckBox15.setVisible(false);
                this.jCheckBox16.setVisible(false);
                this.jCheckBox17.setVisible(false);
            }
            else{
            this.jTable3.setVisible(false);
            this.jLabel4.setVisible(false);
            this.jCheckBox4.setVisible(false);
            this.jCheckBox5.setVisible(false);
            this.jCheckBox6.setVisible(false);
            this.jCheckBox7.setVisible(false);
            this.jCheckBox8.setVisible(false);
            this.jCheckBox9.setVisible(false);
            this.jCheckBox10.setVisible(false);
            this.jCheckBox1.setVisible(false);
            this.jCheckBox11.setVisible(false);
            this.jCheckBox12.setVisible(false);
            this.jCheckBox13.setVisible(false);
            this.jCheckBox14.setVisible(false);
            this.jCheckBox15.setVisible(false);
            this.jCheckBox16.setVisible(false);
            this.jCheckBox17.setVisible(false);
            }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.enlistar();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.jRadioButton1.isSelected())
            this.crearPais();
        if(this.jRadioButton2.isSelected())
            this.crearCiudad();
        if(this.jRadioButton3.isSelected())
            this.crearIdioma();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(this.jRadioButton1.isSelected())
            this.modificarPais();
        if(this.jRadioButton2.isSelected())
            this.modificarCiudad();
        if(this.jRadioButton3.isSelected())
            this.modificarIdioma();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(this.jRadioButton1.isSelected())
            this.eliminarPais();
        if(this.jRadioButton2.isSelected())
            this.eliminarCiudad();
        if(this.jRadioButton3.isSelected())
            this.eliminarIdioma();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox17;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    // End of variables declaration//GEN-END:variables

    private Interfaz ppal;
    
    /**
     * Creates new form InterfazCRUD
     * @param ppal
     */
    public InterfazCRUD(Interfaz ppal) {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.ppal=ppal;
        this.jTable1.setVisible(false);
        this.jTable2.setVisible(false);
        this.jTable3.setVisible(false);
        this.jLabel4.setVisible(false);
        this.jCheckBox4.setVisible(false);
        this.jCheckBox5.setVisible(false);
        this.jCheckBox6.setVisible(false);
        this.jCheckBox7.setVisible(false);
        this.jCheckBox8.setVisible(false);
        this.jCheckBox9.setVisible(false);
        this.jCheckBox10.setVisible(false);
        this.jCheckBox1.setVisible(false);
        this.jCheckBox11.setVisible(false);
        this.jCheckBox12.setVisible(false);
        this.jCheckBox13.setVisible(false);
        this.jCheckBox14.setVisible(false);
        this.jCheckBox15.setVisible(false);
        this.jCheckBox16.setVisible(false);
        this.jCheckBox17.setVisible(false);
    }
    private void poneaEscuchar()
    {
        this.jRadioButton1.addActionListener(this);
        this.jRadioButton2.addActionListener(this);
        this.jRadioButton3.addActionListener(this);
    }
    private void enlistar(){
        if(this.jRadioButton1.isSelected()){
            this.jTable1.setVisible(true);
            this.jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            DefaultTableModel tabla1 = new DefaultTableModel();//pasar el codigo a el metodo buscar
            tabla1.addColumn("Código");
            tabla1.addColumn("Nombre");
            tabla1.addColumn("Continente");
            tabla1.addColumn("Región");
            tabla1.addColumn("Superficie");
            tabla1.addColumn("Año de Independencia");
            tabla1.addColumn("Población");
            tabla1.addColumn("Esperanza de Vida");
            tabla1.addColumn("GNP");
            tabla1.addColumn("GNPOld");
            tabla1.addColumn("Nombre Local");
            tabla1.addColumn("Tipo de Gobierno");
            tabla1.addColumn("Cabeza de Estado");
            tabla1.addColumn("Capital");
            tabla1.addColumn("Código 2");
            this.jTable1.setModel(tabla1);
            String[] busqueda1 = new String[15];

            try {
                Statement st = Interfaz.con.createStatement();
                ResultSet rs = st.executeQuery("select * from country order by 1");
                while(rs.next())
                {
                    for(int i=0;i<15;i++){
                        busqueda1[i]=rs.getString(i+1);
                    }
                    tabla1.addRow(busqueda1);
                }

            }
            catch (SQLException ex) {
                Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(this.jRadioButton2.isSelected()){
            this.jTable2.setVisible(true);
            this.jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            DefaultTableModel tabla1 = new DefaultTableModel();//pasar el codigo a el metodo buscar
            tabla1.addColumn("Id");
            tabla1.addColumn("Nombre");
            tabla1.addColumn("Código de País");
            tabla1.addColumn("Distrito");
            tabla1.addColumn("Población");
            this.jTable2.setModel(tabla1);
            String[] busqueda1 = new String[5];

            try {
                Statement st = Interfaz.con.createStatement();
                ResultSet rs = st.executeQuery("select * from city order by 1");
                while(rs.next())
                {
                    for(int i=0;i<5;i++){
                        busqueda1[i]=rs.getString(i+1);
                    }
                    tabla1.addRow(busqueda1);                    
                }

            }
            catch (SQLException ex) {
                Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(this.jRadioButton3.isSelected()){
            this.jTable3.setVisible(true);
            this.jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
            DefaultTableModel tabla1 = new DefaultTableModel();//pasar el codigo a el metodo buscar
            tabla1.addColumn("Código de País");
            tabla1.addColumn("Idioma");
            tabla1.addColumn("¿Es Oficial?");
            tabla1.addColumn("Porcentaje");
            this.jTable3.setModel(tabla1);
            String[] busqueda1 = new String[4];

            try {
                Statement st = Interfaz.con.createStatement();
                ResultSet rs = st.executeQuery("select * from countrylanguage order by 1");
                while(rs.next())
                {
                    for(int i=0;i<4;i++){
                        busqueda1[i]=rs.getString(i+1);
                    }
                    tabla1.addRow(busqueda1);                    
                }

            }
            catch (SQLException ex) {
                Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private void buscarPais(){
        String pais,p1="",p3,opc="";
        int cont=0;
        boolean yaesta=false;
        
        pais=JOptionPane.showInputDialog("Ingrese el nombre del país \n Ingrese 1 si quiere ver todos los paises con las características seleccionadas");
        
        this.jTable1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        DefaultTableModel tabla1 = new DefaultTableModel();//pasar el codigo a el metodo buscar
        
        if(this.jCheckBox4.isSelected() && cont==0){
            p1=p1+"code";
            tabla1.addColumn("Código");
            cont++;
        }
        if(this.jCheckBox5.isSelected() && cont==0){
            p1=p1+"name";
            tabla1.addColumn("Nombre");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox5.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",name";
            tabla1.addColumn("Nombre");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox6.isSelected() && cont==0){
            p1=p1+"region";
            tabla1.addColumn("Región");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox6.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",region";
            tabla1.addColumn("Región");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox7.isSelected() && cont==0){
            p1=p1+"continent";
            tabla1.addColumn("Continente");
            cont++;yaesta=true;
        }
        if(this.jCheckBox7.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",continent";
            tabla1.addColumn("Continente");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox8.isSelected() && cont==0){
            p1=p1+"surfacearea";
            tabla1.addColumn("Superficie");
            cont++;yaesta=true;
        }
        if(this.jCheckBox8.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",surfacearea";
            tabla1.addColumn("Superficie");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox9.isSelected() && cont==0){
            p1=p1+"indepyear";
            tabla1.addColumn("Año de Independencia");
            cont++;yaesta=true;
        }
        if(this.jCheckBox9.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",indepyear";
            tabla1.addColumn("Año de Independencia");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox10.isSelected() && cont==0){
            p1=p1+"population";
            tabla1.addColumn("Población");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox10.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",population";
            tabla1.addColumn("Población");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox1.isSelected() && cont==0){
            p1=p1+"lifeexpectancy";
            tabla1.addColumn("Esperanza de Vida");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox1.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",lifeexpectancy";
            tabla1.addColumn("Esperanza de Vida");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox11.isSelected() && cont==0){
            p1=p1+"gnp";
            tabla1.addColumn("GNP");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox11.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",gnp";
            tabla1.addColumn("GNP");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox12.isSelected() && cont==0){
            p1=p1+"gnpold";
            tabla1.addColumn("GNPOld");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox12.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",gnpold";
            tabla1.addColumn("GNPOld");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox13.isSelected() && cont==0){
            p1=p1+"localname";
            tabla1.addColumn("Nombre Local");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox13.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",localname";
            tabla1.addColumn("Nombre Local");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox14.isSelected() && cont==0){
            p1=p1+"governmentform";
            tabla1.addColumn("Tipo de Gobierno");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox14.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",governmentform";
            tabla1.addColumn("Tipo de Gobierno");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox15.isSelected() && cont==0){
            p1=p1+"headofstate";
            tabla1.addColumn("Cabeza de Estado");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox15.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",headofstate";
            tabla1.addColumn("Cabeza de Estado");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox16.isSelected() && cont==0){
            p1=p1+"capital";
            tabla1.addColumn("Capital");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox16.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",capital";
            tabla1.addColumn("Capital");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox17.isSelected() && cont==0){
            p1=p1+"code2";
            tabla1.addColumn("Código 2");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox17.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",code2";
            tabla1.addColumn("Código 2");
            cont++;
        }     
               
        if(pais.equals("1"))       
             opc="select "+p1+" from country;";
        else{
            p3="name='"+pais+"'";
            opc="select "+p1+" from country where "+p3+";";
        }
                
        this.jTable1.setModel(tabla1);
        String[] busqueda1 = new String[cont];

        try {
            Statement st = Interfaz.con.createStatement();
            ResultSet rs = st.executeQuery(opc);
            while(rs.next())
            {
                for(int i=0;i<cont;i++){
                    busqueda1[i]=rs.getString(i+1);
                }
                tabla1.addRow(busqueda1);
            }

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void buscarCiudad(){
        String pais,p1="",p3,opc="";
        int cont=0;
        boolean yaesta=false;
        
        pais=JOptionPane.showInputDialog("Ingrese el nombre de la ciudad \n Ingrese 1 si quiere ver todas las ciudades con las características seleccionadas");
       
        this.jTable2.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        DefaultTableModel tabla1 = new DefaultTableModel();//pasar el codigo a el metodo buscar
        
        if(this.jCheckBox4.isSelected() && cont==0){
            p1=p1+"id";
            tabla1.addColumn("Id");
            cont++;
        }
        if(this.jCheckBox5.isSelected() && cont==0){
            p1=p1+"name";
            tabla1.addColumn("Nombre");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox5.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",name";
            tabla1.addColumn("Nombre");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox6.isSelected() && cont==0){
            p1=p1+"countrycode";
            tabla1.addColumn("Código de País");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox6.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",countrycode";
            tabla1.addColumn("Código de País");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox7.isSelected() && cont==0){
            p1=p1+"district";
            tabla1.addColumn("Distrito");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox7.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",district";
            tabla1.addColumn("Distrito");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox8.isSelected() && cont==0){
            p1=p1+"population";
            tabla1.addColumn("Población");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox8.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",population";
            tabla1.addColumn("Población");
            cont++;
        }
                      
        if(pais.equals("1"))       
             opc="select "+p1+" from city;";
        else{
            p3="name='"+pais+"'";
            opc="select "+p1+" from city where "+p3+";";
        }
        
        System.out.println(opc);
        
        this.jTable2.setModel(tabla1);
        String[] busqueda1 = new String[cont];

        try {
            Statement st = Interfaz.con.createStatement();
            ResultSet rs = st.executeQuery(opc);
            while(rs.next())
            {
                for(int i=0;i<cont;i++){
                    busqueda1[i]=rs.getString(i+1);
                }
                tabla1.addRow(busqueda1);
            }

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void buscarIdioma(){
        String pais,p1="",p3,opc="";
        int cont=0;
        boolean yaesta=false;
        
        pais=JOptionPane.showInputDialog("Ingrese el nombre del idioma \n Ingrese 1 si quiere ver todos los idiomas con las características seleccionadas");
        
        this.jTable3.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        DefaultTableModel tabla1 = new DefaultTableModel();//pasar el codigo a el metodo buscar
        
        if(this.jCheckBox4.isSelected() && cont==0){
            p1=p1+"countrycode";
            tabla1.addColumn("Código de País");
            cont++;
        }
        if(this.jCheckBox5.isSelected() && cont==0){
            p1=p1+"language";
            tabla1.addColumn("Idioma");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox5.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",language";
            tabla1.addColumn("Idioma");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox6.isSelected() && cont==0){
            p1=p1+"isofficial";
            tabla1.addColumn("¿Es Oficial?");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox6.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",isofficial";
            tabla1.addColumn("¿Es Oficial?");
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox7.isSelected() && cont==0){
            p1=p1+"percentage";
            tabla1.addColumn("Porcentaje");
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox7.isSelected() && cont!=0 && yaesta==false){
            p1=p1+",percentage";
            tabla1.addColumn("Porcentaje");
            cont++;
        }
        
        if(pais.equals("1"))       
             opc="select "+p1+" from countrylanguage;";
        else{
            p3="language='"+pais+"'";
            opc="select "+p1+" from countrylanguage where "+p3+";";
        }
        
        this.jTable3.setModel(tabla1);
        String[] busqueda1 = new String[cont];

        try {
            Statement st = Interfaz.con.createStatement();
            ResultSet rs = st.executeQuery(opc);
            while(rs.next())
            {
                for(int i=0;i<cont;i++){
                    busqueda1[i]=rs.getString(i+1);
                }
                tabla1.addRow(busqueda1);
            }

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
            
    private void modificarPais(){
        String pais,cod,nom,conti,reg,sup,indep,pobla,esp,gnp,gnpo,nomloc,gob,cabe,cap,cod2,p1="",p3,opc="";
        int cont=0;
        boolean yaesta=false;
        
        pais=JOptionPane.showInputDialog("Ingrese el nombre del país a modificar");
        
        if(this.jCheckBox4.isSelected() && cont==0){
            cod=JOptionPane.showInputDialog("Ingrese el nuevo código del país");
            p1=p1+"code='"+cod+"'";
            cont++;
        }
        if(this.jCheckBox5.isSelected() && cont==0){
            nom=JOptionPane.showInputDialog("Ingrese el nuevo nombre del país");
            p1=p1+"name='"+nom+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox5.isSelected() && cont!=0 && yaesta==false){
            nom=JOptionPane.showInputDialog("Ingrese el nuevo nombre del país");
            p1=p1+",name='"+nom+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox6.isSelected() && cont==0){
            reg=JOptionPane.showInputDialog("Ingrese la nueva región del país");
            p1=p1+"region='"+reg+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox6.isSelected() && cont!=0 && yaesta==false){
            reg=JOptionPane.showInputDialog("Ingrese la nueva región del país");
            p1=p1+",region='"+reg+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox7.isSelected() && cont==0){
            conti=JOptionPane.showInputDialog("Ingrese el nuevo continente del país");
            p1=p1+"continent='"+conti+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox7.isSelected() && cont!=0 && yaesta==false){
            conti=JOptionPane.showInputDialog("Ingrese el nuevo continente del país");
            p1=p1+",continent='"+conti+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox8.isSelected() && cont==0){
            sup=JOptionPane.showInputDialog("Ingrese la nueva superficie del país");
            p1=p1+"surfacearea='"+sup+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox8.isSelected() && cont!=0 && yaesta==false){
            sup=JOptionPane.showInputDialog("Ingrese la nueva superficie del país");
            p1=p1+",surfacearea='"+sup+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox9.isSelected() && cont==0){
            indep=JOptionPane.showInputDialog("Ingrese el nuevo año de independencia del país");
            p1=p1+"indepyear='"+indep+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox9.isSelected() && cont!=0 && yaesta==false){
            indep=JOptionPane.showInputDialog("Ingrese el nuevo año de independencia del país");
            p1=p1+",indepyear='"+indep+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox10.isSelected() && cont==0){
            pobla=JOptionPane.showInputDialog("Ingrese la nueva población del país");
            p1=p1+"population='"+pobla+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox10.isSelected() && cont!=0 && yaesta==false){
            pobla=JOptionPane.showInputDialog("Ingrese la nueva población del país");
            p1=p1+",population='"+pobla+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox1.isSelected() && cont==0){
            esp=JOptionPane.showInputDialog("Ingrese la nueva esperanza de vida del país");
            p1=p1+"lifeexpectancy='"+esp+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox1.isSelected() && cont!=0 && yaesta==false){
            esp=JOptionPane.showInputDialog("Ingrese la nueva esperanza de vida del país");
            p1=p1+",lifeexpectancy='"+esp+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox11.isSelected() && cont==0){
            gnp=JOptionPane.showInputDialog("Ingrese el nuevo GNP del país");
            p1=p1+"gnp='"+gnp+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox11.isSelected() && cont!=0 && yaesta==false){
            gnp=JOptionPane.showInputDialog("Ingrese el nuevo GNP del país");
            p1=p1+",gnp='"+gnp+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox12.isSelected() && cont==0){
            gnpo=JOptionPane.showInputDialog("Ingrese el nuevo GNPOld del país");
            p1=p1+"gnpold='"+gnpo+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox12.isSelected() && cont!=0 && yaesta==false){
            gnpo=JOptionPane.showInputDialog("Ingrese el nuevo GNPOld del país");
            p1=p1+",gnpold='"+gnpo+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox13.isSelected() && cont==0){
            nomloc=JOptionPane.showInputDialog("Ingrese el nuevo nombre local del país");
            p1=p1+"localname='"+nomloc+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox13.isSelected() && cont!=0 && yaesta==false){
            nomloc=JOptionPane.showInputDialog("Ingrese el nuevo nombre local del país");
            p1=p1+",localname='"+nomloc+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox14.isSelected() && cont==0){
            gob=JOptionPane.showInputDialog("Ingrese el nuevo tipo de gobierno del país");
            p1=p1+"governmentform='"+gob+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox14.isSelected() && cont!=0 && yaesta==false){
            gob=JOptionPane.showInputDialog("Ingrese el nuevo tipo de gobierno del país");
            p1=p1+",governmentform='"+gob+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox15.isSelected() && cont==0){
            cabe=JOptionPane.showInputDialog("Ingrese la nueva cabeza de estado del país");
            p1=p1+"headofstate='"+cabe+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox15.isSelected() && cont!=0 && yaesta==false){
            cabe=JOptionPane.showInputDialog("Ingrese la nueva cabeza de estado del país");
            p1=p1+",headofstate='"+cabe+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox16.isSelected() && cont==0){
            cap=JOptionPane.showInputDialog("Ingrese la nueva capital del país");
            p1=p1+"capital='"+cap+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox16.isSelected() && cont!=0 && yaesta==false){
            cap=JOptionPane.showInputDialog("Ingrese la nueva capital del país");
            p1=p1+",capital='"+cap+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox17.isSelected() && cont==0){
            cod2=JOptionPane.showInputDialog("Ingrese el nuevo código 2 del país");
            p1=p1+"code2='"+cod2+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox17.isSelected() && cont!=0 && yaesta==false){
            cod2=JOptionPane.showInputDialog("Ingrese el nuevo código 2 del país");
            p1=p1+",code2='"+cod2+"'";
            cont++;
        }     
        
        p3="name='"+pais+"'";
        opc="update country set "+p1+" where "+p3+";";
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡El país fue modificado exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void modificarCiudad(){
        String pais,id,nom,ccode,dis,pobla,p1="",p3,opc="";
        int cont=0;
        boolean yaesta=false;
            
        pais=JOptionPane.showInputDialog("Ingrese el nombre de la ciudad a modificar");
        
        if(this.jCheckBox4.isSelected() && cont==0){
            id=JOptionPane.showInputDialog("Ingrese el nuevo ID de la ciudad");
            p1=p1+"id='"+id+"'";
            cont++;
        }
        if(this.jCheckBox5.isSelected() && cont==0){
            nom=JOptionPane.showInputDialog("Ingrese el nombre de la nueva ciudad");
            p1=p1+"name='"+nom+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox5.isSelected() && cont!=0 && yaesta==false){
            nom=JOptionPane.showInputDialog("Ingrese el nombre de la nueva ciudad");
            p1=p1+",name='"+nom+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox6.isSelected() && cont==0){
            ccode=JOptionPane.showInputDialog("Ingrese el nuevo codigo del país de la ciudad");
            p1=p1+"countrycode='"+ccode+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox6.isSelected() && cont!=0 && yaesta==false){
            ccode=JOptionPane.showInputDialog("Ingrese el codigo del país de la ciudad");
            p1=p1+",countrycode='"+ccode+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox7.isSelected() && cont==0){
            dis=JOptionPane.showInputDialog("Ingrese el distrito de la ciudad");
            p1=p1+"district='"+dis+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox7.isSelected() && cont!=0 && yaesta==false){
            dis=JOptionPane.showInputDialog("Ingrese el distrito de la ciudad");
            p1=p1+",district='"+dis+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox8.isSelected() && cont==0){
            pobla=JOptionPane.showInputDialog("Ingrese la población de la ciudad");
            p1=p1+"population='"+pobla+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox8.isSelected() && cont!=0 && yaesta==false){
            pobla=JOptionPane.showInputDialog("Ingrese la población de la ciudad");
            p1=p1+",population='"+pobla+"'";
            cont++;
        }
        
        p3="name='"+pais+"'";
        opc="update city set "+p1+" where "+p3+";";
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡La ciudad fue modificada exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void modificarIdioma(){
        String pais,ccode,lan,offi,perc,p1="",p3,opc="";
        int cont=0;
        boolean yaesta=false;
            
        pais=JOptionPane.showInputDialog("Ingrese el nombre del idioma a modificar");
        
        if(this.jCheckBox4.isSelected() && cont==0){
            ccode=JOptionPane.showInputDialog("Ingrese el nombre de país del idioma a cambiar");
            p1=p1+"countrycode='"+ccode+"'";
            cont++;
        }
        if(this.jCheckBox5.isSelected() && cont==0){
            lan=JOptionPane.showInputDialog("Ingrese el nuevo nombre del idioma");
            p1=p1+"language='"+lan+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox5.isSelected() && cont!=0 && yaesta==false){
            lan=JOptionPane.showInputDialog("Ingrese el nuevo nombre del idioma");
            p1=p1+",language='"+lan+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox6.isSelected() && cont==0){
            offi=JOptionPane.showInputDialog("Ingrese T o F si el idioma es oficial o no");
            p1=p1+"isofficial='"+offi+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox6.isSelected() && cont!=0 && yaesta==false){
            offi=JOptionPane.showInputDialog("Ingrese el nuevo T o F si el idioma es oficial o no");
            p1=p1+",isofficial='"+offi+"'";
            cont++;
        }
        yaesta=false;
        if(this.jCheckBox7.isSelected() && cont==0){
            perc=JOptionPane.showInputDialog("Ingrese el nuevo porcentaje de quienes hablan el idioma");
            p1=p1+"percentage='"+perc+"'";
            cont++;
            yaesta=true;
        }
        if(this.jCheckBox7.isSelected() && cont!=0 && yaesta==false){
            perc=JOptionPane.showInputDialog("Ingrese el nuevo porcentaje de quienes hablan el idioma");
            p1=p1+",percentage='"+perc+"'";
            cont++;
        }
        
        p3="language='"+pais+"'";
        opc="update countrylanguage set "+p1+" where "+p3+";";
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡El idioma fue modificado exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearPais(){
        String cod,nom,conti,reg,sup,indep,pobla,esp,gnp,gnpo,nomloc,gob,cabe,cap,cod2,p1="",opc="";
        
        cod=JOptionPane.showInputDialog("Ingrese el código del nuevo país (Escriba 3 letras mayúsculas)");
        nom=JOptionPane.showInputDialog("Ingrese el nombre del nuevo país");
        conti=JOptionPane.showInputDialog("Ingrese el continente del nuevo país (Escriba uno de los siguientes 'Asia','Europe','North America','Africa','Oceania','Antarctica','South America')");
        reg=JOptionPane.showInputDialog("Ingrese la región del nuevo país");
        sup=JOptionPane.showInputDialog("Ingrese la superficie del nuevo país");
        indep=JOptionPane.showInputDialog("Ingrese el año de independencia del nuevo país");
        pobla=JOptionPane.showInputDialog("Ingrese la población del nuevo país");
        esp=JOptionPane.showInputDialog("Ingrese la esperanza de vida del nuevo país");
        gnp=JOptionPane.showInputDialog("Ingrese el GNP del nuevo país");
        gnpo=JOptionPane.showInputDialog("Ingrese el GNPOld del nuevo país");
        nomloc=JOptionPane.showInputDialog("Ingrese el nombre local del nuevo país");
        gob=JOptionPane.showInputDialog("Ingrese el tipo de gobierno del nuevo país");
        cabe=JOptionPane.showInputDialog("Ingrese la cabeza de estado del nuevo país");
        cap=JOptionPane.showInputDialog("Ingrese la capital del nuevo país");
        cod2=JOptionPane.showInputDialog("Ingrese el código 2 del nuevo país (Escriba dos letras mayúsculas)");
        
        p1="'"+cod+"','"+nom+"','"+conti+"','"+reg+"','"+sup+"','"+indep+"','"+pobla+"','"+esp+"','"+gnp+"','"+gnpo+"','"+nomloc+"','"+gob+"','"+cabe+"','"+cap+"','"+cod2+"'";
        opc="insert into country values ("+p1+");";
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡El país fue creado exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearCiudad(){
        String id,nom,ccode,dis,pobla,p1="",opc="";
        
        id=JOptionPane.showInputDialog("Ingrese el ID de la nueva ciudad (A partir del número 4079)");
        nom=JOptionPane.showInputDialog("Ingrese el nombre de la nueva ciudad");
        ccode=JOptionPane.showInputDialog("Ingrese el código del país de la nueva ciudad");
        dis=JOptionPane.showInputDialog("Ingrese el distrito de la nueva ciudad");
        pobla=JOptionPane.showInputDialog("Ingrese la población de la nueva ciudad");
        
        p1="'"+id+"','"+nom+"','"+ccode+"','"+dis+"','"+pobla+"'";
        opc="insert into city values ("+p1+");";
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡La ciudad fue creada exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void crearIdioma(){
        String ccode,lan,offi,perc,p1="",opc="";
        
        ccode=JOptionPane.showInputDialog("Ingrese el código del país del nuevo idioma");
        lan=JOptionPane.showInputDialog("Ingrese el nombre del idioma del nuevo idioma");
        offi=JOptionPane.showInputDialog("Ingrese T o F si el oficial el nuevo idioma");
        perc=JOptionPane.showInputDialog("Ingrese el porcentaje de quienes hablan el nuevo idioma");
        
        p1="'"+ccode+"','"+lan+"','"+offi+"','"+perc+"'";
        opc="insert into countrylanguage values ("+p1+");";
        System.out.print(opc);
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡El idioma fue creado exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarPais(){
        String pais,p3,opc;
        
        pais=JOptionPane.showInputDialog("Ingrese el nombre del país a eliminar");
        p3="name='"+pais+"'";
        
        opc="delete from country where "+p3+";";
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡El país fue eliminado exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarCiudad(){
        String pais,p3,opc;
        
        pais=JOptionPane.showInputDialog("Ingrese el nombre de la ciudad a eliminar");
        p3="name='"+pais+"'";
        
        opc="delete from city where "+p3+";";
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡La ciudad fue eliminada exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void eliminarIdioma(){
        String pais,p3,opc;
        
        pais=JOptionPane.showInputDialog("Ingrese el nombre del idioma a eliminar");
        p3="language='"+pais+"'";
        
        opc="delete from countrylanguage where "+p3+";";
        
        try {
            Statement st = Interfaz.con.createStatement();
            int rs = st.executeUpdate(opc);
            JOptionPane.showMessageDialog(null,"¡El idioma fue eliminado exitosamente!");

        }
        catch (SQLException ex) {
            Logger.getLogger(InterfazCRUD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }
}
