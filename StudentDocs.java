/**
  *StudentDocs.java
  *@author Bryce Jones?
  *@since today
  *@version 1.8
 **/
public class Student {
   
private String name; 
private String firstName;
private String lastName;
private int gradYear;
private String email;
private boolean sports;
double gpa;

    /**
     * Constructor that sets the default values for each of the instance variables defined above 
     */

public Student() {
    name = "None";
    gradYear = 2037;
    email = name + gradYear + "@gbwl.org";
}
 /**
  * Constructor that assigns provided values to the object's instance variables, and creates an email address based on those values
  * @param initFName a String represnting the Student's first name
  * @param initlName a String represnting the Student's last name
  * @param initGradYear a String represnting the Student's graduation year
  */
public Student(String initFName, String initlName, int initGradYear){
    firstName = initFName;
    lastName = initlName;
    gradYear = initGradYear;
    email = firstName + "." + lastName + gradYear + "@gbwl.org";
}
    
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

    
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    public void setLastName(String newLastname) {
        lastName = newLastName;
    }
    public void setEmail(String newEmail) {
        email = newEmail;
    }
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    

   
    public void complain() {

        System.out.ptinln("I am getting no sleep");
    }
    public void doHomework(int numAssignments) {
        
        for (int i = numAssignments; i > 0; i--){
            System.out.println("Working");

        }
        System.out.println("Done.");
    }

    
}