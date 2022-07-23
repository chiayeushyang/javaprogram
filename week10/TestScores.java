import javax.sound.sampled.FloatControl;

import javafx.beans.binding.DoubleExpression;

public class TestScores {

    private double[] scoresArray;
    

    TestScores(double[] scoresArray) {
        this.scoresArray = scoresArray;
    }
    
    public double Average() throws IllegalAccessException{

        double total = 0;
        for (double i : scoresArray) {
            if (i < 0 ){
                throw new IllegalArgumentException(i + " is negative number!!!");
            } else if(i > 100) {
                throw new IllegalArgumentException(i + " is bigger than 100!!!");
            } else {
                total += i ; 
            }
            
        }
        return total / scoresArray.length;
    }

    public static void main(String[] args) {
        double[] score = {12,29, 49, -19};
        TestScores test = new TestScores(score);

        try{
            System.out.println(test.Average());
        }catch (IllegalAccessException e) {
            System.out.println(e.getMessage());
        }
    }
}
