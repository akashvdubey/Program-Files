#include<iostream>
const int N=5;
static short counter=0;
using namespace std;
bool canWalk(int grid[][N],int x,int y);
bool tryUntilReach(int grid[][N],int curPosX,int curPosY);
bool checkTarget(int grid[][N],int x,int y);
int main()
{
  int grid[5][5]={{1,0,0,0,0},{1,0,0,0,0},{1,0,0,0,9},{1,0,0,1,0},{0,1,1,0,1}};
  for(int i=0;i<5;i++)
    {
      cout<< endl;
      for(int j=0;j<5;j++)
        {
          cout<< grid[i][j]<<" ";
        }
    }

      if(tryUntilReach(grid,0,0))
          cout << "the mouse can reach the target" <<endl;
      else
        cout << "the mouse cannot reach" << endl;
  return 0;
}
//check if target is in reach
bool checkTarget(int grid[][N],int x,int y)
{
  int posX[]={-1,0,1,1,1,0,-1,-1};
  int posY[]={-1,-1,-1,0,1,1,1,0};
  for(int i=0;i<8;i++)
    {
      if( (x+posX[i]) <N && (y+posY[i]) < N )
        {
          if(grid[x+posX[i]][y+posY[i]]==9)
            return true;
        }
    }
    return false;
}
//check if rat can walk in given cell direction
bool canWalk(int grid[][5],int x,int y)
{
  if(x>N || y>N ||x<N ||y<N)
  {
    cout<<"returning false because"<<"x is "<< x <<"yis "<<y<<"and grid is "<<grid[x][y]<<endl;

      return false;
  }
  if(grid[x][y]==0)
  {
    cout<<"     rrrrrrrrreturning false because"<<"x is "<< x <<"yis "<<y<<"and grid is "<<grid[x][y]<<endl;
      return false;
  }
  cout<<"returning true because"<<"x is "<< x <<"yis "<<y<<"and grid is "<<grid[x][y]<<endl;
  return true;
}

bool tryUntilReach(int grid[][5],int curPosX,int curPosY)
{
  counter++;
  cout<< "going in now at depth "<<counter<<endl;
  int posX[]={-1,0,1,1,1,0,-1,-1};
  int posY[]={-1,-1,-1,0,1,1,1,0};
  if(checkTarget(grid,curPosX,curPosY))
      return true;
  for(int i=0;i<8;i++)
    {
        if(canWalk(grid,curPosX+posX[i],curPosY+posY[i]))
          {
            if(tryUntilReach(grid,curPosX+posX[i],curPosY+posY[i]))
                return true;
          }
    }
  return false;
}
