package btlop;

public class HinhVuong
{
    public float canh;
    
    public HinhVuong(){}
    public HinhVuong(float canh)
    {
        this.canh = canh;
       
    }

    public float getCanh() {
        return canh;
    }

    public void setCanh(float canh) {
        this.canh = canh;
    }
    public void dientich(float dientich)
    {
     dientich = (float) Math.pow(canh, 2);
     System.out.println(" dien tich hinh vuong la "+dientich);
    }
    public void chuvi (float chuvi)
    {
    chuvi = (float) (4*canh);
    System.out.println(" chu vi hinh vuong la "+chuvi);
    }

    @Override
    public String toString() {
        return "HinhVuong{" + "canh=" + canh + '}';
    }

}