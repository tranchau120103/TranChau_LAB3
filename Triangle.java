package TranChauLAB3;
public class Triangle 
{
 public float width=0.0f;
 public float hegth=0.0f;
 public Triangle ()
 {
 }
 public Triangle(float width , float hegth)
 {
    width = this.width;
    hegth = this.hegth;
 }

    public float getWidth()
    {
        return width;
    }

    public void setWidth(float width)
    {
        this.width = width;
    }

    public float getHegth() 
    {
        return hegth;
    }

    public void setHegth(float hegth)
    {
        this.hegth = hegth;
    }

    @Override
    public String toString() {
        return "Triangle{" + "width=" + width + ", hegth=" + hegth + '}';
    }
    
 
    
    
    
    
}