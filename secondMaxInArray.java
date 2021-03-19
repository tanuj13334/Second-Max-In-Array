import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger; 

class SecondMaxVal
{
    // Compare two string Numbers
    public static int compareNumbers(String firstNum, String secondNum){
        return new BigInteger(firstNum).compareTo(new BigInteger(secondNum));
    }
    
    // Return second Max Element in input Array
    public static String getSecondMaxInArray(String[] inputArray) {
	    String firstMaxInArray = null, secondMaxInArray = null;
	    
	    for(int index=0; index<inputArray.length; index++) {
          String currElement = inputArray[index];

          /* If current element is greater than firstMax then update both firstMax and secondMax */
          if (firstMaxInArray == null || compareNumbers(currElement, firstMaxInArray) > 0) {
              secondMaxInArray = firstMaxInArray;
              firstMaxInArray = currElement;

          /* If currElement is in between firstMax and secondMax then update secondMax  */
          } else if (compareNumbers(currElement, firstMaxInArray) != 0 &&
            (secondMaxInArray == null || compareNumbers(currElement, secondMaxInArray) > 0)){
              secondMaxInArray = currElement;
          }
	    }
	    
	    if (secondMaxInArray == null) {
	        /* assuming here to return "-1" when second max is not present in array */
	        return "-1";
	    } else {
	        return secondMaxInArray;
	    }
        
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
	    // TC : 1
	    // Input : {"3", "-2"}             Output : -2
	    String[] firstInputArray = new String[]{"3", "-2"};
	    System.out.println(getSecondMaxInArray(firstInputArray));
	    
	    
	    // TC : 2
	    // Input : {"5", "5", "4", "2"}    Output : "4"
	    String[] secondInputArray = new String[]{"5", "5", "4", "2"};
	    System.out.println(getSecondMaxInArray(secondInputArray));
	    
	    
	    // TC : 3
	    // Input : {"4", "4", "4"}         Output : "-1"
	    String[] thirdInputArray = new String[]{"4", "4", "4"};
	    System.out.println(getSecondMaxInArray(thirdInputArray));
	    
	    
	    // TC : 4
	    // Input : {}                      Output : "-1"
	    String[] fourthInputArray = new String[]{};
	    System.out.println(getSecondMaxInArray(fourthInputArray));
	    
	    
	    // TC : 5
	    // Input : {"-214748364801","-214748364802"}    Output : "-214748364802"
	    String[] fifthInputArray = new String[]{"-214748364801","-214748364802"};
	    System.out.println(getSecondMaxInArray(fifthInputArray));
	    
	}
}
