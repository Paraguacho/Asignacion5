/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

/**
 *
 * @author Sebastian
 */
public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        String tipo = "CajaPequeña";
        String servicio = "Estandar";
        int distancia = 4;

        Paquete paquete = PaqueteFactory.crearPaquete(tipo, servicio, distancia);
        int costo = paquete.calcularCosto(distancia);
        double tiempo = paquete.calcularTiempo(distancia);

        System.out.println("Costo del servicio: $" + costo);
        System.out.println("Tiempo estimado de entrega: " + tiempo + " horas");
    }
}