public class Students {
    String firstName;
    String lastName;
    int gradYear;
    double gpa;
    String declaredMajor;

    public Students(String firstName, String lastName, int gradYear, double gpa, String declaredMajor){
        this.firstName = firstName;
        this.lastName = lastName;
        this.gradYear = gradYear;
        this.gpa = gpa;
        this.declaredMajor = declaredMajor;
    }

    public int addYear(){
        return (this.gradYear + 1);
    }
    
}
