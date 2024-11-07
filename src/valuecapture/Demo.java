package valuecapture;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        final int price = 0;
        List<Integer> li = new ArrayList<>();
        li.sort((a, b) -> {
            return a - price;
        });
        final List<String> strList = new ArrayList<>();
        li.forEach((ele) -> {
            strList.add("Hello");
        });


    }

}
