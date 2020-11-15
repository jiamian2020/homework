package Tools;

public class Tools {
    public int countNum(int num) {
        int ans = 0; // answer
        for (int i = 1; i <= num; i++) {
            ans = ans + i;
        }
        return ans;
    }

    public int simpleCircle(int num) {//简单的循环计算的阶乘
        int sum = 1;
        if (num < 0) {
            throw new IllegalArgumentException("请输入正整数");
        }
        for (int i = 1; i <= num; i++) {
            sum *= i;
        }
        return sum;//返回阶乘的值
    }

    public int Fibonacci(int num) {
        if(num == 0){
            return 0;
        }else if(num <= 2){
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        for(int i=3; i <= num; i++){
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}