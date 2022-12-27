public class HouserRobber {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n==0)
            return 0;
        if(n==1)
            return nums[0];
        if(n==2)
            return Math.max(nums[0], nums[1]);

        int maxTillSecondLast = 0;
        int maximumLootAmount = Integer.MIN_VALUE;
        for(int i=1; i<n; i++)
        {
            nums[i] += maxTillSecondLast;
            if(maximumLootAmount<nums[i])
                maximumLootAmount = nums[i];

            maxTillSecondLast = Math.max(maxTillSecondLast, nums[i-1]);

        }
        return maximumLootAmount;
    }
}
