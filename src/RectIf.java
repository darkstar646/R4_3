//R4_3
/*public class Rectlf extends MyFrame2{
	public void run() {
		setSize(500,400); //frameのサイズを変更。runの直後でもよい
		int x=30;
		setColor(0,128,0);
		int i;
		for(i=0; i<10; i++) {
			if(i%2==0) {
				fillRect(x,100,10,100);
			} else {
				fillRect(x,80,10,100);
			}
			x+=20;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new Rectlf();
		frame1.setLocation(200,100);
		//frame1.setSize(300,400);

	}
}*/

public class RectIf extends MyFrame2{
	public void run() {
		setSize(500,400); 
		int x=30;
		setColor(0,128,0);
		int i;
		int a=7;
		for(i=0; i<20; i++) {
			if(i%15==0) {
				fillRect(x,80,10,25*a+10);
				//System.out.println(15);
			} else if(i%5==0) {
				fillRect(x,80,10,18*a+10);
				//System.out.println(5);
			}else if(i%3==0) {
				fillRect(x,80,10,10*a+10);
				//System.out.println(3);
			}else  {
				fillRect(x,80,10,10);
				//System.out.println("@");
			}	
			x+=20;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("プログラムを実行します");
		MyFrame2 frame1=new RectIf();
		frame1.setLocation(200,100);

	}
}