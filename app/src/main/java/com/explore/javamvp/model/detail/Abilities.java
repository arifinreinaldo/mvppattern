package com.explore.javamvp.model.detail;

public class Abilities {
    private String is_hidden;

    private Ability ability;

    private String slot;

    public String getIs_hidden() {
        return is_hidden;
    }

    public void setIs_hidden(String is_hidden) {
        this.is_hidden = is_hidden;
    }

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public String getSlot() {
        return slot;
    }

    public void setSlot(String slot) {
        this.slot = slot;
    }

    @Override
    public String toString() {
        return "ClassPojo [is_hidden = " + is_hidden + ", ability = " + ability + ", slot = " + slot + "]";
    }
}
