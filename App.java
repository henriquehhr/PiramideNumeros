import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe um número inteiro: ");
        int num = scan.nextInt();
        String texto = "";
        for(int i = 1; i <= num; i++) {
            for(int j = 1; j <= i; j++) {
                texto += i;
            }
            texto += "\n";
        }
        System.out.println(texto);
        
        scan.close();
    }
}
