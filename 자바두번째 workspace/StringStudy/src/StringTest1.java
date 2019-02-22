
public class StringTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Hello";

//		String s = new String("Hello");
//		System.out.println(s);

//		char[] c = { 'H', 'e', 'l', 'l', 'o' };
//		String s = new String(c);
//		System.out.println(c);
//		System.out.println(s);

//		StringBuffer sb = new StringBuffer("Hello");
//		String s2 = new String(sb);
//		System.out.println(s2);
//      
////      char charAt
//		String s3 = "Hello";
//		String n = "0123456";
//		char c02 = s3.charAt(4);
//		char c22 = n.charAt(1);
//		System.out.println(c02);
//		System.out.println(c22);

//		String nameStr = "박성욱";
//		String lastName = nameStr.charAt(0) + "";
//		
//		System.out.println(lastName);

////      int compareTo(Stringstr)
		// 앞에 글자가 작으면 음수
		// 앞에 글자가 크면 양수
//		String tempStr = "";
//		str.compareTo(tempStr);
//		int i = "aaa".compareTo("aaa");
//		int i2 = "aaa".compareTo("bbb");
//		int i3 = "bbb".compareTo("aaa");
//		System.out.println("i = " + i);
//		System.out.println("i = " + i2);
//		System.out.println("i = " + i3);

		// String concat(String str)
//      String s = "Hello";
//      String s2 = s.concat("World");
//      System.out.println(s);
//      System.out.println(s2);

//      boolean contains (CarSequence s)
//      String s = "abcdefg";
//      boolean b = s.contains("bg");
//      System.out.println(b);

//   boolean endsWith(String suffix)
//		String file = "Hello.txt";
//		boolean b = file.endsWith("txt");
//		System.out.println(b);

////      boolean equals(Object obj)
//		equals 는 비교연산자 같은 메서드다
//		String s = "Hello";
//		boolean b = s.equals("Hello");
//		boolean b2 = s.equals("hello");
////		System.out.println(b);
////		System.out.println(b2);
//		String strObj = new String("Hello");
//		String aaa = "Hello";
//		System.out.println("Hello" == "Hello");
//		System.out.println("Hello" == strObj);
//		System.out.println("Hello".equals(strObj));
//		System.out.println(aaa == "Hello");

////      boolean equalsIgnoreCase(String str)
//      String s = "Hello";
//      boolean b = s.equalsIgnoreCase("HELLO");
//      boolean b2 = s.equalsIgnoreCase("hello");
//      System.out.println(b);
//      System.out.println(b2);

////      int indexOf(int ch)
//		String s = "Hello";
//		int idx1 = s.indexOf('o'); // 왜 얘만 싱글따옴표?
//		int idx2 = s.indexOf('k');
//		int idx3 = s.indexOf('l');
//		System.out.println(idx1);
//		System.out.println(idx2);
//		System.out.println(idx3);
//		
//		str = "가나다라";
//		System.out.println(str.indexOf('나'));

////      int indexOf(int ch, int pos)
//		String s = "Hello";
//		int idx1 = s.indexOf('e', 0);
//		int idx2 = s.indexOf('l', 3);
//		System.out.println(idx1);
//		System.out.println(idx2);

////      int indexOf(String str)
//		String s = "ABCDEFG";
//		int idx = s.indexOf("ABCDEFG");
//		System.out.println(idx);

////      String intern() 상수풀(constant pool)?? 이해안됨
//		String s = new String("abc");
//		String s2 = new String("abc");
//		boolean b = (s == s2);
//		boolean b2 = s.equals(s2);
//		boolean b3 = (s.intern() == s2.intern());
//		System.out.println(b);
//		System.out.println(b2);
//		System.out.println(b3);

////      int lastIndexOf(int ch)
//		String s = "java.lang.Object";
//		int idx1 = s.lastIndexOf('.');
//		int idx2 = s.indexOf('.');
//		System.out.println(idx1);
//		System.out.println(idx2);

////      int length()
//		String s = "123";
//		int length = s.length();
//		System.out.println(length);

////      String replace(char old, char nw)
//		String s = "HeHlloHe";
//		String s1 = s.replace('H', 'C');
//		System.out.println(s);
//		System.out.println(s1);
//		String s2 = s.replace("He", "Z");
//		System.out.println(s);
//		System.out.println(s2);

////      String replaceAll(String regex, String replacement)
//		String ab = "AABBAABB";
//		String r = ab.replaceAll("BB", "bb");
//		System.out.println(r);

////      String replaceFirst(String regex,  String replacement)
//		String ab = "AABBAABB";
//		String r = ab.replaceFirst("BB", "bb");
//		System.out.println(r);

////      String[] split(String regex)
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);

////      String[] split(String regex, int limit)
//		String animals = "dog,cat,bear";
//		String[] arr = animals.split(",", 3);
//		for (int i = 0; i < arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[2]);

////      boolean startsWith(String prefix)
//		String s = "java.lang.Object";
//		boolean b = s.startsWith("java");
//		boolean b2 = s.startsWith("lang");
//		System.out.println(b);
//		System.out.println(b2);

//      String substring(int begin)
//      String substring(int begin, int end)
//		String s = "java.lang.Object";
//		String c = s.substring(2);
//		String p = s.substring(5, 9);
//		System.out.println(c);
//		System.out.println(p);

////      String toLowerCase()
//		String s = "HellO";
//		String s1 = s.toLowerCase();
//		System.out.println(s1);

////      String toString()
//		String s = "Hello";
//		String s1 = s.toString();
//		System.out.println(s1);

////      String toUpperCase()
//		String s = "Hello";
//		String s1 = s.toUpperCase();
//		System.out.println(s1);

//		String s = "Hello";
//		String s1 = s.toUpperCase();
//		System.out.println(s1);
//
//		String s = "  Hello World  12";
//		String s1 = s.trim();
//		System.out.println(s1);
//
		String b = String.valueOf(true);
		String c = String.valueOf('a');
		String i = String.valueOf(100);
		String l = String.valueOf(100L);
		String f = String.valueOf(10f);
		String d = String.valueOf(10.0);
		java.util.Date dd = new java.util.Date();
		String date = String.valueOf(dd);
//
		System.out.println(b);
		System.out.println(c);
		System.out.println(i);
		System.out.println(l);
		System.out.println(f);
		System.out.println(d);
		System.out.println(date);

	}

}
