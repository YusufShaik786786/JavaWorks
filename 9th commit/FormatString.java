package com.steams.java;

@FunctionalInterface
interface FormatStringImpl {
	public void formatString(String s);
}

public class FormatString {
	String result = "";

	public void format() {
		int x=100;

		FormatStringImpl formatstr = (str1) -> {
			for (int i = 0; i < str1.length(); i++) {
				result +=str1.charAt(i) + " ";

			}

		};
		formatstr.formatString("Hello");
		System.out.println(result);

	}

	public static void main(String[] args) {
		FormatString fs=new FormatString();
		fs.format();
	}
}


