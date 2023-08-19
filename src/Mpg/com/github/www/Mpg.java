package Mpg.com.github.www;
import java.util.Scanner;

public class Mpg {
    public static void main(String[] args) {
        /** Chama o Scanner */
        Scanner scanner = new Scanner(System.in);
        int selecionaMPG;

        /**  Captura a Entrada */
        System.out.println();
        System.out.print("Caso queira converter MPG digite 1, caso queira converter Km/L digite 2: ");
        selecionaMPG = scanner.nextInt();

        /** Faz o Calculo e printa na Tela */
        switch (selecionaMPG) {
            case 1:
                System.out.println();
                System.out.print("Digite o Valor em MPG: ");
                float mpgValue = scanner.nextFloat();
                float kmPorLitro = (float) (mpgValue * 0.4251); // 1 MPG = 0.4251 Km/L
                System.out.println();
                System.out.println("********** RESULTADO **********");
                System.out.println("O RESULTADO EM KM/L É: " + kmPorLitro);
                System.out.println("********** PAULO HENRIQUE AZEVEDO DO NASCIMENTO **********");
                break;

            case 2:
                System.out.println();
                System.out.print("Digite o Valor em Km/L: ");
                float kmPorLitroValue = scanner.nextFloat();
                float mpgEquivalent = (float) (kmPorLitroValue / 0.4251); // 1 MPG = 0.4251 Km/L
                System.out.println();
                System.out.println("********** RESULTADO **********");
                System.out.println("O RESULTADO EM MPG É: " + mpgEquivalent);
                System.out.println("********** PAULO HENRIQUE AZEVEDO DO NASCIMENTO **********");
                break;

            default:
                System.out.println("Opção inválida. Por favor, escolha 1 para converter de MPG para Km/L ou 2 para converter de Km/L para MPG.");
                break;
        }
    }
}
