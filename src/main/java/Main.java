import java.util.List;

public class Main {

    public static void main(String... args){

        int numrows = 5;
        Solution solution = new Solution();
        List<List<Integer>> answer = solution.generate(numrows);
        System.out.print(answer);

    }
}
