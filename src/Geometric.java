public class Geometric extends DiscreteRandomDist {

    private int n; //Going to default it to 20
    private double p;

    public Geometric(double p) {
        super(new int[]{1,15});
        this.n = 20;
        this.p = p;
    }

    //P(x=k) = (n choose k) * (p**k) * ((1-p)**(n-k)
    //TODO: Check range of K to see if it is a valid parameter and error if not
    public double pmf(int k) {
        return Math.pow((1-p),k-1)*p;
    }

    //E(x) = np
    public double exp() {
        return(1/p);
    }

    //Var(x) = np(1-p)
    public double var() {
        return((1-p)/(p*p));
    }
}
