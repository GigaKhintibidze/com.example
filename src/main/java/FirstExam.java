public class FirstExam {
    public static void main(String[] args) {

        helloText("Giga"); // პირველი ამოცანა

        int result = sum(10, 15);
        System.out.println(result); // მეორე ამოცანა

        boolean isEvenNumber = evenNumber();
        System.out.println("ricxvi 20 luwia? - " + isEvenNumber); // მესამე ამოცანა


        int wholeNumber = (int) price(7.60);
        System.out.println(wholeNumber); // მეოთხე ამოცანა



        System.out.println(maxOfTwo(17, 27)); // მეხუთე ამოცანა



        System.out.println(lengthOfString("Hello")); // მეექვსე ამოცანა


        int firstResult = multiplication(7,5);
        int secondResult = multiplication(3,5,2);
        System.out.println(firstResult);
        System.out.println(secondResult); // მეშვიდე ამოცანა



    }




    public static void helloText(String name) {
        System.out.println("hello " + name); // პირველი ამოცანა
    }



    public static int sum(int a, int b) {
        return a + b; // მეორე ამოცანა
    }



    public static boolean evenNumber() {
        return true; // მესამე ამოცანა
    }



    public static double price(double pasi) {
        return (int) pasi; // მეოთხე ამოცანა
    }




    public static int maxOfTwo(int a, int b) {
        if (a > b)
            return a;
        else {
            return b; // მეხუთე ამოცანა
        }
    }



    public static String lengthOfString(String word) {
        return "ტექსტში სიმბოლოების რაოდენობაა - " + word.length(); // მეექვსე ამოცანა
    }



    public static int multiplication(int a, int b){
        return a * b;
    }
    public static int multiplication(int a, int b, int c){
        return a * b * c; // მეშვიდე ამოცანა
    }



}

