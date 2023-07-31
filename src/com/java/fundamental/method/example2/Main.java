package com.java.fundamental.method.example2;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        FlightPlan berlinToBucharest = new FlightPlan("BER", "OTP");
        berlinToBucharest.print();

        System.out.println();

        FlightPlan londonToParis = new FlightPlan("LHR", "CDG", LocalDateTime.of(2022,
                10, 03, 22, 10),
                Arrays.asList("LHR", "FARAR", "BAYKA", "DUDES", "CDG"));

        londonToParis.print();

    }
}
