public class function11 {
    //Calculate the binomial coefficient for n=5 and r=2
    public static int factorial(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        return fact;
    }

    public static int biCoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int binomialCoefficient=fact_n/(fact_r*fact_nmr);
        return binaryCoefficient;
    }
    public static void main(String[] args) {
        System.out.println(biCoeff(5, 2));
    }
}
