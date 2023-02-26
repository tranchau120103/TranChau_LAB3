package TranChauLAB3;

public class Vector {
    public int i;
    public int j;
    public Vector(){}

    public Vector(int i, int j) {
        this.i = i;
        this.j = j;
    }
    public Vector (Vector f)
    {
   f.i =this.i;
   f.i=this.i;

    }
    public void cong(Vector f)
    {
    Vector v = new Vector();
    v.i=this.i+f.i;
    v.j =this.i+f.j;
    System.out.println("vay kq "+v.i);
    }
    public void tru(Vector f)
    {
    Vector v = new Vector();
    v.i=this.i-f.i;
    v.j =this.i-f.j;
    }
    public void nhan(Vector f,int r)
    {
    Vector v = new Vector();
    v.i=this.i*r;
    v.j =this.i*r;
    }
    public void nhanvohuong(Vector f,int kq)
    {
    Vector v = new Vector();
    kq = this.i*f.i+this.j*f.j;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public String toString() {
        return "Vector{" + "i=" + i + ", j=" + j + '}';
    }
    
    
}