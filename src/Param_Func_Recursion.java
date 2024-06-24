public class Param_Func_Recursion {

    public int sum_of_n_v1(int n) {
        if (n == 1) {
            return n;
        }
        return n + sum_of_n_v1(n - 1);
    }

    public int sum_of_n_v2(int n, int sum) {
        if (n < 1) {
            return sum;
        }
        return sum_of_n_v2(n - 1, sum + n);
    }

    public int fact_of_n_v1(int n) {
        if (n == 1)
            return 1;
        return n * fact_of_n_v1(n - 1);
    }

}
