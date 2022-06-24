
package Views.REDIS;

import javax.swing.JDesktopPane;

import Cassandra.DTO.DTO_Persona;
import javax.swing.JOptionPane;

import Controladores.RedisControlador;
import Views.REDIS.Crear_REDIS;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Crear_REDIS extends javax.swing.JInternalFrame {

    public static RedisControlador controlador = new RedisControlador();
    JDesktopPane desktopPane;    

    public Crear_REDIS() {
        initComponents();
    }

    public Crear_REDIS(JDesktopPane desktopPane) {
        initComponents();
        this.desktopPane = desktopPane;
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_crear_REDIS = new javax.swing.JButton();
        id_REDIS = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombre_REDIS = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        departamento_REDIS = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        funcion_REDIS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        status_REDIS = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        sueldo_REDIS = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ano_REDIS = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        perfil_REDIS = new javax.swing.JTextField();
        mes_REDIS = new javax.swing.JComboBox<>();
        img_redis = new javax.swing.JButton();
        lbl_imagen = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btn_crear_REDIS.setText("CREAR");
        btn_crear_REDIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_crear_REDISActionPerformed(evt);
            }
        });

        id_REDIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_REDISActionPerformed(evt);
            }
        });

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        nombre_REDIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_REDISActionPerformed(evt);
            }
        });

        jLabel3.setText("Departamento");

        departamento_REDIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                departamento_REDISActionPerformed(evt);
            }
        });

        jLabel4.setText("Función");

        funcion_REDIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                funcion_REDISActionPerformed(evt);
            }
        });

        jLabel5.setText("Status");

        status_REDIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                status_REDISActionPerformed(evt);
            }
        });

        jLabel6.setText("Sueldo");

        sueldo_REDIS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sueldo_REDISActionPerformed(evt);
            }
        });

        jLabel7.setText("Mes de Ingreso");

        jLabel8.setText("Año de Ingreso");

        jLabel9.setText("Foto de perfil");

        mes_REDIS.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Juni", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        img_redis.setText("Seleccionar Imagen");
        img_redis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_redisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sueldo_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mes_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(perfil_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ano_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(img_redis))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(55, 55, 55)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(status_REDIS)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(nombre_REDIS, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                        .addComponent(id_REDIS, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(funcion_REDIS, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(departamento_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(65, 65, 65)
                        .addComponent(lbl_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_crear_REDIS)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(nombre_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(departamento_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(funcion_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(status_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(sueldo_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(mes_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(ano_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(perfil_REDIS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn_crear_REDIS)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(img_redis)
                        .addContainerGap(32, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_crear_REDISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_crear_REDISActionPerformed
        try{
            int id = Integer.parseInt(id_REDIS.getText());
            String nombre = nombre_REDIS.getText();
            String departamento = departamento_REDIS.getText();
            String funcion = funcion_REDIS.getText();
            String status = status_REDIS.getText();
            double sueldo = Double.parseDouble(sueldo_REDIS.getText());
            String mes = (String) mes_REDIS.getSelectedItem();
            String ano = ano_REDIS.getText();
            String perfil = perfil_REDIS.getText();
            
            controlador.conectarREDIS();
            controlador.insertarEmpleadosREDIS(String.valueOf(id), nombre, departamento,
                                           funcion, status, sueldo, mes, ano,
                                           perfil);
            controlador.desconectarREDIS();
        }catch(Exception e){}
        
    }//GEN-LAST:event_btn_crear_REDISActionPerformed

    private void nombre_REDISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_REDISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_REDISActionPerformed

    private void departamento_REDISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_departamento_REDISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_departamento_REDISActionPerformed

    private void funcion_REDISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_funcion_REDISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_funcion_REDISActionPerformed

    private void status_REDISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_status_REDISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_status_REDISActionPerformed

    private void sueldo_REDISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sueldo_REDISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sueldo_REDISActionPerformed

    private void id_REDISActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_REDISActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_REDISActionPerformed

    private void img_redisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_redisActionPerformed
        JFileChooser jFileChooser = new JFileChooser();
        FileNameExtensionFilter filtrado = new FileNameExtensionFilter("JPG, PNG", "JPG", "PNG");
        jFileChooser.setFileFilter(filtrado);
        
        String ruta;
        int respuesta = jFileChooser.showOpenDialog(this);
        if(respuesta == JFileChooser.APPROVE_OPTION){
            ruta = jFileChooser.getSelectedFile().getPath();
            Image mImagen = new ImageIcon(ruta).getImage();
            ImageIcon mIcon = new ImageIcon(mImagen.getScaledInstance(lbl_imagen.getWidth(), lbl_imagen.getHeight(), Image.SCALE_SMOOTH));
            lbl_imagen.setIcon(mIcon);
            perfil_REDIS.setText(ruta);
        }
    }//GEN-LAST:event_img_redisActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_REDIS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ano_REDIS;
    private javax.swing.JButton btn_crear_REDIS;
    private javax.swing.JTextField departamento_REDIS;
    private javax.swing.JTextField funcion_REDIS;
    private javax.swing.JTextField id_REDIS;
    private javax.swing.JButton img_redis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_imagen;
    private javax.swing.JComboBox<String> mes_REDIS;
    private javax.swing.JTextField nombre_REDIS;
    private javax.swing.JTextField perfil_REDIS;
    private javax.swing.JTextField status_REDIS;
    private javax.swing.JTextField sueldo_REDIS;
    // End of variables declaration//GEN-END:variables
}
