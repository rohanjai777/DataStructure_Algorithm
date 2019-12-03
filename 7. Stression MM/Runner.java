class MatrixMultiplication{
    public int [][] MM(int a[][], int b[][], int n){
        if(n<=2){
            int c[][] = new int[2][2];
            c[0][0] = a[0][0]*b[0][0]+a[0][0]*b[1][0];
            c[0][1] = a[0][0]*b[0][1]+a[0][1]*b[1][1];
            c[1][0] = a[1][0]*b[0][0]+a[1][1]*b[1][0];
            c[1][1] = a[1][0]*b[0][1]+a[1][1]*b[1][1];
            
            return c;
        }
        else{int j=0;
            int a1[][] = new int[n/2][n/2];
            int b1[][] = new int[n/2][n/2];
            int c1[][] = new int[n/2][n/2];
            int d1[][] = new int[n/2][n/2];
            int a2[][] = new int[n/2][n/2];
            int b2[][] = new int[n/2][n/2];
            int c2[][] = new int[n/2][n/2];
            int d2[][] = new int[n/2][n/2];
            for(int i=0;i<n/2;i++){
                for(j=0;j<n/2;j++){
                    a1[i][j] = a[i][j];
                }
            }
            for(int i=0;i<n/2;i++){
                for(j=n/2;j<n;j++){
                    b1[i][j] = a[i][j];
                }
            }
            for(int i=n/2;i<n;i++){
                for(j=0;j<n/2;j++){
                    c1[i][j] = a[i][j];
                }
            }
            for(int i=n/2;i<n;i++){
                for(j=n/2;j<n;j++){
                    d1[i][j] = a[i][j];
                }
            }
            
            for(int i=0;i<n/2;i++){
                for(j=0;j<n/2;j++){
                    a2[i][j] = b[i][j];
                }
            }
            for(int i=0;i<n/2;i++){
                for(j=n/2;j<n;j++){
                    b2[i][j] = b[i][j];
                }
            }
            for(int i=n/2;i<n;i++){
                for(j=0;j<n/2;j++){
                    c2[i][j] = b[i][j];
                }
            }
            for(int i=n/2;i<n;i++){
                for(j=n/2;j<n;j++){
                    d2[i][j] = b[i][j];
                }
            }
            
            int p[][] = new int[n/2][n/2];
            int q[][] = new int[n/2][n/2];
            int r[][] = new int[n/2][n/2];
            int s[][] = new int[n/2][n/2];
            int t[][] = new int[n/2][n/2];
            int u[][] = new int[n/2][n/2];
            int v[][] = new int[n/2][n/2];
            
            p = MM(sum(a1,d1,n/2), sum(a2,d2,n/2),n/2);
            q = MM(sum(c1,d1,n/2), a2,n/2);
            r = MM(a1, sub(b2,d2,n/2),n/2);
            s = MM(d1, sub(c2,a2,n/2),n/2);
            t = MM(sum(a1,d1,n/2), d2,n/2);
            u = MM(sub(c1,a1,n/2), sum(a2,b2,n/2),n/2);
            v = MM(sub(b1,d1,n/2), sum(c2,d2,n/2),n/2);
            
            int c[][] = new int[n/2][n/2];
            for(int i=0;i<n/2;i++){
                for(j=0;j<n/2;j++){
                    c[i][j] = p[i][j]+s[i][j]-t[i][j]+v[i][j];
                }
            }
            for(int i=0;i<n/2;i++){
                for(j=n/2;j<n;j++){
                    c[i][j] = r[i][j]+t[i][j];
                }
            }
            for(int i=n/2;i<n;i++){
                for(j=0;j<n/2;j++){
                    c[i][j] = q[i][j]+s[i][j];
                }
            }
            for(int i=n/2;i<n;i++){
                for(j=n/2;j<n;j++){
                    c[i][j] = p[i][j]+r[i][j]-q[i][j]+u[i][j];
                }
            }
            return c;
        }
    }
    
    public int[][] sum(int [][] a, int [][] b, int n){
        int c[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        return c;
    }
    public int[][] sub(int [][] a, int [][] b, int n){
        int c[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                c[i][j] = a[i][j]-b[i][j];
            }
        }
        return c;
    }
}
public class Runner{
    public static void main(String[] args){
        MatrixMultiplication m = new MatrixMultiplication();
        int [][] a = {{9,7,5,3},{3,5,7,9},{9,7,5,3},{1,3,5,7}};
        int [][] b = {{1,3,5,7},{7,5,3,1},{1,3,5,7},{9,7,5,3}};
        int [][] c = new int[4][4];
        c = m.MM(a,b,4);
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println(c[i][j]);
            }
        }
        
    }
}