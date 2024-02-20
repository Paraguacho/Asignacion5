/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import Interfaces.Transporte;
import Vehiculos.Auto;
import Vehiculos.Bicicleta;
import Vehiculos.Dron;
import Vehiculos.Moto;
/**
 *
 * @author Sebastian
 */
class PaqueteFactory {
    public static Paquete crearPaquete(String tipo, String servicio, int distancia) {
        Transporte transporte;
        int precioBase;

        switch (tipo) {
            case "Sobre":
                precioBase = 5;
                transporte = obtenerTransporte(servicio, distancia);
                return new Sobre(transporte, precioBase);
            case "CajaPequeña":
                precioBase = 10;
                transporte = obtenerTransporte(servicio, distancia);
                return new CajaPequeña(transporte, precioBase);
            case "CajaMediana":
                precioBase = 20;
                transporte = obtenerTransporte(servicio, distancia);
                return new CajaMediana(transporte, precioBase);
            case "CajaGrande":
                precioBase = 50;
                transporte = new Auto(); // Siempre se usa el auto para cajas grandes
                return new CajaGrande(transporte, precioBase);
            default:
                throw new IllegalArgumentException("Tipo de paquete desconocido");
        }
    }

    private static Transporte obtenerTransporte(String servicio, int distancia) {
        if (servicio.equals("Estandar")) {
            if (distancia <= 1) {
                return new Bicicleta();
            } else if (distancia <= 5) {
                return new Bicicleta();
            } else {
                return new Moto();
            }
        } else if (servicio.equals("Expres")) {
            if (distancia <= 1) {
                return new Dron();
            } else {
                return new Moto();
            }
        } else {
            throw new IllegalArgumentException("Tipo de servicio desconocido");
        }
    }
}
