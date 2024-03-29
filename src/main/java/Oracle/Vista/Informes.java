package Oracle.Vista;

import Oracle.DTO.DTO_EAE;
import Oracle.DTO.DTO_Empleado;
import Oracle.DTO.DTO_Cargo;
import Oracle.DTO.DTO_EE;
import Oracle.DTO.DTO_Bitacora;
import Oracle.Generalidades.Constantes;
import Oracle.Singleton.SingletonMaster;
import java.io.File;
import java.io.FileOutputStream;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JDesktopPane;
/**
 * @Autor Samuel
 */
public class Informes extends javax.swing.JInternalFrame {
    JDesktopPane desktopPane;
    private int vent = 0;

    /**
     * Creates new form EmpleadoRead
     */
    public Informes() {
        initComponents();
        vent = Constantes.getCont();

    }
    public Informes(JDesktopPane desktopPane) {
        initComponents();
        this.desktopPane = desktopPane;
        vent = Constantes.getCont();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Informes");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("Generar PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleados 1", "Empleados 2", "Cargos", "Elementos asignados", "Elementos entregados", "Informe Conexiones" }));

        jButton2.setText("Carga");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(204, 204, 204))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jButton1)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 645, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23)))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (SingletonMaster.getInstance(vent) == null){
            Noconexion er = new Noconexion();
            er.setVisible(true);   
        }else{
            jTextArea1.setText("");
            if("Empleados 1".equals(jComboBox1.getSelectedItem().toString())){
                for (DTO_Empleado dto: GUI.masterEmpleado.listarEmpleado2(vent)) {
                      jTextArea1.append(dto.toString3());
                }
           }else if("Empleados 2".equals(jComboBox1.getSelectedItem().toString())){
                for (DTO_Empleado dto: GUI.masterEmpleado.listarEmpleado3(vent)) {
                      jTextArea1.append(dto.toString4());
                }
           }else if("Cargos".equals(jComboBox1.getSelectedItem().toString())){
                String aux = jTextField1.getText();
                if (aux.length()!=0){
                    for (DTO_Cargo dto: GUI.masterCargo.listarCargos2(vent, aux)) {
                      jTextArea1.append(dto.toString());
                    }
                }else{
                    jLabel2.setText("Ingrese algo");
                }
           }else if("Elementos asignados".equals(jComboBox1.getSelectedItem().toString())){
                for (DTO_EAE dto: GUI.masterElementos_Asignados.listarElementos_Asignados2(vent)) {
                  jTextArea1.append(dto.toString());
                }
           }else if("Elementos entregados".equals(jComboBox1.getSelectedItem().toString())){
                for (DTO_EE dto: GUI.masterElementos_Asignados.listarElementos_Asignados3(vent)) {
                  jTextArea1.append(dto.toString());
                }
           }else if("Informe Conexiones".equals(jComboBox1.getSelectedItem().toString())){
                for (DTO_Bitacora dto: GUI.masterBitacora.listarBitacoras(vent)) {
                  jTextArea1.append(dto.toString());
                }
           }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    	if("Empleados 1".equals(jComboBox1.getSelectedItem().toString())){
            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\empleados1.pdf";
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                document.open();

                Paragraph p = new Paragraph();
                p.add("Informe Empleados 1");
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);
                
                Paragraph p2 = new Paragraph();
                for (DTO_Empleado dto: GUI.masterEmpleado.listarEmpleado2(vent)) {
                  p2.add(dto.toString3());
                }
                document.add(p2);

                document.close();

            } catch (Exception e) {
                e.printStackTrace();
            }        
        }else if("Empleados 2".equals(jComboBox1.getSelectedItem().toString())){
            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\empleados2.pdf";
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                document.open();

                Paragraph p = new Paragraph();
                p.add("Informe Empleados 2");
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);
                
                Paragraph p2 = new Paragraph();
                for (DTO_Empleado dto: GUI.masterEmpleado.listarEmpleado3(vent)) {
                  p2.add(dto.toString4());
                }
                document.add(p2);

                document.close();


            } catch (Exception e) {
                e.printStackTrace();
            }                    
       }else if("Cargos".equals(jComboBox1.getSelectedItem().toString())){
            String aux = jTextField1.getText();
            if (aux.length()!=0){
                String FILE_NAME = "C:\\Users\\csamu\\Desktop\\cargos.pdf";
                Document document = new Document();
                try {
                    PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                    document.open();

                    Paragraph p = new Paragraph();
                    p.add("Informe Cargos");
                    p.setAlignment(Element.ALIGN_CENTER);
                    document.add(p);

                    Paragraph p2 = new Paragraph();
                    for (DTO_Cargo dto: GUI.masterCargo.listarCargos2(vent, aux)) {
                        p2.add(dto.toString());
                    }
                    document.add(p2);

                    document.close();

                } catch (Exception e) {
                    e.printStackTrace();
                }  
            }else{
                jLabel2.setText("Ingrese algo");
            }                  
        }else if("Elementos asignados".equals(jComboBox1.getSelectedItem().toString())){
            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\elementos_asignados.pdf";
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                document.open();

                Paragraph p = new Paragraph();
                p.add("Informe Elementos asignados");
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);
                
                Paragraph p2 = new Paragraph();
                for (DTO_EAE dto: GUI.masterElementos_Asignados.listarElementos_Asignados2(vent)) {
                  p2.add(dto.toString());
                }
                document.add(p2);

                document.close();


            } catch (Exception e) {
                e.printStackTrace();
            }         
        }else if("Elementos entregados".equals(jComboBox1.getSelectedItem().toString())){
            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\elementos_entregados.pdf";
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                document.open();

                Paragraph p = new Paragraph();
                p.add("Informe Elementos  entregados");
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);
                
                Paragraph p2 = new Paragraph();
                for (DTO_EE dto: GUI.masterElementos_Asignados.listarElementos_Asignados3(vent)) {
                  p2.add(dto.toString());
                }
                document.add(p2);

                document.close();


            } catch (Exception e) {
                e.printStackTrace();
            }         
        }else if("Informe Conexiones".equals(jComboBox1.getSelectedItem().toString())){
            String FILE_NAME = "C:\\Users\\csamu\\Desktop\\conexiones.pdf";
            Document document = new Document();
            try {
                PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
                document.open();

                Paragraph p = new Paragraph();
                p.add("Informe Bitacora de Conexiones");
                p.setAlignment(Element.ALIGN_CENTER);
                document.add(p);
                
                Paragraph p2 = new Paragraph();
                for (DTO_Bitacora dto: GUI.masterBitacora.listarBitacoras(vent)) {
                  jTextArea1.append(dto.toString());
                }
                document.add(p2);

                document.close();


            } catch (Exception e) {
                e.printStackTrace();
            }         
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        SingletonMaster.desconectar(vent);
    }//GEN-LAST:event_formInternalFrameClosed

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
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Informes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Informes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
