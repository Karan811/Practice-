package LeetCode;

public class JumpGame {

    public static void main(String args[]){
        int arr[] = {2,1,3,5,3};
        System.out.println("Result - "+jump(arr));
    }

        public static int jump(int[] nums) {

                if (nums.length == 1) return 0; // Already at the last index
                int jumps = 0; // Number of jumps
                int farthest = 0; // Farthest index that can be reached
                int end = 0; // The end of the current jump range

                for (int i = 0; i < nums.length - 1; i++) {
                    farthest = Math.max(farthest, i + nums[i]); // Calculate the farthest point that can be reached

                    if (i == end) { // If we have reached the end of the current jump range
                        jumps++; // Make a jump
                        end = farthest; // Update the end to the farthest point we can reach

                        if (end >= nums.length - 1) {
                            break; // We can reach the last index
                        }
                    }
                }

                return jumps; // Return the total number of jumps
            }



}
