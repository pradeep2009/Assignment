package com.forloopassignment;

public class PalindromeRange12 {
	
	 public static boolean CheckPrime(int numberToCheck) {
	        int remainder;
	        for (int i = 2; i <= numberToCheck / 2; i++) {
	            remainder = numberToCheck % i;
	            if (remainder == 0) {
	                return false;
	            }
	        }
	        return true;

	    }


    public static void main(String[] args) {

        int i;
        int maxCheck = 100; 
        boolean isPrime = true;
        String primeNumbersFound = "";
        for (i = 2; i <= maxCheck; i++)
        {
            isPrime = CheckPrime(i);
            if (isPrime)
            {
                primeNumbersFound = primeNumbersFound + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to " + maxCheck + " are:");
        
        System.out.println(primeNumbersFound);
    }
   

}


