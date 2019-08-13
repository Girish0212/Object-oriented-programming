package arraylistops;

import java.util.*;

public class ArrayListOps {
    ArrayList<String> al = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        String str;
        ArrayListOps alo = new ArrayListOps();
        System.out.println("\nString Operations using ArrayList");
        int choice;
        do {
            System.out.println("\nChoose an option:");
            System.out.print("1. Append\n2. Insert\n3. Search\n4. List all starting with given letter\n5. Exit\n\nYour choice: ");
            choice = in.nextInt();
            in.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("\nEnter a String: ");
                    str = in.nextLine();
                    alo.al.add(str);
                    break;
                case 2:
                    System.out.print("\nEnter a String: ");
                    str = in.nextLine();
                    System.out.print("Enter index: ");
                    int i = in.nextInt();
                    in.nextLine();
                    alo.al.add(i, str);
                    break;
                case 3:
                    System.out.print("\nEnter search key: ");
                    str = in.nextLine();
                    int searchIndex = alo.al.indexOf(str);
                    if (searchIndex == -1) {
                        System.out.println("Element not found!");
                    } else {
                        System.out.println("Element found at index " + searchIndex);
                    }
                    break;
                case 4:
                    System.out.println("Enter a starting letter: ");
                    String c = in.next().toLowerCase();
                    System.out.println();
                    for (int j = 0; j < alo.al.size(); j++)
                    {
                        if (alo.al.get(j).substring(0, 1).toLowerCase().equals(c.substring(0,1).toLowerCase()))
                        {
                            System.out.println(j + ": " + alo.al.get(j));
                        }
                    }
                    break;
            }
        } while (choice != 5);
    }
}