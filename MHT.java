import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MHT {

	public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if(n ==1){
            return Collections.singletonList(0);
        }
        List<Set<Integer>> adjNodeList = new ArrayList<>(n);//Create a list set of nodes which are adjoint to each other.
        for(int i = 0;i<n;i++){
            adjNodeList.add(new HashSet<>());
        }
        //Add edge list to each of these sets
        for(int [] edge: edges){
            adjNodeList.get(edge[0]).add(edge[1]);
            adjNodeList.get(edge[1]).add(edge[0]);
        }
        //Now find the leaves
        List<Integer> leavesList = new ArrayList<Integer>();
        for(int i = 0;i<n;i++){
            if(adjNodeList.get(i).size()==1)
                leavesList.add(i);
        }
        while(n>2){//there should be atleast 2 vertices
             n-=leavesList.size();// remove all the leaves
             //So change the count in the adj list also
             List<Integer> newLeaves = new ArrayList<Integer>();
             for(int i :leavesList){
                 int  j = adjNodeList.get(i).iterator().next();
                 adjNodeList.get(j).remove(i);
                 if(adjNodeList.get(j).size() ==1) newLeaves.add(j);
             }
             leavesList = newLeaves;
        }
        return leavesList;
    }
}
