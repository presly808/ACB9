package ua.artcode.week2;

public class MethodContainer {
    /*
    *   interface -> signature -> outer body
    *   public static <type> <methodName>(<type> <argName>){
    *       // inner
    *       // body
    *   }
    * */
    public static int sum(int num1, int num2) {
        int res = num1 + num2;
        return res;
    }

    public static int sum3(int[] nums) {
        return nums[0] + nums[1] + nums[2];
    }



}
