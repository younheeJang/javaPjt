package comex.inher;

public class HashCodeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("test");
		String str2 = new String("test");
//�ؽ��ڵ� : �ؽ� �Լ��� ��� ��Ʈ ���ڿ�
		//���� ��ü�� ���� �ؽ� �ڵ带 ������ �Ѵ�.

//equals()�޵�Ұ� ���ٸ� �Ϲ������� ���� �ؽ��ڵ� ���� �����ٰ� �Ѵ�




		System.out.println("str1�� str2�� �ּҰ��� ������?" + (str1 == str2));
		System.out.println("str1�� str2�� �ؽ��ڵ�� ������?" + (str1.hashCode() == str2.hashCode()));


		System.out.println("h1�� �ؽ��ڵ�:" + str1.hashCode());
		System.out.println("h2�� �ؽ��ڵ�:" + str2.hashCode());

		
		HashCodeEx h1 = new HashCodeEx();
		HashCodeEx h2 = new HashCodeEx();

		System.out.println("h1�� h2�� �ּҰ��� ������?" + (h1 == h2));
		System.out.println("h1�� h2�� �ؽ��ڵ�� ������?" + (h1.hashCode() == h2.hashCode()));

		System.out.println("h1�� �ؽ��ڵ�:" + h1.hashCode());
		System.out.println("h2�� �ؽ��ڵ�:" + h2.hashCode());

	}

}
// ��Ʈ��(�ּҰ� �ٸ� �ؽ��ڵ� ���� ��Ʈ���� ���� �ڷᰪ�� �����صδ� ������ ����
// Ŭ����(�ּҰ� �ٸ� �ؽ��ڵ� �ٸ� Ŭ������ ��Ʈ������ �ٸ��� ��ü �ϳ��ϳ��� ���������� ����
/*
 * 16���� �ּҰ��� ���������� ��ȯ�� �� = �ؽ��ڵ� �޼ҵ�*/
