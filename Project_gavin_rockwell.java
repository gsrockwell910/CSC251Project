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

   public static void main(String[] args)
   {
   
      //try clause to handle expections
      try
      {
         //create instance of File class
         File file = new File("PolicyInformation.txt");
         
         //Scanner with input file passed as argument
         Scanner inputFile = new Scanner(file);
      
         //declare variables
         int age = 0,
             totalSmoke = 0,
             totalNoSmoke = 0;
          
         String policyNumber = "",
                provider = "",
                firstName = "",
                lastName = "",
                smokeStatus = "",
                fileInput = "";
            
         double height = 0.0,
                weight = 0.0;
                
         //create arraylist to hold objects
         ArrayList<Policy> policyList = new ArrayList<Policy>();
         
         while( inputFile.hasNext() )
         {
            //get info from file and store in variables
            policyNumber = inputFile.nextLine();
            provider = inputFile.nextLine();
            firstName = inputFile.nextLine();
            lastName = inputFile.nextLine();
            
            //parse integer
            fileInput = inputFile.nextLine();
            age = Integer.parseInt(fileInput);
            
            //string
            smokeStatus = inputFile.nextLine();
            
            //parse doubles
            fileInput = inputFile.nextLine();
            height = Double.parseDouble(fileInput);
            
            fileInput = inputFile.nextLine();
            weight = Double.parseDouble(fileInput);
            
            //check for end of file
            if( inputFile.hasNext() )
            {
               //skip blank line
               inputFile.nextLine();
            }
            
            //create objects
            Policy p = new Policy(policyNumber, provider, firstName, lastName, age, smokeStatus, height, weight);
            
            //add object to arraylist
            policyList.add(p);
        }
        
        //close file
        inputFile.close();
        
        //display output 
      }
      
      //catch exceptions
      catch(IOException ex)
      {  
         //display error message
         System.out.println( "Something went wrong while reading the file: " + ex.getMessage() );
      }
   }
}