import java.util.*;

public class methodTest
{
	public static void main(String[] args)
	{
		String str = "coucou";
		String str2 = "Coucou";

		if(str.equals(str2))
			System.out.print("identical Strings!\n");
		else
			System.out.print("Not the same String !\n");
		str2 = str2.toLowerCase();
		if(str.equals(str2))
			System.out.print("identical Strings!\n");
		else
			System.out.print("Not the same String !\n");
	}
}
