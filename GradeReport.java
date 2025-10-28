public class GradeReport {
    public static void main(String[] args) {
        int a[]={78, 82, 91, 65, 34};
        boolean fail = false;
        int total =0;
        for(int i=0 ;i<5;i++){
            if(a[i]<35){
                fail = true;
                break;
            }
            total+=a[i];
        }
        if(fail){
            System.out.println("failed");
        }
        else{
            int average = total/5;
            if (average>=90){
                System.out.println("GRADE A");
            }
            else if(average >=75 && average<=89){
                System.out.println("GRADE B");
            }
            else if(average >=60 && average<=74){
                System.out.println("GRADE C");
            }
            else
            {
                System.out.println("GRADE D");
            }
        }

    }
    
}
