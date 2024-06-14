public class Estudiantes{
    private String Nombre;
    private String apellido;
    private double n1;
    private double n2;
    public int edad;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }


    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    //Metodo constructor
    public Estudiantes(String Nombre,String apellido,double n1,double n2){
        this.Nombre=Nombre;
        this.apellido=apellido;
        this.n1=n1;
        this.n2=n2;

    }
    public void promedio(){
        double total=(getN1()+getN2())/2;
        System.out.println("El promedio es: "+total);
    }
    public void calificaciones(){
        System.out.println("Calificaciones");
        System.out.println("Calificacion1 "+getN1());
        System.out.println("Calificacion2: "+getN2());
    }
    public void datos(){
        System.out.println("Datos");
        System.out.println("Nombre: "+getNombre());
        System.out.println("Apellido "+getApellido());
    }



}