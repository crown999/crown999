#include<stdio.h>
#include<math.h>
void Compounding(){
    int n,k;
    double F,P;
    float i;
    printf("|-----------------------------------------|\n");
    printf("   ��������������ı���");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   ������������������ʱȣ�");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");
    printf("   ����������������ޣ�");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    printf("   ������������ĸ���������");
    scanf("%d",&k);
    printf("|-----------------------------------------|\n");
    F=P*pow(i/k+1,k*n);
    printf("\nͨ��������������õĽ��Ϊ��%.4lf\n\n",F);

}

void Simple_Interested(){
    int n;
    double F,P;
    float i;
    printf("|-----------------------------------------|\n");
    printf("   ��������������ı���");
    scanf("%lf",&P);
    printf("|-----------------------------------------|\n");
    printf("   �������������������Ϣ��");
    scanf("%f",&i);
    printf("|-----------------------------------------|\n");    
    printf("   ���������������������");
    scanf("%d",&n);
    printf("|-----------------------------------------|\n");
    F=P*(1+i*n);
    printf("\nͨ��������������õĽ��Ϊ��%.4lf\n\n",F);
}

void Comparison(){
    printf("\t\t<����������>\n");
    Compounding();
    printf("\t\t<����������>\n");
    Simple_Interested();
}

void Count_Deposit(){
    double F,P1,P2;
    float i1,i2;
    int n1,n2,k;
    printf("\n��������ϣ����õ����ս��Ϊ��");
    scanf("%lf",&F);
    printf("\n������<<����>>������Ϣ\n");
    printf("|-----------------------------------------|\n");
    printf("   ������������������ʱȣ�");
    scanf("%f",&i1);
    printf("|-----------------------------------------|\n");
    printf("   ����������������ޣ�");
    scanf("%d",&n1);
    printf("|-----------------------------------------|\n");
    printf("   ������������ĸ���������");
    scanf("%d",&k);
    printf("|-----------------------------------------|\n");
    P1=F/pow(i1/k+1,k*n1);
    printf("\nͨ��������������Ҫ�Ĵ����Ϊ��%lf\n\n",P1);

    printf("������<<����>>������Ϣ\n");
    printf("|-----------------------------------------|\n");
    printf("   �������������������Ϣ��");
    scanf("%f",&i2);
    printf("|-----------------------------------------|\n");    
    printf("   ���������������������");
    scanf("%d",&n2);
    printf("|-----------------------------------------|\n");
    P2=F/(1+i2*n2);
    printf("\nͨ��������������Ҫ�Ĵ����Ϊ��%lf\n\n",P2);
}

void Count_Time()
{
	double a,c;
	float b;
	int d;
	printf("|-----------------------------------------|\n");
    printf("   ��������������ı���");
    scanf("%lf",&a);
	printf("|-----------------------------------------|\n");
	printf("   ������������ı����ʣ�");
    scanf("%f",&b);
	printf("|-----------------------------------------|\n");
    printf("   ����������Ľ�");
    scanf("%.4lf",&c);
    printf("|-----------------------------------------|\n");
	d=72/b;
    printf("\nͨ�������Ĺ�Ʊ�ʹ��õ��������������Ҫ����ݣ�%d\n\n",d);

}

void Count_Precent()
{
	double a,c;
	float b;
	int d;
	printf("|-----------------------------------------|\n");
    printf("   ��������������ı���");
    scanf("%lf",&a);
	printf("|-----------------------------------------|\n");
	printf("   ������������Ĵ��ʱ����");
    scanf("%d",&d);
	printf("|-----------------------------------------|\n");
    printf("   ����������Ľ�");
    scanf("%.4lf",&c);
    printf("|-----------------------------------------|\n");
	b=72/d;
    printf("\nͨ�������Ĺ�Ʊ�ʹ��𷭱��ı�����Ϊ��%f%%\n\n",b);

}

void Count_Contiune()
{
	double a,c;
	float b;
	int d;
	printf("|-----------------------------------------|\n");
    printf("   ��������������ı���");
    scanf("%lf",&a);
	printf("|-----------------------------------------|\n");
	printf("   ������������ı����ʣ�");
    scanf("%f",&b);
	printf("|-----------------------------------------|\n");
    printf("   ������������Ĵ��ʱ����");
    scanf("%d",&d);
    printf("|-----------------------------------------|\n");
	c=a*pow(1+b,d);
    printf("\n������õ��ܽ���ǣ�%.4lf\n\n",c);
}

void main(){
    int a;
    printf("1���ø�������\n");
    printf("2���õ�������\n");
    printf("3������������㡢��������Ľ��\n");
    printf("4��������ֹʱ�ܽ�� ����\n");
	printf("5���������� ���𷭱���֪���𡢱����ʡ������ܽ�� ����ʱ��\n");
	printf("6���������� ���𷭱���֪���𡢴��ʱ���������ܽ�� �󱨳���\n");
	printf("7���������� ������Ͷ\n");
    printf("\n���������ѡ��");
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
}