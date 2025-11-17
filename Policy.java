/**
 * The Policy class stores information about an insurance policy and
 * provides methods to calculate the policyholder's BMI and the cost
 * of the policy.
 */
public class Policy {

   //declare instance variables
   private String policyNumber;
   private String providerName;
   private String firstName;
   private String lastName;
   private int age;
   private String smokingStatus;
   private double heightInches;
   private double weightPounds;

   /**
    * No-arg constructor that initializes all fields to default values.
    */
   public Policy() {
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      heightInches = 0.0;
      weightPounds = 0.0;
   }

   /**
    * Constructor that accepts values for all fields.
    *
    * @param policyNumber   the policy number
    * @param providerName   the provider name
    * @param firstName      the policyholder's first name
    * @param lastName       the policyholder's last name
    * @param age            the policyholder's age
    * @param smokingStatus  the policyholder's smoking status
    * @param heightInches   the policyholder's height in inches
    * @param weightPounds   the policyholder's weight in pounds
    */
   public Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double heightInches, double weightPounds) {

      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName  = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.heightInches = heightInches;
      this.weightPounds = weightPounds;
   }

   //  Getters 

   /**
    * @return the policy number
    */
   public String getPolicyNumber() {
      return policyNumber;
   }

   /**
    * @return the provider name
    */
   public String getProviderName() {
      return providerName;
   }

   /**
    * @return the policyholder's first name
    */
   public String getFirstName() {
      return firstName;
   }

   /**
    * @return the policyholder's last name
    */
   public String getLastName() {
      return lastName;
   }

   /**
    * @return the policyholder's age
    */
   public int getAge() {
      return age;
   }

   /**
    * @return the policyholder's smoking status
    */
   public String getSmokingStatus() {
      return smokingStatus;
   }

   /**
    * @return the policyholder's height in inches
    */
   public double getHeightInches() {
      return heightInches;
   }

   /**
    * @return the policyholder's weight in pounds
    */
   public double getWeightPounds() {
      return weightPounds;
   }

   /**
    * Calculates and returns the BMI for this policyholder.
    *
    * @return the BMI value
    */
   public double getBMI() {
      return (weightPounds * 703) / (heightInches * heightInches);
   }

   //  Setters 

   /**
    * Sets the policy number. Any non-digit character will cause
    * the policy number to be set to the empty string.
    *
    * @param policyNumber the policy number to set
    */
   public void setPolicyNumber(String policyNumber) {
      boolean allDigits = true;

      for (int i = 0; i < policyNumber.length(); i++) {
         if (!Character.isDigit(policyNumber.charAt(i))) {
            allDigits = false;
            break;
         }
      }

      if (allDigits) {
         this.policyNumber = policyNumber;
      } else {
         this.policyNumber = "";
      }
   }

   /**
    * Sets the provider name.
    *
    * @param providerName the provider name to set
    */
   public void setProviderName(String providerName) {
      this.providerName = providerName;
   }

   /**
    * Sets the policyholder's first name.
    *
    * @param firstName the first name to set
    */
   public void setFirstName(String firstName) {
      this.firstName = firstName;
   }

   /**
    * Sets the policyholder's last name.
    *
    * @param lastName the last name to set
    */
   public void setLastName(String lastName) {
      this.lastName = lastName;
   }

   /**
    * Sets the policyholder's age. If the age is negative,
    * it is set to 0.
    *
    * @param age the age to set
    */
   public void setAge(int age) {
      if (age >= 0) {
         this.age = age;
      } else {
         this.age = 0;
      }
   }

   /**
    * Sets the policyholder's smoking status. Accepts "smoker"
    * or "non-smoker" (any case). Any other value defaults
    * to "non-smoker".
    *
    * @param smokingStatus the smoking status to set
    */
   public void setSmokingStatus(String smokingStatus) {
      if (smokingStatus.equalsIgnoreCase("non-smoker")) {
         this.smokingStatus = "non-smoker";
      } else if (smokingStatus.equalsIgnoreCase("smoker")) {
         this.smokingStatus = "smoker";
      } else {  // default to non-smoker
         this.smokingStatus = "non-smoker";
      }
   }

   /**
    * Sets the policyholder's height in inches. Negative values
    * are changed to 0.0.
    *
    * @param heightInches the height to set
    */
   public void setHeightInches(double heightInches) {
      if (heightInches >= 0) {
         this.heightInches = heightInches;
      } else {
         this.heightInches = 0.0;
      }
   }

   /**
    * Sets the policyholder's weight in pounds. Negative values
    * are changed to 0.0.
    *
    * @param weightPounds the weight to set
    */
   public void setWeightPounds(double weightPounds) {
      if (weightPounds >= 0) {
         this.weightPounds = weightPounds;
      } else {
         this.weightPounds = 0.0;
      }
   }

   /**
    * Calculates and returns the price of this insurance policy.
    * The base fee is 600. An extra fee is added if the age is
    * over 50, if the policyholder is a smoker, and if the BMI
    * is greater than 35.
    *
    * @return the cost of the policy
    */
   public double calculatePolicyCost() {
      double policyCost = 600.0;
      double ageFee = 75.0;
      double smokerFee = 100.0;

      if (age > 50) {
         policyCost += ageFee;
      }

      if (smokingStatus.equals("smoker")) {
         policyCost += smokerFee;
      }

      double BMI = getBMI(); //get the current BMI

      if (BMI > 35) {
         policyCost += (BMI - 35) * 20;
      }

      return policyCost;
   }
}
