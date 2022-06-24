
package Views.Neo;

import Views.REDIS.*;
import javax.swing.JDesktopPane;

import Cassandra.DTO.DTO_Persona;
import javax.swing.JOptionPane;

import Controladores.RedisControlador;
import Neo.controller.Controller;
import Neo.model.MovieCastDTO;
import Neo.model.Table2PDF;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class ViewMovieCast extends javax.swing.JInternalFrame {

    public static Controller controlador = new Controller();
    JDesktopPane desktopPane;    
    String [][] reporte;
    
    public ViewMovieCast() {
        initComponents();
    }

    public ViewMovieCast(JDesktopPane desktopPane) {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listado_empleados = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        textano = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        listado_empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title", "Released", "Tagline", "Cast"
            }
        ));
        jScrollPane1.setViewportView(listado_empleados);

        jLabel1.setText("Pelicual Cast");

        jButton1.setText("GENERAR PDF");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_buscar.setText("BUSCAR");
        btn_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 636, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(169, 169, 169)
                        .addComponent(jButton1)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(textano, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_buscar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_buscar))
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Table2PDF pdf = new Table2PDF();
        pdf.print(listado_empleados, "movieCast");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarActionPerformed
        this.desktopPane = desktopPane;
//        reporte = controlador.listarEmpleadoAnoREDIS(textano.getText());
//        controlador.desconectarREDIS();
        
//        DefaultTableModel model = (DefaultTableModel) listado_empleados.getModel();
////        model.setRowCount(reporte.length);
//
//        Table2PDF pdf = new Table2PDF();
//        pdf.print(listado_empleados, "movieCast");
//
        String movie = textano.getText();
        ArrayList<MovieCastDTO> movie_cast = controlador.getMovieCast(movie);

        DefaultTableModel model = (DefaultTableModel) listado_empleados.getModel();

        model.setRowCount(0); // reset model

        Object rowData[] = new Object[4];

        movie_cast.forEach((t) -> {
            rowData[0] = t.getTitle()+"";
            rowData[1] = t.getReleased()+"";
            rowData[2] = t.getTagline()+"";
            rowData[3] = t.getCast()+"";
            model.addRow(rowData);
        });
//        System.out.println(MovieCastDTO.class.getFields().length);
//        System.out.println(movie_cast.get(0).getTitle()+"");
//        for(int i = 0; i < movie_cast.size(); i++){
//            rowData[0] = movie_cast.get(i).getTitle()+"";
//            rowData[1] = movie_cast.get(i).getReleased()+"";
//            rowData[2] = movie_cast.get(i).getTagline()+"";
//            rowData[3] = movie_cast.get(i).getCast()+"";
//            model.addRow(rowData);
//         }
    }//GEN-LAST:event_btn_buscarActionPerformed

    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMovieCast().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_buscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listado_empleados;
    private javax.swing.JTextField textano;
    // End of variables declaration//GEN-END:variables
}
