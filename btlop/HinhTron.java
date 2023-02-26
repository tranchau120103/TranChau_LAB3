package btlop;

public class HinhTron
{
    public float bankinh;
    
    public HinhTron()
    {}

    public HinhTron(float bankinh) {
        this.bankinh = bankinh;
    }

    public float getBankinh() {
        return bankinh;
    }

    public void setBankinh(float bankinh) {
        this.bankinh = bankinh;
    }
    public void chuvi(float chuvi)
    {
     chuvi = (float)(2*bankinh*Math.PI);
     System.out.println("vay chu vi hinh tron la "+chuvi);
    }
    public void dientich(float dientich)
    {
    dientich =(float)(Math.pow(bankinh, 2)*Math.PI);
    System.out.println("vay dientich hinh tron la "+dientich);
    }

    @Override
    public String toString() {
        return "HinhTron{" + "bankinh=" + bankinh + '}';
    }
    
}