package program1;

public class pattern7 {

	public static void main(String[] args) {
		int k =1;
		for(int i=1;i<=5;i++){
			for(int j=1;j<=4;j++){
				if(i+j>=6){
					System.out.print(k);
					k++;
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println( );
		}

}
}