package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuentas(cuenta1, 2300, 695);
    }

	/**
	 * @param cuenta1
	 * @param cantidadRetirar TODO
	 * @param cantidadIngresar TODO
	 */
	private static void operativa_cuentas(CCuenta cuenta1, float cantidadRetirar, float cantidadIngresar) {
		double saldoActual;
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(cantidadRetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidadIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
