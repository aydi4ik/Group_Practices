public class Main {
    public static void main(String[] args) {
        oddOrEven(5);
        oddOrEven(6);
        System.out.println("______________________________");

        division(25,5);

        System.out.println("______________________________");

        finra();
    }

    static void oddOrEven(int num) {
        System.out.println(num % 2 == 0 ? num + " is even number" : num + " is odd number");
    }

    static void division(int dividend, int divisor) {
        int quotient=0;
        while (dividend>=divisor){
            dividend-=divisor;
            quotient++;

        }
        System.out.println("Quotient = " + quotient);
    }
    static void finra(){
        for (int i =1; i<=30; i++){
            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FINRA");
            } else if (i%5==0) {
                System.out.println("RA");

            } else if (i % 3 == 0 ) {
                System.out.println("FIN");
            }
            else {
                System.out.println(i);
            }

        }

    }
}