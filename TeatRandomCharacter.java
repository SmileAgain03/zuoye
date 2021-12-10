package ex6;
//给出一个测试程序，显示175个随机的小字母

public class TeatRandomCharacter {
	public static void main(String[] args) {
		final int NUMBER_OF_CHARS = 175;
		final int CHARA_PER_LINE = 25;
		
		for(int i=0;i< NUMBER_OF_CHARS;i++) {
			char ch = RandomCharacter.getRandomLowerCaseLetter();
			if((i+1) % CHARA_PER_LINE == 0) 
				System.out.println(ch);
			else
				System.out.print(ch);
			}
		}
		
	}

