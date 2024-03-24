import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voto, totalVotos = 0;
        int[] votosCandidatos = new int[4]; // Índices 0 a 3 representam os candidatos
        int votosNulos = 0, votosBrancos = 0;

        System.out.println("Códigos dos candidatos:");
        System.out.println("1 - José");
        System.out.println("2 - João");
        System.out.println("3 - Maria");
        System.out.println("4 - Ana");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");

        do {
            System.out.print("\nDigite o código do voto (ou 0 para encerrar): ");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[voto - 1]++; // Incrementa o voto para o candidato correspondente
                    totalVotos++;
                    break;
                case 5:
                    votosNulos++;
                    totalVotos++;
                    break;
                case 6:
                    votosBrancos++;
                    totalVotos++;
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Código de voto inválido. Tente novamente.");
            }
        } while (voto != 0);

        System.out.println("\nResultados da Eleição:");
        System.out.println("Total de votos para José: " + votosCandidatos[0]);
        System.out.println("Total de votos para João: " + votosCandidatos[1]);
        System.out.println("Total de votos para Maria: " + votosCandidatos[2]);
        System.out.println("Total de votos para Ana: " + votosCandidatos[3]);
        System.out.println("Total de votos nulos: " + votosNulos);
        System.out.println("Total de votos em branco: " + votosBrancos);
        System.out.println("Percentagem de votos nulos sobre o total de votos: " + (100.0 * votosNulos / totalVotos) + "%");
        System.out.println("Percentagem de votos em branco sobre o total de votos: " + (100.0 * votosBrancos / totalVotos) + "%");

        scanner.close();
    }
}
