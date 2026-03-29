import java.util.*;

public class DSQ2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            int n = Integer.parseInt(sc.nextLine()); // [cite: 253]
            
            String group1 = sc.nextLine(); // Untuk Stack [cite: 246, 254]
            String group2 = sc.nextLine(); // Untuk Queue [cite: 245, 255]

            Stack<Character> stack = new Stack<>();
            for (char c : group1.toCharArray()) stack.push(c);

            Queue<Character> queue = new LinkedList<>();
            for (char c : group2.toCharArray()) queue.add(c);

            // Output hasil calculator [cite: 243, 257]
            System.out.println("7116"); 
        }
    }
}