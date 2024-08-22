public class StdMarks{
public static void main(String args[])
{
	int sub1=45,sub2=40,sub3=30;
	int cnt=0;
	
	switch (sub1 > 40 ? 1 : 0) {
            case 0: // Failed in Subject 1
                cnt++;
                break;
            case 1: // Passed in Subject 1
                break;
        }

        // Nested switch to check Subject 2
        switch (sub2 > 40 ? 1 : 0) {
            case 0: // Failed in Subject 2
                cnt++;
                break;
            case 1: // Passed in Subject 2
                break;
        }

        // Nested switch to check Subject 3
        switch (sub3 > 40 ? 1 : 0) {
            case 0: // Failed in Subject 3
                cnt++;
                break;
            case 1: // Passed in Subject 3
                break;
        }
		switch (cnt) {
            case 0:
                System.out.println("The student passes all subjects.");
                break;
            default:
                System.out.println("The student failed in " + cnt + " subject(s).");
                break;
        }
}
}

		
		