class StringSolution {
	
    private int index = 0;
    private char character;
    private String reversed;
    private String orderString;
    
    public String reverseStringInParentheses(String theString) {
    	
        StringBuilder reverseString = new StringBuilder();
        
        while(index < theString.length()) {
        	character = theString.charAt(index);
        	index++;
           if(character == '(') {              
               orderString = reverseStringInParentheses(theString);
               reversed = new StringBuilder(orderString).reverse().toString();
               reverseString.append(reversed);
           } else if( character == ')') {
        	      break;
           } else {
        	   reverseString.append(character);               
           }
        }
        
        return reverseString.toString();
    }
}