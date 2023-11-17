import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int vu;
        int valor;

        System.out.println("Ingrese el valor de adquisición");
        Scanner sc = new Scanner(System.in);
        valor = Integer.parseInt( sc.nextLine() );

        System.out.println("Ingrese la vida util");
        vu = Integer.parseInt( sc.nextLine() );

        int dep = valor / vu;
        int saldo;

        System.out.printf("%-8s  %-8s  %-8s  %-8s \n", "Periodo", "Valor", "Deprec." , "Saldo");

        for(int i = 1 ; i <= vu; i++){
            saldo = valor - dep;
            System.out.printf("%-8d  %-8d  %-8d  %-8d \n", i, valor, dep , saldo);
            valor = saldo;
        }
    }
}
