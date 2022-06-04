public class Employee {
    
    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee() {
        this.name = "";
        this.idNumber = 0;
        this.department = "";
        this.position = "";
    }

    public Employee(String name, int idNumber) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = "";
        this.position = "";
    }
    
    public Employee(String name, int idNumber, String department, String position) {
        this.name = name;
        this.idNumber = idNumber;
        this.department = department;
        this.position = position;
    }
    
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }


    public static void main (String [] args) {

        Employee emp1 = new Employee("Elizabeth Swann", 47888 , "Accounting" , "Vice Presiden");
        Employee emp2 = new Employee("Will Turner" ,10101 , "IT" , "Programmer");
        Employee emp3 = new Employee("Jack Sparrow" , 81774 , "Manufacturing" , "Engineer");

        System.out.println();
        System.out.println("Name\t\t\t" + "ID Number\t" + "Department\t\t" + "Position\t");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(emp1.getName() + "\t\t" + emp1.getIdNumber() + "\t\t"  + emp1.getDepartment() + "\t\t"  + emp1.getPosition());
        System.out.println(emp2.getName() + "\t\t" + emp2.getIdNumber() + "\t\t"  + emp2.getDepartment() + "\t\t\t"  + emp2.getPosition());
        System.out.println(emp3.getName() + "\t\t" + emp3.getIdNumber() + "\t\t"  + emp3.getDepartment() + "\t\t"  + emp3.getPosition());
        System.out.println();
    }
}
