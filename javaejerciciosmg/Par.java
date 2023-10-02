import java.util.Scanner;

public class Par {
    public static void main(String[] args) {
        Scanner lecter =new Scanner(System.in);


        int a;

        try{

            System.out.println("Ingrese el número a validar: ");
            a= lecter.nextInt();

            if (a%2==0){
                System.out.println("El número es par");
            }else if(a%5==0){
                System.out.println("El número es multiplo de 5");
            }else{
                System.out.println("El número no cumple con ninguna de las condiciones");
            }
        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lecter.close();
        }



    }
}
