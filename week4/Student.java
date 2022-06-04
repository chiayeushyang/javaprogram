
public class Student
{
    String name; //instance field
    String studentID;


    public Student(){

    }//no argument constructor

    public Student(String studName, String studID){
        name = studName;
        studentID = studID;   
    }

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

        Student stud2 = new Student("Yeu Shyang", "2220407-BSE");
        System.out.println("Name: " + stud2.getName() + "\nStudent ID: " + stud2.getStudentID());

    }
}