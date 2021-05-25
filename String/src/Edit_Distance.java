
public class Edit_Distance {
	
	static int min(int x,int y,int z) {
		if(x<=y && x<=z)
			return x;
		if(y<=z && y<=x)
			return y;
		else return z;
	}
	
	static int edit(String a,String b,int n,int m) {
		
		
		if(m==0) return n;
		if(n==0) return m;
		
		if(a.charAt(n-1)==b.charAt(m-1))
				return(edit(a,b,n-1,m-1));
		
		return 1 +(min(edit(a,b,n-1,m-1),edit(a,b,n-1,m),edit(a,b,n,m-1)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "sunday";
        String str2 = "saturday";
 
        System.out.println(edit(
            str1, str2, str1.length(), str2.length()));

	}

}
