package llll;
import java.io.*;

public class Exan12 {

	public static void main(String[] args)throws IOException {
		
BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;

//�̸� ���� �հ� ��� ��� ����



String[] name = new String [5];

String[] sub = {"����", "����", "����", "��ȸ", "����"};

char[] grade = new char[5];

int[] sum =  new int[5];
int[] avg = new int[5];
int[] rank = new int[5];


int[][] soc = new int[5][5];

int i, j, h, k;// �տ� �� ���� �Է¿� �̿� ��������, ������ �� ���� ����ڵ忡 �̿�.
		

for(i=0; i<name.length; i++) {
	System.out.print("�̸�");
	name[i] = br.readLine();
	
	for(j=0; j<sub.length; j++) {
	 System.out.print(sub[j]+"����:");
		soc[i][j] = Integer.parseInt(br.readLine());//���� ������� ���������� �Է¹޾Ƽ�
		sum[i] += soc[i][j];// ������ ��Ʈ�� �ٲ��ش�. �׷��� �����س��´�.
		//������ ��� ��� ������ ��ȸ�� ������ ���ʷ� �����Ǹ鼭 �� ����� ������ ������ ���� �� �ִ�.
	}
	
	avg[i]=sum[i]/5;
	if(avg[i]>=90) {
		grade[i]='A';
	}else if(avg[i]>=80) {
		grade[i]='B';
	}else if(avg[i]>=70) {
		grade[i]='C';
	}else if(avg[i]>=60) {
		grade[i]='D';
	}else {
		grade[i]='F';
	}
	
	System.out.println();
	
}
for(i=0; i<name.length; i++) {
rank[i] = 1;
	for(j=0; j<sub.length; j++) {
		if(avg[i]<avg[j]) {
			rank[i]++;
			
		}
		
	}
	
	
}//ù��° ������ ������.
	//���������� �Է��� �Ǿ �����Ͱ� ������ �� ���±� ������ ���� ��� ��ȣ�� �Է������
//��

System.out.println("�̸�\t����\t����\t����\t��ȸ\t����\t����\t���\t���\t����");
for(k=0; k<name.length; k++) {
	System.out.print(name[k]);
	for(h=0; h<sub.length; h++) {
		System.out.print("\t"+soc[k][h]);
	}
System.out.println("\t"+sum[k]+"\t"+avg[k]+"\t"+grade[k]+"\t"+rank[k]);
}



	}

}
