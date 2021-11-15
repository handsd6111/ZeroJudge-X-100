public class Martix_Process {
    public static double[][] Martix_Plus(double[][] martix1, double[][] martix2) {
        double[][] tmp = null;
        if(martix1.length > 0 && martix2.length > 0){
            if(martix1.length == martix2.length) {
                if(martix1[0].length == martix2[0].length)
                {
                    int _m = martix1.length, _n = martix1[0].length;
                    tmp = new double[_m][_n];
                    for(int m = 0; m < _m; m++) {
                        for(int n = 0; n < _n; n++) {
                            tmp[m][n] = martix1[m][n] + martix2[m][n];
                        }
                    }
                }
            }
        }
        return tmp;
    }
    public static double[][] Martix_Multiply(double[][] martix1, double[][] martix2) {
        double[][] tmp = null;
        if(martix1.length > 0 && martix2.length > 0){
            if(martix1[0].length == martix2.length) {
                int _m = martix1.length, _n = martix2[0].length;
                tmp = new double[_m][_n];
                for(int m = 0; m < _m; m++) {
                    for(int n = 0; n < _n; n++) {
                        for(int i = 0; i < martix2.length; i++) {
                            tmp[m][n] +=  martix1[m][i] * martix2[i][n];
                        }
                    }
                }
            }
        }
        return tmp;
    }
    public static double[][] Martix_Power(double[][] martix, int k) {
        double[][] tmp = null;
        if(martix.length > 0) {
            if(martix[0].length > 0) {
                tmp = martix;
                for(int i = 1; i < k; i++) {
                    tmp = Martix_Multiply(tmp, martix);
                }
            }
        }
        return tmp;
    }
    public static double[][] Martix_Transpose(double[][] martix) {
        double[][] tmp = null;
        if(martix.length > 0) {
            if(martix[0].length > 0) {
                int _m = martix.length, _n = martix[0].length;
                tmp = new double[_n][_m];
                for(int m = 0; m < _m; m++) {
                    for(int n = 0; n < _n; n++) {
                        tmp[n][m] = martix[m][n];
                    }
                }
            }
        }
        return tmp;
    }
    public static double Martix_Trace(double[][] martix) {
        double tmp = 0;
        if(martix.length > 0) {
            if(martix[0].length > 0) {
                int _m = martix.length, _n = martix[0].length;
                for(int m = 0; m < _m; m++) {
                    for(int n = 0; n < _n; n++) {
                        tmp += martix[m][n];
                    }
                }
            }
        }
        return tmp;
    }
}
