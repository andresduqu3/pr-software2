
package Views.REDIS;

import javax.swing.JDesktopPane;

import Cassandra.DTO.DTO_Persona;
import javax.swing.JOptionPane;

import Controladores.RedisControlador;
import Views.REDIS.Listado5;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;


public class Listado5 extends javax.swing.JInternalFrame {

    public static RedisControlador controlador = new RedisControlador();
    JDesktopPane desktopPane;    
    
    String [][] m_empleados = null;
    
    public Listado5() {
        initComponents();
        
    }

    public Listado5(JDesktopPane desktopPane) {
        initComponents();
        this.desktopPane = desktopPane;
        controlador.conectarREDIS();
        m_empleados = controlador.listarEmpleadosREDIS();
        controlador.desconectarREDIS();
        for(int i=0; i<m_empleados.length; i++){
            lista_id_redis.addItem(m_empleados[i][0]);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_PDF = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lista_id_redis = new javax.swing.JComboBox<>();
        lbl_img = new javax.swing.JLabel();
        lbl_departamento = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        lbl_sueldo = new javax.swing.JLabel();
        lbl_funcion = new javax.swing.JLabel();
        lbl_ano = new javax.swing.JLabel();
        lbl_mes = new javax.swing.JLabel();
        lbl_perfil = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        btn_PDF.setText("PDF");
        btn_PDF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PDFActionPerformed(evt);
            }
        });

        jLabel1.setText("Id");

        jLabel2.setText("Nombre");

        jLabel3.setText("Departamento");

        jLabel4.setText("Función");

        jLabel5.setText("Status");

        jLabel6.setText("Sueldo");

        jLabel7.setText("Mes de Ingreso");

        jLabel8.setText("Año de Ingreso");

        jLabel9.setText("Foto de perfil");

        lista_id_redis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lista_id_redisActionPerformed(evt);
            }
        });

        lbl_departamento.setText("Label Departamento");

        lbl_nombre.setBackground(new java.awt.Color(255, 0, 0));
        lbl_nombre.setText("Label Nombre");

        lbl_status.setText("Label Status");

        lbl_sueldo.setText("Label Sueldo");

        lbl_funcion.setText("Label Función");

        lbl_ano.setText("Label Año");

        lbl_mes.setText("Label Mes");

        lbl_perfil.setText("Label Perfil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lista_id_redis, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(btn_PDF)))
                .addGap(38, 38, 38)
                .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(lista_id_redis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lbl_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(lbl_departamento, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(lbl_funcion, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(lbl_status, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lbl_sueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(lbl_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(lbl_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(lbl_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btn_PDF)
                        .addGap(0, 3, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbl_img, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_PDFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PDFActionPerformed
        try{
            int id = Integer.parseInt((String) lista_id_redis.getSelectedItem());
            String nombre = lbl_nombre.getText();
            String departamento = lbl_departamento.getText();
            String funcion = lbl_funcion.getText();
            String status = lbl_status.getText();
            double sueldo = Double.parseDouble(lbl_sueldo.getText());
            String mes = (String) lbl_mes.getText();
            String ano = lbl_ano.getText();
            String perfil = lbl_perfil.getText();
            String ruta = "/home/osboxes/Desktop/RES.png";
            String ruta2 = "/home/osboxes/Desktop/Listado5.pdf";
            File file = new File(ruta);
            try {
                BufferedImage bufferedImage = ImageIO.read(file);
                ImageIcon imageIcon = new ImageIcon(bufferedImage);
                controlador.conectarREDIS();
                controlador.generar_pdf2(id, nombre, departamento, funcion, status, sueldo, mes, ano, ruta, ruta2);
                controlador.desconectarREDIS();
            } catch (IOException ex) {
                System.out.println("Error en la vista");
                Logger.getLogger(Listado5.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }catch(Exception e){}
        
    }//GEN-LAST:event_btn_PDFActionPerformed

    private void lista_id_redisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lista_id_redisActionPerformed
        String [][] reporte=null;
        controlador.conectarREDIS();
        reporte = controlador.listarEmpleadoREDIS( (String) lista_id_redis.getSelectedItem());
        controlador.desconectarREDIS();
        
        lbl_nombre.setText(reporte[0][1]);
        lbl_departamento.setText(reporte[0][2]);
        lbl_funcion.setText(reporte[0][3]);
        lbl_status.setText(reporte[0][4]);
        lbl_sueldo.setText(reporte[0][5]);
        lbl_mes.setText(reporte[0][6]);
        lbl_ano.setText(reporte[0][7]);
        String ruta = "/home/osboxes/Desktop/RES.png";
        File file = new File(ruta);
        try {
            BufferedImage bufferedImage = ImageIO.read(file);
            ImageIcon imageIcon = new ImageIcon(bufferedImage);
            lbl_img.setIcon(imageIcon);
        } catch (IOException ex) {
            Logger.getLogger(Listado5.class.getName()).log(Level.SEVERE, null, ex);
        }
        lbl_perfil.setText(ruta);
                
    }//GEN-LAST:event_lista_id_redisActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listado5().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_PDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbl_ano;
    private javax.swing.JLabel lbl_departamento;
    private javax.swing.JLabel lbl_funcion;
    private javax.swing.JLabel lbl_img;
    private javax.swing.JLabel lbl_mes;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_perfil;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_sueldo;
    private javax.swing.JComboBox<String> lista_id_redis;
    // End of variables declaration//GEN-END:variables
}
