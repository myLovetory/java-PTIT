
/**
 *
 * @author TGDD
 */
import java.util.*;

public class J08022_phantubenphaidautienlonhon {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- >0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> vector = new ArrayList<>();
            for(int i = 0;i<n;i++)
            {
                vector.add(sc.nextInt());
            }
            
            for(int i = 0;i<n;i++)
            {
                int check  = 0;
                for(int j = i + 1;j<n;j++)
                {
                    if(vector.get(i) < vector.get(j))
                    {
                        System.out.print(vector.get(j) + " ");
                        check = 1;
                        break;
                    }
                }
                if(check == 0) System.out.print("-1 ");
            }
            System.out.println("");
        }
        
    }
}