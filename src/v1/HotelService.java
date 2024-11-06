package v1;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    static List<Hotel> hotels = null;
    public static void main(String[] args) {
        hotels = new ArrayList<>();
        init(hotels);

        System.out.println(filterHotelsByPrice(3000));
        System.out.println(filterHotelsByRating(3));
        System.out.println(filterHotelsByCity("Pune"));
    }

    private static List<Hotel> filterHotelsByPrice(int price) {
        List<Hotel> filteredHotels = new ArrayList<>();

        for(Hotel h : hotels) {
            if(h.getPrice() > price)
                filteredHotels.add(h);
        }

        return filteredHotels;
    }

    private static List<Hotel> filterHotelsByRating(int rating) {
        List<Hotel> filteredHotels = new ArrayList<>();

        for(Hotel h : hotels) {
            if(h.getRating() >= rating)
                filteredHotels.add(h);
        }

        return filteredHotels;
    }

    private static List<Hotel> filterHotelsByCity(String city) {
        List<Hotel> filteredHotels = new ArrayList<>();

        for(Hotel h : hotels) {
            if(h.getCity().equalsIgnoreCase(city))
                filteredHotels.add(h);
        }

        return filteredHotels;
    }

    private static void init(List<Hotel> hotels) {
        hotels.add(new Hotel("Oberoi Hotel", 5, "Mumbai", 10000));
        hotels.add(new Hotel("Hotel Bhooshan", 3, "Pune", 3000));
        hotels.add((new Hotel("Hotel Lotus", 4, "Leh", 4000)));
        hotels.add(new Hotel("Relax Hotel", 2, "Mumbai", 2000));
    }
}
