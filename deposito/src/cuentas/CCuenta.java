package cuentas;
/**
 * Esta clase simula una cuenta bancaria.
 * @author Daniel de Álvaro Casado.
 * @version 1.0
 */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;
    
   
    public CCuenta()
    {
    }

    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Devuelve el saldo actual de la cuenta.
     * @return Devuelve estado de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }
    
    /**
     * Ingresa dinero en la cuenta
     * @param cantidad : Cantidad a ingresar.
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
    
    /**
     * Retira dinero de la cuenta
     * @param cantidad : Cantidad a retirar
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

	/**
	 * Devuelve el tipo de Interes de la cuenta
	 * @return the tipoInterés
	 */
	public double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Permite asignar un tipo de interes a la cuenta
	 * @param tipoInterés the tipoInterés to set
	 */
	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	/**
	 * Devuelve el saldo de la cuenta.
	 * @return the saldo
	 */
	public double getSaldo() {
		return saldo;
	}

	/**
	 * Permite asignar un saldo a la cuenta.
	 * @param saldo the saldo to set
	 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el codigo de la cuenta
	 * @return the cuenta
	 */
	public String getCuenta() {
		return cuenta;
	}

	/**
	 * Permite asignar un código de cuenta
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el nombre del propietario de la cuenta.
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Permite asignar un nombre del propietario de la cuenta.
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
