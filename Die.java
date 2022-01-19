import java.util.Scanner;

public class Die {
    private int sides, value;

    public Die() {
        this.sides = 6;
    }

    public Die(int sides) {
        this.sides = sides;
    }

    public void roll() {
        this.value = ((int) (Math.random() * sides)) + 1;
    }

    public int getValue() { 
        this.roll();
        return value;
    }
}