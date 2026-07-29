class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] temp = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    temp[0] = i;
                    temp[1] = j;
                    return temp;
                }
            }
        }
        return new int[0]; // Return empty array if no match found
    }

    public static void main(String args[]) {
        int a[] = { 2, 7, 11, 15 };
        int target = 9;
        int[] ans; // Declare only

        Solution obj1 = new Solution();
        ans = obj1.twoSum(a, target);

        for (int i = 0; i < ans.length; i++) {
            System.out.print(ans[i] + " ");
        }
    }
}
