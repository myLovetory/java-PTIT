import java.util.*;
public class J8015_capsocotongbangk {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long[] a = new long[n];
            Map<Long, Integer> m = new HashMap<>();
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
                if (m.containsKey(a[i])) {
                    int x = m.get(a[i]) + 1;
                    m.put(a[i], x);
                } else {
                    m.put(a[i], 1);
                }
            }
            long ans = 0L;
            List<Long> l = new ArrayList<>(m.keySet());
            for (Long i : a) {
                Long x = k - i;
                //Nếu x tồn tại trong Map, chương trình sẽ cộng số lần xuất hiện của x vào biến ans.
                if (m.containsKey(x)) {
                    if (i == x) {
                        ans += m.get(x) - 1;
                    } else {
                        ans += m.get(x);
                    }
                }
            }
            System.out.println(ans / 2);
        }
    }
}
