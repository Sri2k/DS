public class App {
    public static void main(String[] args) throws Exception {
        System.out.println(1 < 1);
        var recursion = new Param_Func_Recursion();
        int result = recursion.fact_of_n_v1(5);
        System.out.println(result);
    }
}
