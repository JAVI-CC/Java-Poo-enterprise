/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

/**
 *
 * @author User
 */
public class Empresa {

    /*variables para la clase Empresa*/
    private static int cnt = 0;
    protected int codigoEmpresa;
    private String direccion;

    /*Constructor para empresa*/
    public Empresa(String direccion) {
        Empresa.cnt++;
        this.codigoEmpresa = Empresa.cnt;
        this.direccion = direccion;
    }

    /*Constructor para nave*/
    public Empresa(int codigo) {
        this.codigoEmpresa = codigo;
    }

    /*Get y Set Codigo*/
    public int getCodigoEmpresa() {
        return codigoEmpresa;
    }

    public void setCodigoEmpresa(int codigo) {
        this.codigoEmpresa = codigo;
    }

    /*Get y Set Direccion*/
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /*Funcion toString*/
    public String toString() {
        return "Codigo: " + this.codigoEmpresa + " Direccion: " + this.direccion;
    }

}
