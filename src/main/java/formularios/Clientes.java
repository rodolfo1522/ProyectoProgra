/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author hecto
 */
public class Clientes extends javax.swing.JInternalFrame {
Connection conn = null;
    Conexion Conect = new Conexion();
    String qry = "";
    ResultSet rs = null;
    PreparedStatement pst = null;
    /**
     * Creates new form Clientes
     */
    public Clientes() {
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

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txthoraS = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtciudad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboHuesped = new javax.swing.JComboBox<>();
        txtpais = new javax.swing.JTextField();
        txthoraD = new javax.swing.JTextField();
        txtcodigo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtCV = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Moficar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Consultar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("Cantidad de huéspedes:");

        jLabel1.setText("Nombre  :");

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 14)); // NOI18N
        jLabel10.setText("Ingrese los datos de la reservacion");

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        jLabel2.setText("Apellidos :");

        jLabel3.setText("Ciudad :");

        jLabel7.setText("Hora de llegada :");

        jLabel9.setText("Codigo De Reservacion:");

        jLabel4.setText("Pais :");

        comboHuesped.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", " " }));

        txtcodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcodigoActionPerformed(evt);
            }
        });

        jLabel5.setText("Telefono :");

        jLabel8.setText("Hora de salida:");

        jLabel11.setText("Codigo validacion");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(172, 172, 172))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txthoraD, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtnombre)
                                        .addComponent(txtciudad)
                                        .addComponent(comboHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtpais, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtapellido, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txthoraS, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addGap(33, 33, 33)
                                .addComponent(jButton2)
                                .addGap(30, 30, 30)
                                .addComponent(jButton3)
                                .addGap(35, 35, 35)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(txtCV, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(txtCV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtpais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(comboHuesped, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txthoraS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(txthoraD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtcodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcodigoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here: guardar de
      try {
    conn = Conect.getConnection();
    if (conn != null) {
        // Consulta SQL ajustada para incluir el campo 'codigo'
        qry = "INSERT INTO cliente(codigo, nombre, apellido, ciudad, pais, telefono, hora_d, hora_s, huesped_tipo) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement pr = conn.prepareStatement(qry);
        
        // Asigna el valor de 'codigo' desde un campo de texto
        pr.setInt(1, Integer.parseInt(txtCV.getText())); // Campo para 'codigo'
        pr.setString(2, txtnombre.getText());
        pr.setString(3, txtapellido.getText());
        pr.setString(4, txtciudad.getText());
        pr.setString(5, txtpais.getText());
        pr.setString(6, txttelefono.getText());
        pr.setString(7, txthoraD.getText()); // Se corresponde con 'hora_d' en la tabla
        pr.setString(8, txthoraS.getText()); // Se corresponde con 'hora_s' en la tabla
        pr.setString(9, comboHuesped.getSelectedItem().toString()); // Se corresponde con 'huesped_tipo' en la tabla

        pr.executeUpdate();
        JOptionPane.showMessageDialog(null, "Su reservación ha sido registrada, tenga un feliz día =)");
    }
} catch (SQLException sqle) {
    System.out.println(sqle.getMessage());
} catch (NumberFormatException nfe) {
    JOptionPane.showMessageDialog(null, "Por favor, introduzca un número válido para el código.");
} finally {
    try {
        if (conn != null) conn.close();
    } catch (SQLException sqle) {
        System.out.println(sqle.getMessage());
    }
}



    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: modificar
        try {
    conn = Conect.getConnection();  // Asegúrate de que Conect.getConnection() funcione con Oracle
    String codValue = txtcodigo.getText();  // Si tienes alguna columna para identificar el registro a actualizar (e.g. un código o ID)
    
    if (conn != null && codValue.charAt(0) != '/') {
        // Query para actualizar los datos en la tabla 'cliente'
        qry = "UPDATE cliente SET nombre=?, apellido=?, ciudad=?, pais=?, telefono=?, "
            + "hora_d=?, hora_s=?, huesped_tipo=? WHERE codigo=?";  // Asegúrate de tener una columna 'codigo' o un identificador único
        
        // Preparamos el query
        PreparedStatement pr = conn.prepareStatement(qry);
        
        // Asignamos los valores a los placeholders de la query
        pr.setString(1, txtnombre.getText());
        pr.setString(2, txtapellido.getText());
        pr.setString(3, txtciudad.getText());
        pr.setString(4, txtpais.getText());
        pr.setString(5, txttelefono.getText());
        
        // Asignamos las horas como cadenas (tipo VARCHAR2 en tu tabla)
        pr.setString(6, txthoraD.getText());  // hora_d
        pr.setString(7, txthoraS.getText());  // hora_s
        
        // Asignamos el tipo de huésped
        pr.setString(8, comboHuesped.getSelectedItem().toString());  // huesped_tipo
        
        // Asignamos el código (si es una columna que identifica al cliente)
        pr.setInt(9, Integer.parseInt(txtcodigo.getText()));
        
        // Ejecutamos la actualización
        pr.executeUpdate();
        
        // Mostramos mensaje de confirmación
        JOptionPane.showMessageDialog(null, "Los datos del cliente han sido actualizados exitosamente.");
    }
} catch (SQLException sqle) {
    // Manejamos cualquier error en SQL
    System.out.println(sqle.getMessage());
} finally {
    // Cerramos la conexión en el bloque 'finally'
    try {
        conn.close();
    } catch (SQLException sqle) {
        System.out.println(sqle.getMessage());
    }
}

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here: eliminiar 
        try {
    conn = Conect.getConnection();  // Asegúrate de que Conect.getConnection() funcione con Oracle
    String codValue = txtcodigo.getText();
    
    // Verificamos si la conexión es válida y si el código no empieza con '/'
    if (conn != null && codValue.charAt(0) != '/') {
        // Query para eliminar el registro en la tabla 'cliente'
        qry = "DELETE FROM cliente WHERE codigo=?";  // Asegúrate de que 'codigo' sea la columna correcta para identificar al cliente
        
        // Preparamos el query
        PreparedStatement pr = conn.prepareStatement(qry);
        
        // Asignamos el valor del código que se debe eliminar
        pr.setInt(1, Integer.parseInt(txtcodigo.getText()));
        
        // Ejecutamos la eliminación
        int rowsAffected = pr.executeUpdate();
        
        // Verificamos si se eliminó algún registro
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Su reservación ha sido eliminada. ¡Que tenga un feliz día! =)");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró ninguna reservación con el código proporcionado.");
        }
    }
} catch (SQLException sqle) {
    // Manejamos cualquier error en SQL
    System.out.println(sqle.getMessage());
} finally {
    // Cerramos la conexión en el bloque 'finally'
    try {
        conn.close();
    } catch (SQLException sqle) {
        System.out.println(sqle.getMessage());
    }
}

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:consultar
        try {
    conn = Conect.getConnection();  // Asegúrate de que Conect.getConnection() funcione con Oracle
    String sql = "SELECT * FROM cliente WHERE codigo=?";  // Asegúrate de que 'codigo' sea la columna correcta para identificar al cliente
    PreparedStatement pst = conn.prepareStatement(sql);
    
    // Asignamos el valor del código que se debe consultar
    pst.setInt(1, Integer.parseInt(txtcodigo.getText()));
    
    ResultSet rs = pst.executeQuery();

    // Verificamos si se encontraron datos
    if (rs.next()) {
        // Asignamos los valores recuperados a los campos de texto
        txtnombre.setText(rs.getString("nombre"));
        txtapellido.setText(rs.getString("apellido"));
        txtciudad.setText(rs.getString("ciudad"));
        txtpais.setText(rs.getString("pais"));
        txttelefono.setText(rs.getString("telefono"));
        txthoraD.setText(rs.getString("hora_d"));  // hora_d
        txthoraS.setText(rs.getString("hora_s"));  // hora_s
        comboHuesped.setSelectedItem(rs.getString("huesped_tipo"));  // huesped_tipo

        JOptionPane.showMessageDialog(null, "Datos de la reservación recuperados exitosamente.");
    } else {
        JOptionPane.showMessageDialog(null, "No se encontraron datos para el ID especificado.");
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
} finally {
    // Asegúrate de cerrar el ResultSet y PreparedStatement
    try {
        if (rs != null) rs.close();
        if (pst != null) pst.close();
        if (conn != null) conn.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, ex);
    }
}

        
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboHuesped;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JTextField txtCV;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtciudad;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txthoraD;
    private javax.swing.JTextField txthoraS;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtpais;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}