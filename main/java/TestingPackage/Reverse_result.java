package TestingPackage;

public class Reverse_result {
    public static void main(String[] args) {
        int inputNumber = 17320;
        reverseNumber(inputNumber);
        System.out.println("My input number is " + inputNumber + " and my reverse number is " + reverseNumber);


    }//end of main



    public static int reverseNumber(int inputNumber){
        System.out.println("The original number is " + inputNumber);

        int reversedNumber = 0;
        while (inputNumber != 0){
            int remainder = inputNumber % 10;

            reversedNumber = reversedNumber * 10 + remainder;

            inputNumber = inputNumber / 10;

            return reversedNumber;
        }


    }

}//end of class
