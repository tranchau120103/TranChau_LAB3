package TranChauLAB3;
public class Fraction
{
    public int numerator ;
    public int denomirator;
    public Fraction()
    {}
    public Fraction(int num , int den )
    {
     num = this.numerator;
     den = this.denomirator;
    }
    public Fraction(Fraction f)
    {
    this.numerator =   f.numerator;
    this.denomirator = f.denomirator;
    }
    public Fraction add(Fraction f)
    {
     Fraction kq = new Fraction();
     kq.numerator = f.denomirator*this.numerator +f.numerator*this.denomirator;
     kq.denomirator =this.denomirator*f.denomirator;
     return (kq);
    }
    public Fraction sub(Fraction f)
    {
     Fraction kq = new Fraction();
     kq.numerator = f.denomirator*this.numerator - f.numerator*this.denomirator;
     kq.denomirator =this.denomirator*f.denomirator;
     return (kq);
    }
    public Fraction mul(Fraction f)
    {
    Fraction kq = new Fraction();
     kq.numerator = this.numerator * f.numerator;
     kq.denomirator =this.denomirator*f.denomirator;
     return (kq);
    }
     public Fraction div(Fraction f)
    {
    Fraction kq = new Fraction();
     kq.numerator = this.numerator * f.denomirator;
     kq.denomirator =this.denomirator*f.numerator;
     return (kq);
    }
    public void reduce ()
    {
     int max =0;
     for (int i =1 ; i<this.numerator||i<this.denomirator ; i++)
     {
      if (this.numerator%i ==0&&this.denomirator%i==0 )
      {
       if (max <i)
       {
        max =i;
       }
      }
     }
     this.denomirator=this.denomirator/max;
     this.numerator=this.numerator/max;
    }

    @Override
    public String toString() {
        return "Fraction{" + "numerator=" + numerator + ", denomirator=" + denomirator + '}';
    }
    
}

