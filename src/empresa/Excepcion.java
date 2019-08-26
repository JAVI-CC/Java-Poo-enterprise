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
public class Excepcion {

    private static final Scanner teclado = new Scanner(System.in);

   private String codiCausa = "desconocido";
   private String missatge;

    public Excepcion(String codiCausa) {
        this.codiCausa = codiCausa;
        switch (codiCausa) {
            case "1":
                this.missatge = "Formato incorrecto";
                break;
        }
    }
        
    public String getMessage() {
        return "Error: " + this.missatge;
    } 
   

}
