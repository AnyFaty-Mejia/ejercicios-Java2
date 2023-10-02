
import java.util.Scanner;

public class Mayor{

    public static void main(String[] args) {
        
        Scanner lecter = new Scanner (System.in);

        double a;

        try{ 
            System.out.println("Ingrese el número a validar: ");
            a= lecter.nextDouble();

            if (a> 10 && a<20){
                System.out.println("El número es mayor a 10 y menor a 20");
            }else{
                System.out.println("El número no cumple con las condiciones" );
            }


        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }
    }
}