public class Binomial extends DiscreteRandomDist {

    private int n;
    private double p;

    public Binomial(int n, double p) {
        super(new int[]{0,n});
        this.n = n;
        this.p = p;
    }

    //P(x=k) = (n choose k) * (p**k) * ((1-p)**(n-k)
    public double pmf(int k) {
        return (choose(n,k)* Math.pow(p,k) * Math.pow(1-p,n-k));
    }

    //E(x) = np
    public double exp() {
        return(n*p);
    }

    //Var(x) = np(1-p)
    public double var() {
        return(n*p*(1-p));
    }
}
