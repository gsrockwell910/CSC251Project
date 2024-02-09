/**
   The Policy class models an insurance policy for one person
*/

public class Policy
{
   //Create all necessary fields, declared as private to encapsulate data
   private int policyNumber;
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
      policyNumber = 1;
      providerName = " ";
      holderFirstName = " ";
      holderLastName = " ";
      holderAge = 1;
      smokingStatus = " ";
      holderHeight = 1.00;
      holderWeight = 1.00;
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
   public Policy(int polNum, String provName, String first, String last,
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
   
   public void setPolicyNumber(int num)
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
   
   public int getPolicyNumber()
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
   
   public double getHolderBmi(double height, double weight)
   {
      return (weight * 703) / (Math.pow(height, 2));
   }
   
   /**
      The getPolicyPrice method calculates the policy price based on the holderAge, smokingStatus, holderHeight,
      holderWeight fields and the calculated holder BMI
      
      @param age     The policy holder age     
      @param smoke   The policy holder smoking status
      @param height  The policy holder height
      @param weight  The policy holder weight     
      
      @return        The calculated policy price
   */
   
   public double getPolicyPrice(int age, String smoke, double height, double weight)
   {
      //Constant to store base fee
      
      final double BASE_FEE = 600.00, 
                   AGE_FEE = 75.00, 
                   SMOKER_FEE = 100.00,
                   BMI = getHolderBmi(height, weight);
                   
      double total = BASE_FEE;
      
      //If statement to determine age fee if applicable 
      
      if (age > 50)
      {
         total += AGE_FEE;
      }
      else
      {
         total += 0.0;
      }
      
      //Switch statement to determine smoker fee if applicable
      
      switch(smoke)
      {
         case "smoker":
            total += SMOKER_FEE;
            break;
         case "non-smoker":
            total += 0.0;
            break;
         default:
            total += 0.0;
      }
      
      //If statement to determine BMI fee if applicable
      
      if (BMI > 35)
      {
         total += (BMI - 35) * 20;
      }
      else
      {
         total += 0.0;
      }
      
      //return total
      return total;
      
   }
   
   //End calculation methods
}