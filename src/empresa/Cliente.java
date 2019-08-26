/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package empresa;

import javax.swing.*;
import persistencia.GestorXML;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author User
 */
public class Cliente {

    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) throws FileNotFoundException, IOException {

        /*Variables Arraylist*/
        ArrayList<Empresa> empresalist = new ArrayList<Empresa>();
        ArrayList<Nave> navelist = new ArrayList<Nave>();
        ArrayList<Mueble> mueblelist = new ArrayList<Mueble>();
        ArrayList<Ordenador> ordenadorlist = new ArrayList<Ordenador>();
        ArrayList<Impresora> impresoralist = new ArrayList<Impresora>();

        /*Variable para la clase GestorXML*/
        GestorXML XML = new GestorXML();

        /*Llamar a la funcion para cargar los objetos de todas las arraylists.*/
        XML.CargarObjtetos(empresalist, navelist, mueblelist, ordenadorlist, impresoralist);
        
        /*Guardar los objetos en cada arraylist correspondiente.*/
        empresalist = XML.getEmpresalist();
        navelist = XML.getNavelist();
        mueblelist = XML.getMueblelist();
        ordenadorlist = XML.getOrdenadorlist();
        impresoralist = XML.getImpresoralist();

        int opcion = 0;
        String tecla;
        int m = 0;
        int c = 0;
        int elegir = 0;

        /*Variables para empresa*/
        int empresa;
        /*Empresa e1 = new Empresa("calle falsa 123");
        Empresa e2 = new Empresa("calle falsa 456");
        Empresa e3 = new Empresa("calle falsa 789");
        empresalist.add(e1);
        empresalist.add(e2);
        empresalist.add(e3);*/
        String direccion;

        /*Variables para Nave*/
        /*Nave n1 = new Nave(empresalist.get(0).getCodigoEmpresa(), "NAV1", "Nave 1");
        Nave n2 = new Nave(empresalist.get(1).getCodigoEmpresa(), "NAV2", "Nave 2");
        Nave n3 = new Nave(empresalist.get(2).getCodigoEmpresa(), "NAV3", "Nave 3");
        navelist.add(n1);
        navelist.add(n2);
        navelist.add(n3);*/
        String codigo;
        String nombre;
        String nave;

        /*Variables para Mueble.*/
        /*Mueble m1 = new Mueble(1, "MUE1", "Silla", 10, 25, 5);
        Mueble m2 = new Mueble(2, "MUE2", "Armario", 55, 15, 30);
        Mueble m3 = new Mueble(3, "MUE3", "Mesa", 25, 10, 5);
        mueblelist.add(m1);
        mueblelist.add(m2);
        mueblelist.add(m3);*/
        String descripcion;
        double alto;
        double ancho;
        double fondo;

        /*Variables para Ordenador*/
        /*Ordenador o1 = new Ordenador(1, "ORD1", "Portatil", "HP", "250GB", "455MHz");
        Ordenador o2 = new Ordenador(2, "ORD2", "Sobremesa", "ASUS", "1TB", "2GHz");
        Ordenador o3 = new Ordenador(3, "ORD3", "Portatil", "Lenovo", "500GB", "2.3GHz");
        ordenadorlist.add(o1);
        ordenadorlist.add(o2);
        ordenadorlist.add(o3);*/
        String marca;
        String memoria;
        String velocidad;

        /*Variables para Impresora*/
        /*Impresora i1 = new Impresora(1, "IMP1", "Impresora grande", "Canon", "2GB", "Laser");
        Impresora i2 = new Impresora(2, "IMP2", "Impresora mediana", "HP", "1GB", "Tinta");
        Impresora i3 = new Impresora(3, "IMP3", "Impresora enana", "Asus", "4GB", "3D");
        impresoralist.add(i1);
        impresoralist.add(i2);
        impresoralist.add(i3);*/
        String tipo;

        /*bucle for para seleccionar una empresa para trabajar sobre esta empresa.*/
        System.out.println("Selecciona una Empresa para trabajar");
        for (int i = 0; i < empresalist.size(); i++) {
            System.out.println("Opcion: " + elegir + " " + empresalist.get(i));
            elegir += 1;
        }

        elegir = teclado.nextInt();
        empresa = empresalist.get(elegir).getCodigoEmpresa();
        System.out.println(empresa);

        do {
            try {
                /*Menu principal*/
                System.out.println("Escoge una opcion");
                System.out.println("1. Gestion de Empresas");
                System.out.println("2. Gestion de Naves");
                System.out.println("3. Gestion de Muebles");
                System.out.println("4. Gestion de Ordenadores");
                System.out.println("5. Gestion de Impresoras");
                System.out.println("6. Cambiar de Empresa");
                System.out.println("7. Guardar objetos en XML");
                System.out.println("8. Salir del programa");
                opcion = teclado.nextInt();

                System.out.println("--------------------------------------------------------------------------");

                switch (opcion) {

                    /*Menu de opciones de gestion de empresa*/
                    case 1:
                        System.out.println("Escoge una opcion");
                        System.out.println("1. Crear Empresa");
                        System.out.println("2. Modificar Empresa");
                        System.out.println("3. Mostrar Empresas");
                        System.out.println("4. Mostrar elementos de tu Empresa");
                        opcion = teclado.nextInt();

                        switch (opcion) {

                            /*opcion de crear empresa*/
                            case 1:

                                /*Bucle for para saber en que posicion tiene que guardar la proxima Empresa.*/
                                for (int i = 0; i < empresalist.size(); i++) {
                                    m += 1;
                                }

                                System.out.println("Introduzca una Direccion");
                                teclado.nextLine();
                                direccion = teclado.nextLine();

                                /*Guardar los valores a la clase Empresa*/
                                Empresa empresacrear = new Empresa(direccion);

                                /*Añadir la Empresa creado en el Arraylist en la posicion mas conveniente*/
                                empresalist.add(m, empresacrear);
                                System.out.println("--------------------------------------------------------------------------");

                                break;

                            /*Opcion de modificar empresa*/
                            case 2:

                                /*Bucle for para modificar la empresa en la que estoy trabajando.*/
                                for (int i = 0; i < empresalist.size(); i++) {
                                    if (mueblelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.println("Tu empresa es: " + empresalist.get(i));
                                        m += 1;
                                        break;
                                    }
                                }

                                /*Introducir valores para la modificacion de la empresa.*/
                                System.out.println("Introduzca una Direccion");
                                teclado.nextLine();
                                direccion = teclado.nextLine();

                                /*Cambiar el valor llamando a la clase Empresa */
                                empresalist.get(m).setDireccion(direccion);
                                System.out.println("--------------------------------------------------------------------------");

                                break;

                            /*Opcion de mostrar empresa*/
                            case 3:

                                /*Bucle for para mostrar todas las empresas que hay creadas.*/
                                for (int i = 0; i < empresalist.size(); i++) {
                                    System.out.println(empresalist.get(i));
                                }
                                System.out.println("--------------------------------------------------------------------------");

                                break;

                            /*Opcion de mostrar elementos de tu empresa*/
                            case 4:

                                /*Bucle for para mostrar la empresa en la que estas trabajando.*/
                                for (int i = 0; i < empresalist.size(); i++) {
                                    if (mueblelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.println("Tu empresa es: " + empresalist.get(i));
                                        m = +1;
                                        break;
                                    }
                                }

                                /*Mostrar los muebles que su propiedad sea la empresa en la que estas trabajando.*/
                                System.out.println("Muebles: ");
                                for (int i = 0; i < mueblelist.size(); i++) {

                                    if (mueblelist.get(i).getCodigoEmpresa() == empresa) {
                                        //System.out.println(mueblelist.get(i));
                                        mueblelist.get(i).showActivo();
                                    }

                                }

                                System.out.println("-----------------------------------------------------------------------------------------");

                                /*Mostrar los ordenadores que su propiedad sea la empresa en la que estas trabajando.*/
                                System.out.println("Ordenadores: ");
                                for (int i = 0; i < ordenadorlist.size(); i++) {

                                    if (ordenadorlist.get(i).getCodigoEmpresa() == empresa) {
                                        //System.out.println(ordenadorlist.get(i));
                                        ordenadorlist.get(i).showActivo();
                                        System.out.println("");
                                    }
                                }

                                System.out.println("-----------------------------------------------------------------------------------------");

                                /*Mostrar las impresoras que su propiedad sea la empresa en la que estas trabajando.*/
                                System.out.println("Impresoras: ");
                                for (int i = 0; i < impresoralist.size(); i++) {

                                    if (impresoralist.get(i).getCodigoEmpresa() == empresa) {
                                        //System.out.println(impresoralist.get(i));
                                        impresoralist.get(i).showActivo();
                                        System.out.println("");
                                    }

                                }

                                System.out.println("-----------------------------------------------------------------------------------------");

                                /*Mostrar las naves que su propiedad sea la empresa en la que estas trabajando.*/
                                System.out.println("Naves: ");
                                for (int i = 0; i < navelist.size(); i++) {
                                    if (navelist.get(i).getCodigoEmpresa() == empresa) {
                                        //System.out.println(navelist.get(i));
                                        navelist.get(i).showActivo();
                                    }

                                }

                                System.out.println("-----------------------------------------------------------------------------------------");
                                break;
                        }

                        break;

                    case 2:
                        System.out.println("Escoge una opcion");
                        System.out.println("1. Crear Nave");
                        System.out.println("2. Añadir Mueble");
                        System.out.println("3. Añadir Ordenador");
                        System.out.println("4. Añadir Impresora");
                        System.out.println("5. Mostrar Naves");
                        System.out.println("6. Mostrar elementos que tiene una nave");
                        System.out.println("7. Modificar Nave");
                        opcion = teclado.nextInt();

                        switch (opcion) {

                            /*Opcion crear Nave*/
                            case 1:

                                /*Bucle for para saber en que posicion tiene que guardar la proxima nave.*/
                                for (int i = 0; i < navelist.size(); i++) {
                                    m += 1;
                                }

                                /*Introducir los nuevos valores para la clase nave.*/
                                System.out.println("Introduzca un Codigo");
                                teclado.nextLine();
                                codigo = teclado.nextLine();
                                System.out.println("Introduzca un Nombre");
                                nombre = teclado.nextLine();

                                /*Guardar los valores a la clase Nave */
                                Nave navecrear = new Nave(empresa, codigo, nombre);

                                /*Añadir la Nave creado en el Arraylist en la posicion mas conveniente*/
                                navelist.add(m, navecrear);
                                System.out.println("--------------------------------------------------------------------------");

                                break;

                            /*Opcion añdir mueble*/
                            case 2:

                                /*Bucle for para mostrar todas las naves que le pertenece a la empresa en la que estas trabajando.*/
                                for (int i = 0; i < navelist.size(); i++) {
                                    if (navelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Nave: " + c + " ");
                                        navelist.get(i).showActivo();
                                        c += 1;
                                    }
                                }

                                /*Seleccionar la nave para añadir el mueble*/
                                System.out.println("Elige una Nave para añadir el mueble");
                                c = teclado.nextInt();

                                String Navemueble = navelist.get(c).getcodigoNave();

                                /*Bucle for para mostrar todas los muebles que le pertenece a la empresa en la que estas trabajando.
                                /*Tambien las que no pertenece a ninguna nave.*/
                                for (int i = 0; i < mueblelist.size(); i++) {
                                    if (mueblelist.get(i).getCodigoEmpresa() == empresa && mueblelist.get(i).getCodigoNave() == null) {
                                        System.out.print("Mueble: " + i + " ");
                                        mueblelist.get(i).showActivo();
                                        m += 1;
                                    }
                                }

                                /*Seleccionar el mueble que quieres añadir en la nave.*/
                                System.out.println("Elige el mueble que deseas guardar en la nave");
                                m = teclado.nextInt();

                                /*Cambiar los valores llamando a la clase Mueble*/
                                mueblelist.get(m).setCodigoNave(Navemueble);
                                System.out.println("--------------------------------------------------------------------------");

                                break;

                            /*Opcion añdir ordenador*/
                            case 3:

                                /*Bucle for para mostrar todas las naves que le pertenece a la empresa en la que estas trabajando.*/
                                for (int i = 0; i < navelist.size(); i++) {
                                    if (navelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Nave: " + c + " ");
                                        navelist.get(i).showActivo();
                                        c += 1;
                                    }
                                }

                                /*Seleccionar la nave para añadir el ordenador*/
                                System.out.println("Elige una Nave para añadir el ordenador");
                                c = teclado.nextInt();

                                String Naveordenador = navelist.get(c).getcodigoNave();

                                /*Bucle for para mostrar todos los ordenadores que le pertenece a la empresa en la que estas trabajando.
                            Tambien las que no pertenece a ninguna nave.*/
                                for (int i = 0; i < ordenadorlist.size(); i++) {
                                    if (ordenadorlist.get(i).getCodigoEmpresa() == empresa && ordenadorlist.get(i).getCodigoNave() == null) {
                                        System.out.print("Ordenador: " + i + " ");
                                        ordenadorlist.get(i).showOrdenador();
                                        m += 1;
                                    }
                                }

                                /*Seleccionar el ordenador que quieres añadir en la nave.*/
                                System.out.println("Elige el ordenador que deseas guardar en la nave");
                                m = teclado.nextInt();

                                /*Cambiar los valores llamando a la clase ordenador*/
                                ordenadorlist.get(m).setCodigoNave(Naveordenador);
                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*Opcion añdir impresora*/
                            case 4:

                                /*Bucle for para mostrar todas las naves que le pertenece a la empresa en la que estas trabajando.*/
                                for (int i = 0; i < navelist.size(); i++) {
                                    if (navelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Nave: " + c + " ");
                                        navelist.get(i).showActivo();
                                        c += 1;
                                    }

                                }

                                /*Seleccionar la nave para añadir la impresora*/
                                System.out.println("Elige una Nave para añadir la impresora");
                                c = teclado.nextInt();

                                String Naveimpresora = navelist.get(c).getcodigoNave();

                                /*Bucle for para mostrar todas las impresoras que le pertenece a la empresa en la que estas trabajando.
                            Tambien las que no pertenece a ninguna nave.*/
                                for (int i = 0; i < impresoralist.size(); i++) {
                                    if (impresoralist.get(i).getCodigoEmpresa() == empresa && impresoralist.get(i).getCodigoNave() == null) {
                                        System.out.print("Impresora: " + i + " ");
                                        impresoralist.get(i).showImpresora();
                                        m += 1;
                                    }
                                }

                                /*Seleccionar la impresora que quieres añadir en la nave.*/
                                System.out.println("Elige la impresora que deseas guardar en la nave");
                                m = teclado.nextInt();

                                /*Cambiar los valores llamando a la clase impresora*/
                                impresoralist.get(m).setCodigoNave(Naveimpresora);
                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*opcion mostrar naves*/
                            case 5:

                                /*Bucle For para mostrar todos las naves creadas.*/
                                for (int i = 0; i < navelist.size(); i++) {
                                    navelist.get(i).showActivo();
                                }
                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*Mostrar elementos de una nave*/
                            case 6:

                                /*Bucle for para mostrar todas las naves que le pertenece a la empresa en la que estas trabajando.*/
                                System.out.println("Selecciona una nave para mostrar sus elementos");
                                for (int i = 0; i < navelist.size(); i++) {
                                    if (navelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Opcion: " + m + " ");
                                        navelist.get(i).showActivo();
                                        m += 1;
                                    }
                                }

                                m = teclado.nextInt();
                                nave = navelist.get(m).getcodigoNave();

                                /*Bucle for para mostrar la nave que has seleccionado en el anterior bucle for.*/
                                for (int i = 0; i < navelist.size(); i++) {
                                    if (navelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Tu nave es: ");
                                        navelist.get(i).showActivo();
                                        break;
                                    }
                                }

                                /*Mostrar los muebles que su propiedad sea la nave escogida anteriormente.*/
                                System.out.println("Muebles: ");
                                for (int i = 0; i < mueblelist.size(); i++) {

                                    if (mueblelist.get(i).getCodigoNave() == nave) {
                                        mueblelist.get(i).showActivo();
                                    }

                                }

                                System.out.println("-----------------------------------------------------------------------------------------");

                                /*Mostrar los ordenadores que su propiedad sea la nave escogida anteriormente.*/
                                System.out.println("Ordenadores: ");
                                for (int i = 0; i < ordenadorlist.size(); i++) {

                                    if (ordenadorlist.get(i).getCodigoNave() == nave) {
                                        ordenadorlist.get(i).showOrdenador();
                                    }
                                }

                                System.out.println("-----------------------------------------------------------------------------------------");

                                /*Mostrar los ordenadores que su propiedad sea la nave escogida anteriormente.*/
                                System.out.println("Impresoras: ");
                                for (int i = 0; i < impresoralist.size(); i++) {

                                    if (impresoralist.get(i).getCodigoNave() == nave) {
                                        impresoralist.get(i).showImpresora();
                                    }

                                }

                                System.out.println("-----------------------------------------------------------------------------------------");

                                break;

                            case 7:

                                /*Bucle for para mostrar todas las naves que le pertenece a la empresa en la que estas trabajando.*/
                                for (int i = 0; i < navelist.size(); i++) {
                                    if (navelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Nave: " + c + " ");
                                        navelist.get(i).showActivo();
                                    }
                                    c += 1;
                                }

                                /*Seleccionar una nave para modificar*/
                                System.out.println("Elige una Nave para modificar");
                                c = teclado.nextInt();

                                navelist.get(c).updateActivo();

                                break;
                        }

                        break;

                    /*Menu de gestionar muebles*/
                    case 3:
                        System.out.println("Escoge una opcion");
                        System.out.println("1. Crear");
                        System.out.println("2. Modificar");
                        System.out.println("3. Mostrar");
                        opcion = teclado.nextInt();

                        switch (opcion) {

                            /*Opcion Muebles Crear*/
                            case 1:

                                /*Bucle for para saber en que posicion tiene que guardar el proximo mueble.*/
                                for (int i = 0; i < mueblelist.size(); i++) {
                                    m += 1;
                                }

                                /*Introducir los nuevos valores para la clase mueble.*/
                                System.out.println("Introduzca un Codigo");
                                teclado.nextLine();
                                codigo = teclado.nextLine();
                                System.out.println("Introduzca una Descripcion");
                                descripcion = teclado.nextLine();
                                System.out.println("Introduzca un Alto");
                                alto = teclado.nextDouble();
                                System.out.println("Introduzca un Ancho");
                                ancho = teclado.nextDouble();
                                System.out.println("Introduzca un Fondo");
                                fondo = teclado.nextDouble();

                                /*Guardar los valores a la clase Mueble */
                                Mueble mueblecrear = new Mueble(empresa, codigo, descripcion, alto, ancho, fondo);

                                /*Añadir el Mueble creado en el Arraylist en la posicion mas conveniente*/
                                mueblelist.add(m, mueblecrear);
                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*Opcion Mueble modificar.*/
                            case 2:

                                /*Bucle for para mostrar todos los Muebles creados y la posicion que le corresponde cada uno de ellos.
                            Tambien solo muestre los muebles que pertenezca a la empresa a la que estas trabajando.*/
                                for (int i = 0; i < mueblelist.size(); i++) {
                                    if (mueblelist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Posicion: " + i + " ");
                                        mueblelist.get(i).showActivo();
                                        m += 1;
                                    }
                                }

                                /*Seleccionar la posicion del mueble que quiere Modificar.*/
                                System.out.println("Elige la posicion que deseas modificar");
                                m = teclado.nextInt();

                                /*Introducir valores para la modificacion del mueble.*/
 /*System.out.println("Introduzca un codigo");
                            teclado.nextLine();
                            codigo = teclado.nextLine();
                            System.out.println("Introduzca una Descripcion");
                            descripcion = teclado.nextLine();
                            System.out.println("Introduzca un Alto");
                            alto = teclado.nextDouble();
                            System.out.println("Introduzca un Ancho");
                            ancho = teclado.nextDouble();
                            System.out.println("Introduzca un Fondo");
                            fondo = teclado.nextDouble();*/

 /*Cambiar los valores llamando a la clase Mueble*/
                                //mueblelist.get(m).modificar(codigo, descripcion, alto, ancho, fondo);
                                mueblelist.get(m).updateActivo();

                                /*mueblelist.get(m).setCodigo(codigo);
                            mueblelist.get(m).setDescripcion(descripcion);
                            mueblelist.get(m).setAlto(alto);
                            mueblelist.get(m).setAncho(ancho);
                            mueblelist.get(m).setFondo(fondo);*/
                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*Opcion mostrar muebles.*/
                            case 3:

                                /*Bucle For para mostrar todos los muebles creados.
                                Tambien solo muestre los muebles que pertenezca a la empresa a la que estas trabajando.*/
                                for (int i = 0; i < mueblelist.size(); i++) {
                                    if (mueblelist.get(i).getCodigoEmpresa() == empresa) {
                                        mueblelist.get(i).showActivo();
                                    }
                                }

                                System.out.println("--------------------------------------------------------------------------");
                                break;
                        }

                        break;

                    /*Menu de gestionar ordenadores*/
                    case 4:
                        System.out.println("Escoge una opcion");
                        System.out.println("1. Crear");
                        System.out.println("2. Modificar");
                        System.out.println("3. Mostrar");
                        opcion = teclado.nextInt();

                        switch (opcion) {

                            /*Opcion crear ordenador*/
                            case 1:

                                /*Bucle for para saber en que posicion tiene que guardar el proximo ordenador.*/
                                for (int i = 0; i < ordenadorlist.size(); i++) {
                                    m += 1;
                                }

                                /*Introducir los nuevos valores para la clase ordenador.*/
                                System.out.println("Introduzca un Codigo");
                                teclado.nextLine();
                                codigo = teclado.nextLine();
                                System.out.println("Introduzca una Descripcion");
                                descripcion = teclado.nextLine();
                                System.out.println("Introduzca una Marca");
                                marca = teclado.nextLine();
                                System.out.println("Introduzca una Memoria");
                                memoria = teclado.nextLine();
                                System.out.println("Introduzca una Velocidad");
                                velocidad = teclado.nextLine();

                                /*Guardar los valores a la clase ordenador */
                                Ordenador ordenadorcrear = new Ordenador(empresa, codigo, descripcion, marca, memoria, velocidad);

                                /*Añadir el ordenador creado en el Arraylist en la posicion mas conveniente*/
                                ordenadorlist.add(m, ordenadorcrear);

                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*Opcion modificar ordenador.*/
                            case 2:

                                /*Bucle for para mostrar todos los ordenadores creados y la posicion que le corresponde cada uno de ellos.
                                Tambien solo muestre los ordenadores que pertenezca a la empresa a la que estas trabajando.*/
                                for (int i = 0; i < ordenadorlist.size(); i++) {
                                    if (ordenadorlist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Posicion: " + i + " ");
                                        ordenadorlist.get(i).showOrdenador();
                                        m += 1;
                                    }
                                }

                                /*Seleccionar la posicion del ordenador que quiere Modificar.*/
                                System.out.println("Elige la posicion que deseas modificar");
                                m = teclado.nextInt();

                                /*Introducir valores para la modificacion del ordenador.*/
 /* System.out.println("Introduzca un codigo");
                            teclado.nextLine();
                            codigo = teclado.nextLine();
                            System.out.println("Introduzca una Descripcion");
                            descripcion = teclado.nextLine();
                            System.out.println("Introduzca una Marca");
                            marca = teclado.nextLine();
                            System.out.println("Introduzca un Memoria");
                            memoria = teclado.nextLine();
                            System.out.println("Introduzca un Velocidad");
                            velocidad = teclado.nextLine();
                           
                            //Cambiar los valores llamando a la clase Ordenador
                            ordenadorlist.get(m).modificar(codigo, descripcion, marca, memoria, velocidad);*/
                                ordenadorlist.get(m).updateOrdenador();

                                /*ordenadorlist.get(m).setCodigo(codigo);
                            ordenadorlist.get(m).setDescripcion(descripcion);
                            ordenadorlist.get(m).setMarca(marca);
                            ordenadorlist.get(m).setMemoria(memoria);
                            ordenadorlist.get(m).setVelocidad(velocidad);*/
                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*Opcion mostrar Ordenador.*/
                            case 3:

                                /*Bucle For para mostrar todos los ordenadores creados.
                                Tambien solo muestre los ordenadores que pertenezca a la empresa a la que estas trabajando.*/
                                for (int i = 0; i < ordenadorlist.size(); i++) {
                                    if (ordenadorlist.get(i).getCodigoEmpresa() == empresa) {
                                        ordenadorlist.get(i).showOrdenador();
                                    }
                                }

                                System.out.println("--------------------------------------------------------------------------");
                                break;
                        }

                        break;
                    case 5:
                        System.out.println("Escoge una opcion");
                        System.out.println("1. Crear");
                        System.out.println("2. Modificar");
                        System.out.println("3. Mostrar");
                        opcion = teclado.nextInt();

                        switch (opcion) {
                            /*Opcion Impresora Crear*/
                            case 1:

                                /*Bucle for para saber en que posicion tiene que guardar la proxima impresora.*/
                                for (int i = 0; i < impresoralist.size(); i++) {
                                    m += 1;
                                }

                                /*Introducir los nuevos valores para la clase Impresora.*/
                                System.out.println("Introduzca un Codigo");
                                teclado.nextLine();
                                codigo = teclado.nextLine();
                                System.out.println("Introduzca una Descripcion");
                                descripcion = teclado.nextLine();
                                System.out.println("Introduzca una Marca");
                                marca = teclado.nextLine();
                                System.out.println("Introduzca una Memoria");
                                memoria = teclado.nextLine();
                                System.out.println("Introduzca un Tipo de Impresora");
                                tipo = teclado.nextLine();

                                /*Guardar los valores a la clase impresora */
                                Impresora impresoracrear = new Impresora(empresa, codigo, descripcion, marca, memoria, tipo);

                                /*Añadir el impresora creado en el Arraylist en la posicion mas conveniente*/
                                impresoralist.add(m, impresoracrear);

                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*Opcion modificar impresora*/
                            case 2:

                                /*Bucle for para mostrar todos las impresoras creadas y la posicion que le corresponde cada uno de ellos.
                                Tambien solo muestre las impresoras que pertenezca a la empresa a la que estas trabajando.*/
                                for (int i = 0; i < impresoralist.size(); i++) {
                                    if (impresoralist.get(i).getCodigoEmpresa() == empresa) {
                                        System.out.print("Posicion: " + i + " ");
                                        impresoralist.get(i).showImpresora();
                                        m += 1;
                                    }
                                }

                                /*Seleccionar la posicion del impresora que quiere Modificar.*/
                                System.out.println("Elige la posicion que deseas modificar");
                                m = teclado.nextInt();

                                /*Introducir valores para la modificacion del impresora.
                            System.out.println("Introduzca un codigo");
                            teclado.nextLine();
                            codigo = teclado.nextLine();
                            System.out.println("Introduzca una Descripcion");
                            descripcion = teclado.nextLine();
                            System.out.println("Introduzca una Marca");
                            marca = teclado.nextLine();
                            System.out.println("Introduzca un Memoria");
                            memoria = teclado.nextLine();
                            System.out.println("Introduzca un Tipo");
                            tipo = teclado.nextLine();*/

 /*Cambiar los valores llamando a la clase Impresora*/
                                //impresoralist.get(m).modificar(codigo, descripcion, marca, memoria, tipo);
                                impresoralist.get(m).updateImpresora();

                                /*impresoralist.get(m).setCodigo(codigo);
                            impresoralist.get(m).setDescripcion(descripcion);
                            impresoralist.get(m).setMarca(marca);
                            impresoralist.get(m).setMemoria(memoria);
                            impresoralist.get(m).setTipo(tipo);*/
                                System.out.println("--------------------------------------------------------------------------");
                                break;

                            /*Opcion mostrar impresora*/
                            case 3:

                                /*Bucle For para mostrar todos las impresoras creadas.
                                Tambien solo muestre las impresoras que pertenezca a la empresa a la que estas trabajando.*/
                                for (int i = 0; i < impresoralist.size(); i++) {
                                    if (impresoralist.get(i).getCodigoEmpresa() == empresa) {
                                        impresoralist.get(i).showImpresora();
                                    }
                                }

                                System.out.println("--------------------------------------------------------------------------");
                                break;
                        }
                        break;

                    /*opcion de cambiar de empresa*/
                    case 6:

                        elegir = 0;
                        /*bucle for para seleccionar una empresa para trabajar sobre esta empresa.*/
                        System.out.println("Selecciona una Empresa para trabajar");
                        for (int i = 0; i < empresalist.size(); i++) {
                            System.out.println("Opcion: " + elegir + " " + empresalist.get(i));
                            elegir += 1;
                        }

                        elegir = teclado.nextInt();
                        empresa = empresalist.get(elegir).getCodigoEmpresa();
                        System.out.println(empresa);
                        break;

                    case 7:
                        XML.GuardarObjetos(empresalist, navelist, mueblelist, ordenadorlist, impresoralist);
                        System.out.println("Objetos guardados en archivos .xml");
                        break;

                    case 8:
                        System.exit(0);
                        break;
                }

                /*Opcion de volver o no volver al menu principal.*/
                System.out.println("¿Quieres volver al menu principal? (S/N)");
                teclado.nextLine();

                System.out.println("--------------------------------------------------------------------------");

                /*reiniciar variables*/
                m = 0;
                c = 0;
                elegir = 0;

                //GestorXML g1 = new GestorXML(nombre_archivo, empresalist);
            } catch (Exception e) {
                Excepcion ee = new Excepcion("1");
                //throw e;
                System.out.println(ee.getMessage());
            }

            tecla = teclado.nextLine();
        } while (tecla.equals("S") || tecla.equals("s"));

    }

}
