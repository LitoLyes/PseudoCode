public class Main {
    public static void main(String[] args) {
        int A = 21;
        int Result = A;
        int B = 12;
        int C = 28;

        if (B > Result){
            Result = B;
        }
        if (C > Result) {
            Result = C;
        }
        System.out.println(Result);

        ///Next Example

        int X = 2;
        int Y = 8;
        int Result2 = 1;

        while (Y > 0){
            if (Y % 2 == 0){
                Y = Y / 2;
                X = X*X;
            }else {
                Y = Y-1;
                Result2= Result2 * X;
            }
        }
        System.out.println(Result2);

        ///2 Homework

        int Z, V, R, M;
        Z = 5;
        V = -7;
        R = 0;


        if (V < 0){
            V = -V;
            M = -1;
        }else{
            M = 1;
        }
        System.out.println(M + " " + V);

        while (V > 0){

            if ( V % 2 == 0){
                Z = Z + Z;
                V = V / 2;
            }else {
                R= R + Z;
                V = V - 1;
            }
        }
        if (M < 0){
            R = -R;
        }
        System.out.println(R);

    }
}