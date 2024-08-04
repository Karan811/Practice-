public class ArrivalDepartureProblem {

    public static void main(String[] args) {
        int n = 6;
        int arr[] = {900, 940, 950, 1100, 1500, 1800};
        int dep[] = {910, 1200, 1120, 1130, 1900, 2000};
        int result = findPlatform(arr, dep, n);
        System.out.println("Result -:" + result);
    }

    static int findPlatform(int arr[], int dep[], int n) {
        int noOfPlatforms = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {

                int i1 = arr[i];
                if (i1 < dep[j]) {
                    noOfPlatforms += 1;
                    break;
                }
            }

        }
        return noOfPlatforms;
    }

}



