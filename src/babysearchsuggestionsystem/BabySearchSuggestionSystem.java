/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package babysearchsuggestionsystem;

import java.util.Scanner;

/**
 *
 * @author Yusuf
 */
public class BabySearchSuggestionSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // TODO code application logic here
        Scanner scanner1 = new Scanner(System.in); //Declaring object scanner1 to help later getting inputs.
     short N = scanner1.nextShort(); //Initializing N for the number of Already Searched Words 'value to be assigned to N is taken from user'.   
     String[] aSW = new String [N+1]; //Declaring array aSW to store Already Searched Words 'Making sure the number of elements in the array (its lenth) is the same number of Already Searched Words.
     
     for(short i=0;i<=N;i++) //An iteration statement to get and assign a string value from the user to each element of aSW array."
     {
         aSW[i]=scanner1.nextLine().toLowerCase();
     }
     // END OF WORK REGARDING getting Already Searched Words.
     
     byte Q = scanner1.nextByte(); //Initializing Q for the number of search queries (terms) 'value to be assigned to Q is taken from user'.
     String[] sQ = new String[Q+1]; //Declaring array sQ to store Search Queries 'Making sure the number of elements in the array (its lenth) is the same number of search queries.
     for(byte i2=0;i2<=Q;i2++) //An iteration statement to get and assign a string value from the user to each element of sQ array."
     {
         sQ[i2]=scanner1.nextLine().toLowerCase();
     }
     // END OF WORK REGARDING getting current Search Queries.
     
     
         
         
    }
    
}
