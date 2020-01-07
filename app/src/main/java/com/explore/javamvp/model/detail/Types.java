package com.explore.javamvp.model.detail;

public class Types {
    private String slot;

    private Type type;

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ClassPojo [slot = " + slot + ", type = " + type + "]";
    }
}


