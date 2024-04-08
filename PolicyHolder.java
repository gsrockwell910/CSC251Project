public class PolicyHolder
{
   private String holderFirstName;
   private String holderLastName;
   private int holderAge;
   private String smokingStatus;
   private double holderHeight;
   private double holderWeight;
   
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

}