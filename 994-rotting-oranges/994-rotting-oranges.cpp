class Solution {
public:
    
    bool isvalid(int x,int y,vector<vector<int>>& grid){
        int n=grid.size();
        int m=grid[0].size();
        if(x<0 or y<0 or x>=n or y>=m) return false;
        
        if(grid[x][y]==2 or grid[x][y]==0) return false;
        
        return true;
    }
    int orangesRotting(vector<vector<int>>& grid) {
        queue<pair<int,int>> q;
        int n=grid.size();
        int m=grid[0].size();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==2)
                    q.push({i,j});
            }
        }
        int dx[]={-1,0,1,0};
        int dy[]={0,1,0,-1};
        int ans=0;
        while(!q.empty()){
            int sz=q.size();
            ans++;
            while(sz--){
                int x=q.front().first;
                int y=q.front().second;
                q.pop();
                for(int i=0;i<4;i++){
                    if(isvalid(x+dx[i],y+dy[i],grid)){
                        grid[x+dx[i]][y+dy[i]]=2;
                        q.push({x+dx[i],y+dy[i]});
                    }
                }
                
            }
        }
       
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j]==1)
                    return -1;
            }
        }
        
    return ans==0?0:ans-1;
    }
};