/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Paquetes;

import Interfaces.Servicio;
import Interfaces.Transporte;

/**
 *
 * @author Sebastian
 */
class Paquete implements Servicio {
    private Transporte transporte;
    private int precioBase;

    public Paquete(Transporte transporte, int precioBase) {
        this.transporte = transporte;
        this.precioBase = precioBase;
    }

    @Override
    public int calcularCosto(int distancia) {
        return transporte.calcularCosto(distancia, precioBase);
    }

    @Override
    public double calcularTiempo(int distancia) {
        return transporte.calcularTiempo(distancia);
    }
}
