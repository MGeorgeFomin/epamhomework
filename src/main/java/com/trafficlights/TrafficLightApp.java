package com.trafficlights;

import java.util.Scanner;

public class TrafficLightApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int timeForRequest = 1;
        TrafficLight trafficLight = new TrafficLight();

        while(timeForRequest != 0) {
            System.out.println("Set time for color request: ");
            timeForRequest = input.nextInt();
            trafficLight.timeToColor(timeForRequest);
            System.out.println("If you want to exit set \"0\"");
        }
    }
}
