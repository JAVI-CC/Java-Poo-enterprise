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
public class Impresora extends Maquinaria {

    private static final Scanner teclado = new Scanner(System.in);

    /*Variable para impresora*/
    private String tipo;

    /*Constructor para la clase impresora.*/
    public Impresora(int codigoEmpresa, String codigo, String descripcion, String marca, String memoria, String tipo) {
        super(codigoEmpresa, codigo, descripcion, marca, memoria);
        this.tipo = tipo;
    }

    /*Contructor para la clase Impresora cuando se le assigna como propiedad una nave.*/
    public Impresora(int codigoEmpresa, String codigoNave, String codigo, String descripcion, String marca, String memoria, String tipo) {
        super(codigoEmpresa, codigoNave, codigo, descripcion, marca, memoria);
        this.tipo = tipo;
    }

    /*Get y Set Tipo*/
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*Metodo Modificar*/
 /*public void modificar(String codigo, String descripcion, String marca, String memoria, String tipo) {
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.marca = marca;
       this.memoria = memoria;
       this.tipo = tipo;
    }*/
    
    public void updateImpresora() {
        super.updateActivo();
        System.out.println("Introduzca un Tipo");
        tipo = teclado.nextLine();
        this.setTipo(tipo);
    }

     public void showImpresora() {
        super.showActivo();
        System.out.print(" Tipo: " + this.tipo);
        System.out.println("");
    }
    
    /*Funcion toString*/
    /*public String toString() {
        return "Codigo: " + this.codigo + " Descripcion: " + this.descripcion + " Marca: " + this.marca + " Memoria: " + this.memoria + " Velocidad: " + this.tipo;
    }*/

}
