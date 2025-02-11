package entities;

public class PessoaFisica extends Pessoa {
    private Double gastosSaude;

    public PessoaFisica(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    public PessoaFisica(Double rendaAnual, String nome, Double gastosSaude) {
        super(rendaAnual, nome);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
        if(getRendaAnual() < 20000){
            return (getRendaAnual() * 0.15) - (getGastosSaude() * 0.5);
        } else{
            return (getRendaAnual() * 0.25) - (getGastosSaude() * 0.5);
        }
    }
}
