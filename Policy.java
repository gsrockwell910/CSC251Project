/**
   The Policy class models an insurance policy for one person
*/

public class Policy
{
   //Create all necessary fields, declared as private to encapsulate data
   private String policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   /**
      No-arg constructor
      
      The Policy no-arg constructer assigns default values to all of the Policy classes fields, 
      if no arguments are given when creating a policy object
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      smokingStatus = "";
      holderHeight = 0;
      holderWeight = 0;
   }
   
   /**
      Constructor
      
      The Policy constructor constructs a Policy object with provided arguments
      
      @param polNum     The holders policy number
      @param provName   The name of the insurance provider
      @param first      The policy holders first name
      @param last       The policy holders last name
      @param age        The policy holders age
      @param smokeStat  The policy holders smoking status
      @param height     The policy holders height in inches
      @param weight     The policy holders weight in pounds
   */
   public Policy(String polNum, String provName, String first, String last,
                 int age, String smokeStat, double height, double weight)
   {
      policyNumber = polNum;
      providerName = provName;
      holderFirstName = first;
      holderLastName = last;
      holderAge = age;
      smokingStatus = smokeStat;
      holderHeight = height;
      holderWeight = weight;
   }
   
   //Start accessor methods
   
   /**
      The setPolicyNumber method allows the policy number to be set with a given argument
      
      @param num     The policy number to be set
   */
   
   public void setPolicyNumber(String num)
   {
      policyNumber = num;
   }
   
   /**
      The setProviderName method allows the insurance provider name to be set with a given argument
      
      @param pName     The insurance provider name to be set
   */
   
   public void setProviderName(String pName)
   {
      providerName = pName;
   }
   
   /**
      The setHolderFirstName method allows the holder first name to be set with a given argument
      
      @param fName     The holder first name to be set
   */
   
   public void setHolderFirstName(String fName)
   {
      holderFirstName = fName;
   }
   
   /**
      The setHolderLastName method allows the holder last name to be set with a given argument
      
      @param lName     The holder last name to be set
   */
   
   public void setHolderLastName(String lName)
   {
      holderLastName = lName;
   }
   
   /**
      The setHolderAge method allows the holder age to be set with a given argument
      
      @param a     The holder age to be set
   */
   
   public void setHolderAge(int a)
   {
      holderAge = a;
   }
   
   /**
      The setSmokingStatus method allows the holder smoking status to be set with a given argument
      
      @param smoke     The holder smoking status to be set
   */
   
   public void setSmokingStatus(String smoke)
   {
      smokingStatus = smoke;
   }

   /**
      The setHolderHeight method allows the holder height to be set with a given argument
      
      @param h     The holder height to be set
   */
   
   public void setHolderHeight(double h)
   {
      holderHeight = h;
   }
   
   /**
      The setHolderWeight method allows the holder weight to be set with a given argument
      
      @param w     The holder weight to be set
   */
   
   public void setHolderWeight(double w)
   {
      holderWeight = w;
   }

   //End accessor methods
   
   //Start mutator methods
   
   /**
      The getPolicyNumber method gets the value stored in the policyNumber field
      
      @return     The value stored in the policyNumber field
   */
   
   public String getPolicyNumber()
   {
      return policyNumber;
   }
   
   /**
      The getProviderName method gets the value stored in the providerName field
      
      @return     The value stored in the policyNumber field
   */
   
   public String getProviderName()
   {
      return providerName;
   }
   
   /**
      The getHolderFirstName method gets the value stored in the holderFirstName field
      
      @return     The value stored in the holderFirstName field
   */
   
   public String getHolderFirstName()
   {
      return holderFirstName;
   }
   
   /**
      The getHolderLastName method gets the value stored in the holderLastName field
      
      @return     The value stored in the holderLastName field
   */
   
   public String getHolderLastName()
   {
      return holderLastName;
   }
   
   /**
      The getHolderAge method gets the value stored in the holderAge field
      
      @return     The value stored in the holderAge field
   */
   
   public int getHolderAge()
   {
      return holderAge;
   }
   
   /**
      The getSmokingStatus method gets the value stored in the smokingStatus field
      
      @return     The value stored in the smokingStatus field
   */
   
   public String getSmokingStatus()
   {
      return smokingStatus;
   }
   
   /**
      The getHolderHeight method gets the value stored in the holderHeight field
      
      @return     The value stored in the holderHeight field
   */
   
   public double getHolderHeight()
   {
      return holderHeight;
   }
   
   /**
      The getHolderWeight method gets the value stored in the holderWeight field
      
      @return     The value stored in the holderWeight field
   */
   
   public double getHolderWeight()
   {
      return holderWeight;
   }
   
   //End mutator methods
   
   //Start calculation methods
   
   /**
      The getHolderBmi method calculates the holder BMI based on the holderHeight and holderWeight fields
      
      @param height     The policy holder height
      @param weight     The policy holder weight
      
      @return           The policy holders calculated BMI
   */
   
   public double getHolderBmi()
   {
      final int CONVERSION_FACTOR = 703;
      
      return (holderWeight * CONVERSION_FACTOR) / (holderHeight * holderHeight);
   }
   
   /**
      The getPolicyPrice method calculates the policy price based on the holderAge, 
      smokingStatus, holderHeight, sholderWeight fields and the calculated holder BMI
      
      @param age     The policy holder age     
      @param smoke   The policy holder smoking status
      @param height  The policy holder height
      @param weight  The policy holder weight     
      
      @return        The calculated policy price
   */
   
   public double getPolicyPrice()
   {
      //Constants to store fees
      
      final double BASE_FEE = 600.00, 
                   AGE_FEE = 75.00, 
                   SMOKER_FEE = 100.00,
                   BMI_FEE = 20.00;
                   
      final int AGE_THRESHOLD = 50,
                BMI_THRESHOLD = 35;
                   
      double total = BASE_FEE;
      
      //If statement to determine age fee if applicable 
      
      if (holderAge > AGE_THRESHOLD)
      {
         total += AGE_FEE;
      }
      
      if(smokingStatus.equalsIgnoreCase("smoker"))
      {
         total += SMOKER_FEE;
      }
      
      //If statement to determine BMI fee if applicable
      
      if (getHolderBmi() > BMI_THRESHOLD)
      {
         total += (getHolderBmi() - BMI_THRESHOLD) * BMI_FEE;
      }
      
      //return total
      return total; 
   }
   
   //End calculation methods
   
   //Start display method
   
   /**
      The display Information method displays all information related to a users policy.
   */
   public void displayInformation()
   {
      System.out.println("\nPolicy Number: " + getPolicyNumber());
      System.out.println("\nProvider Name: " + getProviderName());
      System.out.println("\nPolicyholder's First Name: " + getHolderFirstName());
      System.out.println("\nPolicyholder's Last Name: " + getHolderLastName());
      System.out.println("\nPolicyholder's Age: " + getHolderAge());
      System.out.println("\nPolicyholder's Smoking Status (smoker/non-smoker): " + getSmokingStatus());
      System.out.println("\nPolicyholder's Height: " + getHolderHeight() + " inches");
      System.out.println("\nPolicyholder's Weight: " + getHolderWeight() + " pounds");
      System.out.printf("\nPolicyholder's BMI: %.2f", getHolderBmi());                                                                     
      System.out.printf("\n\nPolicy Price: $%,.2f", getPolicyPrice());
   }
   
   //End display method
}