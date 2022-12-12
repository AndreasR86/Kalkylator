import java.util.Scanner;

public class Program {
    /**
     * Användaren skriver in en operator
     * @return Operator
     */
    public static char getOperatorer() {
        char operator = ' ';
        Scanner input = new Scanner(System.in);
        boolean b= true;

        do{

            System.out.println("Valj operator: +, -, *, or /");
            operator = input.next().charAt(0);

            if (operator == '+' || operator == '-' || operator =='*' || operator == '/'){
                b = false;
                break;
            }else {

                System.out.println("Fel Operator");
            }
        }while (true);
        return operator;
    }

    /**
     * Vi får nummer av användaren
     * @return nummer
     */
    public static double getNumber(){
        Scanner input = new Scanner(System.in);
        double number = 0;
        while (true){
            System.out.println("Enter number");

            try{
                number = Double.parseDouble(input.next());
                break;
            }catch (NumberFormatException e){

                System.out.println("Fel input");
            }
        }
        return number;
    }

    /**
     *
     * @param operator Operator användaren väljer
     * @param number1 Första talet användaren väljer
     * @param number2 Andra talet användaren väljer
     */
    public static void getResultat(char operator, double number1, double number2){
        double result;
        switch (operator) {


            case '+':
                result = number1 + number2;
                System.out.println(number1 + " + " + number2 + " = " + result);
                break;

            case '-':
                result = number1 - number2;
                System.out.println(number1 + " - " + number2 + " = " + result);
                break;

            case '*':
                result = number1 * number2;
                System.out.println(number1 + " * " + number2 + " = " + result);
                break;

            case '/':
                result = number1 / number2;
                System.out.println(number1 + " / " + number2 + " = " + result);
                break;

            default:
                System.out.println("Fel operator!");
                break;
        }
    }
}