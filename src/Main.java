public class Main {
    public static void main(String[] args) {
        String myString = "Съешь еще этих мягких французских булочек.";
        int halfOfMyString;
        halfOfMyString = myString.length() / 2;
        String myStringPart1 = myString.substring(0, halfOfMyString);
        String myStringPart2 = myString.substring(halfOfMyString);
        System.out.println("Количество символов в первой части - " + myStringPart1.length());
        System.out.println("Количество символов во второй части - " + myStringPart2.length());

        if (myString.length() % 2 == 0) {
            System.out.println("Количество символов в строке равно - " + myString.length() + "\n" +
                    "Поделенная строка пополам - " + myStringPart1 + " : " + myStringPart2);
        } else {
            System.out.println("Количество символов в строке равно - " + myString.length() + ", поэтому ровно пополам строку поделить невозможно");
        }
    }
}