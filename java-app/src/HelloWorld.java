
import java.util.Scanner;

public class HelloWorld{

    public static void main(String[] a){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Qual o seu nome?");
            System.out.println("Olá " + sc.nextLine() + "!");
        }
    }
}