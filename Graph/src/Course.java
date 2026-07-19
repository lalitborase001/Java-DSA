import java.util.ArrayList;
import java.util.List;

class Course {
    public static void main(String[] args) {
        int numCourses = 2;
        int[][] prerequisites = {{1,0}};
        System.out.println(canFinish(numCourses,prerequisites));
    }
    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] p : prerequisites) {
            adj.get(p[1]).add(p[0]);
        }
        int[] vis = new int[numCourses];
        int[] pathVis = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            if (vis[i] == 0) {
                if (dfs(i, adj, vis, pathVis)) {
                    return false; 
                }
            }
        }
        return true;
    }
    private static boolean dfs(int node, List<List<Integer>> adj, int[] vis, int[] pathVis) {
        vis[node] = 1;
        pathVis[node] = 1;
        for (int neighbor : adj.get(node)) {
            if (vis[neighbor] == 0) {
                if (dfs(neighbor, adj, vis, pathVis)) return true;
            } 
            else if (pathVis[neighbor] == 1) {
                return true; 
            }
        }
        pathVis[node] = 0; 
        return false;
    }
}