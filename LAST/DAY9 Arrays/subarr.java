public class subarr {
    public static void printsubarr( int numbers[]) {
        int ts = 0; // total subarrays
        for(int i = 0; i<numbers.length;i++){
            int start = i;
            for(int j=i; j<numbers.length;j++){
                int end= j;
                for(int k=start; k<=end;k++){
                    System.out.print(numbers[k] + " ");
                }
                ts++;
                System.out.println();

            }
            System.out.println();

        }
        System.out.println("Total subarrays = " + ts);
    }
    public static void main(String[] args) {
        int numbers[]={1,2,4,6,8,10};
        printsubarr(numbers);

    }
}
