package v2;

import java.util.ArrayList;
import java.util.List;

public class HotelService {
    static List<Hotel> hotels = null;
    public static void main(String[] args) {
        hotels = new ArrayList<>();
        init(hotels);

        System.out.println(filterHotels(new FilteringCondition() {
            @Override
            public boolean test(Hotel h) {
                return h.getCity().equals("Pune");
            }
        }));

        System.out.println(filterHotels(new FilteringCondition() {
            @Override
            public boolean test(Hotel h) {
                return h.getPrice() < 4000;
            }
        }));

        System.out.println(filterHotels(new FilteringCondition() {
            @Override
            public boolean test(Hotel h) {
                return h.getRating() < 4;
            }
        }));
    }

    private static List<Hotel> filterHotels(FilteringCondition fc) {
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
