import java.util.LinkedList;
import java.util.Queue;

class Orange {
    public static void main(String[] args) {
        int[][] grid = {{2,1,1},{1,1,0},{0,1,1}};
        System.out.println(orangesRotting(grid));
    }
    public static int orangesRotting(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i, j});
                } else if(grid[i][j] == 1){
                    fresh++;
                }
            }
        }
        int time = 0;
        int[][] dir = {{1,0},{-1,0},{0,1},{0,-1}};
        while(!q.isEmpty() && fresh > 0){
            int size = q.size();
            for(int k = 0; k < size; k++){
                int[] curr = q.poll();
                int r = curr[0];
                int c = curr[1];
                for(int[] d : dir){
                    int nr = r + d[0];
                    int nc = c + d[1];
                    if(nr >= 0 && nr < m && nc >= 0 && nc < n && grid[nr][nc] == 1){
                        grid[nr][nc] = 2;
                        q.add(new int[]{nr, nc});
                        fresh--;
                    }
                }
            }
            time++;
        }
        return fresh == 0 ? time : -1;
    }
}