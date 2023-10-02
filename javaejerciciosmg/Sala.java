import java.util.Scanner;

public class Sala {
    public static void main(String[] args) {
        Scanner lecter =new Scanner(System.in);

        int edad;
        int invitacion;
        String nombre;

        try{

            System.out.println("Introduzca su Nombre: ");
            nombre = lecter.nextLine();

            System.out.println("Introduzca su edad: ");
            edad = lecter.nextInt();

            System.out.println("¿Cuenta con una invitación especial?");
            System.out.println("Marque 1 en caso de ser cierto");
            System.out.println("Marque 2 en caso de ser incorrecto");
            invitacion= lecter.nextInt();

            if(edad>=18 && invitacion!=1){
                System.out.println("El cliente: " +nombre + " puede hacer uso de la sala VIP");
            }else if(edad!=18 && invitacion==1){
                System.out.println("El cliente: " +nombre + " tiene una invitacion especial, puede hacer uso de la sala VIP");
            }else{
                System.out.println("Lo sentimos, no puede hacer uso de la sala VIP, para mayor información marque al siguiente número: 55555555");
            }

        }catch(Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }
    }
}
