public class Main
{
    public static void main(String[] args)
    {
        try
        {
            //Test Case #1
            Polynomial p1 = new Polynomial();
            p1.addTerm(3, 4);
            p1.addTerm(2, 2);
            p1.addTerm(3, 1);
            p1.addTerm(7, 0);
            System.out.println("Test Case 1:");
            System.out.println(p1);
            System.out.println();

            //Test Case #2
            Polynomial p2 = new Polynomial();
            p2.addTerm(2, 3);
            p2.addTerm(4, 1);
            p2.addTerm(5, 0);
            System.out.println("Test Case 2:");
            System.out.println(p2);
            System.out.println();

            //Test Case #3
            Polynomial p3 = new Polynomial();
            p3.addTerm(3, 4);
            p3.addTerm(2, 3);
            p3.addTerm(2, 2);
            p3.addTerm(7, 1);
            p3.addTerm(12, 0);
            System.out.println("Test Case 3:");
            System.out.println(p3);
            System.out.println();

            //Extra Credit
            p1.store("poly.txt");
            Polynomial loaded = new Polynomial();
            loaded.load("poly.txt");
            System.out.println("Loaded from file:");
            System.out.println(loaded);
        }
        catch (Exception e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}