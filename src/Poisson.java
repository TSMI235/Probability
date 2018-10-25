public class Poisson extends DiscreteRandomDist {

    private double y;

    public Poisson(double y) {
        super(new int[]{0,15});
        this.y = y;
    }

    //P(x=k) = (n choose k) * (p**k) * ((1-p)**(n-k)
    //TODO: Check range of K to see if it is a valid parameter and error if not
    public double pmf(int k) {
        return (Math.pow(y,k)*Math.pow(Math.E,-y)/fact(k));
    }

    //E(x) = np
    public double exp() {
        return(y);
    }

    //Var(x) = np(1-p)
    public double var() {
        return(y);
    }
}