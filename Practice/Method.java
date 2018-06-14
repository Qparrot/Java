import java.util.*;

public class Method
{
	public static void main(String[] argv)
	{
		int i;


		i = 2;
		System.out.println("Before the method the value is " + i);
		i = MultiplyByTwo(i);
		System.out.println("After the method the value is " + i);
	}

	public static int MultiplyByTwo(int x)
	{
		int ret;

		ret = x * 2;
		return ret;
	}
}

