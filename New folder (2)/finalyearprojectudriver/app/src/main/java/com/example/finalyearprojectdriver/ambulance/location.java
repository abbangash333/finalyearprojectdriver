package com.example.finalyearprojectdriver.ambulance;

public class location {
    Double lati;
    Double longi;


    public location() {
    }

    public location(Double lati, Double longi) {
        this.lati = lati;
        this.longi = longi;
    }

    public Double getLati() {
        return lati;
    }

    public void setLati(Double lati) {
        this.lati = lati;
    }

    public Double getLongi() {
        return longi;
    }

    public void setLongi(Double longi) {
        this.longi = longi;
    }
}
