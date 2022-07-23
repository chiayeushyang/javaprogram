public class MyException extends Exception {

    MyException() {
        super("Input with zero value");
    }

    public static void main(String[] args) {

        try { // exeption caught using try-catch
            String inputStr = "-1";
            int input = Integer.parseInt(inputStr);
            checkInputValue(input);
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Input value > 0");
        } catch (NumberFormatException ex) {
            System.out.println(ex.getMessage());
        } catch(Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("finally statement");
        }
       

        System.out.println("Next Statement ");
    }

    public static void checkInputValue(int value)
            throws MyException, Exception { // declare to be thrown

        if (value == 0) {
            throw new MyException();
        } // create a new exception object
        else if (value < 0) {
            throw new Exception("Value is less than 0");
        }
    }
}
