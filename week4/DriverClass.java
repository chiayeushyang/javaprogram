public class DriverClass {
    
    public static void main(String [] args) {
        Student stud = new Student();
        stud.setName("Alicia Tan");
        stud.setStudentID("2150162-BCS");
        System.out.println("Name: " + stud.getName() + "\nStudent ID: " + stud.getStudentID());

        Student stud2 = new Student("Yeu Shyang", "2220407-BSE");
        System.out.println("Name: " + stud2.getName() + "\nStudent ID: " + stud2.getStudentID());
;
        Student stud3 = new Student("Jin Lee", "2109123");
        // stud3.name ="HJK"; // cannot access because name is private in student class
        // stud3.studentID = "ABC"; // cannot access because studentID is private in studnet class
        stud3.setName("BCE");
        stud3.setStudentID("BCE");

        System.out.println("Name: " + stud3.getName() + "\nStudent ID: " + stud3.getStudentID());
    }

}
