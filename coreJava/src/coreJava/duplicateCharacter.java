package coreJava;

public class duplicateCharacter {

	public static void main(String[] args) {
		int count=0;
		//char d='w';
		String s = "welcome to ojas";
		char c[]=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			if(c[i]=='o')
			{
				count++;
			}
			
		}
		System.out.println(count);
	}

}
