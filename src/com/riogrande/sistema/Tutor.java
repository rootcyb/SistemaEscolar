/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.riogrande.sistema;

/**
 *
 * @author Jorge Alonso Ramirez Gutierrez
 */

import com.riogrande.interfaces.Imprimible;

public class Tutor extends Usuario implements Imprimible {
    private Alumno alumno;

    public Tutor(int id, String nombre, String apellido, String correoElectronico, Alumno alumno) {
        super(id, nombre, apellido, correoElectronico);
        this.alumno = alumno;
    }

    public void mostrarCalificaciones() {
        System.out.println("Calificaciones del Alumno:");
        alumno.mostrarCalificaciones();
    }

    @Override
    public void imprimirPerfil() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
    }
}