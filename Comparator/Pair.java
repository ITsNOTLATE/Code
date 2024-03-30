package Comparator;

public class Pair {
    int food;
    int calories;

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public Pair(int food, int calories) {
        this.food = food;
        this.calories = calories;
    }
}
