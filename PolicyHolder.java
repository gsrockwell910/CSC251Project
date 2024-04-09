public class PolicyHolder
{
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
   /**
      No-arg constructor
      
      The PolicyHolder no-arg constructer assigns default values to all of the PolicyHolder classes fields, 
      if no arguments are given when creating a PolicyHolder object
   */
   public PolicyHolder()
   {
      holderFirstName = "";
      holderLastName = "";
      holderAge = 0;
      smokingStatus = "";
      holderHeight = 0.0;
      holderWeight = 0.0;
   }

   
   /**
      Constructor
      
      The PolicyHolder constructor constructs a PolicyHolder object with provided arguments
      
      @param f     The holders first name
      @param l     The holders last name
      @param a     The holders age
      @param smok  The holders smoking status
      @param h     The holders height
      @param w     The holders weight
   */

   public PolicyHolder(String f, String l, int a, String smok, double h, double w)
   {
      holderFirstName = f;
      holderLastName = l;
      holderAge = a;
      smokingStatus = smok;
      holderHeight = h;
      holderWeight = w;
   }
   
   /**
      Copy Constructor
      
      The PolicyHolder copy constructor constructs a PolicyHolder object with provided argument
      
      @param obj2    The object to copy
   */

   public PolicyHolder(PolicyHolder obj2)
   {
      holderFirstName = obj2.holderFirstName;
      holderLastName = obj2.holderLastName;
      holderAge = obj2.holderAge;
      smokingStatus = obj2.smokingStatus;
      holderHeight = obj2.holderHeight;
      holderWeight = obj2.holderWeight;
   }

   
   //Start mutator
   
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
   
   //End mutator
   
   //Start accessor
   
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
   
   //End accessor
   
   //Start calculation
   
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
   //End calculation
   
   //Start toString
   
   /**
      The toString method returns the string representation of an object.
   */
   public String toString()
   {
      String str = "\nPolicyholder's First Name: " + getHolderFirstName() +
                   "\nPolicyholder's Last Name: " + getHolderLastName() +
                   "\nPolicyholder's Age: " + getHolderAge() +
                   "\nPolicyholder's Smoking Status (smoker/non-smoker): " + getSmokingStatus() +
                   "\nPolicyholder's Height: " + getHolderHeight() + " inches" +
                   "\nPolicyholder's Weight: " + getHolderWeight() + " pounds" +
                   "\nPolicyholder's BMI: " + getHolderBmi();                                                                    
      
      //return string
      return str;
   }
   
   //End toString


}