import java.util.Map;

public class GreatestCommonDivisorOfStrings {

    public void result(){
        Map<String,String>testCases= Map.of(
                "ABCABC","ABC",
                "ABABAB","ABAB",
                "LEET","CODE"
        );

        for (Map.Entry<String, String> entry : testCases.entrySet()) {
            long startTime = System.nanoTime();
            String result = solution(entry.getKey(), entry.getValue());
            long endTime   = System.nanoTime();
            System.out.println("Input: " + entry.getKey() + ", " + entry.getValue() + " | Output: " + result + " | Time: " + (endTime - startTime)/1000 + " mks"+ " | Memory: " + (Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory()) / 1024 + " KB");
        }

    }

    private static String solution(String word1, String word2) {
        if (word1.length() < word2.length()) {
            return solution(word2, word1);
        }
        if (!word1.startsWith(word2)) {
            return "";
        }
        if (word2.isEmpty()) {
            return word1;
        }
        return solution(word1.substring(word2.length()), word2);
    }

}
