/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.pc;

import ico.fes.componentes.CPU;
import ico.fes.componentes.Monitor;
import ico.fes.componentes.Mouse;
import ico.fes.componentes.Teclado;

/**
 *
 * @author Alan
 */
public class Computadora {

    private String marca;
    private String modelo;
    private CPU cpu;
    private Monitor monitor;
    private Mouse mouse;
    private Teclado teclado;

    public Computadora() {
    }

    public Computadora(String marca, String modelo, CPU cpu, Monitor monitor, Mouse mouse, Teclado teclado) {
        this.marca = marca;
        this.modelo = modelo;
        this.cpu = cpu;
        this.monitor = monitor;
        this.mouse = mouse;
        this.teclado = teclado;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    @Override
    public String toString() {
        return "Computadora{" + "marca=" + marca + ", modelo=" + modelo + ", cpu=" + cpu + ", monitor=" + monitor + ", mouse=" + mouse + ", teclado=" + teclado + '}';
    }

}
