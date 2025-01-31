package entities;

public class Account {
    private static int cont=0;
    private String id = gerarIdUnico();
    private String name;
    private double value;

    public Account(String name, double value) {
        this.name = name;
        this.value = value;
    }

    private synchronized String gerarIdUnico(){
        long timeStamp = System.currentTimeMillis()% 100000;
        return timeStamp + "-" + (++cont);
    }

    public void salaryIncrease(int percentage){
        this.value += value * percentage/100;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

}
