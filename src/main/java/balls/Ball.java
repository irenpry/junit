/**
 * This is part of Lec01_01: Environment Setup and Java Introduction.
 */
package balls;

import java.awt.Color;
import java.util.Comparator;
import java.util.Objects;
import java.lang.*;

/**
 * This is a simple object that has a volume.
 */
// You may not make Ball implement the Comparable interface.
public class Ball implements Comparable {

    private double volume;
    private Color color;

    /**
     * Constructor that creates a new ball object with the specified volume and color.
     * @param volume the volume of the new ball object
     * @param color the color of the new ball object
     */
    public Ball(double volume, Color color) {
        this.volume = volume;
        this.color = color;
    }

    /**
     * Constructor that creates a new ball object with the specified volume given by a string.
     * @param volume A string representing the volume of the new object.
     */
    public Ball(String volume, Color color) {
        this(Ball.parseStringToDouble(volume),color);
    }

    private static double parseStringToDouble(String volume) {
        StringBuilder dbl = new StringBuilder();
        for (char c : volume.toCharArray()) {
            if (Character.isDigit(c) || c == 'e' || c == '.') {
                dbl.append(c);
            }
        }
        return Double.parseDouble(dbl.toString());
    }

    /**
     * Returns the volume of the ball.
     * @return the volume of the ball.
     */
    public double getVolume() {
        return volume;
    }

    /**
     * Returns the color of the ball.
     * @return the color of the ball.
     */
    public Color getColor() {
        return color;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Ball ball = (Ball) o;
//        return Double.compare(ball.volume, volume) == 0 && color.equals(ball.color);
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(volume, color);
//    }

    @Override
    public int compareTo(Object o) {
        Ball ball = (Ball) o;
        if (this.equals(ball)) {
            return 0;
        } else if (this.getVolume() > ball.getVolume()) {
            return 1;
        } else {
            return -1;
        }
    }
}