import java.util.ArrayList;
import java.util.List;

public class ds9 {
    void helper(int n, int k, List<List<Integer>> list, List<Integer> smallList, int count){
        if(smallList.size()==k){
            list.add(new ArrayList<>(smallList));
            return;
        }        

        for(int i=count;i<=n;i++){
            if(!smallList.contains(i)){
                smallList.add(i);
                helper(n, k, list, smallList, i);
                smallList.remove(smallList.size()-1);
            }
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> smallList = new ArrayList<>();
        helper(n, k, list, smallList, 1);
        return list;
    }
    
}
