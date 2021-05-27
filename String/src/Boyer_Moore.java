
public class Boyer_Moore {
	
	static int c=256;
	static int max(int a,int b) {
		return (a>b)?a:b;
	}
	
	static void bc(char str[],int size,int bad[]) {
		for(int i=0;i<c;i++) bad[i]=-1;
		for(int i=0;i<size;i++) {
			bad[(int)str[i]]=i;
			System.out.println(i);
		}
	}
	
	static void search(char pat[],char txt[]) {
		int m=pat.length;
		int n=txt.length;
		int bad[]=new int[c];
		int s=0;
		while(s<=(n-m)) {
			int j=m-1;
			while(j>=0 && pat[j]==txt[s+j])
				j--;
			if(j<0) {
				System.out.println("Pattern ocurrence at position :" + s);
				s += (s+m < n)? m-bad[txt[s+m]] : 1;
			}
			else {
				s += max(1, j - bad[txt[s+j]]);
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 char txt[] = "ABAAABCD".toCharArray();
         char pat[] = "ABC".toCharArray();
         search(pat,txt);

	}

}
