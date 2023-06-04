import java.util.Map;

public class MergeStringsAlternately {



    public  void result() {
        Map<String,String>testCases=Map.of(
            "abc","pqr","apbqcr",
            "ab","pqrs","apbqrs",
            "abcd","pq","apbqcd",
            "","pq","pq"
        );
        for (Map.Entry<String, String> entry : testCases.entrySet()) {
            long startTime = System.nanoTime();
            String result = solution(entry.getKey(), entry.getValue());
            long endTime   = System.nanoTime();
            System.out.println("Input: " + entry.getKey() + ", " + entry.getValue() + " | Output: " + result + " | Time: " + (endTime - startTime)/1000 + " mks"+ " | Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 + " KB");
        }
    }

    private  static String solution(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        int max = Math.max(word1.length(), word2.length());
        for (int i = 0; i < max; i++) {
            if (i < word1.length()) {
                result.append(word1.charAt(i));
            }
            if (i < word2.length()) {
                result.append(word2.charAt(i));
            }
        }
        return result.toString();
    }


}
