public class Project_christian_jones{

   public static void main(String [] args){
   
   Policy p1 = new Policy(); // no arg constructor object
   System.out.print("This is p1 age: " + p1.getAge());
   
   Policy p2 = new Policy("12345", "Blue Cross", "Christian", "Jones", 22, "non-smoker", 74.0, 210);
   System.out.println("\n This is the height of p2: " + p2.getHeightInches());
   p2.getWeightPounds();
   
   System.out.println("\nThis is Christian's BMI : " + p2.getBMI());
   
   
   
   
   }

}