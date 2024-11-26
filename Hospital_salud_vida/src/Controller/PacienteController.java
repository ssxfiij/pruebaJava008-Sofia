/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Bd.Conexion;
import Models.Paciente;
import com.mysql.cj.util.Util;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.util.Date;
import java.sql.PreparedStatement;


/**
 *
 * @author Cetecom
 */
public class PacienteController {
    HelperController helper = new HelperController();
    Conexion cx;

    public PacienteController() {
        cx = new Conexion();
        cx.conectar();
    }
    
    public List<Paciente> obtenerPaciente(){
        List<Paciente> pacientes = new ArrayList<>();
        try {
            ResultSet rs = cx.EjecutarQuery("");
            while (rs.next()){
                pacientes.add(new Paciente(
                             rs.getInt("rut"),
                             rs.getString("nombre"),
                             rs.getString("direccion"),
                             rs.getDate("fecha_nacimiento"),
                             rs.getInt("telefono")
                             ));
            }
        } catch (Exception e) {
            System.out.println("error");
        }
        return pacientes;
    }
     
    public void agregarPaciente(String nombre, String medico, Date fecha_consulta, String hospitalizacion){
        String sql = "INSERT INTO 'paciente' (nombre, medico, fecha_consulta, hospitalizacion) VALUES (?,?,?,?)";
        
        try {
            PreparedStatement st = cx.getConnection().prepareStatement(sql);
            st.setString(1, nombre);
            st.setString(2, medico);
            st.setString(3, hospitalizacion);
            st.setDate(4, (java.sql.Date) fecha_consulta );
            st.executeUpdate();
            helper.showInformation("Agregado Correctamente");
        } catch (Exception e) {
            helper.showError(e.getMessage());
        }
        }
    
    public Paciente buscarPacientepoRut(){
        Paciente PacienteEncontrado = null;
        String query "SELECT * FROM paciente WHERE rut = " + rut ";";
        try {
            ResultSet rs = cx.EjecutarQuery(query);
            if(rs.next()){
                PacienteEncontrado = new Paciente();
                PacienteEncontrado.setRut(rs.getInt("rut"));
                PacienteEncontrado.setNombre(rs.getString("nombre"));
                PacienteEncontrado.setDireccion(rs.getString("direccion"));
                PacienteEncontrado.setFecha_nacimiento(rs.getDate("fecha_nacimiento"));
            }
        } catch (Exception e) {
             helper.showError(e.getMessage());
        }
       return PacienteEncontrado;
    }
    
    public void 
    
    
}
  
    
    
    

