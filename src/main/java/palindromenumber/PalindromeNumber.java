//Question:
//	
//Given an integer x, return true if x is a palindrome, and false otherwise.
//
//Example 1:
//
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.
//
//Example 2:
//
//Input: x = -121
//Output: false
//Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
//
//Example 3:
//
//Input: x = 10
//Output: false
//Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


package palindromenumber;

public class PalindromeNumber {

	public static void main(String[] args) {

		Solution sol = new Solution();
		System.out.println(sol.isPalindrome(-121));
		System.out.println(sol.isPalindrome(-11));
		System.out.println(sol.isPalindrome(-1));
		System.out.println(sol.isPalindrome(1));
		System.out.println(sol.isPalindrome(11));
		System.out.println(sol.isPalindrome(111));
		System.out.println(sol.isPalindrome(1112));
	}
}

class Solution {
    public boolean isPalindrome(int x) {
    	boolean result = false;
    	String numString = String.valueOf(x);
    	//
    	if (x < 10 & x >= 0) 
    		return true;
    	if (x < 0)
    		return false;
    	//
    	int index = 0;
    	int counter = 2;
    	int xLength = numString.length();
    	while(index < xLength) {
    		if(numString.charAt(index) != numString.charAt(xLength - index-1)) {
    			result = false;
    			break;
    		}
    		//
    		if(counter == xLength || counter == xLength + 1) {
    			result = true;
    			break;
    		}
    		//
    		counter = counter + 2;
    		index = index + 1;
    	}
    	
    	return result;
    }
}


