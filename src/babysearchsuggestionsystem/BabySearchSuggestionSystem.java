/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysearchsuggestionsystem;

import java.util.Scanner;

/**
 *
 * @author Yusuf Ibrahim Abdrabbo - linkedin.com/in/yusufabdrabbo
 * @collaborator Mohamed Kamal Abdelaziz - linkedin.com/in/mohamedkamal-in
 */
public class BabySearchSuggestionSystem {

    /**
     * @param args the command line arguments
     */
    static Scanner scanner1 = new Scanner(System.in); //Declaring object scanner1 to help later getting inputs.
    public static void main(String[] args) 
    {
       //VARIABLES
        
        short N; //N for the number of Already Searched Words
        byte Q; //Q for the number of search queries (terms)
        
        //PROCESSING
        
        // START OF WORK REGARDING getting Already Searched Words.
        N = scanner1.nextShort(); //Initializing N for the number of Already Searched Words 'value to be assigned to N is taken from user'.   
        String[] aSW = new String [N]; //Declaring array aSW to store Already Searched Words 'Making sure the number of elements in the array (its lenth) is the same number of Already Searched Words.
        fillarray(aSW);//Method to get and assign a string value from the user to each element of aSW array."
        // END OF WORK REGARDING getting Already Searched Words.

        // START OF WORK REGARDING getting current Search Queries.
         Q = scanner1.nextByte(); //Initializing Q for the number of search queries (terms) 'value to be assigned to Q is taken from user'.
         String[] sQ = new String[Q]; //Declaring array sQ to store Search Queries 'Making sure the number of elements in the array (its lenth) is the same number of search queries.
          fillarray(sQ);//Method to get and assign a string value from the user to each element of sQ array."
        // END OF WORK REGARDING getting current Search Queries.

         for(int i=0;i<sQ.length;i++)//OUTER (FOR LOOP)
            {
                    int ans=0,len=0; //ans is he number of repetition of the word & len is the number of letters is the largest word among the repeated words

                    for(int j=0;j<aSW.length;j++)//INER (FOR LOOP)
                    {      

                            if(aSW[j].startsWith(sQ[i]))
                            {
                                ans++;
                                len=Math.max(len, aSW[j].length());
                            }

                    }//END OF INER (FOR LOOP)
                   if(ans==0)  
                   {
                       System.out.println("-1");
                   }
                   else
                   {
                       System.out.println(ans+" "+len);  
                   }
            }//END OF OUTER (FOR LOOP)


    }
    //////////////////////////FUNCTIONS//////////////////////////////////////////
    //////////////////////////FUNCTIONS//////////////////////////////////////////
    
    //START fillarray method
    public static void fillarray(String[]namearray)//this method to fill the array
    {
        for(short i=0;i<namearray.length;i++)//An iteration statement to get and assign a string value from the user to each element of aSW array and sQ array.
        {
            namearray[i]=scanner1.next().toLowerCase();
        }
    }//END fillarray method  
}
