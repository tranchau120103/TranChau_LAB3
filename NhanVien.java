package TranChauLAB3;

import java.util.Scanner;

public class NhanVien 
{
    public String TenNhanVien;
    public double luongcoban;
    public double hesoluong;
    public double Luong_max;
    public double luong;

   
    
   public NhanVien(String TenNhanVien , double luongcoban,double hesoluong,double luong_max )
   {
    this.TenNhanVien=TenNhanVien;
    this.luongcoban=luongcoban;
    this.hesoluong=hesoluong;
    this.Luong_max=luong_max;
    this.luong = this.hesoluong*this.luongcoban;
   }

    public String getTenNhanVien() {
        return TenNhanVien;
    }

    public void setTenNhanVien(String TenNhanVien) {
        this.TenNhanVien = TenNhanVien;
    }

    public double getLuongcoban() {
        return luongcoban;
    }

    public void setLuongcoban(double luongcoban) {
        this.luongcoban = luongcoban;
    }

    public double getHesoluong() {
        return hesoluong;
    }

    public void setHesoluong(double hesoluong) {
        this.hesoluong = hesoluong;
    }

    public double getLuong_max() {
        return Luong_max;
    }

    public void setLuong_max(double Luong_max) {
        this.Luong_max = Luong_max;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "TenNhanVien=" + TenNhanVien + ", luongcoban=" + luongcoban + ", hesoluong=" + hesoluong + ", Luong_max=" + Luong_max +'}';
    }

    void tangluong(double luongthem)
    {
     boolean chophepthaydoi;
     System.out.println("luong them cua nhan vien ");
     Scanner sc = new Scanner(System.in);
     luongthem = sc.nextDouble();
     if (this.luong+luongthem < this.Luong_max)
     {
     chophepthaydoi = true;
     }
     else
     {
      chophepthaydoi = false;
     }
     if (chophepthaydoi==true)
     {
      this.luong = this.luong + luongthem;
      System.out.println("vay luong cua "+this.TenNhanVien+" la "+this.luong);
     }
     else 
     {
     luong=luong;
     System.out.println("vay luong cua " + this.TenNhanVien+" la "+luong);
     }
    }
    public static void main(String[] arg)
    {
     NhanVien[] nv = new NhanVien[10];
     nv[0]=inTTin();
     System.out.println(nv[0]);
     nv[0].tangluong(0);
     
    }
    public static NhanVien inTTin()
    {
    NhanVien nv =null;
    String tennhanvien;
    double luongcoban,hesoluong,luongmax;
    Scanner sc = new Scanner(System.in);
    System.out.println("NHAP TEN NHAN VIEN ");
    tennhanvien = sc.nextLine();
    System.out.println("NHAP LUONG CO BAN");
    luongcoban = sc.nextDouble();
    System.out.println("NHAP HE SO LUONG");
    hesoluong = sc.nextDouble();
    System.out.println("NHAP LUONG TOI DA");
    luongmax = sc.nextDouble();
    nv = new NhanVien(tennhanvien,luongcoban,hesoluong,luongmax);
    return nv;
    }
}

