package org.lang;

public class LanguageInfo extends StateDetails{
	public void tamilLanguage() {
		System.out.println("Tamil Language Known People is 50");
		
	}
public void englishLanguage() {
	System.out.println("English Language Known People is 30");
	
}
public void hindiLanguage() {
	System.out.println("Hindi Language Known People is 20");

	
}
public static void main(String[] args) {
	LanguageInfo Li=new LanguageInfo();
	Li.southIndia();
	Li.northIndia();
	Li.tamilLanguage();
	Li.englishLanguage();
	Li.hindiLanguage();
}


}

