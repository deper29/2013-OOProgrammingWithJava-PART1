/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author deper29
 */
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
    }

    public void next() {
        this.value++;
        if (this.value > this.upperLimit) {
            this.value = 0;
        }
    }

    public String toString() {
        if (this.value < 10) {
            return String.format("0%d", this.value);
        } else {
            return String.format("%d", this.value);
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (value >= 0 && value <= this.upperLimit) {
            this.value = value;
        } else {
            this.value = 0;
        }
    }
}
