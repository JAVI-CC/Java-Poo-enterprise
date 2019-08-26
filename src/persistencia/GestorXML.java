/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import com.thoughtworks.xstream.XStream;
import empresa.Empresa;
import empresa.Nave;
import empresa.Mueble;
import empresa.Ordenador;
import empresa.Impresora;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class GestorXML {

    /*Variables ArrayList*/
    private ArrayList<Empresa> Empresalist = new ArrayList<Empresa>();
    private ArrayList<Nave> Navelist = new ArrayList<Nave>();
    private ArrayList<Mueble> Mueblelist = new ArrayList<Mueble>();
    private ArrayList<Ordenador> Ordenadorlist = new ArrayList<Ordenador>();
    private ArrayList<Impresora> Impresoralist = new ArrayList<Impresora>();

    /*Variables para guardar los ficheros XML en una ruta por defecto.*/
    File ruta = new File("src/persistencia/XML");
    File File_Empresa = new File(ruta, "Empresas.xml");
    File File_Nave = new File(ruta, "Naves.xml");
    File File_Mueble = new File(ruta, "Muebles.xml");
    File File_Ordenador = new File(ruta, "Ordenadores.xml");
    File File_Impresora = new File(ruta, "Impresoras.xml");

    /*Variable de tipo XStream*/
    private XStream xstream = new XStream();

    /*Constructor GestorXML*/
    public GestorXML() {

    }

    /*Get y Set Empresalist*/
    public ArrayList<Empresa> getEmpresalist() {
        return Empresalist;
    }

    public void setEmpresalist(ArrayList<Empresa> Empresalist) {
        this.Empresalist = Empresalist;
    }

    /*Get y Set Navelist*/
    public ArrayList<Nave> getNavelist() {
        return Navelist;
    }

    public void setNavelist(ArrayList<Nave> Navelist) {
        this.Navelist = Navelist;
    }

    /*Get y Set Mueblelist*/
    public ArrayList<Mueble> getMueblelist() {
        return Mueblelist;
    }

    public void setMueblelist(ArrayList<Mueble> Mueblelist) {
        this.Mueblelist = Mueblelist;
    }

    /*Get y Set Ordenadorlist*/
    public ArrayList<Ordenador> getOrdenadorlist() {
        return Ordenadorlist;
    }

    public void setOrdenadorlist(ArrayList<Ordenador> Ordenadorlist) {
        this.Ordenadorlist = Ordenadorlist;
    }

    /*Get y Set Impresoralist*/
    public ArrayList<Impresora> getImpresoralist() {
        return Impresoralist;
    }

    public void setImpresoralist(ArrayList<Impresora> Impresoralist) {
        this.Impresoralist = Impresoralist;
    }
    
    /*Funcion para guardar todos los objetos que contiene en las arraylist en ficheros .xml*/
    public void GuardarObjetos(ArrayList<Empresa> EmpresaGuardar, ArrayList<Nave> NaveGuardar,
            ArrayList<Mueble> MuebleGuardar, ArrayList<Ordenador> OrdenadorGuardar, ArrayList<Impresora> ImpresoraGuardar) throws FileNotFoundException, IOException {

        xstream.toXML(EmpresaGuardar, new FileWriter(File_Empresa));

        xstream.toXML(NaveGuardar, new FileWriter(File_Nave));

        xstream.toXML(MuebleGuardar, new FileWriter(File_Mueble));

        xstream.toXML(OrdenadorGuardar, new FileWriter(File_Ordenador));

        xstream.toXML(ImpresoraGuardar, new FileWriter(File_Impresora));
    }

    /*Funcion parar guardar todos los objetos que contiene los ficheros .xml en cada arraylist correspondiente*/
    public void CargarObjtetos(ArrayList<Empresa> Empresalist, ArrayList<Nave> Navelist, 
            ArrayList<Mueble> Mueblelist, ArrayList<Ordenador> Ordenadorlist, ArrayList<Impresora> Impresoralist){
        
        this.Empresalist = (ArrayList<Empresa>) xstream.fromXML(File_Empresa);
        
        this.Navelist = (ArrayList<Nave>) xstream.fromXML(File_Nave);
        
        this.Mueblelist = (ArrayList<Mueble>) xstream.fromXML(File_Mueble);
        
        this.Ordenadorlist = (ArrayList<Ordenador>) xstream.fromXML(File_Ordenador);
        
        this.Impresoralist = (ArrayList<Impresora>) xstream.fromXML(File_Impresora);       
    }

}
