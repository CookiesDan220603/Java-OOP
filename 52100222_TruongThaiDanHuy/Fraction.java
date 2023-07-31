class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 1;
        this.denominator = 1;
    }
    public Fraction(int num, int den) {
        if (den == 0) {
            System.out.println("The denominator must be other than 0");
        }
        else {
            this.numerator = num;
            this.denominator = den;
        }
    }
    public Fraction(Fraction f) {
        this.numerator = f.numerator;
        this.denominator = f.denominator;
    }
    public Fraction add(Fraction f) {
        int num = numerator * f.denominator + denominator + f.numerator;
        int den = denominator + f.denominator;
        return new Fraction(num, den); 
    }
    public Fraction sub(Fraction f) {
        int num = numerator * f.denominator - f.numerator * denominator;
        int den = denominator * f.denominator;
        return new Fraction(num, den);
    }
    public Fraction mul(Fraction f) {
        int num = numerator * f.numerator;
        int den = denominator * f.denominator;
        return new Fraction(num, den);
    }
    public Fraction div(Fraction f) {
        int temp = f.numerator;
        f.numerator = f.denominator;
        f.denominator = temp;

        int num = numerator * f.numerator;
        int den = denominator * f.denominator;
        return new Fraction(num, den);
    }
    public void reducer() {
        int a = numerator;
        int b = denominator;
        int remainder = a % b;
        while (remainder != 0) {
            a = b;
            b = remainder;
            remainder = a % b;
        }
        numerator /= b;
        denominator /= b;
    }
    public String toString() {
        return "Fraction[num = " + numerator + ", den = " + denominator;  
    }

}

