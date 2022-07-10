
import java.lang.reflect.Array;

import javax.naming.ldap.SortControl;

import javafx.beans.binding.DoubleExpression;

public interface Analysis {
    public double getAverage ();
    public double getHighest ();
    public double getLowest ();

    public static void main(String[] args) {
        double[] scores = { 3, 6, 87, 35, 33, 99, 105, 39 };
        TestAnalysia test1 = new TestAnalysia(scores);
        test1.getScore();
        System.out.println("\n" + test1.getAverage());
        System.out.println(test1.getHighest());
        System.out.println(test1.getLowest());
}

class TestAnalysia implements Analysis {
    private double[] score;

    TestAnalysia(double[] score) {
        this.score = score;
    }
    
    public void getScore() {
        for (double i : this.score) {
            System.out.print(i + " - ");
        }
    }

    public void setScore(double[] score) {
        this.score = score;
    }

    public double getAverage() {
        double total = 0;
        for (double i : this.score) {
            total += i;
        }
        return total / score.length;
    }

    public double getHighest() {
        double highest = this.score[0];
        for (double i : this.score) {
            if (i >= highest) {
                highest = i;
            }
        }
        return highest;
    }

    public double getLowest() {
        double lowest = this.score[0];
        for (double i : this.score) {
            if (i <= lowest) {
                lowest = i;
            }
        }
        return lowest;
    }
}
}

// import java.util.Arrays;

// public interface Analysis {
//     public double getAverage(double[] scores);

//     public double getHighest(double[] scores);

//     public double getLowest(double[] scores);

//     public static void main(String[] args) {
//         TestAnalysis ts = new TestAnalysis();

//         double[] scores = { 2, 3, 51, 5, 42, 6, 99 };
//         System.out.println(ts.getAverage(scores));
//         System.out.println(ts.getHighest(scores));
//         System.out.println(ts.getLowest(scores));
//     }
// }

// class TestAnalysis implements Analysis {
//     public double getAverage(double[] scores) {
//         double total = 0;
//         for (double d : scores) {
//             total += d;
//         }
//         return total / scores.length;
//     }

//     public double getHighest(double[] scores) {
//         Arrays.sort(scores);
//         return scores[scores.length - 1];
//     }

//     public double getLowest(double[] scores) {
//         Arrays.sort(scores);
//         return scores[0];
//     }
// }