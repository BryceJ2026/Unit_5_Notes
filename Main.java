public class Main {

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

Student sophmore = new Student("Random" , "Person" , 2027);

Student Freshman = new Student("Random" , "Person" , 2028);





   }
}
