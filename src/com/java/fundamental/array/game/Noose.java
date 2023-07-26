package com.java.fundamental.array.game;

//Graphics for each of the stages in an array of String
public class Noose {
    public static final String[] STAGES = {
            "------\\\n   |   |\n        |\n       |\n       |\n         |\n--------",
            "------\\\n   |   |\n   0    |\n       |\n       |\n         |\n--------",
            "------\\\n   |   |\n   0    |\n   |   |\n   |   |\n         |\n--------",
            "------\\\n   |   |\n   0    |\n --+   |\n   |   |\n         |\n--------",
            "------\\\n   |   |\n   0    |\n --+-- |\n   |   |\n         |\n--------",
            "------\\\n   |   |\n   0    |\n --+-- |\n   |   |\n   /     |\n--------",
            "------\\\n   |   |\n   0    |\n --+-- |\n   |   |\n   / \\  |\n--------"
    };
    private int stage;

    public boolean isComplete(){
        return stage == STAGES.length - 1;
    }
    public void advance(){
        if(!isComplete()) {
            stage++;
        }
    }

    @Override
    public String toString() {
        return STAGES[stage];
    }
}
