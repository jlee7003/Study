

public class parent_접근제한자 {


	
	int num=100;
	public void cal()
	{
		int hap=0;
		for(int i=1;i<=100;i++)
		{
			hap=hap+i;
		
		}
		System.out.println("합: "+hap);
	}
	public static void main(String[] args) {
		parent_접근제한자 p=new parent_접근제한자();
		p.cal();
		son s=new son(12,33);
	}
	
}
class son //상속하지 않은 클래스
{
	int a;
	int b;
	son(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	public void total()
	{
		int hap=0;
		for(int i=a;i<=b;i++)
		hap=hap+i;
		System.out.println("합 :"+hap);
	}

}

/*상속: 다른 클래스의 속성, 메소드를 나의 클래스에 포함시키는 개념
 * A클래스와 내가 만든 B 클래스를 사용한다.
 * 각각의 클래스를 사용할 수 있다 A a=new A(), B b=new B();
 * 상속: B b =new B(); 
 * 
 *
 *public
 *protected--- 다른 패키지에 있으면 사용 못함 , 단 protected는 상속이 가능함
 *defalut----- 다른 패키지에 있으면 사용 못함
 *private
 *
 *
 */