public class primeNo5
{
	public static void main(String args[])
	{
	int cnt=0;
		for(int i=2;i<=11;i++)
		{
			
			for(int j=2;j<=i/2;j++)
			{
				if(i%j==0)
				{
				cnt++;
				break;
			    }
			}
			if(cnt==0)
			{
				System.out.println(i);
			}
		}	
	}
}
	
/*for (int i = 2; i <= num; i++) {
    count = 0;
    for (int j = 2; j <= i / 2; j++) {
        if (i % j == 0) {
            count++;
            break;
        }
    }
    if (count == 0) {
        System.out.println(i);
    }
}*/
	
