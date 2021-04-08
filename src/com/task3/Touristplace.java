package com.task3;

import java.util.ArrayList;
import java.util.List;
import java.text.DecimalFormat;

public class Touristplace {

    String name;
    String workingHours;
    int entryTicketPrice;
    public int noOfRatings;
    public double starRating;
    List<String> famousFor;

    public Touristplace(String name, String workingHours, int entryTicketPrice) {
        this.name = name;
        this.workingHours = workingHours;
        this.entryTicketPrice = entryTicketPrice;
        famousFor = new ArrayList<>();
        noOfRatings = 0;
        starRating = 0;
    }

    public void rate(double stars){
        noOfRatings++;
        starRating = stars+starRating;
    }

    public double findRating(){
        return starRating/noOfRatings;
    }

    public Touristplace addFamousFor(String s){
        famousFor.add(s);
        return this;
    }

    boolean isPlaceOpen(){
        return true;
    }
}
    class City {

    String name;
    String state;
    List<Touristplace> touristPlacesList;

    public City(String name, String state) {
        this.name = name;
        this.state = state;
        touristPlacesList = new ArrayList<>();
    }
}



class Main {
    public static void main(String[] args) {
        Touristplace touristPlaces = new Touristplace("Amber Fort","10:00AM to 5:00PM",100);
        touristPlaces.addFamousFor("Amber Fort is known for its artistic style elements. With its large ramparts and series of gates and cobbled paths, the fort overlooks Maota Lake, which is the main source of water for the Amer Palace. Mughal architecture greatly influenced the architectural style of several buildings of the fort.");


        touristPlaces.rate(4.8);
        touristPlaces.rate(4);
        touristPlaces.rate(3.9);
        touristPlaces.rate(4.5);
        touristPlaces.rate(5);

        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        System.out.println(df.format(touristPlaces.findRating()));

        /*City city1 = new City("Jaipur","Rajasthan");
        city1.*/
    }
}