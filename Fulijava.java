import java.util.Scanner;

public class Fulijava {

    public static void main(String[] args) {
        // TODO Auto-generated3 method stub
        Scanner scanner=new Scanner(System.in);
        System.out.print("��ѡ��  :\n1.��������\n2.��������\n3.���㱾��\n4.����ʱ��\n5.�󱨳���\n6.һ������ʽ��ܶ�\n7.�µȶϢ�������\n");
        System.out.print("��ѡ��������ͣ�");
        int num=scanner.nextInt();
      
        if(num==1){
        	double F;
            System.out.print("��������\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("��������������ı���\n");
            double P=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("������������������ʱȣ�\n"); 
            float i=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("����������������ޣ�\n");  
            int n=scanner.nextInt();
            System.out.print("------------------------------\n"); 
            System.out.print("������������ĸ���������\n");    
            int k=scanner.nextInt();
            F=P*Math.pow(i/k+1,k*n);
            System.out.print("------------------------------\n");  
            System.out.print("ͨ��������������õĽ��Ϊ��\n"+String.format("%.2f", F)); 
            
        }
        if(num==2){
        	double F;
            System.out.print("��������\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("��������������ı���\n");
            double P=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("�������������������Ϣ��\n"); 
            float i=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("���������������������\n");  
            int n=scanner.nextInt();
            F=P*(1+i*n);
            System.out.print("------------------------------\n");  
            System.out.print("ͨ��������������õĽ��Ϊ��\n"+F); 

        }
        if(num==3){
           	System.out.print("��������ϣ����õ����ս��Ϊ��\n"); 
            double F=scanner.nextDouble();
            System.out.print("������<<����>>������Ϣ\n"); 
            System.out.print("------------------------------\n");   
            System.out.print("������������������ʱȣ�\n"); 
            float i1=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("����������������ޣ�\n");  
            int n1=scanner.nextInt();
            System.out.print("------------------------------\n"); 
            System.out.print("������������ĸ���������\n");    
            int k=scanner.nextInt();
            double P1=F/Math.pow(i1/k+1,k*n1);
            System.out.print("------------------------------\n");  
            System.out.print("ͨ��������������Ҫ�Ĵ����Ϊ��\n"+P1); 
          
            System.out.print("������<<����>>������Ϣ\n"); 
            System.out.print("------------------------------\n");   
            System.out.print("�������������������Ϣ��\n"); 
            float i2=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("���������������������\n");  
            int n2=scanner.nextInt();
            System.out.print("------------------------------\n"); 
            double P2=F/(1+i2*n2);
            System.out.print("------------------------------\n");  
            System.out.print("ͨ��������������Ҫ�Ĵ����Ϊ��\n"+P2); 
        	
        	
        }
        if(num==4){
            System.out.print("����ʱ��\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("��������������ı���\n");
            double a=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("������������ı����ʣ�\n"); 
            float b=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print(" ����������Ľ�\n");  
            double c=scanner.nextDouble();
            float d=72/b;
            System.out.print("------------------------------\n");  
            System.out.print("ͨ�������Ĺ�Ʊ�ʹ��õ��������������Ҫ����ݣ�\n"+d); 
        }
        if(num==5)
        {
            System.out.print("�󱨳���\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("��������������ı���\n");
            double a=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print(" ������������Ĵ��ʱ����\n"); 
            float d=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print(" ����������Ľ�\n");  
            double c=scanner.nextDouble();
            float b=72/d;
            System.out.print("------------------------------\n");  
            System.out.print("ͨ�������Ĺ�Ʊ�ʹ��𷭱��ı�����Ϊ��"+b+"%\n"); 
        }
        if(num==6)
        { 
            System.out.print("һ������ʽ��ܶ�\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("��������������ı���\n");
            double a=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("������������ı����ʣ�\n"); 
            float b=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("������������Ĵ��ʱ����\n");  
            int d=scanner.nextInt();
            double c=a*Math.pow(1+b,d);
            System.out.print("------------------------------\n");  
            System.out.print("������õ��ܽ���ǣ�\n"+c); 
        }
        if(num==7)
        { 
            System.out.print("�µȶϢ�������\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("���������������\n");
            double a=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("��������������������ʣ�\n"); 
            float b=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("�����������Ļ���ʱ�����£���\n");  
            int d=scanner.nextInt();
            double c=a*(b*Math.pow(1+b,d))/(Math.pow(1+b,d)-1);
            System.out.print("------------------------------\n");  
            System.out.print("��ÿ�µȶϢ�����ǣ�\n"+c); 
         }
        
    }


}