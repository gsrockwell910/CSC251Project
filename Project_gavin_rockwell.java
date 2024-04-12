//import scanner for user input
import java.util.*;
//import io for working with files
import java.io.*;

public class Project_gavin_rockwell
{

   /**
      Main method
      
      The main method demonstrates the Policy class
   */

   public static void main(String[] args) throws IOException
   {  
         //declare variables
         int age = 0,
             totalSmoke = 0;
          
         String policyNumber = "",
                provider = "",
                firstName = "",
                lastName = "",
                smokeStatus = "";
            
         double height = 0.0,
                weight = 0.0;
                
         //create arraylist to hold objects
         ArrayList<Policy> policyList = new ArrayList<Policy>();
         
          //create instance of File class
         File file = new File("PolicyInformation.txt");
         
         //Scanner with input file passed as argument
         Scanner inputFile = new Scanner(file);
         
         while( inputFile.hasNext() )
         {
            //get info from file and store in variables
            policyNumber = inputFile.nextLine();
            provider = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            age = inputFile.nextInt();
            inputFile.nextLine();
            smokeStatus = inputFile.nextLine();
            height = inputFile.nextDouble();
            weight = inputFile.nextDouble();
            
            //check for end of file
            if( inputFile.hasNext() )
            {
               //skip blank line
               inputFile.nextLine();
            }
            if( inputFile.hasNext() )
            {
               inputFile.nextLine();
            }
            
            PolicyHolder polHol = new PolicyHolder(firstName, lastName, age, smokeStatus, height, weight);
            
            //add object to arraylist
            policyList.add( new Policy(policyNumber, provider, polHol) );
        }
        
        //close file
        inputFile.close();
        
        //display output
        for(Policy policy : policyList)
        {
            System.out.println(policy);
            //two blanks between policies
            System.out.println();
            System.out.println();
            
            //determine number of smokers
            if( policy.getPolicyHolder().getSmokingStatus().equalsIgnoreCase("smoker") )
            {
                  totalSmoke++;
            }
        }
        //blank line
        System.out.println();
        //display smokers
        System.out.printf("There were %d Policy objects created. \n\nThe number of policies with a smoker is: %d \n\nThe number of policies with a non-smoker is: %d", 
                           Policy.numPol, totalSmoke, (policyList.size() - totalSmoke) );
      
   }
}