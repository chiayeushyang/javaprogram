import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.swing.text.MutableAttributeSet;

public class Student implements Serializable{
    
    private String name, studentId; 

    Student (String name, String studentID) {
        this.name = name;
        this.studentId = studentID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }



    public static void main(String[] args) throws IOException, Exception {
        
        Student stud = new Student("John Lee", "A1234");

        FileOutputStream outStream = new FileOutputStream("Student.dat");
        ObjectOutputStream objectOutputFile = new ObjectOutputStream(outStream);
        objectOutputFile.writeObject(stud);

        FileInputStream inStream = new FileInputStream("Student.dat");
        ObjectInputStream objectInputFile= new ObjectInputStream(inStream);
        Student stud2 = (Student) objectInputFile.readObject();
        System.out.println("Student Name: " + stud2.getName() + "\n Student ID: " + stud2.getStudentId() );

    }
}
