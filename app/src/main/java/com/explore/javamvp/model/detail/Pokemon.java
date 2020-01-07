package com.explore.javamvp.model.detail;

public class Pokemon {
    private String location_area_encounters;

    private Types[] types;

    private String base_experience;

    private String[] held_items;

    private String weight;

    private String is_default;

    private Sprites sprites;

    private Abilities[] abilities;

    private GameIndices[] GameIndices;

    private Species species;

    private Stats[] stats;

    private Moves[] moves;

    private String name;

    private String id;

    private Forms[] forms;

    private String height;

    private String order;

    public String getLocation_area_encounters() {
        return location_area_encounters;
    }

    public void setLocation_area_encounters(String location_area_encounters) {
        this.location_area_encounters = location_area_encounters;
    }

    public Types[] getTypes() {
        return types;
    }

    public void setTypes(Types[] types) {
        this.types = types;
    }

    public String getBase_experience() {
        return base_experience;
    }

    public void setBase_experience(String base_experience) {
        this.base_experience = base_experience;
    }

    public String[] getHeld_items() {
        return held_items;
    }

    public void setHeld_items(String[] held_items) {
        this.held_items = held_items;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getIs_default() {
        return is_default;
    }

    public void setIs_default(String is_default) {
        this.is_default = is_default;
    }

    public Sprites getSprites() {
        return sprites;
    }

    public void setSprites(Sprites sprites) {
        this.sprites = sprites;
    }

    public Abilities[] getAbilities() {
        return abilities;
    }

    public void setAbilities(Abilities[] abilities) {
        this.abilities = abilities;
    }

    public GameIndices[] getGameIndices() {
        return GameIndices;
    }

    public void setGameIndices(GameIndices[] GameIndices) {
        this.GameIndices = GameIndices;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public Stats[] getStats() {
        return stats;
    }

    public void setStats(Stats[] stats) {
        this.stats = stats;
    }

    public Moves[] getMoves() {
        return moves;
    }

    public void setMoves(Moves[] moves) {
        this.moves = moves;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Forms[] getForms() {
        return forms;
    }

    public void setForms(Forms[] forms) {
        this.forms = forms;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "ClassPojo [location_area_encounters = " + location_area_encounters + ", types = " + types + ", base_experience = " + base_experience + ", held_items = " + held_items + ", weight = " + weight + ", is_default = " + is_default + ", sprites = " + sprites + ", abilities = " + abilities + ", GameIndices = " + GameIndices + ", species = " + species + ", stats = " + stats + ", moves = " + moves + ", name = " + name + ", id = " + id + ", forms = " + forms + ", height = " + height + ", order = " + order + "]";
    }
}

