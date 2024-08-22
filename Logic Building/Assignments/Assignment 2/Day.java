public class Day{
public static void main(String args[])
{
  int day=7,input=7;
  switch(day)
  {
	  case 1:
	  System.out.println("Monday");
	  switch(input)
	  {
		  case 1:case 2:case 3:case 4: case 5:
		  System.out.println("weekday");
	  }
	  break;
	  case 2:
	  System.out.println("Tuesday");
	   switch(input)
	  {
		  case 1:case 2:case 3:case 4: case 5:
		  System.out.println("weekday");
	  }
	  break;
	  case 3:
	  System.out.println("Wednesday");
	   switch(input)
	  {
		  case 1:case 2:case 3:case 4: case 5:
		  System.out.println("weekday");
	  }
	  break;
	  case 4:
	  System.out.println("Thursday");
	   switch(input)
	  {
		  case 1:case 2:case 3:case 4: case 5:
		  System.out.println("weekday");
	  }
	  break;
	  case 5:
	  System.out.println("Friday");
	   switch(input)
	  {
		  case 1:case 2:case 3:case 4: case 5:
		  System.out.println("weekday");
	  }
	  break;
	  case 6:
	  System.out.println("Saturday");
	   switch(input)
	  {
		  case 6:case 7:
		  System.out.println("weekend");
	  }
	  break;
	  case 7:
	  System.out.println("Sunday");
	   switch(input)
	  {
	    case 6:case 7:
		  System.out.println("weekend");
	  }
	  break;
	  default:
	  System.out.println("Invalid Day");
  }
}
}
	  