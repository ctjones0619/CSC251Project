import java.util.Scanner;

public class Project_christian_jones{

//create scanner object


   public static void main(String [] args){
   
   //create scanner object 
   Scanner keyboard = new Scanner(System.in);
  
  
   String policyNumber;
   String providerName;
   String firstName;
   String lastName;
   int age;
   String smokingStatus;
   double heightInches;
   double weightPounds;
   
   
   //collect input
  
  
   System.out.println("Please enter the Policy Number: "); 
   policyNumber = keyboard.nextLine();
  
   System.out.println("Please enter the Provider Name: ");
   providerName = keyboard.nextLine();
   
   System.out.println("Please enter the Policyholder's First Name: ");
   firstName = keyboard.nextLine();
   
   System.out.println("Please enter the Policyholder's Last Name: ");
   lastName = keyboard.nextLine();
   
   System.out.println("Please enter the Policyholder's Age: ");
   age = keyboard.nextInt();
   keyboard.nextLine(); //eats newline char
   
   System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
   smokingStatus = keyboard.nextLine();
   
   System.out.println("Please enter the Policyholder's Height (in inches): ");
   heightInches = keyboard.nextDouble();
   
   System.out.println("Please enter the Policyholder's Weight (in pounds): ");
   weightPounds = keyboard.nextDouble();
   
          
   
   
   //create new object p2
   Policy p2 = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, heightInches, weightPounds);
   
   
   
   //use setters to validate all input
   p2.setPolicyNumber(policyNumber);
   p2.setProviderName(providerName);
   p2.setFirstName(firstName);
   p2.setLastName(lastName);
   p2.setAge(age);
   p2.setSmokingStatus(smokingStatus);
   p2.setHeightInches(heightInches);
   p2.setWeightPounds(weightPounds);
   
   
   
   
   
   
   
   //print results
   System.out.println("Policy Number: " + policyNumber);
   System.out.println("Provider Name: " + providerName);
   System.out.println("Policyholder's First Name: " + firstName);
   System.out.println("Policyholder's Last Name: " + lastName);
   System.out.println("Policyholder's Age: " + age);
   System.out.println("Policyholder's Smoking Status: " + smokingStatus);
   System.out.println("Policyholder's Height: " + heightInches);
   System.out.println("Policyholder's Weight: " + weightPounds);
   System.out.printf("Policyholder's BMI: %.2f%n", + p2.getBMI() );
   System.out.printf("Policy Price: $%.2f%n", + p2.calculatePolicyCost() );

   
   
   
   }

}