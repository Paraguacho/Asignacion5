/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vehiculos;

import Interfaces.Transporte;

/**
 *
 * @author Sebastian
 */
public class Bicicleta implements Transporte {
    private static final int VELOCIDAD_PROMEDIO = 20;
    private static final int COSTO_ADICIONAL = 5;

    @Override
    public int calcularCosto(int distancia, int precioBase) {
        return precioBase + COSTO_ADICIONAL * distancia;
    }

    @Override
    public double calcularTiempo(int distancia) {
        return distancia / (double) VELOCIDAD_PROMEDIO;
    }
}