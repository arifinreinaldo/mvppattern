package com.explore.javamvp.model.detail;


public class Stats {
    private Stat stat;

    private String base_stat;

    private String effort;

    public Stat getStat() {
        return stat;
    }

    public void setStat(Stat stat) {
        this.stat = stat;
    }

    public String getBase_stat() {
        return base_stat;
    }

    public void setBase_stat(String base_stat) {
        this.base_stat = base_stat;
    }

    public String getEffort() {
        return effort;
    }

    public void setEffort(String effort) {
        this.effort = effort;
    }

    @Override
    public String toString() {
        return "ClassPojo [stat = " + stat + ", base_stat = " + base_stat + ", effort = " + effort + "]";
    }
}


