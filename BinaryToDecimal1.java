public class BinaryToDecimal1 {

    public static int getDecimal(int binary) {
        int decimal = 0;  // initializing the variable
        int n = 0; // initializing the variable

        while (true) {
            if (binary == 0) {
                break;
            }
            else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }

        }
        return decimal;
    }
}
