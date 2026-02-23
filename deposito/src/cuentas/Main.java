package cuentas;
public class Main {

    public static void main(String[] args) {
        CCuenta miCuenta;
        miCuenta = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        operativa_cuentas(miCuenta, 2300, 695);
    }

	/**
	 * @param miCuenta
	 * @param cantidadRetirar TODO
	 * @param cantidadIngresar TODO
	 */
	private static void operativa_cuentas(CCuenta miCuenta, float cantidadRetirar, float cantidadIngresar) {
		double saldoActual;
		saldoActual = miCuenta.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            miCuenta.retirar(cantidadRetirar);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            miCuenta.ingresar(cantidadIngresar);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
