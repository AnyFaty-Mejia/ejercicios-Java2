import java.util.Scanner;

public class Jubilada {
    public static void main(String[] args) {
        Scanner lecter = new Scanner(System.in);

        int edad;
        String nombre;
        int semanas;

        try{

            System.out.println("Introduzca su Nombre: ");
            nombre = lecter.nextLine();

            System.out.println("Introduzca su edad: ");
            edad = lecter.nextInt();

            System.out.println("Introduzca las semanas cotizadas: ");
            semanas = lecter.nextInt();

            int falta= 60-edad;
            int sem= 500-semanas;

            if(edad>=60 && semanas>=500){
                System.out.println("El cliente: " +nombre + "esta jubiladx");
            }else if(edad>=60 && semanas<500){
                System.out.println("El cliente: " +nombre + " tiene la edad pero le faltan " +sem + " semanas");
            }
            
            else{
                System.out.println("El cliente: " +nombre + " no es jubiladx le faltan " +falta + " años y "+sem+ " semanas");
            }

        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }
    }
}
