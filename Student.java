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
private int gradYear;
private String email;
private boolean sports;
double gpa;

    //2.CONSTRUCTION (manuals for setting up an object)
public Student() {
    name = "None";
    gradYear = "2037";
    email = name + gradYear + "@gbwl.org";
}
//Constuctor with PARAMETERS (user provided key data)
//Job: initialize instance variables to PROVIDED values
public Student(String initFName, String initlName, int initGradYear){
    fName = initFName;
    lName = initlName;
    gradYear = initGradYear;
    email = fname + "." + lName + gradYear + "@gbwl.org";
}
    // 3. METHODS (behaviors associated with that object)
    
    
    
}