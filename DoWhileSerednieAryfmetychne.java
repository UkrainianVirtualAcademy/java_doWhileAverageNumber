import java.util.Scanner;
public class DoWhileSerednieAryfmetychne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strVvedenya="0";
		double suma=0.0; int iKilkistChysel=-1;
		do {
			suma += Double.parseDouble(strVvedenya);
			System.out.println("Введіть число або [.] щоб зупинитись:");
			strVvedenya = scan.nextLine();
			iKilkistChysel++;
		}
		while (!strVvedenya.equals("."));
		System.out.println("Ви ввели ("+iKilkistChysel+") чисел. Середнє арифметичне:" + suma/iKilkistChysel);
	}

}
