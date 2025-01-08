public class Main {
//This is the "TESTER CLASS" with a main method
// main method is STATIC ecause a class ("program") should only have one entry print
//(reminder) the MAIN METHOD is what executed when the Run buttonis pressed
   public static void main(String []args) {
      System.out.println("Constructing Student objects...");


      //Call DEFAULT CONSTRUCTOR
      Student kinder = new Student();


      //Call CONSTRUCTOR with PARAMETERS (String, String, int)
      Student junior = new Student("Bryce" , "Jones" , 2026);
//Order matters
      //Student senior = new Student(2025,"Zoie", "Vitale" )

      //Look at our consturcted Student objects
      System.out.println(kinder);
// Consturct two more Student objects and fill them out

// TEst ACESSOR/GETTER METHODS
String juniorEmail = junior.getEmail();
System.out.println(juniorEmail);

System.out.println(kinder.getEmail());

// Test
//void methods(no output)
// but they need an arguement (input)
kinder.setFirstName("Horah");
kinder.setLastName("Loux");
System.out.println(kinder);
// I didn't need to setGradYear because the Default Constructor gave an appropriate value for this already (we chose 2037 as the dafault)
//Use the Object class' equals() method
boolean isEqual = junior.equals(kinder);

/// CALL our custom behavior methods
//Example:  no output, no input
junior.complain();
//Example: no output, NEEDS input
junior.doHomework(8);


//Testing the student class documenttation
// HOVER over the words to view the docs we wrote
StudentDocs test = new StudentDocs("Roaree", "Lion", 2025);
test.getEmail();
test.setGradYear(2025);
test.doHomework(10);


//Demonstrate use of STATIC methods (one copy) for a class
//Static methods are called on the CLASS name, NOT an object instance
Student.printObjectCount();

Student middleSchooler = new Student();
Student.printObjectCount();
   }
}

