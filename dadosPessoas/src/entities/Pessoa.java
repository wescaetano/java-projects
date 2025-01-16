package entities;

public class Pessoa {
    private String gender;
    private double altura;

    public Pessoa(String gender, double altura) {
        this.gender = gender;
        this.altura = altura;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}
