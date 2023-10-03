import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class Pair<T1, T2> {

    private T1 dau;
    private T2 hai;

    public Pair(T1 dau, T2 hai) {
        this.dau = dau;
        this.hai = hai;
    }

    private boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return n >= 2;
    }

    public boolean isPrime() {
        return isPrime((Integer) dau) && isPrime((Integer) hai);
    }

    @Override
    public String toString() {
        return dau + " " + hai;
    }
}

public class J07017_loppair {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(new File("DATA.in"));
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            boolean check = false;
            for(int i = 2; i <= 2*Math.sqrt(n); i++){
                Pair<Integer, Integer> p = new Pair<>(i, n-i);
                if(p.isPrime()){
                    System.out.println(p);
                    check = true;
                    break; 
                }
            }
            if(!check) System.out.println(-1);
        }
    }
}
