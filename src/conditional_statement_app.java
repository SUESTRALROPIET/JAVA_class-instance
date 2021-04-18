public class conditional_statement_app 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		if(false) //boolean(true/false)만 가능!
		{
			System.out.println(1);
		}
		else if(true) // <--if(false), else를 대신 사용해서 하나의 if문으로 그룹핑! 
		{
			System.out.println(2);
		}
		else
		{
			System.out.println(3);
		}
		System.out.println("b");
	}
}
