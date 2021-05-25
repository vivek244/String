
public class Longest_Palindromic {
	
	static void printSubStr(String s, int low, int high)
	{
	    for (int i = low; i <= high; ++i)
	        System.out.print(s.charAt(i));
	}
	
	 static int Pal(String s) {
		int n=s.length();
		int i,j,max=1,start=0;
		for( i=0;i<n;i++) {
			for(j=i;j<n;j++) {
				int flag=1;
				for(int k=0;k<(j-i+1)/2; k++)
					if(s.charAt(i+k) != s.charAt(j-k))
						flag=0;
				if(flag!=0 && (j-i+1)>max) {
					start=i;
				    max=j-i+1;}
//				    System.out.println(max);
			}
			
		}
		 System.out.print("Longest palindrome subString is: ");
		 printSubStr(s, start, start + max - 1);
		return max;
	}

	 
		public static void main(String[] args)
		{
		    String str = "forgeeksskeegfor";
		    System.out.print("\nLength is: "
		         + Pal(str));
		}
		

	}


