package v3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HotelService {
    static List<Hotel> hotels = null;
    public static void main(String[] args) {
        hotels = new ArrayList<>();
        init(hotels);



        System.out.println(filterHotels((h) -> h.getPrice() < 5000));
    }

    private static List<Hotel> filterHotels(Predicate<Hotel> fc) {
        List<Hotel> filteredHotels = new ArrayList<>();

        for(Hotel h : hotels) {
            if(fc.test(h))
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
