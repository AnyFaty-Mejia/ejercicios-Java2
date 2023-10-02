import java.util.Scanner;

public class Negativo {
    
    public static void main(String[] args) {
        Scanner lecter =new Scanner(System.in);

        double a;

        try{

            System.out.println("Ingrese el número a validar: ");
            a= lecter.nextDouble();

            if (a ==0){
                System.out.println("El número es 0");
            }else if(a<0){
                System.out.println("El número es negativo");
            }else{
                System.out.println("El número es positivo");
            }

        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }
            
    }
}
