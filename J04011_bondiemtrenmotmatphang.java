
import java.util.*;

class Point3D
{
    public int x,y,z;
    
    public Point3D(int x,int y,int z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    
    public static boolean check(Point3D A, Point3D B, Point3D C,Point3D D)
    {
        Point3D AB = new Point3D(B.x - A.x, B.y - A.y, B.z - A.z);
        Point3D AC = new Point3D(C.x - A.x, C.y - A.y, C.z - A.z);
        Point3D AD = new Point3D(D.x - A.x, D.y - A.y, D.z - A.z);
         //tạo vector pháp tuyến vs mp ABCD
        Point3D ABAC = new Point3D(AB.y * AC.z - AB.z * AC.y, AB.z * AC.x - AB.x * AC.z, AB.x * AC.y - AB.y * AC.x);
        //tích zo hướng giữa ad và ABAC và AD
        int s = ABAC.x * AD.x + ABAC.y * AD.y + ABAC.z * AD.z;
        return s == 0;
    }
    
    
}
        
public class J04011_bondiemtrenmotmatphang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            Point3D p1 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p2 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p3 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());
            Point3D p4 = new Point3D(sc.nextInt(),sc.nextInt(),sc.nextInt());

            if(Point3D.check(p1,p2,p3,p4)){
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
