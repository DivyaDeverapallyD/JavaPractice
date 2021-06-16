package practice;

public class Abc {

	static int v = 10;
	final  int fin = 100;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Divya";
		char[] strarray = str.toCharArray();
		String rev = "";

		for (int i = strarray.length - 1; i >= 0; i--) {
			rev = rev + strarray[i];
		}
		System.out.println(rev);

		int v = 20;
		//fin=19;
		System.out.println("The Val iss" + v);
		
		
		
		
		
		ImageDisplay img= new ImageDisplay();
		//img.image();
		

	}

	void  methodName(int n) {

		v=10;
		//Deck deck= new Deck();
		
		//fin=120;

	}

}
