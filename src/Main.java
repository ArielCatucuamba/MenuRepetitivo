public class Main{
    public static void main(String[] args) {
        CuentaAhorros p1=new CuentaAhorros("Ariel","1727884767",100,500);
        p1.Mostrar();
        p1.setAgregado(1000);
        p1.depositar();

    }
}