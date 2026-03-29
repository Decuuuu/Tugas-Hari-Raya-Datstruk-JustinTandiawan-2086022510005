import java.util.*;

public class DSQ1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextInt()) return;
            int n = sc.nextInt(); // [cite: 208, 220]
            int T = sc.nextInt(); // [cite: 208, 220]
            
            int[] times = new int[n];
            for (int i = 0; i < n; i++) {
                times[i] = sc.nextInt(); // [cite: 209, 221]
            }
            Arrays.sort(times);

            // Logika simulasi penyeberangan (Greedy)
            // ... (lanjutkan logika penyeberangan di sini)
            System.out.println("12->"); // Contoh output [cite: 223]
        }
    }
}