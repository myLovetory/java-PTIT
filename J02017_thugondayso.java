
package j02017_thugondayso;
import java.util.Stack;
import java.util.Scanner;

public class J02017_thugondayso {
    
    public static int dem(int n,int[] a)
    {
        Stack<Integer> st = new Stack<>();
        for(int i = 0;i<n;i++)
        {
            if(!st.isEmpty() && (st.peek() + a[i])%2==0)
            {
                st.pop();
            }else{
                st.push(a[i]);
            }
        }
        return st.size();
             
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0;i<n;i++)
        {
            a[i] = sc.nextInt();
        }
        int kqua = dem(n, a);
        System.out.println(kqua);
        
    }
    
}
