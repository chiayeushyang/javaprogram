import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    
    private String studName; 
    private String studID; 


    public Student() {

    }

    public Student(String studName, String studID) {
        this.studName = studName;
        this.studID = studID;
    }

    public String getStudName() {
        return this.studName;
    }

    public void setStudName(String studName) {
        this.studName = studName;
    }

    public String getStudID() {
        return this.studID;
    }

    public void setStudID(String studID) {
        this.studID = studID;
    }

    public static void displayName (Student... stud) {
        for (int i = 0; i < stud.length; i++ ) {
            System.out.println("Student " + (i+1) + ":" +stud[i].getStudName());
        }
    }

    public static int sum(int... value) {
        int total = 0;
        for (int i = 0; i < value.length; i++) {
            total += value[i];
        }
        return total;
    }
    

    public static void main(String[] args) {
       
        // Scanner kyb = new Scanner(System.in);

        // Student stud1 = new Student("Alice Tan", "A123");
        // System.out.println("Student name : " + stud1.getStudName());

       
        // //Student array
        // Student[] studArray = new Student[5];
        // for (int i=0 ; i < studArray.length; i++) {
        //     System.out.println("\nEnter " + "Student "   + (i + 1) + " Name & ID" +  ": ");
            
        //     System.out.print("Student Name :");
        //     String name = kyb.nextLine();
           
        //     System.out.print("Student ID : ");
        //     String id = kyb.nextLine();

        //     studArray[i] = new Student(name, id);
        //     // studArray[i] = new Student(); //calling no arg constructor
        //     // studArray[i].setStudID(id);
        //      // studArray[i].setStudName(name);

        // }
        // System.out.println("Student Name : " + studArray[0].getStudName());
        // System.out.println("\nStudent Name and ID : ");

        // for (Student stud : studArray) {
        //     System.out.println("Student Name : " + stud.getStudName());
        //     System.out.println("Student ID : " + stud.getStudID());
        // }

        // // for (int i=0; i< studArray.length; i++){
        // //     System.out.println("Student Name : " + studArray[i].getStudName());
        // // }

        // kyb.close();

        /*------------------------------------------------------------------------------------ */
            // Student stud = new Student("Alicia Tan", "A1234");
            // Student stud1 = new Student("Albert Lee", "A1235");
            // Student stud2 = new Student("Jen Li", "A1236");
            // displayName(stud);
            // displayName(stud, stud1);
            // displayName(stud, stud1, stud2);
            // System.out.println("Sum value is " + sum(1,2,3,4,5,6,7,8,9,10));
            // System.out.println("Sum value is " + sum(1,2,3,4,5));

        /* ----------------------------------------------------------------------------------- */

            Student [] studArray = new Student[3];
            studArray[0] = new Student("Alicia Tan", "A1234");
            studArray[1] = new Student("Albert Lee", "A1235");
            studArray[2]= new Student("Jen Li", "A1236");
            displayName(studArray);

            ArrayList <Student> nameList = new ArrayList<Student>();
            nameList.add(studArray[0]);
            nameList.add(new Student());
    }
}
