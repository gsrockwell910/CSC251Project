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
      this.holderFirstName = obj2.getHolderFirstName();
      this.holderLastName = obj2.getHolderLastName();
      this.holderAge = obj2.getHolderAge();
      this.smokingStatus = obj2.getSmokingStatus();
      this.holderHeight = obj2.getHolderHeight();
      this.holderWeight = obj2.getHolderWeight();
   }

   
   //Start mutator
   
   /**
      The setHolderFirstName method allows the holder first name to be set with a given argument
      
      @param fName     The holder first name to be set
   */
   
   public void setHolderFirstName(String fName)
   {
      this.holderFirstName = fName;
   }
   
   /**
      The setHolderLastName method allows the holder last name to be set with a given argument
      
      @param lName     The holder last name to be set
   */
   
   public void setHolderLastName(String lName)
   {
      this.holderLastName = lName;
   }
   
   /**
      The setHolderAge method allows the holder age to be set with a given argument
      
      @param a     The holder age to be set
   */
   
   public void setHolderAge(int a)
   {
      this.holderAge = a;
   }
   
   /**
      The setSmokingStatus method allows the holder smoking status to be set with a given argument
      
      @param smoke     The holder smoking status to be set
   */
   
   public void setSmokingStatus(String smoke)
   {
      this.smokingStatus = smoke;
   }

   /**
      The setHolderHeight method allows the holder height to be set with a given argument
      
      @param h     The holder height to be set
   */
   
   public void setHolderHeight(double h)
   {
      this.holderHeight = h;
   }
   
   /**
      The setHolderWeight method allows the holder weight to be set with a given argument
      
      @param w     The holder weight to be set
   */
   
   public void setHolderWeight(double w)
   {
      this.holderWeight = w;
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
      return String.format("Policyholder's First Name: " + holderFirstName + 
                           "\nPolicyholder's Last Name: " + holderLastName + 
                           "\nPolicyholder's Age: " + holderAge +
                           "\nPolicyholder's Smoking Status: " + smokingStatus +
                           "\nPolicyholder's Height: " + holderHeight + " inches" +
                           "\nPolicyholder's Weight: " + holderWeight + " pounds" +
                           "\nPolicyholder's BMI: %.2f" , getHolderBmi());
   }
   
   //End toString


}