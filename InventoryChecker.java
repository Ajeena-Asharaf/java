public class InventoryChecker {
    public static void main(String[] args) {
        int a[] = {20,15,10,0,50};
        int sum =0;
        int flag=0;
        for(int i=0 ; i<5 ; i++){
            if (a[i]==0){
                flag=1;
                break;
            } 
            sum+=a[i];
        }
        if(flag==1){
            System.out.println("out of stock");
        }
        else{
            System.out.println(sum);
        
        String status ;
        if(sum<50){
            status = "low";
        }
        else if (sum <= 100){
            status = "moderate";
        }
        else{
            status="good";
        }
        switch(status){
            case "low":
            System.out.println("stock low");
            break;
            case "moderate":
            System.out.println("moderate");
            break;
            case "good":
            System.out.println("good");
            break;
            default:
            System.out.println("status invalid");

        }
    } 
    }
    
}
