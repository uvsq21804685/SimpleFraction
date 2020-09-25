public class Main
{
    public static void main(String[] args) 
    {

        System.out.println("********** This is a test. *************");

        Fraction f1 = new Fraction(1, 2), f2 = new Fraction( 2, 3), result = new Fraction();
        
        //Test the result of the addition 
        result = f1.plus(f2);

        assert (result.getNumerateur() == 7 && result.getDenominateur() == 6) : "resultat d'addition incorrect :(";

        System.out.println(f1 + " + " + f2 + " = " + result);
        
        //Test the result of the sustraction
        result = f1.moins(f2);

        assert (result.getNumerateur() == -1 && result.getDenominateur() == 6) : "resultat de la soustraction incorrect :(";

        System.out.println(f1 + " - " + f2 + " = " + result);

        //Test the result of the multiplication
        result = f1.multiplier(f2);

        assert (result.getNumerateur() == 2 && result.getDenominateur() == 6) : "resultat de la mutiplication incorrect :(";

        System.out.println(f1 + " * " + f2 + " = " + result);

        //Test the result of the division
        result = f1.diviser(f2);

        assert (result.getNumerateur() == 3 && result.getDenominateur() == 4) : "resultat de la division incorrect :(";

        System.out.println(f1 + " / " + f2 + " = " + result);
    }
}