package study;

//import exam.Exam;// ��Ű���� ��Ű�� 


//Ŭ������ ���� ������� �� ���ο��� ����ϱ� ���ؼ���
class CreditCard{
	//public�� ���� ��������

	
	
	
static	public long number; // ���ο��� ��ü ���� �� ��ü �̸�.�� ������ �� ������ ���� �����ڰ� ����
	public String owner;
    private String literate;//private�� ���ο��� ������. ���� ���� ��� ������ ���࿡�� ����
	public String getLiterate() {
		return literate;
	}
	public void setLiterate(String literate) {
		
		//������ this ���� Ŭ���� ���� �ִٴ� ��
		this.literate = literate;
	}
	
 public int aa(int a, int b) {
	 
	 
	 
	 
	 int c;
	 return c=a+b;
	 
 }
 /*getter�� setter�����
  * Private �����
  * 
  *  �Է½� set
  *  ��½� get
  */
   
 
	
}


public class Exam1 extends CreditCard{

protected void name() {
	
	
}	

@Override
public void setLiterate(String literate) {
	//TODO Auto-generated merhod stub
	super.setLiterate(literate);
	
}

	public static void main(String[] args) {
		//1.��ü�� �����ؾ� �Ѵ�.
		//Ŭ�����̸� ��ü�̸� = new ������;
		
		
		//�ٸ� Ŭ�������� static�� ���� �޼ҵ�� ���ο��� �޼ҵ��̸������� �޼ҵ� Ȱ���� �����ϴ�.
		CreditCard.number=100;
		
		
		//�ٸ� Ŭ�������� static�� ������ ���� �޼ҵ带 Ȱ��� 
		//������ ���� �ν��Ͻ� ������ ������־�߸� Ȱ���� ������.
		CreditCard card = new CreditCard();
		card.number=123456;
		card.owner = "ȫ�浿";
		
		//private
	    card.setLiterate("ȫ�浿");
		System.out.println(card.number);
		System.out.println(card.getLiterate());
		
	}

}
