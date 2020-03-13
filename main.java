import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

public class Salario{
    public static void main(String[] args){
        DecimalFormat decimal = new DecimalFormat("##.#");
        
        System.out.println("Digite o seu salário: ");
        double salario = new Scanner(System.in).nextDouble();
        
        System.out.println("Digite o salário mínimo atual: ");
        double salarioMinimo = new Scanner(System.in).nextDouble();
        
        double qtdSM = salario/salarioMinimo;
        
        System.out.println("Você recebe "+decimal.format(qtdSM)+" salário(s) mínimo(s)!");
    }
}
