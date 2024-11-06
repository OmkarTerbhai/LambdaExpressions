package v1;

public class Hotel {
    private String name;
    private int rating;
    private String city;
    private int price;

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", rating=" + rating +
                ", city='" + city + '\'' +
                ", price=" + price +
                '}';
    }

    public Hotel(String name, int rating, String city, int price) {
        this.name = name;
        this.rating = rating;
        this.city = city;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
