package com.explore.javamvp.model.detail;

public class Moves {
    private VersionGroupDetails[] VersionGroupDetails;

    private Move move;

    public VersionGroupDetails[] getVersionGroupDetails() {
        return VersionGroupDetails;
    }

    public void setVersionGroupDetails(VersionGroupDetails[] VersionGroupDetails) {
        this.VersionGroupDetails = VersionGroupDetails;
    }

    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }

    @Override
    public String toString() {
        return "ClassPojo [VersionGroupDetails = " + VersionGroupDetails + ", move = " + move + "]";
    }
}
	