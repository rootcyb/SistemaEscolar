package com.riogrande.sistema;

/**
 *
 * @author Jorge Alonso Ramirez Gutierrez
 */

import com.riogrande.interfaces.Calificaciones;
import com.riogrande.interfaces.Imprimible;

public class Alumno extends Usuario implements Calificaciones, Imprimible {
    private double calificacion;

    public Alumno(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
        this.calificacion = 0.0;
    }

    @Override
    public void mostrarCalificaciones() {
        System.out.println("Calificación: " + this.calificacion);
    }

    @Override
    public void guardarCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    @Override
    public void imprimirPerfil() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
    }
}