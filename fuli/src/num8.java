import java.util.Scanner;


public class num8 {
	{                    
	double [] P=new double [10];
	float [] i=new float [10];
	int [] n=new int [10];
	double [] F=new double [10];
	int [] k=new int [10];
	Scanner scanner=new Scanner(System.in);
	System.out.print("请输入投资数量：\n");
	int c=scanner.nextInt();	//c为投资数目
	for(int a=1;a<=c;a++){
		System.out.print("\n第"+a+"笔资金\n"); 
		System.out.print("请选择投资类型：1为复利计算  | 2为单利计算\n");
		int x=scanner.nextInt();		//x为投资类型
		if(x==1)
		{
		    System.out.print("复利计算\n"); 
		    System.out.print("------------------------------\n");             
		    System.out.print("请输入你所存入的本金：\n");
		    P[a]=scanner.nextDouble();
		    System.out.print("------------------------------\n");   
		    System.out.print("请输入你所存的年利率比：\n"); 
		    i[a]=scanner.nextFloat();
		    System.out.print("------------------------------\n");  
		    System.out.print("请输入你所存的年限：\n");  
		    n[a]=scanner.nextInt();
		    System.out.print("------------------------------\n"); 
		    System.out.print("请输入你所存的复利次数：\n");    
		    k[a]=scanner.nextInt();
		    F[a]=P[a]*Math.pow(i[a]/k[a]+1,k[a]*n[a]);
		    System.out.print("------------------------------\n");  
		    System.out.print("通过复利存款，你所获得的金额为：\n"+String.format("%.2f", F[a])+"\n");
		}
		if(x==2)
		{
	        System.out.print("单利计算\n"); 
	        System.out.print("------------------------------\n");             
	        System.out.print("请输入你所存入的本金：\n");
	        P[a]=scanner.nextDouble();
	        System.out.print("------------------------------\n");   
	        System.out.print("请输入你所存的周期利息：\n"); 
	        i[a]=scanner.nextFloat();
	        System.out.print("------------------------------\n");  
	        System.out.print("请输入你所存的周期数：\n");  
	        n[a]=scanner.nextInt();
	        F[a]=P[a]*(1+i[a]*n[a]);
	        System.out.print("------------------------------\n");  
	        System.out.print("通过单利存款，你所获得的金额为：\n"+String.format("%.2f", F[a])+"\n"); 
		}
		System.out.print("\n\t\t本金\t利率\t时间\t终值\n");
		for(int b=1;b<=c;b++){
			 System.out.print("第"+b+"笔资金投资\t"+P[b]+"\t"+i[b]+"\t"+n[b]+"\t"+String.format("%.2f", F[b])+"\n");
		}
	}
	}
}