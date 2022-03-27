public class EvenDigitSum {
    public static int getEvenDigitSum(int number) {
        if(number < 0) {
            return -1;
        }

        int sum = 0;
        int tempDigit;

        while (number != 0) {
            tempDigit = number % 10;
            if (tempDigit % 2 == 0) {
                sum += tempDigit;
            }
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(2));
        System.out.println(getEvenDigitSum(3));
        System.out.println(getEvenDigitSum(0));
        System.out.println(getEvenDigitSum(45));
        System.out.println(getEvenDigitSum(-10));
        System.out.println(getEvenDigitSum(12345678));
    }
}
