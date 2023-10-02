import java.util.Scanner;

public class Cien {
    
    public static void main(String[] args) {
        Scanner lecter = new Scanner(System.in);

        int a;

        try{
            System.out.println("Ingrese el número a validar: ");
            a= lecter.nextInt();

            if(a>100){
                System.out.println("El número es mayor a 100");

            }else if(a<-100){
                System.out.println("El numero es menor a -100");
            }else{
                System.out.println("El número no cumple con las especificaciones");
            }

        }catch(Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }
    }
}
