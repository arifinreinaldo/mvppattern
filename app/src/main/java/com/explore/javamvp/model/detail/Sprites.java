package com.explore.javamvp.model.detail;

public class Sprites {
    private String back_shiny_female;

    private String back_female;

    private String back_default;

    private String front_shiny_female;

    private String front_default;

    private String front_female;

    private String back_shiny;

    private String front_shiny;


    public String getBack_default() {
        return back_default;
    }

    public void setBack_default(String back_default) {
        this.back_default = back_default;
    }


    public String getFront_default() {
        return front_default;
    }

    public void setFront_default(String front_default) {
        this.front_default = front_default;
    }


    public String getBack_shiny() {
        return back_shiny;
    }

    public void setBack_shiny(String back_shiny) {
        this.back_shiny = back_shiny;
    }

    public String getFront_shiny() {
        return front_shiny;
    }

    public void setFront_shiny(String front_shiny) {
        this.front_shiny = front_shiny;
    }

    @Override
    public String toString() {
        return "ClassPojo [back_shiny_female = " + back_shiny_female + ", back_female = " + back_female + ", back_default = " + back_default + ", front_shiny_female = " + front_shiny_female + ", front_default = " + front_default + ", front_female = " + front_female + ", back_shiny = " + back_shiny + ", front_shiny = " + front_shiny + "]";
    }
}

