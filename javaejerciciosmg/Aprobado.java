import java.util.Scanner;

public class Aprobado {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);

        double a;

        try{
            System.out.println("Ingrese la nota a validar: ");
            a = lector.nextDouble();

            if (a>=60 && a<=100){
                System.out.println("El alumnx esta aprobado");
            }else {
                System.out.println("lo sentimos, el alumnx no esta aprobado");
            }

        }catch (Exception err){
            System.out.println("Hubo un error");
        }finally{
            lector.close();
        }


    }
    
}
