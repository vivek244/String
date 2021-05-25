
public class Wordwrap {
	
    final int max=Integer.MAX_VALUE;
	
	int printSolution (int p[], int n)
    {
        int k;
        if (p[n] == 1)
        k = 1;
        else
        k = printSolution (p, p[n]-1) + 1;
        System.out.println("Line number" + " " + k + ": " + 
                    "From word no." +" "+ p[n] + " " + "to" + " " + n);
        return k;
    }
	
	void solve(int l[],int n,int m) {
		
		int extras[][]=new int[n+1][n+1];
		int lc[][]= new int[n+1][n+1];
		int p[]=new int[n+1];
		int c[]=new int[n+1];
		
		for(int i=1;i<=n;i++) {
			extras[i][i]=m-l[i-1];
			for(int j=i+1;j<=n;j++) {
				extras[i][j]=extras[i][j-1]-l[j-1]-1;
			}
		}
		
		for(int i=1;i<=n;i++)
			for(int j=1;j<=n;j++) {
				if (extras[i][j] < 0)
                    lc[i][j] = max;
                else if (j == n && extras[i][j] >= 0)
                    lc[i][j] = 0;
                else
                    lc[i][j] = extras[i][j]*extras[i][j];
			}
		c[0]=0;
		for(int j=1;j<=n;j++) {
			c[j]=max;
			  for (int i = 1; i <= j; i++)
	            {
	                if (c[i-1] != max && lc[i][j] != max && 
	                   (c[i-1] + lc[i][j] < c[j]))
	                {
	                    c[j] = c[i-1] + lc[i][j];
	                    p[j] = i;
	                }
	            }
		}
			
		printSolution(p,n);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wordwrap w = new Wordwrap();
        int l[] = {3, 2, 2, 5};
        int n = l.length;
        int M = 6;
        w.solve (l, n, M);

	}

}
