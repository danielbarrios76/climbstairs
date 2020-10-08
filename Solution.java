class Solution {
    public static int climbStairs(int n) {
        
        int val;

        if (n <= 1) {
            val =  1;
        } else {
            
            int[] s_case = new int[n + 1];
            
            s_case[0] = 1;
            s_case[1] = 1;
            
            for (int i = 2; i <= n; i++) {
                s_case[i] = s_case[i - 1] + s_case[i - 2];
            }      
        
            val = s_case[n];          
        }

        return val;
    }
    
    public static void main(String[] args) {
        // test the solution
	    //test numbers
	    int steps1 = 5;
        int steps2 = 1;
        int steps3 = 8;
        int steps4 = 11;
        int steps5 = 21;

	    System.out.println("Ways to the top - Steps "+ steps1 + " : " + climbStairs(steps1));
        System.out.println("Ways to the top - Steps "+ steps2 + " : " + climbStairs(steps2));
        System.out.println("Ways to the top - Steps "+ steps3 + " : " + climbStairs(steps3));
        System.out.println("Ways to the top - Steps "+ steps4 + " : " + climbStairs(steps4));
        System.out.println("Ways to the top - Steps "+ steps5 + " : " + climbStairs(steps5));



	}	
}
