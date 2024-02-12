package practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Extra
{
  public void ram()
  {
    int n1, n2, n3;
    try (Scanner s = new Scanner(System.in))
    {
      System.out.println("Enter a set of 3 numbers for sorting:");
      n1 = s.nextInt();
      n2 = s.nextInt();
      n3 = s.nextInt();
    }
    ArrayList<Integer> z = new ArrayList<>();
    z.add(n1);
    z.add(n2);
    z.add(n3);
    Collections.sort(z);
    System.out.println(z);
  }

  public void lakshmana()
  {
    int n1, n2, n3;
    try (Scanner a = new Scanner(System.in))
    {
      System.out.println("Enter a set of 3 numbers for reverse order:");
      n1 = a.nextInt();
      n2 = a.nextInt();
      n3 = a.nextInt();
    }

    ArrayList<Integer> z = new ArrayList<>();
    z.add(n1);
    z.add(n2);
    z.add(n3);
    Collections.reverse(z);
    System.out.println(z);
  }

  public void sita()
  {
    int n1, n2, n3;
    try (Scanner b = new Scanner(System.in))
    {
      System.out.println("Enter a set of 3 numbers for finding minimum numbers:");
      n1 = b.nextInt();
      n2 = b.nextInt();
      n3 = b.nextInt();
    }

    ArrayList<Integer> z = new ArrayList<>();
    z.add(n1);
    z.add(n2);
    z.add(n3);
    int k = Collections.min(z);

    System.out.println(k);
  }

  public void hanuman()
  {
    int n1, n2, n3;
    try (Scanner b = new Scanner(System.in))
    {
      System.out.println("Enter a set of 3 numbers for finding maximum numbers:");
      n1 = b.nextInt();
      n2 = b.nextInt();
      n3 = b.nextInt();
    }

    ArrayList<Integer> z = new ArrayList<>();
    z.add(n1);
    z.add(n2);
    z.add(n3);

    int k = Collections.max(z);

    System.out.println(k);
  }
}

public class menudriven
{
  public static void main(String args[])
  {

    Extra o = new Extra();
    try (Scanner r = new Scanner(System.in))
    {
      int ch;
      while (true)
      {
        System.out.println("Option 1 sorting: ");
        System.out.println("Option 2 reverse order: ");
        System.out.println("Option 3 minimum numbers: ");
        System.out.println("Option 4 maximum numbers:");
        System.out.println("Enter your choice or 0 to exit");

        ch = r.nextInt();

        switch (ch)
        {
          case 1:
            o.ram();
            break;
          case 2:
            o.lakshmana();
            break;
          case 3:
            o.sita();
            break;
          case 4:
            o.hanuman();
            break;
          default:
            System.exit(0);
        }
      }
    }
  }
}
