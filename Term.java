public class Term implements Comparable<Term>
{
    private int coefficient;
    private int exponent;

    public Term(int coefficient, int exponent)
    {
        this.coefficient = coefficient;
        this.exponent = exponent;
    }

    public int getCoefficient()
    {
        return coefficient;
    }

    public void setCoefficient(int coefficient)
    {
        this.coefficient = coefficient;
    }

    public int getExponent()
    {
        return exponent;
    }

    public void setExponent(int exponent)
    {
        this.exponent = exponent;
    }

    @Override
    public String toString()
    {
        if (exponent == 0)
            return "" + coefficient;
        if (exponent == 1)
            return coefficient + "x";
        return coefficient + "x^" + exponent;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (obj instanceof Term)
        {
            Term other = (Term) obj;
            return this.exponent == other.exponent;
        }
        return false;
    }

    @Override
    public int compareTo(Term other)
    {
        return other.exponent - this.exponent; 
    }
}