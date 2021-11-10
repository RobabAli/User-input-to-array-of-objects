public class Student {
    // Data Fields
    private String name;
    private int id;
    private double cgpa;
    private double CreditPassed;
    public int numberOfStudents;

    // Default Constructor
    public Student(){

    }

    // Argument constructor
    public Student(String name, int id){
        this.name = name;
        this.id = id;
    }


    // Overloaded Constructor
    public Student(String name, int id, double cgpa, double CreditPassed){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
        this.CreditPassed = CreditPassed;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCgpa(double cgpa){
        this.cgpa = cgpa;
    }

    public void setCreditPassed(double CreditPassed){
        this.CreditPassed = CreditPassed;
    }

    // Getters
    public String getName(){
        return name;
    }

    public int getId(){
        return id;
    }

    public double getCgpa(){
        return cgpa;
    }

    public double getCreditPassed(){
        return CreditPassed;
    }

    public int getNumberOfStudent(){
        return numberOfStudents;
    }

    public String toString(){
        return "Name: " + name + "\nID: " + id + "\nCGPA: " + cgpa + "\nCredits Passed: " + CreditPassed + "\n";

    }





}
