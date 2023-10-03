import java.util.*;
public class Faculty_info{
    Class_main o=new Class_main();
    Dasboard o2=new Dasboard();
    public void view_name() {
        // HASHMAP FOR NAMES AND FACULTY ID
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "Mrugendrasinh Rahevar");
        hm.put(2, "Dr. Ritesh Patel");
        hm.put(3, "Arpita Shah");
        hm.put(4, "Dr Ashwin Makwana");
        hm.put(5, "Dhaval Bhoi");
        hm.put(6, "Vaishali Koria");
        hm.put(7, "Ronak Patel");
        hm.put(8, "Trusha Patel");
        hm.put(9, "Martin Parmar");
        hm.put(10, "Sneha Padhiar");
        hm.put(11, "Deep Kothadiya");
        hm.put(12, "Mayuri Popat");
        hm.put(13, "Rikita Chokshi");
        System.out.println("ID:\t\tFACULTY");
        for (Map.Entry<Integer, String> e : hm.entrySet()) {
            System.out.print(e.getKey() + "\t\t");
            System.out.print(e.getValue() + "\n");
        }
    }
    public void view_info(){
        //HASHMAP FOR FACULTY INFORMATION
        HashMap<Integer,String> hm2 = new HashMap<>();
        hm2.put(1,"Mrugendrasinh Rahevar: \nDesignation : Assistant Professor\nExperience : 15+ Years\nEmployer: CE, CSPIT, CHARUSAT\nContact number: 02697-5354\nEmail: mrugendrarahevar.ce@charusat.ac.in");
        hm2.put(2,"Currently Working as an Professor in Computer Engg. Dept.(CSPIT-Changa) (2004 to till Date)\nWorked as a visiting faculty for the P.G. and U.G. Course at Computer Engg. DDU, Nadiad (2008).\nWorking as a CCNA instructor and governing Cisco Networking Academy at Education Campus Changa since July-2005");
        hm2.put(3,"Arpita Shah");
        hm2.put(4,"Working as Associate Professor, @U & P U. Patel Department of Computer Engineering, CSPIT, CHARUSAT, Campus, Changa. [Since 2004].");
        hm2.put(5,"Assistant Professor,\nU & P U. Patel Department of Computer Engineering,\nCSPIT,\nCHARUSAT\nE-mail: dhavalbhoi.ce@charusat.ac.in");
        hm2.put(6,"Designation : Assistant Professor\nExperience : 10 Years\nEmployer: CE, CSPIT, CHARUSAT\nContact number: 02697-255358\nEmail: vaishalimewada.ce@charusat.ac.in, vsl.239@gmail.com");
        hm2.put(7,"Assistant Professor, Computer Engineering Department, CSPIT, CHARUSAT,  Anand, Gujarat, India.\nMember of Career Development and Placement Cell");
        hm2.put(8,"Assistant Professor\nU. & P. U. Patel Department of Computer Engineering\nChandubhai S. Patel Institute of Technology (CSPIT)\nCharotar University of Science & Technology (CHARUSAT)\nChanga, Gujarat, India - 388421\nEmail : trushagajjar.ce@charusat.ac.n");
        hm2.put(9,"Assistant Professor, Charotar University of Science & Technology (CHARUSAT)\nEmail: martinparmar.ce@charusat.ac.in");
        hm2.put(10,"Currently Working as an ASSISTANT PROFESSOR in Computer Engg. Dept.(CSPIT-Changa) (10/08/2017 to till Date)\nWorked as an ASSISTANT PROFESSOR, L.D.COLLEGE OF ENGINEERING 28/10/2016 -09/08/2017");
        hm2.put(11,"Assistant Professor \nDepartment of Computer Engineering ,\nCSPIT- CHARUSAT Changa, 388421  ");
        hm2.put(12,"Mayuri Popat");
        hm2.put(13,"Assistant Professor\nU & P U. Patel Department of Computer Engineering\nChandubhai S. Patel Institute of Technology\nCharotar University of Science & Technology");
        System.out.println("PRESS 1: TO ENTER FACULTY ID\nPRESS 2: REDIRECT TO DASHBOARD\nPRESS 3: LOGOUT");
        Scanner sc1=new Scanner(System.in);
        int ch=sc1.nextInt();
        while (true)
        {
            switch (ch)
            {
                case 1:
                    System.out.println("Enter Faculty Id number: ");
                    int id=sc1.nextInt();
                    System.out.println(hm2.get(id));
                    System.out.println("PRESS 1: TO ENTER FACULTY ID\nPRESS 2: REDIRECT TO DASHBOARD\nPRESS 3: LOGOUT");
                    ch=sc1.nextInt();
                    break;
                case 2:
                    o2.dasboard();
                    return;
                case 3:
                    return;
                case 4:
                    System.out.println("Enter valid choice");
                    break;
            }
        }
    }
}
