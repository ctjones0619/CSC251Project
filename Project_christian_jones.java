import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;
import java.io.IOException;

public class Project_christian_jones {

   public static void main(String[] args) throws IOException {

      ArrayList<Policy> policies = new ArrayList<Policy>();

      // open the PolicyInformation.txt file (must be in same folder as .java files)
      File file = new File("PolicyInformation.txt");
      Scanner fileScanner = new Scanner(file);

      // read until there is no more data
      while (fileScanner.hasNextLine()) {

         // read first line (policy number) and SKIP blank separator lines
         String policyNumber = fileScanner.nextLine();

         // if this line is blank, go to the next iteration
         if (policyNumber.trim().isEmpty()) {
            continue;
         }

         String providerName   = fileScanner.nextLine();
         String firstName      = fileScanner.nextLine();
         String lastName       = fileScanner.nextLine();
         int age               = Integer.parseInt(fileScanner.nextLine());
         String smokingStatus  = fileScanner.nextLine();
         double heightInches   = Double.parseDouble(fileScanner.nextLine());
         double weightPounds   = Double.parseDouble(fileScanner.nextLine());

         // create Policy object
         Policy p = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus,heightInches, weightPounds);

                              
                               
         // use setters for validation (per original project)
         p.setPolicyNumber(policyNumber);
         p.setProviderName(providerName);
         p.setFirstName(firstName);
         p.setLastName(lastName);
         p.setAge(age);
         p.setSmokingStatus(smokingStatus);
         p.setHeightInches(heightInches);
         p.setWeightPounds(weightPounds);

         policies.add(p);
      }

      fileScanner.close();

      int smokerCount = 0;
      int nonSmokerCount = 0;

      // display info for each policy
      for (Policy p : policies) {

         System.out.println("Policy Number: " + p.getPolicyNumber());
         System.out.println("Provider Name: " + p.getProviderName());
         System.out.println("Policyholder's First Name: " + p.getFirstName());
         System.out.println("Policyholder's Last Name: " + p.getLastName());
         System.out.println("Policyholder's Age: " + p.getAge());
         System.out.println("Policyholder's Smoking Status (smoker/non-smoker): "
                            + p.getSmokingStatus());
         System.out.println("Policyholder's Height: " + p.getHeightInches() + " inches");
         System.out.println("Policyholder's Weight: " + p.getWeightPounds() + " pounds");
         System.out.printf("Policyholder's BMI: %.2f%n", p.getBMI());
         System.out.printf("Policy Price: $%.2f%n", p.calculatePolicyCost());
         System.out.println();

         if (p.getSmokingStatus().equalsIgnoreCase("smoker")) {
            smokerCount++;
         } else {
            nonSmokerCount++;
         }
      }

      System.out.println("The number of policies with a smoker is: " + smokerCount);
      System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
   }
}
