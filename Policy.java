public class Policy{
  
  
  //declare instance variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double heightInches;
      double weightPounds;
      double policyCost;
   
   /**
   Create no-arg constructor
   **/
   
   Policy(){
      policyNumber = "";
      providerName = "";
      firstName = "";
      lastName = "";
      age = 0;
      smokingStatus = "";
      heightInches = 0.0;
      weightPounds = 0.0;
      double policyCost = 0.0;
   }
   
   /**
   Create constructor that accepts arguments
   **/
   
   Policy(String policyNumber, String providerName, String firstName, String lastName, int age, String smokingStatus, double heightInches, double weightPounds){
      this.policyNumber = policyNumber;
      this.providerName = providerName;
      this.firstName = firstName;
      this.lastName  = lastName;
      this.age = age;
      this.smokingStatus = smokingStatus;
      this.heightInches = heightInches;
      this.weightPounds = weightPounds;
      
      
   }
   
   /**
   Include appropriate getters
   **/
      public String getPolicyNumber(){
         return policyNumber;
      }
      public String getProviderName(){
         return providerName;
      }
      public String getFirstName(){
         return firstName;
      }
      public String getLastName(){
         return lastName;
      }
      public int getAge(){
         return age;
      }
      public String getSmokingStatus(){
         return smokingStatus;
      }
      public double getHeightInches(){
         return heightInches;
      }
      public double getWeightPounds(){
         return weightPounds;
      }
      public double getBMI(){
         return (weightPounds * 703) / (heightInches * heightInches);
      }

      
      
   /**
   Include appropriate setters
   **/  
      
      public void setPolicyNumber(String policyNumber){
         this.policyNumber = policyNumber;
         for (int i = 0; i < policyNumber.length() -1; i++){
            if (Character.isDigit(policyNumber.charAt(i))){  //check each character in the string to make sure it is 1-9
            this.policyNumber = policyNumber;
            }else{
            this.policyNumber = ""; //if invalid set to blank string
            }
         }
      }
      
      public void setProviderName(String providerName){
         this.policyNumber = policyNumber;
      }
      
      public void setFirstName(String firstName){
         this.firstName = firstName;
      }
      
      public void setLastName(String lastName){
         this.firstName = firstName;
      }
      
      public void setAge(int age){
         if (age >= 0){
         this.age = age;
         }else age = 0;
      }
      
      public void setSmokingStatus(String smokingStatus){
         if (smokingStatus.equalsIgnoreCase("Non-smoker")){
         this.smokingStatus = "non-smoker";
         }else if (smokingStatus.equalsIgnoreCase("Smoker")){
         this.smokingStatus = "smoker";
         }else { //default to non-smoker
         this.smokingStatus = "non-smoker";
         }
         
      }
      
      
      public void setHeightInches(double heightInches){
         if (heightInches >= 0){
         this.heightInches = heightInches;
         } else this.heightInches = 0.0; //default and fall back case
      }
      
      public void setWeightPounds(double weightPounds){
         if (weightPounds >= 0){
         this.weightPounds = weightPounds;
         } else this.weightPounds = 0.0; //default and fall back case

      }
      
      //set BMI not needed due to getBMI existing, can always calculate fresh//
   
   
   /**
   Method that calculates and returns the BMI of the policyholder
   
   question : is this still needed even with the existence of getBMI??
   **/
     
   /**
   Method that calculates and returns the price of the insurance policy
   **/
   
  public double calculatePolicyCost(){
   double policyCost = 600.0;
   double ageFee = 75.0;
   double smokerFee = 100.0;
   double BMI;
   
      if (age > 50){
      policyCost += ageFee;
      }
      if(smokingStatus.equals("smoker")){
      policyCost += smokerFee;
      }
      BMI = getBMI(); //get the current BMI
      if(BMI > 35){
      policyCost += (BMI - 35) * 20;
      }
   return policyCost;
  }
  
  ?
      
  
   
   
}