
package study;

//���� �޼ҵ尡 ����ִ� Ŭ���� ���� Ŭ���� �ȿ� ���� ���� �� �޼ҵ� ����
class Credit {

	 static public int number;
	public String owner;
	private String literate;

	public String getLiterate() {
		return literate;
	}

	public void setLiterate(String literate) {
		this.literate = literate;
	}

	
	//�޼ҵ�
	public int h(int a, int b) {
		int c;
		return c = a + b;

	}

}


//���� �޼ҵ尡 ����ִ� Ŭ�������� �ٸ� Ŭ������ �޼ҵ� �� ������ ����ϰ��� �Ѵٸ�,
//�Ʒ��� ���� �������ش�.
// �ۺ� Ŭ���� ī��(��) �ͽ����� ũ����Ʈ(��)



public class Card extends Credit {


	
	@Override
	public void setLiterate(String literate) {
		//TODO Auto-generated merhod stub
		super.setLiterate(literate);
		
	}
	
	public static void main(String[] args) {

	 Credit.number=100;
		
		
	 Credit a = new Credit();
	a.owner = "ȫ�浿";
	
	a.setLiterate("ȫ�浿");
	System.out.println(a.number);
	 System.out.println(a.getLiterate());
	}
}