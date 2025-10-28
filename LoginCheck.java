import java.util.Scanner;

public class LoginCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "admin";
        String pass = "java123";
        System.out.println("Username: ");
        String username = sc.nextLine();
        System.out.println("Password: ");
        String password = sc.nextLine();
        if(username.equals(name) && password.equals(pass)){
            System.out.println("Login Successful" );
        }
        else{
            System.out.println("Access Denied");
        }
    }
    
}
