import java.util.Scanner;

public class Ex45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o código da região de origem da carga (1 a 5): ");
        int codigoRegiao = input.nextInt();

        System.out.print("Digite o peso da carga em toneladas: ");
        double pesoTon = input.nextDouble();

        System.out.print("Digite o código da carga (10 a 40): ");
        int codigoCarga = input.nextInt();

        // conversão do peso da carga em toneladas para quilos
        double pesoQuilos = pesoTon * 1000;

        // cálculo do preço da carga
        double precoCarga;
        if (codigoCarga <= 20) {
            precoCarga = pesoQuilos * 100;
        } else if (codigoCarga <= 30) {
            precoCarga = pesoQuilos * 250;
        } else {
            precoCarga = pesoQuilos * 340;
        }

        // cálculo do imposto
        double imposto;
        switch (codigoRegiao) {
            case 1:
                imposto = precoCarga * 35 / 100;
                break;
            case 2:
                imposto = precoCarga * 25 / 100;
                break;
            case 3:
                imposto = precoCarga * 15 / 100 ;
                break;
            case 4:
                imposto = precoCarga * 5 / 100;
                break;
            default:
                imposto = precoCarga;
                break;
        }

        // cálculo do valor total transportado
        double valorTotal = precoCarga + imposto;

        System.out.println("Peso da carga em quilos: " + pesoQuilos);
        System.out.println("Preço da carga: R$ " + precoCarga);
        System.out.println("Valor do imposto: R$ " + imposto);
        System.out.println("Valor total transportado: R$ " + valorTotal);
    }
}
