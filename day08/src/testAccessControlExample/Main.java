package testAccessControlExample;

import defaultExample.DefaultMain;
import protectedExample.ProtectedMain;
import publicExample.PublicMain;

public class Main {
	public static void main(String[] args) {
		
//		DefaultMain defaultMain = new DefaultMain();
//		defaultMain.getName();
//		
//		ProtectedMain protectedMain = new ProtectedMain();
//		protectedMain.getName();
		
		PublicMain publicMain = new PublicMain();
		publicMain.getName();
		
		// ����غ����?
		System.out.println("�ۺ�, ������ ������ ���ΰ�? " + publicMain.getName());
	}

}
