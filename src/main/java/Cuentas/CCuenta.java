package Cuentas;

/**
 * La clase CCuenta representa una cuenta bancaria que permite realizar
 * operaciones básicas como ingresar dinero, retirar dinero y consultar el
 * saldo. También incluye atributos relacionados con el titular y el tipo de
 * interés.
 *
 * Esta clase está pensada para demostrar encapsulamiento y uso de métodos con
 * control de errores mediante excepciones.
 *
 * @author jose
 */
public class CCuenta {

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor de la clase CCuenta.
     *
     * @param nom el nombre del titular de la cuenta
     * @param cue el numero o identificador de la cuenta
     * @param sal el saldo inicial
     * @param tipo el tipo de interes
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
    }

    /**
     * Obtiene el nombre del titular de la cuenta
     *
     * @return el nombre del titular
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Pone el nombre del titular de la cuenta
     *
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el número o identificador de la cuenta.
     *
     * @return el num de cuenta
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número o identificador de la cuenta.
     *
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return el saldo disponible
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Obtiene el tipo de interés asociado a la cuenta.
     *
     * @return el tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés de la cuenta.
     *
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el saldo actual de la cuenta.
     *
     * @return saldo disponible
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad positiva en la cuenta.
     *
     * @param cantidad a ingresar
     * @throws Exception si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad del saldo de la cuenta, si hay suficiente dinero.
     *
     * @param cantidad a retirar
     * @throws Exception si la cantidad es negativa o insuficiente saldo.
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0) {
            throw new Exception("No se puede retirar una cantidad negativa");
        }
        if (estado() < cantidad) {
            throw new Exception("No se hay suficiente saldo");
        }
        setSaldo(getSaldo() - cantidad);
    }
}