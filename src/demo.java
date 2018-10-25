public class demo {

    public static void main(String[] args) {
        Binomial test = new Binomial(10,0.5);
        System.out.println(test.pmf(3));
        test.fullpmf();

        Geometric test2 = new Geometric(0.85);
        System.out.println(test2.pmf(10));
        test2.fullpmf();

        NegativeBinomial test3 = new NegativeBinomial(5,0.4);
        System.out.println(test3.pmf(10));
        test3.fullpmf();

        Poisson test4 = new Poisson(5);
        System.out.println(test4.pmf(3));
        test4.fullpmf();
    }
}