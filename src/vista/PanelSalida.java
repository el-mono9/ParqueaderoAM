/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import controlador.Controlador;
import java.awt.Color;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Vehiculo;

/**
 *
 * @author trabajo
 */
public class PanelSalida extends javax.swing.JPanel {

    Controlador control = new Controlador();
    Vehiculo mod = new Vehiculo();
    int BuscarRetirar = 0 ;
    String fecha;
    
    public PanelSalida() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ModeloFront = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        HoroIngresoFront = new javax.swing.JTextField();
        HoraSalidaFront = new javax.swing.JTextField();
        PrecioFront = new javax.swing.JTextField();
        GuardarPanel = new javax.swing.JPanel();
        Guardar = new javax.swing.JTextField();
        PlacaFront = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jTextField3 = new javax.swing.JTextField();
        TipoFront = new javax.swing.JTextField();

        setBackground(null);
        setMaximumSize(new java.awt.Dimension(560, 310));
        setMinimumSize(new java.awt.Dimension(560, 310));
        setPreferredSize(new java.awt.Dimension(560, 310));

        jPanel1.setBackground(new java.awt.Color(241, 239, 241));
        jPanel1.setMaximumSize(new java.awt.Dimension(560, 310));
        jPanel1.setMinimumSize(new java.awt.Dimension(560, 310));
        jPanel1.setName(""); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(440, 300));

        jLabel2.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(11, 97, 133));
        jLabel2.setText(" Tipo ");

        jLabel3.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(11, 97, 133));
        jLabel3.setText(" Placa ");

        jLabel4.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(11, 97, 133));
        jLabel4.setText(" Modelo ");

        ModeloFront.setEditable(false);
        ModeloFront.setBackground(new java.awt.Color(241, 239, 241));
        ModeloFront.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        ModeloFront.setForeground(new java.awt.Color(153, 153, 255));
        ModeloFront.setText(" -------- ------");
        ModeloFront.setBorder(null);

        jLabel5.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(11, 97, 133));
        jLabel5.setText(" Costo ");

        jLabel1.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 97, 133));
        jLabel1.setText(" Salida ");

        jLabel6.setFont(new java.awt.Font("Roboto Light", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(11, 97, 133));
        jLabel6.setText(" Entrada ");

        HoroIngresoFront.setEditable(false);
        HoroIngresoFront.setBackground(new java.awt.Color(241, 239, 241));
        HoroIngresoFront.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        HoroIngresoFront.setForeground(new java.awt.Color(153, 153, 255));
        HoroIngresoFront.setText("          -- : -- : -- ");
        HoroIngresoFront.setBorder(null);
        HoroIngresoFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoroIngresoFrontActionPerformed(evt);
            }
        });

        HoraSalidaFront.setEditable(false);
        HoraSalidaFront.setBackground(new java.awt.Color(241, 239, 241));
        HoraSalidaFront.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        HoraSalidaFront.setForeground(new java.awt.Color(153, 153, 255));
        HoraSalidaFront.setText("           -- : -- : -- ");
        HoraSalidaFront.setBorder(null);
        HoraSalidaFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HoraSalidaFrontActionPerformed(evt);
            }
        });

        PrecioFront.setEditable(false);
        PrecioFront.setBackground(new java.awt.Color(241, 239, 241));
        PrecioFront.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PrecioFront.setForeground(new java.awt.Color(153, 153, 255));
        PrecioFront.setText(" $ ---------");
        PrecioFront.setBorder(null);
        PrecioFront.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrecioFrontActionPerformed(evt);
            }
        });

        GuardarPanel.setBackground(new java.awt.Color(0, 134, 138));

        Guardar.setEditable(false);
        Guardar.setBackground(new java.awt.Color(11, 97, 133));
        Guardar.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        Guardar.setForeground(new java.awt.Color(212, 212, 212));
        Guardar.setText("   Buscar");
        Guardar.setBorder(null);
        Guardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                GuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                GuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                GuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout GuardarPanelLayout = new javax.swing.GroupLayout(GuardarPanel);
        GuardarPanel.setLayout(GuardarPanelLayout);
        GuardarPanelLayout.setHorizontalGroup(
            GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
            .addGroup(GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))
        );
        GuardarPanelLayout.setVerticalGroup(
            GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
            .addGroup(GuardarPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(Guardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
        );

        PlacaFront.setBackground(new java.awt.Color(241, 239, 241));
        PlacaFront.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        PlacaFront.setForeground(new java.awt.Color(153, 153, 255));
        PlacaFront.setText(" Ingresar Placa");
        PlacaFront.setBorder(null);
        PlacaFront.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlacaFrontMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(11, 97, 133));

        jTextField3.setEditable(false);
        jTextField3.setBackground(new java.awt.Color(11, 97, 133));
        jTextField3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(241, 239, 241));
        jTextField3.setText("Retirar Vehículo");
        jTextField3.setBorder(null);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
        );

        TipoFront.setEditable(false);
        TipoFront.setBackground(new java.awt.Color(241, 239, 241));
        TipoFront.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        TipoFront.setForeground(new java.awt.Color(153, 153, 255));
        TipoFront.setText(" -----------");
        TipoFront.setToolTipText("");
        TipoFront.setBorder(null);
        TipoFront.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TipoFrontMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ModeloFront, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(PrecioFront, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(GuardarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PlacaFront, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(TipoFront, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(jLabel6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(HoraSalidaFront, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(HoroIngresoFront, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(36, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TipoFront, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoroIngresoFront, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PlacaFront, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(HoraSalidaFront, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ModeloFront)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PrecioFront, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(GuardarPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void HoroIngresoFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoroIngresoFrontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoroIngresoFrontActionPerformed

    private void HoraSalidaFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HoraSalidaFrontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HoraSalidaFrontActionPerformed

    private void PrecioFrontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrecioFrontActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrecioFrontActionPerformed

    private void GuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseEntered
        // TODO add your handling code here:
        Color CGuard = new Color (255,255,255);
        Guardar.setForeground(CGuard);
    }//GEN-LAST:event_GuardarMouseEntered

    private void GuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseExited
        // TODO add your handling code here:
        Color CGuard = new Color (212,212,212);
        Guardar.setForeground(CGuard);
    }//GEN-LAST:event_GuardarMouseExited

    private void GuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_GuardarMouseClicked
   
        if (BuscarRetirar == 0){
            
            fecha = control.obtenerFecha();
            
            try {
            mod = control.ejecucionBuscar(PlacaFront.getText());
            if (mod == null){
                JOptionPane.showMessageDialog(null,"No se pudo encontrar");
            }else{
                ModeloFront.setText(mod.getModelo());
                TipoFront.setText(mod.getTipo());
                HoraSalidaFront.setText(fecha);
                HoroIngresoFront.setText(mod.getIngreso());
                
//                PrecioFront.setText(mod.getPrecio());

                BuscarRetirar = 1 ;
                Guardar.setText("   Retirar");
            }
        } catch (IOException ex) {
            Logger.getLogger(PanelSalida.class.getName()).log(Level.SEVERE, null, ex);
        }
            
        }
        
        if (BuscarRetirar == 1){
            
            //PARA RETIRAR VEHICULO
                //1 debo modificar hora de salida en base de datos
                //2 debo calcular total a cobrar 
                //3 joption pane
                //4 limpiar 
            
            try {
                
                if(control.ejecucionModificarSalida(PlacaFront.getText(),fecha,HoroIngresoFront.getText(),TipoFront.getText())){
                    
                    
                    
                    
                    PlacaFront.setText(mod.getPlaca());
                    ModeloFront.setText(mod.getModelo());
                    HoroIngresoFront.setText(mod.getIngreso());
                    HoraSalidaFront.setText(mod.getSalida());
                    PrecioFront.setText(String.valueOf(mod.getPrecio()));
                    
                    BuscarRetirar = 2 ;
                    
                }else{
                    JOptionPane.showMessageDialog(null, "no se pudo retirar el vehiculo");
                }
                
                control.Limpiar();
                
            } catch (IOException ex) {
                Logger.getLogger(PanelSalida.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ParseException ex) {
                Logger.getLogger(PanelSalida.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            Guardar.setText("   Limpiar");
        }
        
        else if (BuscarRetirar == 2){
            
             mod = control.Limpiar();
             
             PlacaFront.setText(mod.getPlaca());
             ModeloFront.setText(mod.getModelo());
             HoroIngresoFront.setText(mod.getIngreso());
             HoraSalidaFront.setText(mod.getSalida());
             PrecioFront.setText(String.valueOf(mod.getPrecio()));
             
             Guardar.setText("   Buscar");
             BuscarRetirar = 0 ;
             
        }
        
        
    }//GEN-LAST:event_GuardarMouseClicked

    private void PlacaFrontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlacaFrontMouseClicked
        // TODO add your handling code here:
        if(PlacaFront.getText().equals(" Ingresar Placa")){
        PlacaFront.setText("");
        
        Color color = new Color(11,97,133);
        PlacaFront.setForeground(color);
        }
    }//GEN-LAST:event_PlacaFrontMouseClicked

    private void TipoFrontMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TipoFrontMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TipoFrontMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField Guardar;
    private javax.swing.JPanel GuardarPanel;
    public javax.swing.JTextField HoraSalidaFront;
    public javax.swing.JTextField HoroIngresoFront;
    public javax.swing.JTextField ModeloFront;
    public javax.swing.JTextField PlacaFront;
    public javax.swing.JTextField PrecioFront;
    public javax.swing.JTextField TipoFront;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}