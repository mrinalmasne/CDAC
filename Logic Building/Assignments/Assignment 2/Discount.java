public class Discount{
public static void main(String args[])
{
	int rs=500;
	double discount;
	String membership="no";
	if(rs>=1000)
	{discount=rs*20/100;}
	else if(rs>=500 && rs<=999)
	{discount=rs*10/100;}
	else
	{discount=rs*5/100;}

   if(membership=="yes")
   {
	   discount+=rs*5/100;
	     System.out.println(discount);
   }
     System.out.println(discount);
}
}
	
		
		