package date524;


public class Test1 
{
   int num1;
   int num2;
   // 객체를 생성할때 num1과 num2의 값을 가져오시오
   Test1(int num1,int num2)
   {
	   this.num1=num1; //System.out.println(num1);
	   this.num2=num2; //System.out.println(num2);
   }
   
   public void hap()
   {
	   // num1에서부터 num2까지의 합을 구하시오.
	   int sum = 0;
	   for(int i=num1;i<=num2;i++)
	   {
		   sum=sum+i;
	   }
	   System.out.println(sum);
   }
}
