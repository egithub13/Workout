package com.hfad.workout;

/**
 * Created by Eric on 12/20/2017.
 */

public class WorkOut {
    private String name;
    private String description;

    public static final WorkOut[] workouts = {
            new WorkOut("The limb loosener",
                    "5 Handstand push-ups\n10 1-legged squats\n15 pull-ups"),
            new WorkOut("Core Agony",
                    "100 Pull-ups\n100 Push-ups\n100 Sit-ups\n100 Squats"),
            new WorkOut("The Wimp Special",
                    "5 pull-ups\n10 Push-ups\n15 Squats"),
            new WorkOut("Strength and Length",
                    "500 meter run\n21 x 1.5 pood kettlebell swing\21 x Pull-ups")
    };

    private WorkOut(String name, String description){
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }
    public String toString(){
        return this.name;
    }


}
