package methodExample;

public class MethodExample3 {
	
	static Integer testIntegerValue; //
	static String testStringValue;
	
	//getter
	public static Integer getInteger() {
		return testIntegerValue;
	}
	
	//setter
	public static void setInteger(Integer value) {
		testIntegerValue = value;
	}
	
	//getter
	public static String getString() {
		return testStringValue;
	}
	
	//setter
	public static void setString(String value) {
		testStringValue = value;
	}
	

	public static void main(String[] args) {
		// 1. Integer
		setInteger(3); // (1) 3�� setting ���ְ�
		System.out.println("��� -> " + getInteger());
		
		// 2. String
		setString("�ȳ��ϼ���."); 
		System.out.println("��� -> " + getString());
	}

}
