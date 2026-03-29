import java.util.*;

public class DSQ4 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            if (!sc.hasNextLine()) return;
            String input = sc.nextLine();
            // Membersihkan input dari koma jika ada, lalu dipisah per spasi
            String[] cards = input.split("\\s+");
            
            // Gunakan Stack utama untuk mensimulasikan tumpukan kartu raksasa (LIFO)
            Stack<String> giantStack = new Stack<>();
            for (String card : cards) {
                giantStack.push(card);
            }

            List<Stack<String>> resultStacks = new ArrayList<>();
            resultStacks.add(new Stack<>());

            // Proses kartu dari atas (LIFO) sesuai permintaan soal [cite: 299]
            while (!giantStack.isEmpty()) {
                String currentCard = giantStack.pop();
                boolean placed = false;

                for (Stack<String> s : resultStacks) {
                    if (!s.contains(currentCard)) {
                        s.push(currentCard);
                        placed = true;
                        break;
                    }
                }

                if (!placed) {
                    Stack<String> newStack = new Stack<>();
                    newStack.push(currentCard);
                    resultStacks.add(newStack);
                }
            }

            // Output setiap stack tanpa duplikat [cite: 306]
            for (Stack<String> s : resultStacks) {
                for (int i = 0; i < s.size(); i++) {
                    System.out.print(s.get(i) + (i == s.size() - 1 ? "" : " "));
                }
                System.out.println();
            }
        }
    }
}