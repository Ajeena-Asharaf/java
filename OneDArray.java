public class OneDArray {
    public static void main(String[] args) {
        int arr[] = {90,80,70,60,40};
        for(int i=0 ; i<5 ; i++){
            if(arr[i] >= 90){
                System.out.println("Excellent");
            }
            else if(arr[i] >=75 &&arr[i]<=89){
                System.out.println("Good");
            }
            else if( arr[i]>=50 && arr[i]<=74){
                System.out.println("Average");
            }
            else{
                System.out.println("Failed");
            }
        }
    }
}
