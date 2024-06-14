import java.util.Scanner;


public class Main{
    public static void main(String[] args) {
        Scanner cal = new Scanner(System.in);
        System.out.println("Nombre: ");
        String Nombre=cal.nextLine();
        System.out.println("Apellido: ");
        String Apellido=cal.nextLine();
        System.out.println("Cal 1");
        double cal1=cal.nextDouble();
        System.out.println("Cal 1");
        double cal2=cal.nextDouble();
        Estudiantes estudiante1=new Estudiantes( Nombre, Apellido, cal1, cal2);
        estudiante1.calificaciones();
        estudiante1.datos();
        estudiante1.promedio();
        System.out.println("Opcion");
        int opcion=cal.nextInt();
        switch (opcion){
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
        }
        int cacaoo;
        do{
            System.out.println("Menu");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("Opcion");
            cacaoo=cal.nextInt();
            switch (cacaoo){
                case 1:
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
            }

        }while (cacaoo !=4);
        System.out.println("Saliste del menu");
    }

}