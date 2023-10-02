import java.util.Scanner;

public class Divisible {
    
    public static void main(String[] args) {
        Scanner lecter =new Scanner(System.in);

        int a; 

        try{

            System.out.println("Introduzca el número a evaluar: ");
            a = lecter.nextInt();

            if( (a%2==0) && (a%3==0)){
                System.out.println("El número puede ser divisible por 2 y por 3");
            }else{
                System.out.println("El Nuúmero no puede ser divisible por 2 y por 3");
            }

        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }

    }
}
