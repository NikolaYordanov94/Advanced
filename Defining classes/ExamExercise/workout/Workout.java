package workout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Workout {
    private String type;
    private int exerciseCount;
    List<Exercise> exercises;

    public Workout(String type, int exerciseCount) {
        this.type = type;
        this.exerciseCount = exerciseCount;
        this.exercises = new ArrayList<>();
    }

    public String getType() {
        return type;
    }

    public int getExerciseCount() {
        return exerciseCount;
    }

    public List<Exercise> getExercises() {
        return exercises;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setExerciseCount(int exerciseCount) {
        this.exerciseCount = exerciseCount;
    }

    public void setExercises(List<Exercise> exercises) {
        this.exercises = exercises;
    }
    public void addExercise(Exercise exercise){
        if(exercises.size() < exerciseCount){
            exercises.add(exercise);
        }
    }
    public boolean removeExercise(String name, String muscle){
        return exercises.removeIf(p -> p.getName().equals(name) && p.getMuscle().equals(muscle));
    }
    public Exercise getExercise(String name, String muscle){
        for (Exercise exercise : exercises){
            if(exercise.getName().equals(name) && exercise.getMuscle().equals(muscle)){
                return exercise;
            }
        }
        return null;
    }
    public Exercise getMostBurnedCaloriesExercise(){
        if (exercises.size() <= 0){
            return null;
        }else{
            return Collections.max(exercises, Comparator.comparingInt(Exercise::getBurnedCalories));
        }
    }
    public String getStatistics(){
        StringBuilder builder = new StringBuilder();
        builder.append("Workout type: ").append(type);
        for (Exercise exercise : exercises){
            builder.append("\n");
            builder.append("Exercise: ").append(exercise.getName()).append(", ").append(exercise.getMuscle()).append(", ").append(exercise.getBurnedCalories());
        }
            return builder.toString();
    }




}
