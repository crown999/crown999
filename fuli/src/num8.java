import java.util.Scanner;


public class num8 {
	{                    
	double [] P=new double [10];
	float [] i=new float [10];
	int [] n=new int [10];
	double [] F=new double [10];
	int [] k=new int [10];
	Scanner scanner=new Scanner(System.in);
	System.out.print("������Ͷ��������\n");
	int c=scanner.nextInt();	//cΪͶ����Ŀ
	for(int a=1;a<=c;a++){
		System.out.print("\n��"+a+"���ʽ�\n"); 
		System.out.print("��ѡ��Ͷ�����ͣ�1Ϊ��������  | 2Ϊ��������\n");
		int x=scanner.nextInt();		//xΪͶ������
		if(x==1)
		{
		    System.out.print("��������\n"); 
		    System.out.print("------------------------------\n");             
		    System.out.print("��������������ı���\n");
		    P[a]=scanner.nextDouble();
		    System.out.print("------------------------------\n");   
		    System.out.print("������������������ʱȣ�\n"); 
		    i[a]=scanner.nextFloat();
		    System.out.print("------------------------------\n");  
		    System.out.print("����������������ޣ�\n");  
		    n[a]=scanner.nextInt();
		    System.out.print("------------------------------\n"); 
		    System.out.print("������������ĸ���������\n");    
		    k[a]=scanner.nextInt();
		    F[a]=P[a]*Math.pow(i[a]/k[a]+1,k[a]*n[a]);
		    System.out.print("------------------------------\n");  
		    System.out.print("ͨ��������������õĽ��Ϊ��\n"+String.format("%.2f", F[a])+"\n");
		}
		if(x==2)
		{
	        System.out.print("��������\n"); 
	        System.out.print("------------------------------\n");             
	        System.out.print("��������������ı���\n");
	        P[a]=scanner.nextDouble();
	        System.out.print("------------------------------\n");   
	        System.out.print("�������������������Ϣ��\n"); 
	        i[a]=scanner.nextFloat();
	        System.out.print("------------------------------\n");  
	        System.out.print("���������������������\n");  
	        n[a]=scanner.nextInt();
	        F[a]=P[a]*(1+i[a]*n[a]);
	        System.out.print("------------------------------\n");  
	        System.out.print("ͨ��������������õĽ��Ϊ��\n"+String.format("%.2f", F[a])+"\n"); 
		}
		System.out.print("\n\t\t����\t����\tʱ��\t��ֵ\n");
		for(int b=1;b<=c;b++){
			 System.out.print("��"+b+"���ʽ�Ͷ��\t"+P[b]+"\t"+i[b]+"\t"+n[b]+"\t"+String.format("%.2f", F[b])+"\n");
		}
	}
	}
}