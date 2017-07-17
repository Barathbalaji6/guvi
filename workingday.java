package aa;
import java.util.*;
public class WorkingDay
{
public static void main(String ar[])throws Exception
{
	String day;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	day=sc.next();
	check(day);
	}
public static void check(String da)
{
	if(da.equalsIgnoreCase("Sunday"))
		System.out.println("false");
	else
		System.out.println("true");
	}
}
