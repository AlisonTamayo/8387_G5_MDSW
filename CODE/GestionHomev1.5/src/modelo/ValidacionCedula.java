/*Universidad de las Fuerzas Armadas "ESPE"

Proyecto Final
 */
package modelo;
//Clase para validar una cédula Ecuatoriana

public class ValidacionCedula {
//Método estatico para validar cédula

    public static boolean cedula(String cedula) {
        boolean estado = false;
        try {
            ///Restricción 1
            if (cedula.length() == 10) {
                ///Restricción 3
                if ((Integer.parseInt(cedula.substring(0, 2)) <= 24) || (Integer.parseInt(cedula.substring(0, 2)) == 30)) {
                    int[] coeficientes = {2, 1, 2, 1, 2, 1, 2, 1, 2};
                    int digitoVerificador = Integer.parseInt(cedula.substring(cedula.length() - 1, cedula.length()));
                    int suma = 0;
                    int digitoXcoeficiente = 0;
                    int modulo = 0;
                    ///Restricción 4
                    for (int i = 0; i < cedula.length() - 1; i++) {
                        ///Paso 1
                        digitoXcoeficiente = Integer.parseInt(cedula.substring(i, i + 1)) * coeficientes[i];
                        ///Paso 2
                        digitoXcoeficiente = (digitoXcoeficiente > 9) ? digitoXcoeficiente -= 9 : digitoXcoeficiente;
                        ///Paso 3
                        suma += digitoXcoeficiente;
                    }
                    ///Paso 4
                    modulo = suma % 10;
                    ///Paso 5
                    if ((10 - modulo) == digitoVerificador) {
                        estado = true;
                    }
                    if (modulo == 0 & modulo == digitoVerificador) {
                        estado = true;
                    }
                } else {///Fin Restricción 3
                    estado = false;

                }
            } else {///Fin Restricción 1
                estado = false;

            }
        } catch (NumberFormatException e) {
            estado = false;
        }
        return estado;
    }

}
