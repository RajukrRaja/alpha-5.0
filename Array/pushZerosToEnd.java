
public class pushZerosToEnd {

    public static void main(String[] args) {

        int arr[] = { 0, 2, 0, 5 };
        System.out.println("Original array");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "");
        }
        System.out.println();
     
        Solution s1 =  new Solution();
        s1.pushZerosToEnd(arr, arr.length);

         System.out.println("updated array");
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ "");
        }

        System.out.println();

      



    }

}

class Solution{
    void pushZerosToEnd(int [] arr , int n){
        int i =0;
        for(int j=0; j<arr.length; j++){
            if(arr[j]!=0){
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
                i++;

            }
        }
    }
}
