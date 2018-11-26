package com.trafficlights;

public class TrafficLight {
    private String redLight = "RED";
    private String yellowLight = "YELLOW";
    private String greenLight = "GREEN";

    public String getRedLight() {
        return redLight;
    }

    public String getYellowLight() {
        return yellowLight;
    }

    public String getGreenLight() {
        return greenLight;
    }

    public void showLight(String color) {
        System.out.println(color + " light is switched on at that time!");
    }

    public void timeToColor(int time) {
        int timeOfLoop = 2 + 3 + 5;
        time = time % timeOfLoop;
        if (time > 0 && time < 3) {
            showLight(getRedLight());
        } else if (time > 2 && time <= (2 + 3)) {
            showLight(getYellowLight());
        } else if (time > (2 + 3) || time == 0) {
            showLight(getGreenLight());
        }
    }
}
