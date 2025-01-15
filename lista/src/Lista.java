import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

class Produto {
    private String nome;
    private String detalhes;
    private double valor;
    private boolean disponivel;

    public Produto(String nome, String detalhes, double valor, boolean disponivel) {
        this.nome = nome;
        this.detalhes = detalhes;
        this.valor = valor;
        this.disponivel = disponivel;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nDetalhes: " + detalhes +
                "\nValor: R$ " + valor +
                "\nDisponível: " + (disponivel ? "Sim" : "Não");
    }
}

class CadastroDeProdutosGUI {
    private ArrayList<Produto> produtos = new ArrayList<>();

    public CadastroDeProdutosGUI() {
        // Criação da janela principal
        JFrame frame = new JFrame("Cadastro de Produtos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new BorderLayout());


        JPanel panelButtons = new JPanel();
        JButton btnCadastrar = new JButton("Cadastrar Produto");
        JButton btnListar = new JButton("Listar Produtos");
        panelButtons.add(btnCadastrar);
        panelButtons.add(btnListar);


        JTextArea textArea = new JTextArea();
        textArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(textArea);


        frame.add(panelButtons, BorderLayout.NORTH);
        frame.add(scrollPane, BorderLayout.CENTER);


        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JTextField fieldNome = new JTextField();
                JTextField fieldDetalhes = new JTextField();
                JTextField fieldValor = new JTextField();
                JCheckBox checkDisponivel = new JCheckBox("Disponível para venda");

                // Formulário de entrada
                Object[] form = {
                        "Nome do Produto:", fieldNome,
                        "Detalhes do Produto:", fieldDetalhes,
                        "Valor (R$):", fieldValor,
                        checkDisponivel
                };

                int option = JOptionPane.showConfirmDialog(frame, form, "Cadastrar Produto", JOptionPane.OK_CANCEL_OPTION);
                if (option == JOptionPane.OK_OPTION) {
                    try {
                        String nome = fieldNome.getText();
                        String detalhes = fieldDetalhes.getText();
                        double valor = Double.parseDouble(fieldValor.getText());
                        boolean disponivel = checkDisponivel.isSelected();

                        Produto produto = new Produto(nome, detalhes, valor, disponivel);
                        produtos.add(produto);

                        JOptionPane.showMessageDialog(frame, "Produto cadastrado com sucesso!");
                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(frame, "Erro: Valor inválido.", "Erro", JOptionPane.ERROR_MESSAGE);
                    }
                }
            }
        });


        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (produtos.isEmpty()) {
                    textArea.setText("Nenhum produto cadastrado.");
                } else {
                    StringBuilder lista = new StringBuilder();
                    for (int i = 0; i < produtos.size(); i++) {
                        lista.append("Produto #").append(i + 1).append("\n");
                        lista.append(produtos.get(i)).append("\n\n");
                    }
                    textArea.setText(lista.toString());
                }
            }
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new CadastroDeProdutosGUI());
    }
}