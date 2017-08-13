public class Triangulo
{
    // instance variables - replace the example below with your own
    double lado1;
    double lado2;
    double lado3;
    double perime;
    double are;

    /**
     * Constructor for objects of class Triangulo
     */
    public Triangulo (double primer, double segundo, double tercer)
    {
        lado1=primer;
        lado2=segundo;
        lado3=tercer;
        perimetro();
        area();
    }

       public double area()
    {
        double oper = (lado1 + lado2 + lado3)*(0.5);
        double oper2 =Math.sqrt(oper*(oper-lado1)*(oper-lado2)*(oper-lado3));
        are = oper2;
        return are;
    }
        public double perimetro()
    {
        perime = lado1 + lado2 + lado3;
        return perime;
    }
}
