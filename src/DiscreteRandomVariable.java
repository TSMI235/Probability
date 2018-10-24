abstract class DiscreteRandomDist {

    //range[0] = lower bound
    //range[1] = upper bound
    private int[] range;

    public DiscreteRandomDist(int[] range) {
        this.range = range;
    }

    //Single point value "k" of the probability mass function
    abstract double pmf(int k);

    //The expected value
    abstract double exp();

    //The variance
    abstract double var();

    //Prints out all of the possible K values for the discrete variable x
    //and their pmf values
    public void fullpmf() {
        for (int i = range[0]; i < range[1]+1; i++)
            System.out.printf("PMF(%s) = %f\n",i,pmf(i));
    }

    //Simple recursive factorial method for private use in choose only
    private int fact(int j) {
        return (j == 1 || j == 0) ? 1 : j * fact(j - 1);
    }

    //for use in all subclasses for easy calculations of choose
    public int choose(int n, int k) {
        return (fact(n)/(fact(k)*fact(n-k)));
    }

}
