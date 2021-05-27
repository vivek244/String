
public class Bracket_balancing {
	
	static long swap(String s) {
		int cl=0,cr=0,sw=0,bal=0;
		char[] chars=s.toCharArray();
		for(int i=0;i<chars.length;i++) {
			if(chars[i]=='[') {
				cl++;
				if(bal>0) {
				sw+=bal;
				bal--;
			}}
			else if(chars[i]==']') {
				cr++;
				bal=Math.abs(cr-cl);
				
				
			}
			
		}
		return sw;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="[[[[[]]]]]";
		System.out.println(swap(s));

	}

}
