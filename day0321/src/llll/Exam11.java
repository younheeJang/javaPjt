package llll;

import java.io.*;

public class Exam11 {

	public static void main(String[] args) throws IOException{
	
		
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		
		//�迭 ����
		
		//�̸�
		
		String[] name = new String[5];
		
		//����
		
		int[] sum = new int[5];
		
		//���
		int[] avg = new int[5];
		
		//����
		char[] grade = new char[5];
		
	int i,j, k, h;
	
	String sub[] = {"����","����","����","��ȸ","����"};
	
	
	
	
	//2����
	
	

	int[][] soc = new int[5][5];
	
	
	int[] rank = new int[5];//����
	
	
	
	for(i=0; i<name.length; i++) {
		//�̸� �Է�
		System.out.print("�̸��Է�: ");
		
		name[i] =br.readLine();//�̸� �Է�
		//�� ���� ���� �Է�
		for(j=0; j<sub.length; j++) {
		//���� �����Է¹���	
			
		System.out.print(sub[j]+"����:");//sub[j]+"����:"  sub[j]�� �տ��� �Ҵ����� ������ �̸��̴ϱ� �� ������ �̸� + ����(��Ʈ�� ����)
		soc[i][j]=Integer.parseInt(br.readLine());//���� �Է��� �޴´�.
		//���� ������ �ڷ����� ��Ʈ���̱� ������ ���� ������ ���� ������ �Է��� ���� ����
		//��Ʈ�� ��ȯ�� ������� ��. �ڷ���, �Ľ���Ʈ,(����.�� �ڷ���)
		
		
	sum[i]+=soc[i][j]; // �հ�
		
		}
		
		avg[i]= sum[i]/5;
		
		if(avg[i]>=90)
			grade[i]='A';
		else if(avg[i]>=80)
			grade[i]='B';
		else if(avg[i]>=70)
			grade[i]='C';
		else if(avg[i]>=60)
			grade[i]='D';
		else
			grade[i]='F';
		
		System.out.println();
		
	}
		// ���� ���ϱ�
	for(i=0; i<name.length; i++){
		rank[i]=1;//1��
		for(j=0; j<sub.length; j++){
			if(avg[i]<avg[j]) {
				rank[i]++;
				
				/*for(i=0; i<name.length; i++) {
					rank[i] = 1;
						for(j=0; j<sub.length; j++) {
							if(rank[i]<rank[j]) {
								rank[i]++;
								
							}*/
			}
		
		}
		
		
	}
    
	//���
	System.out.println("�̸�\t����\t����\t����\t��ȸ\t����\t����\t���\t����\t����");
	for(k=0; k<name.length; k++) {
		System.out.print(name[k]);//�̸����
		for(h=0; h<sub.length; h++) {
			System.out.print("\t"+soc[k][h]);//�̸��� �� ���� ����
		
		}
	
	System.out.println("\t"+sum[k]+"\t"+avg[k]+"\t"+grade[k]+"\t"+rank[k]);
	}
	
	
 }

	
}
