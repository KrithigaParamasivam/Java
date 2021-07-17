class ReverseDigit {
    public static void main(String[] args) {

        int num =15423, rev = 0;
        while(num != 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        System.out.println("Reversed Number: " + rev);
    }
}