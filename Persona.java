/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.Fes;

/**
 *
 * @author Alan
 */
public class Persona {
    private String nombre;
    private String apPaerno;
    private String apMaterno;
    private int edad;
    private String curp;

    public Persona() {
    }

    public Persona(String nombre, String apPaerno, String apMaterno, int edad, String curp) {
        this.nombre = nombre;
        this.apPaerno = apPaerno;
        this.apMaterno = apMaterno;
        this.edad = edad;
        this.curp = curp;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApPaerno() {
        return apPaerno;
    }

    public void setApPaerno(String apPaerno) {
        this.apPaerno = apPaerno;
    }

    public String getApMaterno() {
        return apMaterno;
    }

    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + "\n apPaerno=" + apPaerno + "\n apMaterno=" + apMaterno + "\n edad=" + edad + "\n curp=" + curp + '}';
    }
    
    
}
