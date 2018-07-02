package test_june_22;

public class Ques29 {

	
	public static void main(String[] args) {
		String s1 = "Hello world";
		String s2 = "ello";
		String s3 = "i";
		
		int matcherLength = s2.length();
		int prevIndex;
		String newString;
		for(int i=0;i<s1.length();i++){
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i) == s2.charAt(j)){
					int count = matcherLength;
					prevIndex = i;
					int newI = i;
					int newJ = j;
					while(count>0 && newI<s1.length() && newJ<s2.length()){
						if(s1.charAt(newI) == s2.charAt(newJ)){
							newI++;
							newJ++;
							count--;
						}
						if(count == 0){
							newString = s1.substring(0, prevIndex);
							newString = newString + s3 + s1.substring(prevIndex+s2.length());
							System.out.println(newString);
							break;
						}
					}
					
				}
			}
		}
	}
}
