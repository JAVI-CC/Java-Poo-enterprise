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
public abstract class Maquinaria implements Activo {

    private static final Scanner teclado = new Scanner(System.in);

    /*Variables para la clase abstracta Maquinaria*/
    protected String codigo;
    protected String descripcion;
    protected String marca;
    protected String memoria;
    protected String codigoNave;
    protected int codigoEmpresa;

    /*Constructor para la clase Impresora y Ordenador*/
    public Maquinaria(int codigoEmpresa, String codigo, String descripcion, String marca, String memoria) {
        this.codigoEmpresa = codigoEmpresa;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.memoria = memoria;
    }

    /*Contructor para la clase Impresora y Ordenador cuando se le assigna como propiedad una nave.*/
    public Maquinaria(int codigoEmpresa, String codigoNave, String codigo, String descripcion, String marca, String memoria) {
        this.codigoEmpresa = codigoEmpresa;
        this.codigoNave = codigoNave;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.marca = marca;
        this.memoria = memoria;
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

    /*Get y Set Marca*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*Get y Set Memoria*/
    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
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

    /*Metodos Interfaz Activo*/
    @Override
    public void updateActivo() {
        /*Introducir valores para la modificacion del ordenador y la impresora.*/
        System.out.println("Introduzca un codigo");
        codigo = teclado.nextLine();
        System.out.println("Introduzca una Descripcion");
        descripcion = teclado.nextLine();
        System.out.println("Introduzca una Marca");
        marca = teclado.nextLine();
        System.out.println("Introduzca un Memoria");
        memoria = teclado.nextLine();

        this.setCodigo(codigo);
        this.setDescripcion(descripcion);
        this.setMarca(marca);
        this.setMemoria(memoria);
    }

    @Override
    public void showActivo() {
        System.out.print("Codigo: " + this.codigo + " Descripcion: " + this.descripcion + " Marca: " + this.marca + " Memoria: " + this.memoria);
    }

}
