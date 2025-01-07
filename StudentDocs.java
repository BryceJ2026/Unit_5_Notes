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
    /**
     * @return String representing the object instance and its variables
     */
    public String toString(){
        return ("Student[" + firstName + "," + lastName + "," + gradYear + "," + email + "]");
    }
/**
     * @return String representing the object's first name
     */
    public String getFirstName(){
return firstName;
    }
    /**
     * @return String representing the object's last name
     */
    public String getLastName(){
return lastName;
    }
    /**
     * @return String representing the object's grad year as an int
     */
    public int getGradYear(){
        return gradYear;
    }
    /**
     * @return String representing the object's email
     */
    public String getEmail(){
        return email;
    }

    /**
     * @param newFirstName - a String to change Student's first name
     */
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    /**
     * @param newFirstName - a String to change Student's last name
     */
    public void setLastName(String newLastname) {
        lastName = newLastName;
    }
    /**
     * @param newFirstName - a String to change Student's email
     */
    public void setEmail(String newEmail) {
        email = newEmail;
    }
    /**
     * @param newFirstName - an int to change Student's grad year
     */
    public void setGradYear(int newGradYear) {
        gradYear = newGradYear;
    }

    

   /**
     * Prints complaint message
     */
    public void complain() {

        System.out.ptinln("I am getting no sleep");
    }
    /**
     * Loos from numAssignments, decreasing till there are zero assignments left
     * @param numAssignments -  an int representing the amount of homework assignments to be compekted by the student
     */
    public void doHomework(int numAssignments) {
        
        for (int i = numAssignments; i > 0; i--){
            System.out.println("Working");

        }
        System.out.println("Done.");
    }

    
}