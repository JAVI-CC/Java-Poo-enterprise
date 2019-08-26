/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ordenador extends Maquinaria {

    private static final Scanner teclado = new Scanner(System.in);

    /*Variable para la clase Ordenador*/
    private String velocidad;

    /*Contructor para la clase Ordenador.*/
    public Ordenador(int codigoEmpresa, String codigo, String descripcion, String marca, String memoria, String velocidad) {
        super(codigoEmpresa, codigo, descripcion, marca, memoria);
        this.velocidad = velocidad;
    }

    /*Contructor para la clase Ordenador cuando se le assigna como propiedad una nave.*/
    public Ordenador(int codigoEmpresa, String codigoNave, String codigo, String descripcion, String marca, String memoria, String velocidad) {
        super(codigoEmpresa, codigoNave, codigo, descripcion, marca, memoria);
        this.velocidad = velocidad;
    }

    /*Get y Set Velocidad*/
    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    /*Metodo Modificar*/
 /*public void modificar(String codigo, String descripcion, String marca, String memoria, String velocidad) {
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.marca = marca;
       this.memoria = memoria;
       this.velocidad = velocidad;
    }*/
    public void updateOrdenador() {
        super.updateActivo();
        System.out.println("Introduzca un Velocidad");
        velocidad = teclado.nextLine();
        this.setVelocidad(velocidad);
    }
    
    public void showOrdenador() {
        super.showActivo();
        System.out.print(" Velocidad: " + this.velocidad);
        System.out.println("");
    }
            
    
    /*Funcion toString*/
    /*public String toString() {
        return "Codigo: " + this.codigo + " Descripcion: " + this.descripcion + " Marca: " + this.marca + " Memoria: " + this.memoria + " Velocidad: " + this.velocidad;
    }*/

}
