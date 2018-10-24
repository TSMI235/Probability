public class NegativeBinomial extends DiscreteRandomDist {

    private int r;
    private double p;

    public NegativeBinomial(int r, double p) {
        super(new int[]{r,30});
        this.r = r;
        this.p = p;
    }

    //P(x=k) = (n choose k) * (p**k) * ((1-p)**(n-k)
    public double pmf(int k) {
        return (choose(k-1,r-1)* Math.pow(1-p,k-r) * Math.pow(p,r));
    }

    //E(x) = np
    public double exp() {
        return(r/p);
    }

    //Var(x) = np(1-p)
    public double var() {
        return(p*r/(Math.pow(1-p,2)));
    }
}
