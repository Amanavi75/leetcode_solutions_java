class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) return true;
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        HashSet<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> al;

       // Creating Adjacency List
        for(int i = 0; i< edges.length; i++){
            if (adjList.containsKey(edges[i][0])) al = adjList.get(edges[i][0]);
            else al = new ArrayList<Integer>();
            al.add(edges[i][1]);
            adjList.put(edges[i][0],al);
            if (adjList.containsKey(edges[i][1])) al = adjList.get(edges[i][1]);
            else al = new ArrayList<Integer>();
            al.add(edges[i][0]);
            adjList.put(edges[i][1],al);
        }

        //System.out.println(adjList);
        stack.push(source);

        // DFS
        while (!stack.empty()){
            int node = stack.pop();
            if(visited.contains(node) || !adjList.containsKey(node)) continue;
            if(node == destination) return true;
            visited.add(node);
            for(Integer each: adjList.get(node)){
                stack.push(each);
            }
        }
        return false;
    }
}
