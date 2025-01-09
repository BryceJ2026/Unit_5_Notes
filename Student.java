/*Example CLASS that defines an object
Class names like Student are always capitalized
Object-Orianited Classes are like BLUEPRINTS
(in another Java Class, you create instances from this blueprint)
*/
public class Student {
    // 1. INSTANCE VARIABLE (attributes/data)
    //think of what this object needs to know
    //must be PRIVATE ("encapsulation")
private String name; //"A student has a name"
private String firstName;
private String lastName;
private int gradYear;
private String email;
double gpa;
//STATIC variables for data that should only have ONE COPY for an entire class
private static int currentYear = 2025;
private static String schoolName = "BWL";
private static int studentCount = 0;
//static does not mean unchaing/constant
//instead, the keyword FINAL would be used

    //2.CONSTRUCTION (manuals for setting up an object)

    //DEFAULT consturctor (user did not provide data)
    //"no-arguement" constructor

public Student() {
    this.firstName = "First";
    this.lastName = "Last";
    gradYear = 2037;
    email = firstName + "." + lastName + gradYear + "@gbwl.org";
    //increment the student object ccounter STATIC variable
    // do not use this.studentCount because it is data belonging to the CLASS, not an object instance
    studentCount++;
}
//Constuctor with PARAMETERS (user provided key data)
//Job: initialize instance variables to PROVIDED values
//ORDER OF PARAMETERS IS IMPORTANT!!! (the data types)
//"initFirstName", etc. are like PLACEHOLDERS for real values
public Student(String firstName, String lastName, int gradYear){
    //THIS keyword indicates CURRENT CALLING OBJECT
    this.firstName = initFName;
    this.lastName = initlName;
    this.gradYear = initGradYear;
    this.email = firstName + "." + lastName + gradYear + "@gbwl.org";
    //increment the student object counter static variable
    studentCount++;
}
    // 3. METHODS (behaviors associated with that object)
    
    //toString method provides a "Sting Representation"
    //of an object instance with all its data!
    public String toString(){
        return ("Student[" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }

    public String getFirstName(){
return firstName;
    }
    public String getLastName(){
return lastName;
    }
    public int getGradYear(){
        return gradYear;
    }
    public String getEmail(){
        return email;
    }

    //MUTATOR METHODS ("Setters") accept a nnew value
    // and change the instance variable to it
    //Setters are VOID meaning NO RETURN VALUE (output)
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }
    public void setEmail(String newEmail) {
        email = newEmail;
    }
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    //OTHER METHOD (behaviors/actions assciated with the object)

    //Example: VOID method, no parameters
    public void complain() {
//Method BODY is the step(s) for this process
        System.out.println("I am getting no sleep");
    }
    public void doHomework(int numAssignments) {
        //Printa message for each assignment completed
        for (int i = numAssignments; i > 0; i--){
            System.out.println("Working");

        }
        System.out.println("Done.");
    }
// Example interact with a static variable
//METHODS can also be STATIC - menaing tat the beahavior/ action
public static void printObjectCount(){
    System.out.println(studentCount);

}
    
}