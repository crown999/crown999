#include <stdio.h>
#include <iostream>    
using namespace std; 
int board[65][65],tile;
void ChessBoard(int tr, int tc, int dr, int dc, int size)
{
	if (size == 1) return;
	int t = tile++, s = size/2; 
	   if (dr < tr + s && dc < tc + s)
		   ChessBoard(tr, tc, dr, dc, s);
	   else 
	   {
		   board[tr + s - 1][tc + s - 1] = t;
		   ChessBoard(tr, tc, tr+s-1, tc+s-1, s);
	   }
	   if (dr < tr + s && dc >= tc + s)
		   ChessBoard(tr, tc+s, dr, dc, s);
	   else 
	   {
		   board[tr + s - 1][tc + s] = t; 
		   ChessBoard(tr, tc+s, tr+s-1, tc+s, s);
	   }
	   if (dr >= tr + s && dc < tc + s) 
		   ChessBoard(tr+s, tc, dr, dc, s); 
	   else 
	   {
		   board[tr + s][tc + s - 1] = t; 
		   ChessBoard(tr+s, tc, tr+s, tc+s-1, s);
	   }
	   if (dr >= tr + s && dc >= tc + s) 
		   ChessBoard(tr+s, tc+s, dr, dc, s); 
	   else 
	   {
		   board[tr + s][tc + s] = t; 
		   ChessBoard(tr+s, tc+s, tr+s, tc+s, s);
	   } 
}
void result(int b[][65],int n)
{
	int i,j;         
	for(i=1;i<=n;i++)
	{             
		for(j=1;j<=n;j++)    
			cout<<b[i][j]<<" ";    
		cout<<endl;       
	}   
} 
int main()
{        
	int size,dr,dc; 
	cout<<"选择输入4种不同形态的L型骨牌中的一种(4/8/16/64): "<<endl;  
	cin>>size;  
	cout<<"请输入特殊的块的位置(x,y): "<<endl; 
	cin>>dr>>dc;  
	cout<<"结果如下："<<endl;     
	board[dr][dc]=-1; 
	tile++;      
	ChessBoard(1,1,dr,dc,size);     
	result(board,size);  
}    