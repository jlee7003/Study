
public class date509_20 
{
	//20. pay라는 배열에 {100,200,150,55,88,95,56,96,88}의
	//값을 입력하고 총합을 구해서 출력하시오.
	
	int pay[]= {100,200,150,55,88,95,56,96,88};
	int sum=0;
	
	public void cal()
	{
		for(int i=0;i<pay.length;i++)
		{
			sum=sum+pay[i];
		}
	}
	
	public void output()
	{
		System.out.print(sum);
	}
		
}
