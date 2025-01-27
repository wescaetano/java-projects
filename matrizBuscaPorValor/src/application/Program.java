package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        int lin = sc.nextInt();
        sc.nextLine();

        System.out.print("Digite a quantidade de colunas da matriz: ");
        int col = sc.nextInt();
        sc.nextLine();

        int[][] mat = new int[lin][col];

        for (int i = 0; i < lin; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("Digite [%d][%d]: ", i, j);
                mat[i][j] = sc.nextInt();
                sc.nextLine();
            }
        }

        System.out.print("Digite um número para ser buscado na matriz: ");
        int num = sc.nextInt();
        sc.nextLine();

        // Encontrar as posições do número na matriz
        List<String> positions = findPositions(mat, num);

        // Exibir o resultado
        if (positions.isEmpty()) {
            System.out.println("O número não foi encontrado na matriz!");
        } else {
            for (String pos : positions) {
                String[] posInfo = pos.split(",");
                int i = Integer.parseInt(posInfo[0]);
                int j = Integer.parseInt(posInfo[1]);

                System.out.println("Número encontrado na posição: Linha " + i + ", Coluna " + j);
                System.out.println("Número vizinhos:");
                if (j > 0) {
                    System.out.println("Esquerda: " + mat[i][j - 1]);
                }
                if (i > 0) {
                    System.out.println("Acima: " + mat[i - 1][j]);
                }
                if (j < mat[i].length - 1) {
                    System.out.println("Direita: " + mat[i][j + 1]);
                }
                if (i < mat.length - 1) {
                    System.out.println("Abaixo: " + mat[i + 1][j]);
                }
                System.out.println();
            }
        }
    }

    public static List<String> findPositions(int[][] mat, int num) {
        List<String> positions = new ArrayList<>();
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == num) {
                    positions.add(i + "," + j); // Salva a posição no formato "linha,coluna"
                }
            }
        }
        return positions;
    }
}
