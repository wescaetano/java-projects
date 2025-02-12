package entities;

public class PessoaJuridica extends Pessoa {
    private Integer numeroFuncionarios;

    public PessoaJuridica(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public PessoaJuridica(Double rendaAnual, String nome, Integer numeroFuncionarios) {
        super(rendaAnual, nome);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Integer getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Integer numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public double imposto() {
        if(getNumeroFuncionarios() <= 10){
            return getRendaAnual() * 0.16;
        } else{
            return getRendaAnual() * 0.14;
        }
    }
}
