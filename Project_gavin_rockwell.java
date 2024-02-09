//import scanner for user input
import java.util.Scanner;

public class Project_gavin_rockwell
{

   /**
      Main method
      
      The main method demonstrates the Policy class
   */

   public static void main(String[] args)
   {
      //declare all necessary variable
      Scanner keyboard = new Scanner(System.in);
      
      int policyNumber = 0,
          age = 0;
          
      String provider = " ",
             firstName = " ",
             lastName = " ",
             smokeStatus = " ";
            
      double height = 0.0,
             weight = 0.0;
             
      
      //prompt user to enter necessary information
      
      System.out.print("Please enter the Policy Number: ");
      policyNumber = keyboard.nextInt();
      
      //clear the buffer
      keyboard.nextLine();
             
      System.out.print("\nPlease enter the Provider Name: ");
      provider = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's First Name: ");
      firstName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Last Name: ");
      lastName = keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Age: ");
      age = keyboard.nextInt();
      
      //clear the buffer
      keyboard.nextLine();
      
      System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
      smokeStatus = keyboard.nextLine().toLowerCase();
      
      //while loop to validate user entered a valid response
      while(!smokeStatus.equalsIgnoreCase("smoker") && !smokeStatus.equalsIgnoreCase("non-smoker"))
      {
         System.out.println("ERROR: Please make a valid selection (smoker/non-smoker)");
         
         System.out.print("\nPlease enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         smokeStatus = keyboard.nextLine().toLowerCase();
      }
      
      System.out.print("\nPlease enter the Policyholder's Height (in inches): ");
      height = keyboard.nextDouble();
      
      System.out.print("\nPlease enter the Policyholder's Weight (in pounds): ");
      weight = keyboard.nextDouble();
      
      //create policy object with given information
      Policy policy = new Policy(policyNumber, provider, firstName, lastName, age, smokeStatus, height, weight);
      
      //output policy information from Policy object
      System.out.println("\nPolicy Number: " + policy.getPolicyNumber());
      System.out.println("\nProvider Name: " + policy.getProviderName());
      System.out.println("\nPolicyholder's First Name: " + policy.getHolderFirstName());
      System.out.println("\nPolicyholder's Last Name: " + policy.getHolderLastName());
      System.out.println("\nPolicyholder's Age: " + policy.getHolderAge());
      System.out.println("\nPolicyholder's Smoking Status: " + policy.getSmokingStatus());
      System.out.println("\nPolicyholder's Height: " + policy.getHolderHeight());
      System.out.println("\nPolicyholder's Weight: " + policy.getHolderWeight());
      System.out.printf("\nPolicyholder's BMI: %.2f", policy.getHolderBmi(policy.getHolderHeight(), 
                                                                          policy.getHolderWeight()));
                                                                            
      System.out.printf("\n\nPolicy Price: $%,.2f", policy.getPolicyPrice(policy.getHolderAge(), 
                                                                          policy.getSmokingStatus(),
                                                                          policy.getHolderHeight(), 
                                                                          policy.getHolderWeight()));
   }
}