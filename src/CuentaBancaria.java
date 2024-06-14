public class CuentaBancaria{
    String cedula;
    String nombre;

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public CuentaBancaria(String nombre,String cedula){
        this.nombre=nombre;
        this.cedula=cedula;
    }

    public void Mostrar(){
        System.out.println("Datos");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Cedula: "+getCedula());
    }


}
class CuentaAhorros extends CuentaBancaria{
    int montoAct;
    int agregado;
    int total;
    public CuentaAhorros(String nombre,String cedula,int montoAct,int agregado){
       super(nombre, cedula);
        this.montoAct=montoAct;
        this.agregado=agregado;
    }

    public int getMontoAct() {
        return montoAct;
    }

    public void setMontoAct(int montoAct) {
        this.montoAct = montoAct;
    }

    public int getAgregado() {
        return agregado;
    }

    public void setAgregado(int agregado) {
        this.agregado = agregado;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    @Override
    public void Mostrar(){
        super.Mostrar();
    }
    public void depositar(){
        int a=getAgregado()+getMontoAct();
        setTotal(a);
        System.out.println("Monto actual: "+getMontoAct());
        System.out.println("Deposito "+getAgregado());
        System.out.println("Total: "+getTotal());
    }
}
