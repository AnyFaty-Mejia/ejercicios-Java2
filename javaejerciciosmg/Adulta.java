import java.util.Scanner;

public class Adulta {
    public static void main(String[] args) {
        Scanner lecter = new Scanner(System.in);

        int a;
        int permiso;
        String nombre;

        try{

            System.out.println("Introduzca su Nombre: ");
            nombre = lecter.nextLine();

            System.out.println("Introduzca su edad: ");
            a = lecter.nextInt();

            System.out.println("¿Cuenta con un permiso para conducir?");
            System.out.println("Marque 1 en caso de ser cierto");
            System.out.println("Marque 2 en caso de ser incorrecto");
            permiso= lecter.nextInt();


            if (a>=18 && permiso ==1){
                System.out.println("El cuidadano " +nombre + "es mayor de edad y tiene un permiso para conducir");
            }else if(a>=18 && permiso !=1){
                System.out.println("El ciudadano " +nombre + "es mayor de edad pero no tiene permiso para conducir");
            }else {
                System.out.println("El cuidadano " +nombre + " es menor de edad");
            }

        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }

    }

}
