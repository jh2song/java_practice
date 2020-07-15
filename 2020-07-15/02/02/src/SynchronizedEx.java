public class SynchronizedEx {
	public static void main(String[] args) {
		SharedPrinter p = new SharedPrinter();
		String[] engText = {"Hello World",
				"BaekJoon Online Judge",
				"sfdajasjafsajdkl",
				"weriowueprwerir",
				"z.,vcmzxc,vmxcmv.,"};
		String[] korText = {"안녕 세상",
				"백준 온라인 저지",
				"러ㅏ임런ㅇㅁ;ㅣ란ㅇ",
				"ㅁㄴㅇ러;ㅣ머ㅏㄴㅇ러ㅏ",
				"카ㅓㅓㅋ티ㅓ차ㅣ퍼ㅣㅌ처"};
		
		Thread th1 = new WorkerThread(p, engText);
		Thread th2 = new WorkerThread(p, korText);
		
		th1.start(); th2.start();
		
	}
}

class SharedPrinter {
	synchronized void print(String text) {
		for(int i=0;i<text.length();i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
	/*
	void print(String text) {
		for(int i=0;i<text.length();i++)
			System.out.print(text.charAt(i));
		System.out.println();
	}
	*/
}

class WorkerThread extends Thread {
	private SharedPrinter p;
	private String [] text;
	
	public WorkerThread(SharedPrinter p, String[] text) {
		this.p=p;	this.text=text;
	}
	
	@Override
	public void run() {
		for(int i=0; i<text.length; i++)
			p.print(text[i]);
	}
}