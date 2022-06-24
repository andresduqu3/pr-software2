/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Richard
 */
public class Tabla {
    public DefaultTableModel contruir_tabla( ArrayList<String[]> listaString,String[] columnas) {

   
           
            String[] datos = new String[columnas.length];
            String[] vacia = new String[columnas.length];

            for (int i = 0; i < vacia.length; i++) {
                vacia[i] = "";
            }

            DefaultTableModel modelo = new DefaultTableModel();
            //this.columnas=new String[col];
            for (int i = 0; i < columnas.length; i++) {
                //System.out.print(estructura.getColumnName(i) + " ");
                //para informes
                //this.columnas[i-1]=estructura.getColumnName(i);
                modelo.addColumn(columnas[i]);
            }
            //System.out.println(col);
            //System.out.println(listaString.get(0).length);
//            for (int i = 0; i < col; i++) {
//                System.out.println(listaString.get(0)[i]);
//            }
            for (int i = 0; i < listaString.size(); i++) {
                for (int j = 0; j < columnas.length; j++) {
                    if (listaString.get(i)[j]==(null)) {
                        datos[j] = "--";
                    } else {
                        datos[j] = listaString.get(i)[j];
                    }

                }
                modelo.addRow(datos);

            }
            modelo.addRow(vacia);
            return modelo;


    }
    
}
