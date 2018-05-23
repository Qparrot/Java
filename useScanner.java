import java.util.*;

public class useScanner
{
	public static void main(String[] argc)
	{
		Scanner sc = new Scanner (System.in);
		System.out.print("Ecris ton nom !\nici :");
		String str = sc.nextLine();
		System.out.print("Merci, " + str + "\n");
	}
}
