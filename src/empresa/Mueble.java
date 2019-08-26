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
public class Mueble implements Activo {

    private static final Scanner teclado = new Scanner(System.in);
    
    /*Variables para la clase Mueble*/
    private int codigoEmpresa;
    private String codigoNave;
    private String codigo;
    private String descripcion;
    private double alto;
    private double ancho;
    private double fondo;

    /*Constructor para la clase Mueble.*/
    public Mueble(int codigoEmpresa, String codigo, String descripcion, double alto, double ancho, double fondo) {
        this.codigoEmpresa = codigoEmpresa;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
    }

    /*Contructor para la clase Mueble cuando se le assigna como propiedad una nave.*/
    public Mueble(int codigoEmpresa, String codigoNave, String codigo, String descripcion, double alto, double ancho, double fondo) {
        this.codigoEmpresa = codigoEmpresa;
        this.codigoNave = codigoNave;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
    }
    
    /*Get y Set Codigo*/
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

     /*Get y Set Descripcion*/
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /*Get y set Alto*/
    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    /*Get y set Ancho*/
    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    /*Get y set Fondo*/
    public double getFondo() {
        return fondo;
    }

    public void setFondo(double fondo) {
        this.fondo = fondo;
    }

    /*Get y Set CodigoEmpresa*/
    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigoEmpresa) {
        this.codigoEmpresa = codigoEmpresa;
    }
    
    /*Get y Set CodigoNave*/
    public String getCodigoNave() {
        return codigoNave;
    }

    public void setCodigoNave(String codigoNave) {
        this.codigoNave = codigoNave;
    }
    
    /*Metodo Modificar*/
    /*public void modificar(String codigo, String descripcion, double alto, double ancho, double fondo) {
       this.codigo = codigo;
       this.descripcion = descripcion;
       this.alto = alto;
       this.ancho = ancho;
       this.fondo = fondo; 
    }*/
    
    /*Funcion toString*/
    /*public String toString() {
        return "Codigo: " + this.codigo + " Descripcion: " + this.descripcion + " Alto: " + this.alto + " Ancho: " + this.ancho + " Fondo: " + this.fondo;
    }*/

    @Override
    public void updateActivo() {
        /*Introducir valores para la modificacion del ordenador y la impresora.*/
        System.out.println("Introduzca un codigo");
        codigo = teclado.nextLine();
        System.out.println("Introduzca una Descripcion");
        descripcion = teclado.nextLine();
        System.out.println("Introduzca una Alto");
        alto = teclado.nextDouble();
        System.out.println("Introduzca un Ancho");
        ancho = teclado.nextDouble();
        System.out.println("Introduzca un Fondo");
        fondo = teclado.nextDouble();

        this.setCodigo(codigo);
        this.setDescripcion(descripcion);
        this.setAlto(alto);
        this.setAncho(ancho);
        this.setFondo(fondo);
    }
    
    @Override
    public void showActivo() {
        System.out.println("Codigo: " + this.codigo + " Descripcion: " + this.descripcion + " Alto: " + this.alto + " Ancho: " + this.ancho + " Fondo: " + this.fondo);
    }

}
