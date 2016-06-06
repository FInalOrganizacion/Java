package ejercio1;

public class tabla {
	int numeron; 
	public tabla()
	{
	}
	
	public int get_numeron()
	{
		return this.numeron; 
	}
    
	public void set_numeron(int numeron)
	{
		this.numeron=numeron; 
	}

	public void resultado(int numeron)
	{
		for(int i=1;i<=numeron;i++)
		{
			if(i==1)
			{
				System.out.println("TABLA DE  MULTIPLICAR ");
				System.out.print("*|  "+i+"  ");
			}
			else
		    System.out.print(i+"  ");	
		}
		System.out.println();
		for(int n=1;n<=numeron;n++)
		{
			System.out.print(n+"|  ");
		   for(int k=1;k<=numeron;k++)
		   {
			   if(n*k<10){
			   System.out.print(n*k+"  ");
			   }
			   else
				   System.out.print(n*k+" ");
			   if(k==numeron){
				   System.out.println();}}}}}
		