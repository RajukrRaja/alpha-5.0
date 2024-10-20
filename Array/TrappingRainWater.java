// ----------------------------------------------------------------------------------------------
// consider width is 1. if not give 
// where waterLevel is = Min(maxLeft boundry  , maxRight Boundary )
// ------------------------------------------------------------------------------
//  formula for calculate Trap water ->  (waterLevel (w) - barlevel (B))*width
// -----------------------------------------------------------------------------------------------------
// notes
// for trapping the water we need to minimum of 3 bar ..
// Ascending and descending order of bar cannot trapped water 

// Time complexity -> 0(n)
// --------------------------------------------------------------------------------------------------------------

package Array;

public class TrappingRainWater {
    public static int TrappingRainWater(int height[]) {
        int n = height.length;

        // calculate left max Boundary
        int LeftMax[] = new int[height.length];
        LeftMax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            LeftMax[i] = Math.max(height[i], LeftMax[i - 1]);
        }

        // calculate right max Boundary
        int rightMax[] = new int[height.length];
        rightMax[height.length - 1] = height[height.length - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(height[i], rightMax[i + 1]);

        }

        // loop
        int trappedWater = 0;
        for (int i = 0; i < n; i++) {
            int waterLevel = Math.min(LeftMax[i], rightMax[i]);
            trappedWater += waterLevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        int height[] = { 4, 2, 0, 6, 3, 2, 5 };
        System.out.println(TrappingRainWater(height));
    }
}
