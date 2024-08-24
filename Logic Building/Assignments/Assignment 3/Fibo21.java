public class Fibo21{
public static void main (String args[])
{ 
    int f1=0,f2=1,res=0;
   System.out.print(f1+" ");
   for(int i=1;i<=21;i++)
   {
	   f1=f2;
	   f2=res;
	   res=f1+f2;
	   System.out.print(res+" ");
   }
}
}