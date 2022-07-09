import java.util.Array;

import javafx.beans.binding.DoubleExpression;

public interface Analysis {
    public double getAverage (double score[]);
    public double getHighest (double score[]);
    public double getLowest (double score[]);

    public static void main(String[] args) {
        
    }
}

class TestAnalysia {
    public double getAverage(double score[]) {
        double total=0;
        for (double i : score) {
            total += i;
        }
        return total / score.length;
    }

    public double getHighest(double score[]) {


    }

    public double getLowest(double score[]) {


    }
}