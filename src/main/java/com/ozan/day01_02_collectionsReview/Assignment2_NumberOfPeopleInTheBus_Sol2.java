package com.ozan.day01_02_collectionsReview;

import java.util.ArrayList;

public class Assignment2_NumberOfPeopleInTheBus_Sol2 {
    public static void main(String[] args) {
        ArrayList<int[]> busStops = new ArrayList<>();
        busStops.add(new int[]{10, 0});
        busStops.add(new int[]{3, 5});
        busStops.add(new int[]{2, 5});
        System.out.println(countPassengers(busStops));
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        int sumZeros = stops.stream().mapToInt(x -> x[0]).sum();
        int sumOnes = stops.stream().mapToInt(x -> x[1]).sum();
        return sumZeros - sumOnes;
    }
}
