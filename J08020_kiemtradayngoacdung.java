import java.util.*;
public class J08020_kiemtradayngoacdung {
    public static int check(String s)
    {
        Stack<Character> str = new Stack<>();
        for(int i = 0;i< s.length();i++)
        {
            char k = s.charAt(i);
            switch (k) {
                case ')':
                    if(str.empty() || str.peek() != '(')
                    {
                        return 0;
                    }   str.pop();
                    break;
                case ']':
                    if (str.empty() || str.peek() != '[')
                        return 0;
                    str.pop();
                    break;
                case '}':
                    if (str.empty() || str.peek() != '{')
                        return 0;
                    str.pop();
                    break;
                default:
                    str.push(k);
                    break;
            }
        }
        return 1;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            if (check(s) == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
    
}
