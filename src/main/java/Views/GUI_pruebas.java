/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/MDIApplication.java to edit this template
 */
package Views;

import Controladores.MongoControlador;
import Controladores.CassandraControlador;
import Views.Cassandra.*;
import Views.MongoDB.vista_Listar;
import Views.REDIS.Actualizar_REDIS;

import Views.REDIS.Crear_REDIS;
import Views.REDIS.Eliminar_Redis;
import Views.REDIS.Listado;
import Views.REDIS.Listado2;
import Views.REDIS.Listado3;
import Views.REDIS.Listado4;
import Views.REDIS.Listado5;

import Oracle.Vista.*;
import Views.MongoDB.Views_InsertarMongo;
import Views.MongoDB.Views_eliminar;
import javax.swing.JDesktopPane;


/**
 *
 * @author Richard
 */
public class GUI_pruebas extends javax.swing.JFrame {

    /**
     * Creates new form descktop
     */
    public static Controladores.RedisControlador controlador_REDIS = new Controladores.RedisControlador();
 MongoControlador conMongo=new MongoControlador();
    public GUI_pruebas() {
        initComponents();

    }
    public JDesktopPane getdesktopPane(){
        return this.desktopPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();
        Menu_REDIS = new javax.swing.JMenu();
        crear_redis = new javax.swing.JMenuItem();
        actualizar_redis = new javax.swing.JMenuItem();
        eliminar_redis = new javax.swing.JMenuItem();
        visualizar_redis = new javax.swing.JMenuItem();
        listado2 = new javax.swing.JMenuItem();
        listado3 = new javax.swing.JMenuItem();
        listado4 = new javax.swing.JMenuItem();
        listado5 = new javax.swing.JMenuItem();
        helpMenu2 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        contentMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        aboutMenuItem2 = new javax.swing.JMenuItem();
        helpMenu3 = new javax.swing.JMenu();
        contentMenuItem3 = new javax.swing.JMenuItem();
        aboutMenuItem3 = new javax.swing.JMenuItem();
        fileMenu = new javax.swing.JMenu();
        VentanaMongo = new javax.swing.JMenuItem();
        VentanaMongo1 = new javax.swing.JMenuItem();
        VentanaMongo2 = new javax.swing.JMenuItem();
        VentanaMongo3 = new javax.swing.JMenuItem();
        VentanaMongo4 = new javax.swing.JMenuItem();
        VentanaMongo5 = new javax.swing.JMenuItem();
        VentanaMongo6 = new javax.swing.JMenuItem();
        VentanaMongo7 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        editMenu.setMnemonic('e');
        editMenu.setText("Oracle");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Activar");
        cutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(cutMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("CouchDB");

        contentMenuItem.setMnemonic('c');
        contentMenuItem.setText("Contents");
        helpMenu.add(contentMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        Menu_REDIS.setMnemonic('h');
        Menu_REDIS.setText("RedisDB");

        crear_redis.setText("Crear");
        crear_redis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_redisActionPerformed(evt);
            }
        });
        Menu_REDIS.add(crear_redis);

        actualizar_redis.setText("Actualizar");
        actualizar_redis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizar_redisActionPerformed(evt);
            }
        });
        Menu_REDIS.add(actualizar_redis);

        eliminar_redis.setText("Eliminar");
        eliminar_redis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_redisActionPerformed(evt);
            }
        });
        Menu_REDIS.add(eliminar_redis);

        visualizar_redis.setText("Visualizar");
        visualizar_redis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizar_redisActionPerformed(evt);
            }
        });
        Menu_REDIS.add(visualizar_redis);

        listado2.setText("Listado2");
        listado2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado2ActionPerformed(evt);
            }
        });
        Menu_REDIS.add(listado2);

        listado3.setText("Listado3");
        listado3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado3ActionPerformed(evt);
            }
        });
        Menu_REDIS.add(listado3);

        listado4.setText("Listado4");
        listado4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado4ActionPerformed(evt);
            }
        });
        Menu_REDIS.add(listado4);

        listado5.setText("Listado5");
        listado5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listado5ActionPerformed(evt);
            }
        });
        Menu_REDIS.add(listado5);

        menuBar.add(Menu_REDIS);

        helpMenu2.setMnemonic('h');
        helpMenu2.setText("CassandraDB");

        jMenuItem2.setText("Create");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem2);

        contentMenuItem2.setMnemonic('c');
        contentMenuItem2.setText("Read");
        contentMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contentMenuItem2ActionPerformed(evt);
            }
        });
        helpMenu2.add(contentMenuItem2);

        jMenuItem3.setText("Update");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem3);

        jMenuItem1.setText("Delete");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem1);

        jMenuItem4.setText("Informe Total");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem4);

        jMenuItem5.setText("Informe Datos Personales");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem5);

        jMenuItem6.setText("Informe Academico");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem6);

        jMenuItem7.setText("Informe Literario");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem7);

        jMenuItem8.setText("Informe Academica No Suspendidos");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem8);

        jMenuItem10.setText("Informe Hibrido Cassandra Redis");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem10);

        jMenuItem9.setText("Respaldo");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        helpMenu2.add(jMenuItem9);

        aboutMenuItem2.setMnemonic('a');
        aboutMenuItem2.setText("About");
        aboutMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutMenuItem2ActionPerformed(evt);
            }
        });
        helpMenu2.add(aboutMenuItem2);

        menuBar.add(helpMenu2);

        helpMenu3.setMnemonic('h');
        helpMenu3.setText("Neo4j");

        contentMenuItem3.setMnemonic('c');
        contentMenuItem3.setText("Contents");
        helpMenu3.add(contentMenuItem3);

        aboutMenuItem3.setMnemonic('a');
        aboutMenuItem3.setText("About");
        helpMenu3.add(aboutMenuItem3);

        menuBar.add(helpMenu3);

        fileMenu.setMnemonic('f');
        fileMenu.setText("MongoDB");

        VentanaMongo.setMnemonic('o');
        VentanaMongo.setText("Listar");
        VentanaMongo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaMongoActionPerformed(evt);
            }
        });
        VentanaMongo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VentanaMongoKeyPressed(evt);
            }
        });
        fileMenu.add(VentanaMongo);

        VentanaMongo1.setMnemonic('o');
        VentanaMongo1.setText("Insertar");
        VentanaMongo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaMongo1ActionPerformed(evt);
            }
        });
        VentanaMongo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VentanaMongo1KeyPressed(evt);
            }
        });
        fileMenu.add(VentanaMongo1);

        VentanaMongo2.setMnemonic('o');
        VentanaMongo2.setText("Eliminar");
        VentanaMongo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaMongo2ActionPerformed(evt);
            }
        });
        VentanaMongo2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VentanaMongo2KeyPressed(evt);
            }
        });
        fileMenu.add(VentanaMongo2);

        VentanaMongo3.setMnemonic('o');
        VentanaMongo3.setText("Eliminar");
        VentanaMongo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaMongo3ActionPerformed(evt);
            }
        });
        VentanaMongo3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VentanaMongo3KeyPressed(evt);
            }
        });
        fileMenu.add(VentanaMongo3);

        VentanaMongo4.setMnemonic('o');
        VentanaMongo4.setText("Eliminar");
        VentanaMongo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaMongo4ActionPerformed(evt);
            }
        });
        VentanaMongo4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VentanaMongo4KeyPressed(evt);
            }
        });
        fileMenu.add(VentanaMongo4);

        VentanaMongo5.setMnemonic('o');
        VentanaMongo5.setText("Eliminar");
        VentanaMongo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaMongo5ActionPerformed(evt);
            }
        });
        VentanaMongo5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VentanaMongo5KeyPressed(evt);
            }
        });
        fileMenu.add(VentanaMongo5);

        VentanaMongo6.setMnemonic('o');
        VentanaMongo6.setText("Eliminar");
        VentanaMongo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaMongo6ActionPerformed(evt);
            }
        });
        VentanaMongo6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VentanaMongo6KeyPressed(evt);
            }
        });
        fileMenu.add(VentanaMongo6);

        VentanaMongo7.setMnemonic('o');
        VentanaMongo7.setText("Eliminar");
        VentanaMongo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentanaMongo7ActionPerformed(evt);
            }
        });
        VentanaMongo7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                VentanaMongo7KeyPressed(evt);
            }
        });
        fileMenu.add(VentanaMongo7);

        menuBar.add(fileMenu);

        jMenu1.setText("Usuarios");

        jMenuItem11.setText("CrearUsuario");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuItem12.setText("Cambiar Contraseña");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem12);

        menuBar.add(jMenu1);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VentanaMongoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentanaMongoKeyPressed
        // TODO add your handling code here:
        System.out.println("SIUU");
    }//GEN-LAST:event_VentanaMongoKeyPressed

    private void VentanaMongoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaMongoActionPerformed
        // TODO add your handling code here:
        //AQUI 
        vista_Listar vistaMongo = new vista_Listar(this.desktopPane);
        this.desktopPane.add(vistaMongo);
        vistaMongo.show(); //migrando x=new  migrando(this.desktopPane);
        //this.desktopPane.add(x);
        //      x.show();
    }//GEN-LAST:event_VentanaMongoActionPerformed

    private void contentMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contentMenuItem2ActionPerformed
        Read_Cassandra RC = new Read_Cassandra(this.desktopPane);
        this.desktopPane.add(RC);
        RC.show();
    }//GEN-LAST:event_contentMenuItem2ActionPerformed

    private void aboutMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutMenuItem2ActionPerformed
        About RC = new About(this.desktopPane);
        this.desktopPane.add(RC);
        RC.show();
    }//GEN-LAST:event_aboutMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Delete_Cassandra DC = new Delete_Cassandra(this.desktopPane);
        this.desktopPane.add(DC);
        DC.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Create_Cassandra CC = new Create_Cassandra(this.desktopPane);
        this.desktopPane.add(CC);
        CC.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Update_Cassandra UC = new Update_Cassandra(this.desktopPane);
        this.desktopPane.add(UC);
        UC.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Informes_Cassandra IC = new Informes_Cassandra(this.desktopPane, 1);
        this.desktopPane.add(IC);
        IC.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void crear_redisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_redisActionPerformed
        Crear_REDIS crear_redis = new Crear_REDIS(this.desktopPane);
        this.desktopPane.add(crear_redis);
        crear_redis.show();
    }//GEN-LAST:event_crear_redisActionPerformed

    private void actualizar_redisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizar_redisActionPerformed
        Actualizar_REDIS actualizar_redis = new Actualizar_REDIS(this.desktopPane);
        this.desktopPane.add(actualizar_redis);
        actualizar_redis.show();
    }//GEN-LAST:event_actualizar_redisActionPerformed

    private void eliminar_redisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_redisActionPerformed
        Eliminar_Redis eliminar_redis = new Eliminar_Redis(this.desktopPane);
        this.desktopPane.add(eliminar_redis);
        eliminar_redis.show();
    }//GEN-LAST:event_eliminar_redisActionPerformed

    private void visualizar_redisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizar_redisActionPerformed
        Listado listado_redis = new Listado(this.desktopPane);
        this.desktopPane.add(listado_redis);
        listado_redis.show();
    }//GEN-LAST:event_visualizar_redisActionPerformed

    private void listado2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado2ActionPerformed
        Listado2 listado_redis = new Listado2(this.desktopPane);
        this.desktopPane.add(listado_redis);
        listado_redis.show();
    }//GEN-LAST:event_listado2ActionPerformed

    private void listado3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado3ActionPerformed
        Listado3 listado_redis = new Listado3(this.desktopPane);
        this.desktopPane.add(listado_redis);
        listado_redis.show();
    }//GEN-LAST:event_listado3ActionPerformed

    private void listado4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado4ActionPerformed
        Listado4 listado_redis = new Listado4(this.desktopPane);
        this.desktopPane.add(listado_redis);
        listado_redis.show();
    }//GEN-LAST:event_listado4ActionPerformed

    private void listado5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listado5ActionPerformed
        Listado5 listado_redis = new Listado5(this.desktopPane);
        this.desktopPane.add(listado_redis);
        listado_redis.show();
    }//GEN-LAST:event_listado5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        Informes_Cassandra IC = new Informes_Cassandra(this.desktopPane, 4);
        this.desktopPane.add(IC);
        IC.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Informes_Cassandra IC = new Informes_Cassandra(this.desktopPane, 5);
        this.desktopPane.add(IC);
        IC.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Informes_Cassandra IC = new Informes_Cassandra(this.desktopPane, 2);
        this.desktopPane.add(IC);
        IC.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Informes_Cassandra IC = new Informes_Cassandra(this.desktopPane, 3);
        this.desktopPane.add(IC);
        IC.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        CassandraControlador MC = new CassandraControlador();
        MC.Respaldo();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void cutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutMenuItemActionPerformed
        GUI g = new GUI(this.desktopPane);
        this.desktopPane.add(g);
        g.show();
    }//GEN-LAST:event_cutMenuItemActionPerformed

    private void VentanaMongo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaMongo1ActionPerformed
        // TODO add your handling code here:
        Views_InsertarMongo vista = new Views_InsertarMongo(this.desktopPane);
        this.desktopPane.add(vista);
        vista.show();
    }//GEN-LAST:event_VentanaMongo1ActionPerformed

    private void VentanaMongo1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentanaMongo1KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo1KeyPressed

    private void VentanaMongo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaMongo2ActionPerformed
        // TODO add your handling code here:sssssssssssss
        Views_eliminar vista = new Views_eliminar(this.desktopPane);
        this.desktopPane.add(vista);
        vista.show();
    }//GEN-LAST:event_VentanaMongo2ActionPerformed

    private void VentanaMongo2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentanaMongo2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo2KeyPressed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        Informes_Cassandra IC = new Informes_Cassandra(this.desktopPane, 6);
        this.desktopPane.add(IC);
        IC.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        CrearUsuario CU = new CrearUsuario(this.desktopPane);
        this.desktopPane.add(CU);
        CU.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        CambiarPassword CP = new CambiarPassword(this.desktopPane);
        this.desktopPane.add(CP);
        CP.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void VentanaMongo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaMongo3ActionPerformed
        // TODO add your handling code here:
this.conMongo.Generar_pdf(1);

    }//GEN-LAST:event_VentanaMongo3ActionPerformed

    private void VentanaMongo3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentanaMongo3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo3KeyPressed

    private void VentanaMongo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaMongo4ActionPerformed
        // TODO add your handling code here:
this.conMongo.Generar_pdf(2);
    }//GEN-LAST:event_VentanaMongo4ActionPerformed

    private void VentanaMongo4KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentanaMongo4KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo4KeyPressed

    private void VentanaMongo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaMongo5ActionPerformed
this.conMongo.Generar_pdf(3);        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo5ActionPerformed

    private void VentanaMongo5KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentanaMongo5KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo5KeyPressed

    private void VentanaMongo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaMongo6ActionPerformed
this.conMongo.Generar_pdf(4);        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo6ActionPerformed

    private void VentanaMongo6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentanaMongo6KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo6KeyPressed

    private void VentanaMongo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentanaMongo7ActionPerformed
this.conMongo.Generar_pdf(5);        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo7ActionPerformed

    private void VentanaMongo7KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_VentanaMongo7KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_VentanaMongo7KeyPressed

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
            java.util.logging.Logger.getLogger(GUI_pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_pruebas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new GUI_pruebas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Menu_REDIS;
    private javax.swing.JMenuItem VentanaMongo;
    private javax.swing.JMenuItem VentanaMongo1;
    private javax.swing.JMenuItem VentanaMongo2;
    private javax.swing.JMenuItem VentanaMongo3;
    private javax.swing.JMenuItem VentanaMongo4;
    private javax.swing.JMenuItem VentanaMongo5;
    private javax.swing.JMenuItem VentanaMongo6;
    private javax.swing.JMenuItem VentanaMongo7;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem aboutMenuItem2;
    private javax.swing.JMenuItem aboutMenuItem3;
    private javax.swing.JMenuItem actualizar_redis;
    private javax.swing.JMenuItem contentMenuItem;
    private javax.swing.JMenuItem contentMenuItem2;
    private javax.swing.JMenuItem contentMenuItem3;
    private javax.swing.JMenuItem crear_redis;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem eliminar_redis;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JMenu helpMenu2;
    private javax.swing.JMenu helpMenu3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem listado2;
    private javax.swing.JMenuItem listado3;
    private javax.swing.JMenuItem listado4;
    private javax.swing.JMenuItem listado5;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem visualizar_redis;
    // End of variables declaration//GEN-END:variables

}