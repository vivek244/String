
public class Search_2D_word {
	
	static int R, C;
	
    static int[] x = { -1, -1, -1, 0, 0, 1, 1, 1 };
    static int[] y = { -1, 0, 1, -1, 1, -1, 0, 1 };

	static boolean search(char arr[][] ,String word) {
		int row=arr.length;
		int col=arr[0].length;
		int n=word.length();
		if(arr[row][col]!= word.charAt(0) )
			return false;
		
		for(int i=0;i<8;i++) {
			int k,rd=row + x[i] ,cd=col +y[i];
			
			for(k=1;k<n;k++) {
				if(rd>=R || rd<0 || cd>=C || cd<0)
					break;
				
				if(arr[rd][cd] !=word.charAt(k))
					break;
				rd +=x[i]; cd +=y[i];
			}
			if(k==n)
				return true;
		}
		return false;
		
	} 
	static void pattern(char gg[][],String ss) {
		for(int r=0;r<R;r++)
			for(int c=0;c<C;c++)
				if(search(gg,ss))
					System.out.println("pattern found at " + r + ", " + c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		R = 3;
        C = 13;
        char[][] grid = { { 'G', 'E', 'E', 'K', 'S', 'F', 'O', 'R', 'G', 'E', 'E', 'K', 'S' },
                          { 'G', 'E', 'E', 'K', 'S', 'Q', 'U', 'I', 'Z', 'G', 'E', 'E', 'K' },
                          { 'I', 'D', 'E', 'Q', 'A', 'P', 'R', 'A', 'C', 'T', 'I', 'C', 'E' } };
        search(grid, "GEEKS");
        System.out.println();
        search(grid, "EEE");

	}

}
