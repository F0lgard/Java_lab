package lab4;

public class lab4 {
    private double[] vector = null;
    public lab4(double[] vector){
        this.vector = vector;
    }

    public double mult(lab4 anotherVector){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] * anotherVector.vector[i];
        }
        return s;
    }
    public static double mult(lab4 a, lab4 b){
        return a.mult(b);
    }

    public double plus(lab4 anotherVector){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] + anotherVector.vector[i];
        }
        return s;
    }

    public static double plus(lab4 a, lab4 b){
        return a.plus(b);
    }

    public double minus(lab4 anotherVector){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] - anotherVector.vector[i];
        }
        return s;
    }

    public static double minus(lab4 a, lab4 b){
        return a.minus(b);
    }

    public double DodavaniaDoCysla(double number){
        double s = 0;
        for ( int i = 0; i < vector.length; i++ ){
            s += vector[i] * number;
        }
        return s;
    }

    public static double DodavaniaDoCysla(lab4 a, double n){
        return a.DodavaniaDoCysla(n);
    }

    public static void main(String[] args){
        double[] a = {1, 2, 3, 4};
        double[] b = {1, 1, 1, 1};
        double[] c = {2, 2, 2, 2};

        double n = 10;

        lab4 v1 = new lab4(a);
        lab4 v2 = new lab4(b);
        lab4 v3 = new lab4(c);
        System.out.println("v1*v2=" + v1.mult(v2));
        System.out.println("v1*v2=" + lab4.mult(v1, v2));
        System.out.println("v1*v3=" + v1.mult(v3));

        System.out.println("v1+v2=" + v1.plus(v2));
        System.out.println("v1+v2=" + lab4.plus(v1, v2));
        System.out.println("v1+v3=" + v1.plus(v3));

        System.out.println("v1-v2=" + v1.minus(v2));
        System.out.println("v1-v2=" + lab4.minus(v1, v2));
        System.out.println("v1-v3=" + v1.minus(v3));

        System.out.println("v1*n=" + v1.DodavaniaDoCysla(n));
        System.out.println("v2*n=" + lab4.DodavaniaDoCysla(v2, n));
        System.out.println("v3*n=" + v3.DodavaniaDoCysla(n));
    }
}
