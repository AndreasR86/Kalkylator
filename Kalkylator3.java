
class Kalkulator3 {
    public static void main(String[] args) {

        char operator;
        Double number1, number2;




        operator= Program.getOperatorer();//Vi får operatorn från användaren.

        number1 = Program.getNumber();//Vi får första talet.

        number2 = Program.getNumber();//Vi får andra talet.

        Program.getResultat(operator, number1, number2);//Vi skriver ut resultatet

    }
}