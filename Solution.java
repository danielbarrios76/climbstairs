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

	}	
}
