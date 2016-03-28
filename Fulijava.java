import java.util.Scanner;

public class Fulijava {

    public static void main(String[] args) {
        // TODO Auto-generated3 method stub
        Scanner scanner=new Scanner(System.in);
        System.out.print("请选择  :\n1.复利计算\n2.单利计算\n3.计算本金\n4.求存款时长\n5.求报酬率\n6.一定年份资金总额\n7.月等额本息还款计算\n");
        System.out.print("请选择计算类型：");
        int num=scanner.nextInt();
      
        if(num==1){
        	double F;
            System.out.print("复利计算\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("请输入你所存入的本金：\n");
            double P=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("请输入你所存的年利率比：\n"); 
            float i=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("请输入你所存的年限：\n");  
            int n=scanner.nextInt();
            System.out.print("------------------------------\n"); 
            System.out.print("请输入你所存的复利次数：\n");    
            int k=scanner.nextInt();
            F=P*Math.pow(i/k+1,k*n);
            System.out.print("------------------------------\n");  
            System.out.print("通过复利存款，你所获得的金额为：\n"+String.format("%.2f", F)); 
            
        }
        if(num==2){
        	double F;
            System.out.print("单利计算\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("请输入你所存入的本金：\n");
            double P=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("请输入你所存的周期利息：\n"); 
            float i=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("请输入你所存的周期数：\n");  
            int n=scanner.nextInt();
            F=P*(1+i*n);
            System.out.print("------------------------------\n");  
            System.out.print("通过单利存款，你所获得的金额为：\n"+F); 

        }
        if(num==3){
           	System.out.print("请输入你希望获得的最终金额为：\n"); 
            double F=scanner.nextDouble();
            System.out.print("请输入<<复利>>存款的信息\n"); 
            System.out.print("------------------------------\n");   
            System.out.print("请输入你所存的年利率比：\n"); 
            float i1=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("请输入你所存的年限：\n");  
            int n1=scanner.nextInt();
            System.out.print("------------------------------\n"); 
            System.out.print("请输入你所存的复利次数：\n");    
            int k=scanner.nextInt();
            double P1=F/Math.pow(i1/k+1,k*n1);
            System.out.print("------------------------------\n");  
            System.out.print("通过复利存款，你所需要的存款金额为：\n"+P1); 
          
            System.out.print("请输入<<单利>>存款的信息\n"); 
            System.out.print("------------------------------\n");   
            System.out.print("请输入你所存的周期利息：\n"); 
            float i2=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("请输入你所存的周期数：\n");  
            int n2=scanner.nextInt();
            System.out.print("------------------------------\n"); 
            double P2=F/(1+i2*n2);
            System.out.print("------------------------------\n");  
            System.out.print("通过复利存款，你所需要的存款金额为：\n"+P2); 
        	
        	
        }
        if(num==4){
            System.out.print("求存款时长\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("请输入你所存入的本金：\n");
            double a=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("请输入你所存的报酬率：\n"); 
            float b=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print(" 到最后期望的金额：\n");  
            double c=scanner.nextDouble();
            float d=72/b;
            System.out.print("------------------------------\n");  
            System.out.print("通过复利的股票型存款，得到期望金额大概所需要的年份：\n"+d); 
        }
        if(num==5)
        {
            System.out.print("求报酬率\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("请输入你所存入的本金：\n");
            double a=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print(" 请输入你所存的存款时长：\n"); 
            float d=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print(" 到最后期望的金额：\n");  
            double c=scanner.nextDouble();
            float b=72/d;
            System.out.print("------------------------------\n");  
            System.out.print("通过复利的股票型存款本金翻倍的报酬率为："+b+"%\n"); 
        }
        if(num==6)
        { 
            System.out.print("一定年份资金总额\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("请输入你所存入的本金：\n");
            double a=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("请输入你所存的报酬率：\n"); 
            float b=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("请输入你所存的存款时长：\n");  
            int d=scanner.nextInt();
            double c=a*Math.pow(1+b,d);
            System.out.print("------------------------------\n");  
            System.out.print("你所获得的总金额是：\n"+c); 
        }
        if(num==7)
        { 
            System.out.print("月等额本息还款计算\n"); 
            System.out.print("------------------------------\n");             
            System.out.print("请输入你所贷款金额：\n");
            double a=scanner.nextDouble();
            System.out.print("------------------------------\n");   
            System.out.print("请输入你所贷款的年利率：\n"); 
            float b=scanner.nextFloat();
            System.out.print("------------------------------\n");  
            System.out.print("请输入你贷款的还款时长（月）：\n");  
            int d=scanner.nextInt();
            double c=a*(b*Math.pow(1+b,d))/(Math.pow(1+b,d)-1);
            System.out.print("------------------------------\n");  
            System.out.print("你每月等额本息还款是：\n"+c); 
         }
        
    }


}