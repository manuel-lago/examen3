/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen3refactorizado;

/**
 * Clase principal del programa de cuentas bancarias
 * @author Manuel Lago
 * @version 1
 * @since 22/05/2024
 */
public class CCuenta {

    /**
     * Getter del saldo
     * @return Recuperar el saldo
     */
    public double getdSaldo() {
        return dSaldo;
    }

    /**
     * Setter del saldo
     * @param dSaldo Saldo a setear
     */
    public void setdSaldo(double dSaldo) {
        this.dSaldo = dSaldo;
    }

    /**
     * Getter del nombre
     * @return Recuperar el nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Setter del nombre
     * @param nombre El nombre a setear
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    // Propiedades de la Clase Cuenta
    private double dSaldo;
    private String nombre;

    /**
     * Método main
     * @param args
     */
    public static void main(String[] args) {

        operativa_cuenta(100);
    }

        /**
         * Método para realizar las operaciones sobre la cuenta
         * @param cantidad con la que trabajar
         */
    private static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1 = new CCuenta();
        
        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");

        cuenta1.ingresar(-100);
        System.out.println("Saldo Incial: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(cantidad);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.ingresar(2000);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");

        cuenta1.ingresar(300);
        System.out.println("Saldo tras ingreso: " + cuenta1.getdSaldo() + " euros");
        cuenta1.retirar(50);
        System.out.println("Saldo tras retirada: " + cuenta1.getdSaldo() + " euros");
    }

    /**
     * Método para realizar ingresos
     * @param cantidad a ingresar
     * @return Devuelve el código de error
     */
    public int ingresar(double cantidad) {
        int iCodErr;

        if (!(cantidad >= 0 || cantidad <= 3000)) {
            System.out.println("No se puede ingresar una cantidad negativa ni superior a 3000€ (sin ser notificada con formulario)");
            iCodErr = 1;
        } else if (cantidad == 3000) {
            System.out.println(
                    "Le recordamos que estamos obligados a notificar a Hacienda dicho ingreso (superior o igual a 3000€)");
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        } else {
            setdSaldo(getdSaldo() + cantidad);
            iCodErr = 0;
        }

        return iCodErr;
    }

    /** 
     * Metodo para retirar cantidades en la cuenta. Modifica el saldo.
     * @param cantidad a retirar de la cuenta
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("No se puede retirar una cantidad negativa");
        } else if (getdSaldo() < cantidad) {
            System.out.println("No  hay suficiente saldo");
        } else {
            setdSaldo(getdSaldo() - cantidad);
            System.out.println("Le quedan " + getdSaldo() + " en cuenta");
        }
    }
}
