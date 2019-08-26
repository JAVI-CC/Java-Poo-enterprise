/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Nave extends Empresa implements Activo {

        private ArrayList<Integer> nums = new ArrayList<Integer>();

        private ArrayList<Integer> nums2 = new ArrayList<Integer>();

    private static final Scanner teclado = new Scanner(System.in);

    /*variables para la clase Nave*/
    private String nombre;
    private String codigoNave;

    /*Constructor para la clase nave*/
    public Nave(int codigoEmpresa, String codigoNave, String nombre) {
        super(codigoEmpresa);
        this.codigoNave = codigoNave;
        this.nombre = nombre;
    }

    /*Get y Set CodigNave*/
    public String getcodigoNave() {
        return codigoNave;
    }

    public void setcodigoNave(String codigoNave) {
        this.codigoNave = codigoNave;
    }

    /*Get y Set getNombre */
    public String getnombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /*Funcion toString*/
 /* public String toString() {
        return "Propiedad Empresa: " + this.codigoEmpresa + " Codigo: " + this.codigoNave + " Nombre: " + this.nombre;
    }*/
    
    @Override
    public void updateActivo() {
        /*Introducir valores para la modificacion del ordenador y la impresora.*/
        System.out.println("Introduzca un codigoNave");
        codigoNave = teclado.nextLine();
        System.out.println("Introduzca un nombre");
        nombre = teclado.nextLine();
        
        this.setcodigoNave(codigoNave);
        this.setNombre(nombre);
    }

    @Override
    public void showActivo() {
        System.out.println("Propiedad Empresa: " + this.codigoEmpresa + " Codigo: " + this.codigoNave + " Nombre: " + this.nombre);
    }

}
