package application;

import entities.Product;

import java.io.*;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        // Define o Locale padrão como US para garantir que os números usem ponto (.) como separador decimal
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Configuração do formatador para garantir que o número seja formatado com ponto como separador decimal
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);

        // Lista para armazenar os produtos lidos do arquivo
        List<Product> products = new ArrayList<>();

        // Solicita ao usuário o caminho do arquivo de entrada
        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        // Cria um objeto File com base no caminho informado
        File sourceFile = new File(sourceFileStr);s
        // Obtém o diretório onde o arquivo está localizado
        String sourceFolderStr = sourceFile.getParent();

        // Cria um diretório "out" dentro da pasta do arquivo de entrada, se ainda não existir
        new File(sourceFolderStr + "\\out").mkdir();

        // Define o caminho do arquivo de saída dentro da pasta "out"
        String targetFileStr = sourceFolderStr + "\\out\\summary.csv";

        // Inicia a leitura do arquivo de entrada
        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {
            String itemCsv = br.readLine(); // Lê a primeira linha do arquivo

            while (itemCsv != null) { // Continua lendo enquanto houver linhas no arquivo
                String[] fields = itemCsv.split(","); // Divide a linha em partes, separadas por vírgula

                // Extrai os valores do produto e remove espaços em branco extras
                String name = fields[0].trim();
                double price = Double.parseDouble(fields[1].trim());
                int quantity = Integer.parseInt(fields[2].trim());

                // Cria um objeto Product e adiciona à lista
                products.add(new Product(name, price, quantity));

                // Lê a próxima linha do arquivo
                itemCsv = br.readLine();
            }

            // Inicia a escrita no arquivo de saída (summary.csv)
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {
                for (Product product : products) {
                    // Escreve os produtos no arquivo CSV com o formato correto (sem espaços extras)
                    bw.write(product.getName() + "," + df.format(product.total()));
                    bw.newLine(); // Adiciona uma quebra de linha
                }
                System.out.println(targetFileStr + " CREATED"); // Mensagem de sucesso
            } catch (IOException e) {
                System.out.println("Error writing file: " + e.getMessage()); // Tratamento de erro na escrita
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage()); // Tratamento de erro na leitura
        }

        sc.close(); // Fecha o Scanner para evitar vazamento de recursos
    }
}
