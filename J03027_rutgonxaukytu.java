package j03027_rutgonxaukytu;
import java.util.*;
public class J03027_rutgonxaukytu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Stack st = new Stack();
        for (int i = str.length() - 1; i >= 0; --i)
        {
            if (!st.isEmpty() && str.charAt(i) == (char) st.peek())
                st.pop();
            else
                st.push(str.charAt(i));
        }
        if (st.isEmpty())
            System.out.print("Empty String");
        else
        {
            while (!st.isEmpty())
                System.out.print(st.pop());
        }
    }
    
}
