/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio.colegiado;

/**
 *
 * @author dagui
 */
public class Segunda {
    public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Crear una instancia de la clase Cancion
        Cancion cancion1 = new Cancion(1, "Cancion 1", "Autor 1", 180, 2020);

        // Acceder a los atributos usando los getters
        System.out.println("Título de la canción: " + cancion1.getTitulo());
        System.out.println("Duración de la canción: " + cancion1.getDuracion() + " segundos");

        // Modificar atributos usando los setters
        cancion1.setAnoCreacion(2021);
        System.out.println("Año de creación actualizado: " + cancion1.getAnoCreacion());
    }
}
//
}
