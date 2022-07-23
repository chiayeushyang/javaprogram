public class InvalidTestScore extends Exception {

    InvalidTestScore(String message) {
        super (message);
    }

    public static void main(String[] args) {
        double[] score = {12,29, 49, -1};
        TestScores test = new TestScores(score);

        try{
            System.out.println("Average = " + test.Average());
        }catch (InvalidTestScore e) {
            System.out.println(e.getMessage());
        }
    }
}

class TestScores {

    private double[] scoresArray;
    

    TestScores(double[] scoresArray) {
        this.scoresArray = scoresArray;
    }
    
    public double Average() throws InvalidTestScore{

        double total = 0;
        for (double i : scoresArray) {
            if (i < 0 ){
                throw new InvalidTestScore("Error: " + i + " is negative number!!!");
            } else if(i > 100) {
                throw new InvalidTestScore("Error: " + i + " is bigger than 100!!!");
            } else {
                total += i ; 
            }
            
        }
        return total / scoresArray.length;
    }
}
