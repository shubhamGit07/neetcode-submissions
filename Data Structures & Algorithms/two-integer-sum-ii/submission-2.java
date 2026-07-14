class Solution { 
    public int[] twoSum(int[] numbers, int target) { 
        int i = 0; 
        int j = numbers.length - 1; 
        
        while (i < j) { 
            int sum = numbers[i] + numbers[j]; 
            if (sum == target) { 
                return new int[]{i + 1, j + 1}; // Returns 1-indexed positions
            } else if (sum < target) { 
                i++; 
            } else { 
                j--; 
            } 
        } 
        
        return new int[]{-1, -1}; // Fixed: Returns an array instead of 'sum'
    } 
}
