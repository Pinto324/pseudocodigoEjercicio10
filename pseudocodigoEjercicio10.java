
import java.util.Scanner;

public class pseudocodigoEjercicio10 {
        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int no;
        int Suma = 0;
        double prom1 = 0;
        int Num = 0;
        int Schi = 0;
        while(!(Suma>=1000)){            
            System.out.println("Escribe el numero a sumar:");            
            no = sc.nextInt();
            Suma += no;
                if(no%6==0){
                Num++;    
                }
                if(no < 16&& no >= 1){
                Schi += no;
                }
        }
        System.out.println("La cantidad de numeros multiplos de 6 es de: "+Num);
        System.out.println("La suma de los no entre 1 a 15 es de: "+Schi);
    }    
}
