package cr.ac.ucr.sa.examen2ing;


public class Facade {
    public void viewUpperBodyWorkout() {
        Workout workout = new UpperBody();
        workout.setWorkout();
        workout.viewWorkout();
    }

    public void viewLowerBodyWorkout() {
        Workout workout = new LowerBody();
        workout.setWorkout();
        workout.viewWorkout();
    }

}
