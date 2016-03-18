#include<stdio.h>
#include<math.h>
void Compounding(){
    int n,k;
    double F,P;
    float i;
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存入的本金：");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的年利率比：");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的年限：");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的复利次数：");
    scanf("%d",&k);
    printf("|-----------------------------------------|\n");
    F=P*pow(i/k+1,k*n);
    printf("\n通过复利存款，你所获得的金额为：%.4lf\n\n",F);

}

void Simple_Interested(){
    int n;
    double F,P;
    float i;
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存入的本金：");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的周期利息：");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");    
    printf("   请输入你所存的周期数：");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    F=P*(1+i*n);
    printf("\n通过单利存款，你所获得的金额为：%.4lf\n\n",F);
}

void Comparison(){
    printf("\t\t<复利计算器>\n");
    Compounding();
    printf("\t\t<单利计算器>\n");
    Simple_Interested();
}

void Count_Deposit(){
    double F,P1,P2;
    float i1,i2;
    int n1,n2,k;
    printf("\n请输入你希望获得的最终金额为：");
    scanf("%lf",&F);
    printf("\n请输入<<复利>>存款的信息\n");
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的年利率比：");
    scanf("%f",&i1);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的年限：");
    scanf("%d",&n1);
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的复利次数：");
    scanf("%d",&k);
    printf("|-----------------------------------------|\n");
    P1=F/pow(i1/k+1,k*n1);
    printf("\n通过复利存款，你所需要的存款金额为：%lf\n\n",P1);

    printf("请输入<<单利>>存款的信息\n");
    printf("|-----------------------------------------|\n");
    printf("   请输入你所存的周期利息：");
    scanf("%f",&i2);
    printf("|-----------------------------------------|\n");    
    printf("   请输入你所存的周期数：");
    scanf("%d",&n2);
    printf("|-----------------------------------------|\n");
    P2=F/(1+i2*n2);
    printf("\n通过单利存款，你所需要的存款金额为：%lf\n\n",P2);
}

void Count_Time()
{
	double a,c;
	float b;
	int d;
	printf("|-----------------------------------------|\n");
    printf("   请输入你所存入的本金：");
    scanf("%lf",&a);
	printf("|-----------------------------------------|\n");
	printf("   请输入你所存的报酬率：");
    scanf("%f",&b);
	printf("|-----------------------------------------|\n");
    printf("   到最后期望的金额：");
    scanf("%.4lf",&c);
    printf("|-----------------------------------------|\n");
	d=72/b;
    printf("\n通过复利的股票型存款，得到期望金额大概所需要的年份：%d\n\n",d);

}

void Count_Precent()
{
	double a,c;
	float b;
	int d;
	printf("|-----------------------------------------|\n");
    printf("   请输入你所存入的本金：");
    scanf("%lf",&a);
	printf("|-----------------------------------------|\n");
	printf("   请输入你所存的存款时长：");
    scanf("%d",&d);
	printf("|-----------------------------------------|\n");
    printf("   到最后期望的金额：");
    scanf("%.4lf",&c);
    printf("|-----------------------------------------|\n");
	b=72/d;
    printf("\n通过复利的股票型存款本金翻倍的报酬率为：%f%%\n\n",b);

}

void Count_Contiune()
{
	double a,c;
	float b;
	int d;
	printf("|-----------------------------------------|\n");
    printf("   请输入你所存入的本金：");
    scanf("%lf",&a);
	printf("|-----------------------------------------|\n");
	printf("   请输入你所存的报酬率：");
    scanf("%f",&b);
	printf("|-----------------------------------------|\n");
    printf("   请输入你所存的存款时长：");
    scanf("%d",&d);
    printf("|-----------------------------------------|\n");
	c=a*pow(1+b,d);
    printf("\n你所获得的总金额是：%.4lf\n\n",c);
}

void Count_PayMon(){
	double a,c;
	float b;
	int d;
	printf("|-----------------------------------------|\n");
    printf("   请输入你所贷款金额：");
    scanf("%lf",&a);
	printf("|-----------------------------------------|\n");
	printf("   请输入你所贷款的年利率：");
    scanf("%f",&b);
	printf("|-----------------------------------------|\n");
	printf("   请输入你贷款的还款时长（月）：");
    scanf("%d",&d);
    printf("|-----------------------------------------|\n");	
	c=a*(b*pow(1+b,d))/(pow(1+b,d)-1);
	printf("\n你每月等额本息还款是：%.4lf\n\n",c);
}

void main(){
    int a;
    printf("1、用复利计算\n");
    printf("2、用单利计算\n");
    printf("3、输出复利计算、单利计算的结果\n");
    printf("4、输入终止时总金额 求存款\n");
	printf("5、复利计算 本金翻倍已知本金、报酬率、到期总金额 求存款时长\n");
	printf("6、复利计算 本金翻倍已知本金、存款时长、到期总金额 求报酬率\n");
	printf("7、复利计算 红利再投\n");
	printf("8、复利条件下等额还款金额\n");
    printf("\n请输入你的选择：");
    scanf("%d",&a);
    if(a==1)
        Compounding();
    else if(a==2)
        Simple_Interested();
    else if(a==3)
        Comparison();
    else if(a==4)
        Count_Deposit();
	else if(a==5)
		Count_Time();
	else if(a==6)
		Count_Precent();
	else if(a==7)
		Count_Contiune();
	else if(a==8);
		Count_PayMon();
}
