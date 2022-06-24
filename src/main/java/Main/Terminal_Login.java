/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @Autor Alejandro
 */
public class Terminal_Login {
    
    public static void main(String[] args) {
        DAO_Login log = new DAO_Login();
        //controlador.buscarlogin("alejo", "alejo");
        log.insertarUsuario("roger", "sistemas");
        System.out.println(log.buscarlogin("roger", "sistemas"));
        log.cambiarContrasena("roger", "fresa", "sistemas");
    }
    
}
