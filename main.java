import java.util.Scanner;
public class Salario{
    public static void main(String[] args){
        double salario, salarioMinimo, qtdSM;
        
        System.out.println("Digite o seu salário: ");
        salario = new Scanner(System.in).nextDouble();
        
        System.out.println("Digite o salário mínimo atual: ");
        salarioMinimo = new Scanner(System.in).nextDouble();
        
        qtdSM = salario/salarioMinimo;
        
        System.out.printf("Você recebe %f salário(s) mínimos!",qtdSM);
    }
}
