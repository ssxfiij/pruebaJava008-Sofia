/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hospital_salud_vida;

import Bd.Conexion;
import Controller.PacienteController;

/**
 *
 * @author Cetecom
 */
public class Hospital_salud_vida {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Conexion cx = new Conexion();
        
        cx.conectar();
        
        PacienteController pc = new PacienteController();
        
        
    }
    
}
