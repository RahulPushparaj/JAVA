package Practise;

public class a2b2c3 
{
	public static void main(String[] args) 
	{
		String s = "a1b2c3d4";
		char[] arr = s.toCharArray();
		
		
		for (int i = 1; i < arr.length; i=i+2)
		{
			int n = arr[i]-48;
			for (int j = 1; j <=n; j++)
			{
				System.out.print(arr[i-1]);
			}
		}
	}
}
/*
public class a2b2c3 
{
	public static void main(String[] args) 
	{
		
        String s = "a1b2c3d2";
        
        for(int i=0; i<s.length(); i++)
        {
            char a = s.charAt(i);
            int b = ((int)s.charAt(++i)-48);
           //  System.out.println(a);
            
            if(i+1 >= s.length())
            {
                for(int j=0; j<b; j++)
                System.out.print(a);
                break;
            }
            
            if (((int)s.charAt(i+1)-48)>-1 && ((int)s.charAt(i+1)-48)<10)
            {
                b = (b*10) + ((int)s.charAt(++i)-48);
            }
            //System.out.println(b);
            for(int j=0; j<b; j++)
                System.out.print(a);
        }
	}
}
*/