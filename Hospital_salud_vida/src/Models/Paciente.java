/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author Cetecom
 */
public class Paciente {
    private int rut;
    private String nombre, direccion, hospitalizacion;
    private Date fecha_nacimiento;
    private int telefono;
    public String getHospitalizacion;

    public Paciente() {
    }

    public Paciente(int rut, String nombre, String direccion, String hospitalizacion, Date fecha_nacimiento, int telefono, String getHospitalizacion) {
        this.rut = rut;
        this.nombre = nombre;
        this.direccion = direccion;
        this.hospitalizacion = hospitalizacion;
        this.fecha_nacimiento = fecha_nacimiento;
        this.telefono = telefono;
        this.getHospitalizacion = getHospitalizacion;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getHospitalizacion() {
        return hospitalizacion;
    }

    public void setHospitalizacion(String hospitalizacion) {
        this.hospitalizacion = hospitalizacion;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getGetHospitalizacion() {
        return getHospitalizacion;
    }

    public void setGetHospitalizacion(String getHospitalizacion) {
        this.getHospitalizacion = getHospitalizacion;
    }

    @Override
    public String toString() {
        return "Paciente{" + "rut=" + rut + ", nombre=" + nombre + ", direccion=" + direccion + ", hospitalizacion=" + hospitalizacion + ", fecha_nacimiento=" + fecha_nacimiento + ", telefono=" + telefono + ", getHospitalizacion=" + getHospitalizacion + '}';
    }

}