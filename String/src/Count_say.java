
public class Count_say {
	
	public static String count(int s) {
		String c="1";
		for(int i=0;i<s;i++) {
			c=counts(c);
		}
		return c;
	}
	public static String counts(String s) {
		int count=1;
		StringBuilder sb=new StringBuilder();
		char c=s.charAt(0);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==c) count++;
			else {
				sb.append(count);
				sb.append(c);
				c=s.charAt(i);
				count =1;
			}
		}
		sb.append(count);
		sb.append(c);
		return sb.toString();
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s= 11223345;
		System.out.println(count(s));

	}

}
