import java.util.HashMap;
import java.util.Scanner;

public class Dasboard {
    public void dasboard ()
    {
        Faculty_info o1 = new Faculty_info();
        Feedback o2= new Feedback();
        Rating r =new Rating();
        System.out.println("WELCOME TO FACULTY FEEDBACK SYSTEM");
        System.out.println("1: FACULTY INFORMATION");
        System.out.println("2: FACULTY FEEDBACK");
        System.out.println("3: EXIT");
        System.out.println("ENTER YOUR CHOICE: ");
        Scanner sc =new Scanner(System.in);
        int choice=sc.nextInt();
        System.out.println(choice);
        switch (choice)
        {
            case 1:
                o1.view_name();
                o1.view_info();
                break;
            case 2:
                o2.feedback_main();
                break;
            case 3:
                break;
        }
    }
}