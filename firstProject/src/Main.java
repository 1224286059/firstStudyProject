// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Main m1 = new Main();
        System.out.println(m1.fibonacci(9));

    }
    public int f(int n){
        if(n == 0){
            return 1;
        } else if (n == 1) {
            return 4;
        }else {
            return f( n - 2 ) + 2 * f(n - 1);
        }
    }

    public int fibonacci(int n){
        if (n == 0 | n == 1){
            return 1;
        }else {
            return fibonacci(n - 1) + fibonacci( n - 2);
        }

    }

}





