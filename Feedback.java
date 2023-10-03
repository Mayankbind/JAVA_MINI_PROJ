import java.util.HashMap;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

/*      (1) Potential as a Teacher
        (2) Potential as a Researcher
        (3) Potential as an Administrator
        (4) Knowledge of job. (Familiarity with subject matters, teaching methodologies, various rules, regulations, etc.)
        (5) Leadership and Ability to get things done. (Ability to perform and achieve on assigned task)
        (6) Attitude & Sociability (Sense of Team work, friendliness with others)
        (7) Communication skills in English. (Vocabulary, correct grammar, correct speech and error free goal-oriented writing)
        (8) Health
        (9) Commitment towards Profession (Honesty, Sincerity and Hard work)
 */
public class Feedback {
//    NavigableMap nm = new TreeMap();
    HashMap ex_map = new HashMap<>();
    HashMap g_map = new HashMap<>();
    HashMap f_map = new HashMap<>();
    Faculty_info fi =new Faculty_info();
    public void feedback_main()
    {
        Dasboard db = new Dasboard();
        fi.view_name();
        Scanner sc =new Scanner(System.in);
        while(true) {
        System.out.println("ENTER ID\tEXIT: PRESS 0\tDASHBOARD:PRESS -1");
        int ch=sc.nextInt();
        if(ch==0)
        {
            return;
        }
        if(ch==-1)
        {
            db.dasboard();
            return;
        }
            switch (ch) {
                case 1:
                    System.out.println("Mrugendrasinh Rahevar");
                    feedback_enter(ch);
                    break;
                case 2:
                    System.out.println("Dr. Ritesh patel");
                    feedback_enter(ch);
                    break;
                case 3:
                    System.out.println("Arpita Shah");
                    feedback_enter(ch);
                    break;
                case 4:
                    System.out.println("Dr Ashwin Makwana");
                    feedback_enter(ch);
                    break;
                case 5:
                    System.out.println("Dhaval Bhoi");
                    feedback_enter(ch);
                    break;
                case 6:
                    System.out.println("Vaishali Koria");
                    feedback_enter(ch);
                    break;
                case 7:
                    System.out.println("Ronak Patel");
                    feedback_enter(ch);
                    break;
                case 8:
                    System.out.println("Trusha Patel");
                    feedback_enter(ch);
                    break;
                case 9:
                    System.out.println("Martin Parmar");
                    feedback_enter(ch);
                    break;
                case 10:
                    System.out.println("Sneha Padhiar");
                    feedback_enter(ch);
                    break;
                case 11:
                    System.out.println("Deep Kothadiya");
                    feedback_enter(ch);
                    break;
                case 12:
                    System.out.println("Mayuri Popat");
                    feedback_enter(ch);
                    break;
                case 13:
                    System.out.println("Rikita Choksi");
                    feedback_enter(ch);
                    break;
            }
        }
    }
    public void feedback_enter(int id)
    {
        Rating r= new Rating();
        int excellent_cnt=0,good_cnt=0,fair_cnt=0;
        Scanner sc1 =new Scanner(System.in);
        System.out.println("Potential as a Teacher");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        int feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        System.out.println("Potential as a Researcher");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        System.out.println("Potential as an Administrator");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        System.out.println("Knowledge of job");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        System.out.println("Leadership and Ability to get things done");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        System.out.println("Attitude & Sociability");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        System.out.println("Communication skills in English");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        System.out.println("Health");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        System.out.println("Commitment towards Profession");
        System.out.println("1: Excellent\t2:Good\t3:Fair");
        feed=sc1.nextInt();
        switch (feed)
        {
            case 1:
                excellent_cnt++;
                break;
            case 2:
                good_cnt++;
                break;
            case 3:
                fair_cnt++;
                break;
            default:
                System.out.println("Please enter valid choice");
                break;
        }
        ex_map.put(id,excellent_cnt);
        g_map.put(id,good_cnt);
        f_map.put(id,fair_cnt);
        System.out.println("RATINGS: PRESS 0\tCONTINUE: PRESS 1");
        int n= sc1.nextInt();
        if (n==0)
        {
        r.rating(ex_map,g_map,f_map);
        }
    }
}
