import java.util.Scanner;
public class Loteria {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int combinacion;
		
		//System.out.println("Ponga la cantidad de combinaciones que desea: ");
		//combinacion = reader.nextInt();
		
			for(int a = 0; a <= 38; a++)
				for(int b = 0; b <= 38; b++)
					for(int c = 0; c <= 38; c++)
						for(int d = 0; d <= 38; d++)
							for(int e = 0; e <= 38; e++)
								for(int f = 0; f <= 38; f++){
									System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e+"-"+f);
								
								}
	}

}
