public class countingvowelsandconsonants {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		String str;
		int vowels = 0, Consonants = 0;
		char ch;
		str = "Metro";
		for(int i = 0; i < str.length(); i ++)
		{
			ch = str.charAt(i);

			if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
				vowels ++;
			else 
				Consonants++;
		}

		System.out.println("Vowels : " + vowels);
		System.out.println("Consonants : " + Consonants);
		

	}

}
