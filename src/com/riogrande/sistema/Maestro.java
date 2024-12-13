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

public class Maestro extends Usuario implements Imprimible {

    public Maestro(int id, String nombre, String apellido, String correoElectronico) {
        super(id, nombre, apellido, correoElectronico);
    }

    @Override
    public void imprimirPerfil() {
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre() + " " + getApellido());
        System.out.println("Correo Electrónico: " + getCorreoElectronico());
    }
}
