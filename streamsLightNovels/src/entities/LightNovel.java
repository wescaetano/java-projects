package entities;

public class LightNovel {
    private String title;
    private Double price;

    public LightNovel(String title, Double price) {
        this.title = title;
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return  "title: " + title  +
                ", price: " + price;
    }
}
