
public class Arr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int b[] = {10,50,5,70,60};
		int MinNumber = 100;
		for(int i = 0;i<b.length;i++) {
			if(MinNumber>b[i]) {
				MinNumber = b[i];
			}
		}

		System.out.println("MinNumber="+MinNumber);
	}

}
