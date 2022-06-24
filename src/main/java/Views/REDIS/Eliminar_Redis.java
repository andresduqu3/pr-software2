
package Views.REDIS;

import javax.swing.JDesktopPane;

import Cassandra.DTO.DTO_Persona;
import javax.swing.JOptionPane;

import Controladores.RedisControlador;
import Views.REDIS.Eliminar_Redis;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Eliminar_Redis extends javax.swing.JInternalFrame {

    public static RedisControlador controlador = new RedisControlador();
    JDesktopPane desktopPane;    

    public Eliminar_Redis() {
        initComponents();
    }

    public Eliminar_Redis(JDesktopPane desktopPane) {
        initComponents();
        this.desktopPane = desktopPane;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id_REDIS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_borrarRedis = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        id_REDIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_REDISActionPerformed(evt);
            }
        });

        jLabel1.setText("Id");

        btn_borrarRedis.setText("Borrar");
        btn_borrarRedis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarRedisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(114, 114, 114)
                .addComponent(id_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_borrarRedis)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(btn_borrarRedis))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void id_REDISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_REDISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_REDISActionPerformed

    private void btn_borrarRedisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarRedisActionPerformed
        controlador.conectarREDIS();
        controlador.eliminarEmpleadosREDIS(id_REDIS.getText());
        controlador.desconectarREDIS();
    }//GEN-LAST:event_btn_borrarRedisActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_Redis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_borrarRedis;
    private javax.swing.JTextField id_REDIS;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
