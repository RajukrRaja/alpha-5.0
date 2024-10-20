class PrintSubArray {

    public static void printsubArray(int num[]) {
       
        //calculate start
        for (int i = 0; i < num.length; i++) {
            int start = i;
            
            // calculate end
            for (int j = i; j < num.length; j++) {
                int end = j;
                
               //print subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(num[k] + " ");
                }
                System.out.println();
            }
        }
    }
       //main method 
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        printsubArray(num);
    }
}
