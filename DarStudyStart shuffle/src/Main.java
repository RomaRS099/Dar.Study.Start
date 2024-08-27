//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Solution {
    public static void main(String[] args) {
            String s = "codeleet";
            int[] indices = {4, 5, 6, 7, 0, 2, 1, 3};
            Solution solution = new Solution();
            String result = solution.restoreString(s, indices);
            System.out.print(result);
        }
}