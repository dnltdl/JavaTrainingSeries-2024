package day4OperationExpression;

public class RelationComparison {

    // 2. Relational / Comparison operation
    // Always result to boolean value - true/false
    // > , <, <=, >=, ==(isitEqual), != (is not Equals to)
    public static void main(String[] args) {
        int a = 30;
        int b = 30;
        //boolean comparingResult = a < b; // 10 < 20
        System.out.println( a + " > " + b + " = " + (a > b));
        System.out.println( a + " < " + b + " = " + (a < b));
        System.out.println( a + " <= " + b + " = " +(a <= b));
        System.out.println( a + " >= " + b + " = " +(a >= b));
        System.out.println( a + " == " + b + " = " +(a == b));
        System.out.println( a + " != " + b + " = " + (a != b));


    }
}
