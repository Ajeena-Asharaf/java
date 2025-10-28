package Day3.profile;

import java.util.Scanner;

public class UserInput {
    public String Input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        sc.close();
        return name;
    }
}
