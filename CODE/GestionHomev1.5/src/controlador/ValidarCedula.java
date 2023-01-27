/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author Usuario
 */
public class ValidarCedula {
    
    public String validarCedula(String numero) {
        String msg = validarInicial(numero, 10);        
        if (msg.isEmpty()) {
            msg = validarCodigoProvincia(Integer.valueOf(numero.substring(0, 2)));
            if (msg.isEmpty()) {
                msg = validarTercerDigito(Integer.parseInt(String.valueOf(numero.charAt(2))));
                if (msg.isEmpty()) {
                    msg = algoritmoModulo10(numero.substring(0, 9), Integer.parseInt(String.valueOf(numero.charAt(9))));                     
                }
            }
        }

        return msg;
    }

    public String validarInicial(String numero, int caracteres) {
        if (numero.isEmpty()) {
            return "Valor no puede estar vacio";            
        }
        if (!numero.matches("[0-9]+")) {            
            return "Valor ingresado solo puede tener dígitos";            
        }
        if (numero.length() != caracteres) {
            return "Valor ingresado debe tener digitos";                        
        }
        return "";
    }

    public String validarCodigoProvincia(int numero)  {
        if (numero < 0 || numero > 24) {
            return "Codigo de Provincia (dos primeros dígitos) no deben ser mayor a 24 ni menores a 0";            
        }
        return "";
    }

    public String validarTercerDigito(int digito)  {
        if (digito < 0 || digito > 5 && digito != 9 && digito != 6) {
            return "Tercer dígito debe ser mayor o igual a 0 y menor a 6 para cédulas";                        
        }
        return "";
    }

    public String algoritmoModulo10(String digitosIniciales, int digitoVerificador) {
        int[] arrayCoeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
        int resultado = 0;

        int valorPosicion = 0;
        int total = 0;
        for (int i = 0; i < arrayCoeficientes.length; i++) {
            valorPosicion = Integer.parseInt(digitosIniciales.substring(i, i + 1)) * arrayCoeficientes[i];
            if (valorPosicion > 9){
                valorPosicion -= 9;
            }
            //total += ((valorPosicion % 10) + (valorPosicion / 10));
            total += valorPosicion;
        }
        
        int[] decenas = {10,20,30,40,50,60,70,80,90};
        for (int i = 0; i < decenas.length; i++){
            if (decenas[i] > total){
               resultado = decenas[i] - total;
               break;
            }
        }

        if (resultado != digitoVerificador) {
            return "Cedula no valida";
        }

        return "";
    }
    
}
