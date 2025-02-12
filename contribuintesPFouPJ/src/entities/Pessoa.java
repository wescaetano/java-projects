package entities;

public abstract class Pessoa {
    private String nome;
    private Double rendaAnual;

    public Pessoa() {
    }

    public Pessoa(Double rendaAnual, String nome) {
        this.rendaAnual = rendaAnual;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getRendaAnual() {
        return rendaAnual;
    }

    public void setRendaAnual(Double rendaAnual) {
        this.rendaAnual = rendaAnual;
    }

    public abstract double imposto();
}
