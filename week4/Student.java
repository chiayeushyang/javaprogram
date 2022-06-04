public class Student
{
    String name;
    String studentID;

    public String getName() { //accessor method or getter method
        return name;
    }

    public void setName (String studName) { // mutator method or setter method
        name = studName; 
    }

    public String getStudentID() { //accessor method or getter method
        return studentID;
    }

    public void setStudentID(String studID){  // mutator method or setter method
        studentID = studID;
    }


        

    public static void main(String[] args) {
        Student stud = new Student();
        stud.setName("Alicia Tan");
        stud.setStudentID("2150162-BCS");
        System.out.println("Name: " + stud.getName() + "\nStudent ID: " + stud.getStudentID());

    }
}