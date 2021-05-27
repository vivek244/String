
public class Rabin_karp {
	
	public static int c=256;
	
	public static void search(String pat,String txt, int q) {
		
		int m=pat.length();
		int n=txt.length();
		int p=0,t=0,h=1,j;
		
		for(int i=0;i<m-1;i++) {
			h=(h*c)%q;
		}
		
		for(int i=0;i<m;i++) {
			p=(c*p + pat.charAt(i))%q;
			t=(c*t + txt.charAt(i))%q;
		}
		
		for(int i=0;i<=n-m;i++) {
			if(p==t) {
				for( j=0;j<m;j++) {
					if(txt.charAt(i+j)  !=pat.charAt(j))
						break;	
				}
				 
				if (j == m)
	                    System.out.println("Pattern found at index " + i);
			}
			
			if(i<n-m) {
				t = (c*(t - txt.charAt(i)*h) + txt.charAt(i+m))%q;
				if(t<0) t=t+q;
			}
		}
				
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String txt = "Virat kohli king kohli";
        String pat = "li";
            
         
        int q = 11; 
        
        search(pat, txt, q);

	}

}
