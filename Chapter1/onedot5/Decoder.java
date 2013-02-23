package onedot5;

public class Decoder {
	public static void main(String [] args) throws Exception{
	     String s = "a1b2c8";
	     System.out.println(decode(s));
	     
	}
	public  static String decode(String str) throws Exception{
        if (str == null)
        	throw new Exception("empty string");
		StringBuffer buf = new StringBuffer();
		char flag = str.charAt(0);
		int i = 0;
		while (i < str.length() - 1){
			int begin = ++i   ;
			while(  (i < str.length())  && isNumber(str.charAt(i)) ){
				 i++;
			}
			int count = Integer.parseInt(str.substring(begin, i));
			for (int k = 0; k < count; k++){
				buf.append(flag);
			}
			if(i < str.length()){
				flag = str.charAt(i);
			}
			
		 }
			return buf.toString();
			
	}
		
	private static boolean isNumber(char c){
		return c <='9' && c >= '0';
	}
    

}