import java.util.Scanner;

public class Positivo {
 
    public static void main(String[] args) {
        Scanner lecter =new Scanner(System.in);

        double a;

        try{

            System.out.println("Ingrese el número a validar: ");
            a= lecter.nextDouble();

            if (a != 0 && a>0){
                System.out.println("El número es positivo y mayor que 0");
            }else{
                System.out.println("El número es negativo y menor que 0");
            }

        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }
            
        
       
    }

    
}
