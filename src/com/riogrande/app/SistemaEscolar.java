/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/* Reto 5 Proyecto final del paradigma orientado a objetos
 * --------------------------------------------
 * |Código desarrollado por:
 * |Jorge Alonso Ramírez Gutiérrez
 * |Matricula:24007784
 * |Modulo: Programación Orientada a Objetos
 * |Asesora: Claudia Patricia Rojano Hernández
 * |Estudiante de Ingeniería en Sistemas Computacionales
 * |Universidad Virtual del Estado de Guanajuato (UVEG)
 * |Fecha de creación: 29/11/2024
 * --------------------------------------------
 */
package com.riogrande.app;

import com.riogrande.sistema.Alumno;
import com.riogrande.sistema.Maestro;
import com.riogrande.sistema.Tutor;

public class SistemaEscolar {
    public static void main(String[] args) {
        // Datos reales de alumnos
        Alumno alumno1 = new Alumno(1, "Carlos Manuel", "López Robles", "carlos.lopez23@gmail.com");
        Alumno alumno2 = new Alumno(2, "María Guadalupe", "González Pérez", "maria.gonzalez32@gmail.com");
        Alumno alumno3 = new Alumno(3, "Antonio", "Silva Mares", "antonisilmar@gmail.com");
        Alumno alumno4 = new Alumno(4, "Jimena", "Rojas Lozoya", "jimenarojas09@gmail.com");
        

        alumno1.guardarCalificacion(95.5);
        alumno2.guardarCalificacion(92.3);
        alumno3.guardarCalificacion(87.5);
        alumno4.guardarCalificacion(95.3);

        // Maestro
        Maestro maestro1 = new Maestro(3, "Luis Higinio", "Ramírez", "luis.ramirez@gmail.com");
        Maestro maestro2 = new Maestro(4, "Yadira", "Baca Gomez", "luis.ramirez@gmail.com");

        // Tutor
        Tutor tutor1 = new Tutor(5, "Ana Laura", "Fernández Gonzáles", "ana.f3rnandez@outlook.com", alumno1);

        // Mostrar datos del Sistema Escolar 
        System.out.println("|||=== Sistema Escolar Esc. Informática Río Grande ===|||\n");
        System.out.println("===| Alumno 1 |===");
        alumno1.imprimirPerfil();
        alumno1.mostrarCalificaciones();

        System.out.println("\n===| Alumno 2 |===");
        alumno2.imprimirPerfil();
        alumno2.mostrarCalificaciones();
        
        System.out.println("\n===| Alumno 3 |===");
        alumno3.imprimirPerfil();
        alumno3.mostrarCalificaciones();
        
        System.out.println("\n===| Alumno 4 |===");
        alumno4.imprimirPerfil();
        alumno4.mostrarCalificaciones();

        System.out.println("\n===| Maestro |===");
        maestro1.imprimirPerfil();

        System.out.println("\n=== Tutor ===");
        tutor1.imprimirPerfil();
        tutor1.mostrarCalificaciones();
    }
}
