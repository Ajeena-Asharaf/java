package Day3;
import Day3.greeting.*;
import Day3.profile.*;
public class MainProfile {
    public static void main(String[] args) {
        UserInput b = new UserInput();
        String name = b.Input();
        GreetingDisplay a =  new GreetingDisplay();
        a.display(name);

    }
}
