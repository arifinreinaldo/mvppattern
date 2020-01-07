package com.explore.javamvp.model.detail;

public class VersionGroupDetails {
    private String level_learned_at;

    private VersionGroup VersionGroup;

    private MoveLearnMethod MoveLearnMethod;

    public String getLevel_learned_at() {
        return level_learned_at;
    }

    public void setLevel_learned_at(String level_learned_at) {
        this.level_learned_at = level_learned_at;
    }

    public VersionGroup getVersionGroup() {
        return VersionGroup;
    }

    public void setVersionGroup(VersionGroup VersionGroup) {
        this.VersionGroup = VersionGroup;
    }

    public MoveLearnMethod getMoveLearnMethod() {
        return MoveLearnMethod;
    }

    public void setMoveLearnMethod(MoveLearnMethod MoveLearnMethod) {
        this.MoveLearnMethod = MoveLearnMethod;
    }

    @Override
    public String toString() {
        return "ClassPojo [level_learned_at = " + level_learned_at + ", VersionGroup = " + VersionGroup + ", MoveLearnMethod = " + MoveLearnMethod + "]";
    }
}
	
