public class RationalFraction extends Number {

	private int numerator;
	private int denominator;

	public RationalFraction(int numerator, int denominator) {
		if (denominator != 0) {
			this.denominator = denominator;
		} else {
			throw new IllegalArgumentException("Не не не");
		}
		this.numerator = numerator;
	}

	public void setNumerator(int num) {
		numerator = num;
	}

	public int getNumerator() {
		return numerator;
	}

	public void setDenominator(int den) {
		denominator = den;
	}

	public int getDenominator() {
		return denominator;
	}

	@Override
	public int intValue() {
		return numerator / denominator;
	}

	@Override
	public long longValue() {
		long num = (long) numerator;
		long den = (long) denominator;
		return num / den;
	}

	@Override
	public float floatValue() {
		float num = (float) numerator;
		float den = (float) denominator;
		return num / den;
	}

	@Override
	public double doubleValue() {
		double num = (double) numerator;
		double den = (double) denominator;
		return num / den;
	}

	public int Nod(int a, int b) {
        while (b != 0) {
            int Ost = a % b;
            a = b;
            b = Ost;
        }
        return a;
    }

	public void reduce() {
        if (numerator == 0) {
            this.numerator = 0;
            this.denominator = 1;
        }
        int nod = Nod(this.numerator, this.denominator);
        this.numerator = numerator / nod;
        this.denominator = denominator / nod;
    }

	public RationalFraction add(RationalFraction a) {
        RationalFraction res = new RationalFraction(this.numerator * a.getDenominator() + a.getNumerator() * this.denominator,
                this.denominator * a.getDenominator());
        res.reduce();
        return res;
    }

    public RationalFraction sub(RationalFraction a) {
        RationalFraction res = new RationalFraction(this.numerator * a.getDenominator() - a.getNumerator() * this.denominator,
                this.denominator * a.getDenominator());
        res.reduce();
        return res;
    }

    public RationalFraction mult(RationalFraction a) {
        RationalFraction res = new RationalFraction(this.numerator * a.getNumerator(),
                this.denominator * a.getDenominator());
        res.reduce();
        return res;
    }

    public RationalFraction div(RationalFraction a) {
        RationalFraction res = new RationalFraction(this.numerator * a.getDenominator(), this.denominator * a.getNumerator());
        res.reduce();
        return res;
    }

    public RationalFraction negate(RationalFraction a) {
    	a.setNumerator(numerator * (-1));
    	return new RationalFraction(numerator, denominator);
    }

    public boolean isProper() {
    	if (Math.abs(numerator) < Math.abs(denominator)) {
    		return true;
    	} else {
    		return false;
    	}
    }

    @Override
    public String toString() {
    	return numerator + "/" + denominator;
    }
   
    public boolean equals(RationalFraction a) {
    	if (numerator == a.getNumerator() && denominator == a.getDenominator()) {
    		return true;
    	} else {
    		return false;
    	}
    }

    //@Override
    //public int hashCode() {
    //	return Objects.hash(numerator, denominator);
    //}

}