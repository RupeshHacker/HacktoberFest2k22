import java.util.Scanner;
public class TwoDArray
{
       	public static void main(String [] args)
{
	int i,j;
	Scanner ob=new Scanner(System.in);
	int m[] []=new int [3] [2];
	System.out.println("Enter 3*2 matrix element");
{
	for(i=0; i<3; i++)

{
	for(j=0; j<2; j++)

{
	m[i] [j]=ob.nextInt ();
}
}
	System.out.print("matrix");
	
	for(i=0; i<3; i++)
{
	for(j=0; j<3; j++)
{
	System.out.print(m[i] [j]+"");
}
	System.out.print("ln");
}
}
}
}