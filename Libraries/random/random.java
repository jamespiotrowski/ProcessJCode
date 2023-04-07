package std;

public class random {
    static java.util.Random r = new java.util.Random(0);
    
    public static void initRandom(long seed) {
        r = new java.util.Random(seed);
    }
    
    public static long longRandom() {
        return r.nextLong() & Long.MAX_VALUE;
    }

    public static double gaussianRandom(){
        return r.nextGaussian();
    }

    public static double gaussianRandom(double mean, double standardDeviation){
        return r.nextGaussian() * standardDeviation + mean;
    }

}
