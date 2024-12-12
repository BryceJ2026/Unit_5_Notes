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
private boolean sports;
double gpa;

    //2.CONSTRUCTION (manuals for setting up an object)

    //DEFAULT consturctor (user did not provide data)
    //"no-arguement" constructor

public Student() {
    name = "None";
    gradYear = 2037;
    email = name + gradYear + "@gbwl.org";
}
//Constuctor with PARAMETERS (user provided key data)
//Job: initialize instance variables to PROVIDED values
//ORDER OF PARAMETERS IS IMPORTANT!!! (the data types)
//"initFirstName", etc. are like PLACEHOLDERS for real values
public Student(String initFName, String initlName, int initGradYear){
    firstName = initFName;
    lastName = initlName;
    gradYear = initGradYear;
    email = firstName + "." + lastName + gradYear + "@gbwl.org";
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
    
}