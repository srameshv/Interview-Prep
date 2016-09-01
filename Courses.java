import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Courses {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
	        if(numCourses ==1){
	            return false;
	        }
	        List<HashSet<Integer>> adjNodeList = new ArrayList<>(numCourses);//Create a list set of nodes which are adjoint to each other.
	        for(int i = 0;i<numCourses;i++){
	            adjNodeList.add(new HashSet<>());
	        }
	        //Add edge list to each of these sets
	        for(int [] edge: prerequisites){
	            adjNodeList.get(edge[0]).add(edge[1]);
	            adjNodeList.get(edge[1]).add(edge[0]);
	        }
	        //Now find the leaves
	        List<Integer> leavesList = new ArrayList<Integer>();
	        for(int i = 0;i<numCourses;i++){
	            if(adjNodeList.get(i).size()==1)
	                leavesList.add(i);
	        }
	        while(numCourses>2){//there should be atleast 2 vertices
	             numCourses-=leavesList.size();// remove all the leaves
	             //So change the count in the adj list also
	             List<Integer> newLeaves = new ArrayList<Integer>();
	             for(int i :leavesList){
	                 int  j = adjNodeList.get(i).iterator().next();
	                 adjNodeList.get(j).remove(i);
	                 if(adjNodeList.get(j).size() ==1) newLeaves.add(j);
	             }
	             leavesList = newLeaves;
	        }
	        if(leavesList!= null||numCourses ==1 && prerequisites == null)
	            return true;
	       else {
	           return false;
	       }
    }
}