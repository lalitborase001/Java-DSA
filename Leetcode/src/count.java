class count {
    static void main() {
        int[][] grid = {
                {0,1,1,1},
                {1,1,1,1},
                {0,1,1,1}
        };
        System.out.println(countSquares(grid));

    }
    public static int countSquares(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int count = 0;

        for(int i =0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(grid[i][j] == 0) continue;
                if(i>0 && j>0) grid[i][j] += Math.min(grid[i-1][j], Math.min(grid[i][j-1], grid[i-1][j-1]));
                count += grid[i][j];
            }

        }
        return count;
    }
}