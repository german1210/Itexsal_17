/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package expo_itexsal;
import javax.swing.JOptionPane;

/**
 *
 * @author ger
 */
public class Seguridad_Ingresar extends javax.swing.JFrame {

    /**
     * Creates new form Seguridad_Ingresar
     */
    public Seguridad_Ingresar() {
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

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtClave = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Expo_17/icon, tienda.png"))); // NOI18N
        jLabel1.setText("Nombre de la Tienda");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Expo_17/inicio secion.png"))); // NOI18N
        jLabel2.setText("Inicia Secion");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Expo_17/usuario.png"))); // NOI18N
        jLabel3.setText("Usuario:");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Expo_17/clave.png"))); // NOI18N
        jLabel4.setText("Contraseña:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Expo_17/Hecho.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jSeparator1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 113, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(103, 103, 103))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtUsuario)
                    .addComponent(txtClave, javax.swing.GroupLayout.DEFAULT_SIZE, 148, Short.MAX_VALUE))
                .addGap(80, 80, 80))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(161, 161, 161))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Creamos Variables tipo String
        String Usuario, Clave, Mensaje, mensaje;
        
        //Ordenamos que la variable String Usuario sea igual al JtextFiedl
        Usuario = txtUsuario.getText();
        //Ordenamos que la variable String Clave sea igual al PasswordFiedl
        Clave = txtClave.getText();
        
        /*Agregamos una condicion si Usuario y Clave son Correctos entonces
        ordenamos que se abra una nueva ventana*/
        if(txtUsuario.getText().equals("German") && Clave.equals("121020")){
            //Asignamos un nombre a un Jframe
            Seleccion_Insertar inser = new Seleccion_Insertar();
            //ordenamos que el JFrame sea visible
            inser.setVisible(true);
            //Ordenamos que la ventana actual NO sea visible
            this.setVisible(false);
            
            //Enviamos un mensaje con la variable arriba declarada
            Mensaje="Datos Correctos";
            //Llamamos el dialogo y le damos el mensaje con la variable declarada anteriormente
            JOptionPane.showMessageDialog(null, Mensaje);
        }
        if(txtUsuario.getText().equals("Brandon") && Clave.equals("brans10")){
            Seleccion_Insertar inser = new Seleccion_Insertar();
            inser.setVisible(true);
            this.setVisible(false);
            
            Mensaje="Datos Correctos";
            JOptionPane.showMessageDialog(null, Mensaje);
        }
        if(txtUsuario.getText().equals("Katya") && Clave.equals("J29")){
            Seleccion_Insertar inser = new Seleccion_Insertar();
            inser.setVisible(true);
            this.setVisible(false);
            
            Mensaje="Datos Correctos";
            JOptionPane.showMessageDialog(null, Mensaje);
        }
        if(txtUsuario.getText().equals("Natalie") && Clave.equals("120417")){
            Seleccion_Insertar inser = new Seleccion_Insertar();
            inser.setVisible(true);
            this.setVisible(false);
            
            Mensaje="Datos Correctos";
            JOptionPane.showMessageDialog(null, Mensaje);
        }
        if(txtUsuario.getText().equals("Alejandra") && Clave.equals("mora16")){
            Seleccion_Insertar inser = new Seleccion_Insertar();
            inser.setVisible(true);
            this.setVisible(false);
            
            Mensaje="Datos Correctos";
            JOptionPane.showMessageDialog(null, Mensaje);
        }
        if(txtUsuario.getText().equals("Claudina") && Clave.equals("054617")){
            Seleccion_Insertar inser = new Seleccion_Insertar();
            inser.setVisible(true);
            this.setVisible(false);
            
            Mensaje="Datos Correctos";
            JOptionPane.showMessageDialog(null, Mensaje);
        }
        else {mensaje="Datos Incorrectos";
            JOptionPane.showMessageDialog(null, mensaje);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Seguridad_Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Seguridad_Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Seguridad_Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Seguridad_Ingresar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Seguridad_Ingresar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}