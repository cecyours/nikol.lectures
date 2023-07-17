import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class CH15_P04_SetOpertion {
    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the size: ");
        int n = Integer.parseInt(br.readLine());

        int i;

        HashSet<String> studentList = new HashSet<>();

        System.out.println("Enter details : ");

        for (i = 0; i < n; i++) {
            System.out.println("Enter Student Name : ");
            studentList.add(br.readLine());
        }

        int choice;
        String sName;
        do {
            System.out.println("\n\n\n\n Add a new Element [1] : ");
            System.out.println("    delete Element [2] : ");
            System.out.println("search new Element [3] : ");
            System.out.println("          is empty [4] : ");
            System.out.println("       display All [5] : ");
            System.out.println("              exit [6] : ");

            choice = Integer.parseInt(br.readLine());

            switch (choice) {
                case 1:
                    System.out.print("Enter the Student Name : ");
                    sName = br.readLine();
                    studentList.add(sName);
                    System.out.println(sName + "  added.");
                    break;
                case 2:
                    System.out.print("Enter the Student name to Delete : ");
                    sName = br.readLine();
                    if (studentList.remove(sName)) {
                        System.out.println(sName + " is removed..");
                    } else {
                        System.out.println("unable to delete " + sName);
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search : ");
                    sName = br.readLine();
                    if (studentList.contains(sName)) {
                        System.out.println(sName + " is found..");
                    } else {
                        System.out.println(sName + " is not found");
                    }
                    break;

                case 4:
                    System.out.println("empty : " + studentList.isEmpty());
                    break;

                case 5:
                    for (String s : studentList) {
                        System.out.println("Student Name : " + s);
                    }
                    break;
                case 6:
                    System.out.println("exited...");
                    System.exit(0);
                    break;
            }
        } while (true);
    }
}
