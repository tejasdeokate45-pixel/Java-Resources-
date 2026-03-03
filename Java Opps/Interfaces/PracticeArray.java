public class PracticeArray{
    static void MaxMin(int arr[], int n){
        if(n == 1 || n==0){
            System.out.println("-1");
            System.out.println(" ");
            System.out.println("-1");

        }
        
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;

        // for loop for getting smallest and larget 
        for(int i = 0;i<arr.length;++i){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        // for loop for getting second larget and second smallest 
        for(int i = 0;i<n;i++){
            if(arr[i]<secondSmall && arr[i]!=small){
                secondSmall=arr[i];
            }
            if(arr[i]>secondLarge && arr[i]!=large){
                secondLarge = arr[i];
            }
        }

        System.out.println("Second largets elemnt is : "+secondLarge);
        System.out.println("Second smallest elemnt is : "+secondSmall);

    } 

    static boolean isSorted(int arr[]){
        int n = arr.length;
        for(int i = 0;i<n;++i){
            if(i==n-1){
                break;
            }
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }


    public static void main(String args[]){
        int arr[]={1,1,2,2,5,6,9,9,10,10};
        int n = arr.length;

        //MaxMin(arr,n);
        if(isSorted(arr)){
            System.err.println("Array Is sorted : ");
        }else{
            System.out.println("Array is not sorted : ");
        }
    } 
}