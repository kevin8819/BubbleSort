import java.util.Random;

public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] array = new int[10];
		
		Random rand = new Random();
		
		for(int i = 0; i < 10; i++)
		{
			array[i] = rand.nextInt(100);
			System.out.print(array[i] + " ");
		}

		int tracker = 0;
		System.out.println();
		
		for(int i = 1; i < array.length; i++)
		{
			System.out.println("\nOUTER LOOP" + " " + i);
			
			for(int k = 0; k < i; k++)
			{
				System.out.println();
				tracker++;
				for(int p = 0; p < array.length; p++)
				{
					System.out.print(array[p] + " ");
				}
				
				System.out.println("\nI'm comparing " + array[k] + " and " + array[i]);
				if(array[i] < array[k])
				{
					System.out.println(array[i] + " is less than " + array[k] + " so I swap them");
					int temp = array[k];
					array[k] = array[i];
					array[i] = temp;
				}
			}
		}
		System.out.println();
		
		for(int i = 0; i < array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println("\nI did " + tracker + " comparisons");
	}
}
