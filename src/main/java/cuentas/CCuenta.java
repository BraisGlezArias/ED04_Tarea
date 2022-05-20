package cuentas;

/** Clase CCuenta que alberga atributos, constructor y métodos para crear y manipular una cuenta bancaria.
 * @author Brais González Arias
 * @version 1.0  
 */

public class CCuenta {

/** Atributos de la clase CCuenta.
 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/** Constructor vacío para la clase CCuenta.
 */
    public CCuenta()
    {
    }

/** Método getter para obtener el valor del atributo de tipo String nombre. 
 * @return El valor del atributo de tipo String nombre de la clase CCuenta. 
 */
    public String getNombre() {
        return this.nombre;
    }

/** Método setter para dar un valor al atributo de tipo String nombre. 
 * @param nombre Parámetro de tipo String cuyo valor pasa a ser el del atributo nombre. 
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/** Método getter para obtener el valor del atributo de tipo String cuenta.
 * @return El valor del atributo de tipo String cuenta de la clase CCuenta. 
 */    
    public String getCuenta() {
        return this.cuenta;
    }
    
/** Método setter para dar un valor al atributo de tipo String cuenta.
 * @param cuenta Parámetro de tipo String cuenta cuyo valor pasa a ser el del atributo cuenta.
 */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

/** Método getter para obtener el valor del atributo de tipo double saldo.
 * @return El valor del atributo de tipo double saldo de la clase CCuenta. 
 */    
    public double getSaldo() {
        return this.saldo;
    }

/** Método setter para dar un valor al atributo de tipo double saldo.
 * @param saldo Parámetro de tipo double saldo cuyo valor pasa a ser el del atributo saldo. 
 */    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
/** Método getter para obtener el valor del atributo de tipo double tipoInterés.
 * @return El valor del atributo de tipo double tipoInterés de la clase Cuenta. 
 */
    public double getTipoInterés() {
        return this.tipoInterés;
    }

/** Método setter para dar un valor al atributo de tipo double tipoInterés.
 * @param tipoInterés Parámetro de tipo double tipoInterés cuyo valor pasa a ser el del atributo tipoInterés. 
 */     
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

/** Método para ingresar dinero en la cuenta bancaria.
 * @param cantidad Parámetro de tipo double cuyo valor se le añade al valor actual del atributo saldo.
 * @throws Exception en caso de que el valor del parámetro cantidad sea negativo.
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        } else {
            double nuevoSaldo = this.saldo + cantidad;
            this.setSaldo(nuevoSaldo);
        }
    }

/** Método para retirar dinero de la cuenta bancaria.
 * @param cantidad Parámetro de tipo double cuyo valor se le resta al valor actual del atributo saldo.
 * @throws Exception en caso de que el valor del parámetro cantidad sea negativo o en caso de que sea mayor que el del atributo saldo.
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (this.getSaldo() < cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
/** Método que permite consultar el saldo, ingresar y retirar dinero de la cuenta bancaria.
 * @param retiro Parámetro de tipo double que representa la cantidad de dinero a retirar.
 * @param ingreso Parámetro de tipo double que representa la cantidad de dinero a ingresar.
 * @param cantidad Parámetro de tipo float que representa el nuevo tipo de interés.
 */    
    public void operativa_cuenta(double retiro, double ingreso, float cantidad) {
            
            double saldoActual;
            saldoActual = this.getSaldo();
            System.out.println("El saldo actual es " + saldoActual );
        
            try {
                this.retirar(retiro);
            } catch (Exception e) {
                System.out.print("Fallo al retirar");
            }
            
            try {
                System.out.println("Ingreso en cuenta");
                this.ingresar(ingreso);
            } catch (Exception e) {
                System.out.print("Fallo al ingresar");
            }
            
            this.setTipoInterés(cantidad);
    }
}
