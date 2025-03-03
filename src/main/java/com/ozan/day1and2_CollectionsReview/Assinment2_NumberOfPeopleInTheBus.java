package com.ozan.day1and2_CollectionsReview;

import java.util.ArrayList;
import java.util.List;

public class Assinment2_NumberOfPeopleInTheBus {
    public static void main(String[] args) {
        ArrayList<int[]> busStops = new ArrayList<>();
        busStops.add(new int[]{10,0});
        busStops.add(new int[]{3,5});
        busStops.add(new int[]{2,5});

        System.out.println(countPassengers(busStops));
    }
    public static int countPassengers(List<int[]>stops){
        int numOfPeople = 0;
        for (int i = 0; i < stops.size(); i++) {
            numOfPeople = numOfPeople + stops.get(i)[0] - stops.get(i)[1];
        }
        return numOfPeople;
    }
    // complexity of the solution is O(n)
}
