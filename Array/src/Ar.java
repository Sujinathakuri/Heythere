
public class Ar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {20,30,80,50};
		int maxNumber =0;
		for(int i=0;i<a.length;i++) {
			if(maxNumber<a[i]) {
				maxNumber=a[i];
			}
		}
		System.out.println("maxNumber= "+maxNumber);
	}

}
