package Cuentas;

/**
 * Clase principal que contiene el metodo Main, para ejecutar el programa.
 *
 * Esta clase crea una cuenta bancaria y realiza operaciones, retirada e
 * ingreso, utilizando el metodo operativa_cuenta
 *
 * @author jose
 */
public class Main {

    /**
     * main que ejecuta el metodo
     *
     * @param args
     */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        operativa_cuenta(cuenta1, 1000);
    }

    /**
     * Realiza operaciones de retirada e ingreso sobre la cuenta
     *
     * @param cuenta1 la cuenta en la que se hará las operaciones
     * @param cantidad cantidad a retirar o ingresar
     */
    private static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
