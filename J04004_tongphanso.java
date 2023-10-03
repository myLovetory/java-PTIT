import java.util.Scanner;

class PhanSo
{
    private long tu,mau;
    
    public PhanSo(long tu,long mau)
    {
        this.tu =  tu;
        this.mau = mau;
    }
    public long GetTu()
    {
        return tu;
    }
    public void SetTu(long tu)
    {
        this.tu = tu;
    }
    public long GetMau()
    {
        return mau;
    }
    public void SetMau(long mau)
    {
        this.mau = mau;
    }
    public long GCD(long a, long b)
    {
        if (b == 0)
            return a;
        return GCD(b, a % b);
    }
    public void rutgon()
    {
        long GCD = GCD(this.tu, this.mau);
        this.tu /= GCD;
        this.mau /= GCD;
    }
    public void kqua(PhanSo A)
    {
        long LCM = this.mau * A.mau / GCD(this.mau, A.mau);
        this.tu *= LCM / this.mau;
        A.tu *= LCM / A.mau;
        this.mau = LCM;
        this.tu += A.tu;
        this.rutgon();
    }
}     
public class J04004_tongphanso {
     public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong(), b = sc.nextLong();
        PhanSo A = new PhanSo(a, b);
        a = sc.nextLong();
        b = sc.nextLong();
        PhanSo B = new PhanSo(a, b);
        A.kqua(B);
        System.out.print(A.GetTu()+ "/" + A.GetMau());
    }
}
