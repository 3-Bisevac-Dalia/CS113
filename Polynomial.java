import java.util.ArrayList;
import java.util.Collections;
import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class Polynomial
{
    private ArrayList<Term> terms;

    public Polynomial()
    {
        terms = new ArrayList<>();
    }

    public void addTerm(int coefficient, int exponent)
    {
        for (Term t : terms)
        {
            if (t.getExponent() == exponent)
            {
                t.setCoefficient(t.getCoefficient() + coefficient);
                return;
            }
        }
        terms.add(new Term(coefficient, exponent));
        Collections.sort(terms);
    }

    @Override
    public String toString()
    {
        if (terms.size() == 0)
            return "0";

        String result = "";
        for (int i = 0; i < terms.size(); i++)
        {
            if (i > 0)
                result += " + ";
            result += terms.get(i);
        }
        return result;
    }

    public void store(String filename) throws IOException
    {
        FileWriter writer = new FileWriter(filename);
        for (Term t : terms)
        {
            writer.write(t.getCoefficient() + " " + t.getExponent() + "\n");
        }
        writer.close();
    }

    public void load(String filename) throws IOException
    {
        terms.clear();
        Scanner file = new Scanner(new File(filename));

        while (file.hasNextInt())
        {
            int coef = file.nextInt();
            int exp = file.nextInt();
            addTerm(coef, exp);
        }
        file.close();
    }
}