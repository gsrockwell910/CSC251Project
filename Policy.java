/**
   The Policy class models an insurance policy for one person
*/

public class Policy
{
   //Create all necessary fields, declared as private to encapsulate data
   private String policyNumber;
   private String providerName;
   public static int numPol = 0;
   private PolicyHolder policyHolder;
   
   /**
      No-arg constructor
      
      The Policy no-arg constructer assigns default values to all of the Policy classes fields, 
      if no arguments are given when creating a policy object
   */
   public Policy()
   {
      policyNumber = "";
      providerName = "";
      policyHolder = new PolicyHolder();
      
      numPol++;
   }
   
   /**
      Constructor
      
      The Policy constructor constructs a Policy object with provided arguments
      
      @param polNum     The holders policy number
      @param provName   The name of the insurance provider
   */
   public Policy(String polNum, String provName, PolicyHolder polHol)
   {
      this.policyNumber = polNum;
      this.providerName = provName;
      this.policyHolder = new PolicyHolder(polHol);
      
      numPol++;
   }
   
   //Start mutator methods
   
   /**
      The setPolicyNumber method allows the policy number to be set with a given argument
      
      @param num     The policy number to be set
   */
   
   public void setPolicyNumber(String num)
   {
      this.policyNumber = num;
   }
   
   /**
      The setProviderName method allows the insurance provider name to be set with a given argument
      
      @param pName     The insurance provider name to be set
   */
   
   public void setProviderName(String pName)
   {
      this.providerName = pName;
   }
   
   /**
      The setPolicyHolder method allows the policy holder to be set with a given argument
      
      @param polHol     a PolicyHolder object
   */
   
   public void setPolicyHolder(PolicyHolder polHol)
   {
      this.policyHolder = new PolicyHolder(polHol);
   }

   //End mutator methods
     
   //Start accessor methods
   
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
      The getPolicyHolder method returns a copy of the values stored in the policyHolder field
      
      @return     the policyHolder field
   */
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder);
   }

   //End accessor methods
   
   //Start calculation methods
      
   /**
      The getPolicyPrice method calculates the policy price based on the holderAge, 
      smokingStatus, holderHeight, sholderWeight fields and the calculated holder BMI     
      
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
      
      if (policyHolder.getHolderAge() > AGE_THRESHOLD)
      {
         total += AGE_FEE;
      }
      
      if(policyHolder.getSmokingStatus().equalsIgnoreCase("smoker"))
      {
         total += SMOKER_FEE;
      }
      
      //If statement to determine BMI fee if applicable
      
      if (policyHolder.getHolderBmi() > BMI_THRESHOLD)
      {
         total += (policyHolder.getHolderBmi() - BMI_THRESHOLD) * BMI_FEE;
      }
      
      //return total
      return total; 
   }
   
   //End calculation methods
   
   //Start toString method
   
   /**
      The toString method returns the string representation of an object.
   */
   public String toString()
   {
      return String.format("Policy Number: " + policyNumber +
                           "\nProvider Name: " + providerName +
                           "\n" + policyHolder +
                           "\nPolicy Price: $%.2f", getPolicyPrice());
   }
   
   //End toString method
}