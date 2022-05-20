package cuentas;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        
        cuenta1 = new CCuenta(); 
        cuenta1.setNombre("Antonio López");
        cuenta1.setCuenta("1000-2365-85-1230456789");
        cuenta1.setSaldo(2500);
        cuenta1.setTipoInterés(0);
        
        cuenta1.operativa_cuenta(2300, 650, 0);
    }
}
