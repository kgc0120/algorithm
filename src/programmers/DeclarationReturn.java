package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bumblebee
 */
public class DeclarationReturn {

    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> declarationMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            index.put(id_list[i], i);
        }

        for (String reportData : report) {
            String[] reportSplite = reportData.split(" ");
            String front = reportSplite[0]; // 신고한 사람
            String back = reportSplite[1]; // 신고 당한 사람

            if(!declarationMap.containsKey(back)) declarationMap.put(back, new ArrayList<>());
            List<Integer> integers = declarationMap.get(back);
            if(!integers.contains(index.get(front))) integers.add(index.get(front));
        }

        for (String s : id_list) {
            if(declarationMap.containsKey(s) && declarationMap.get(s).size() >= k) {
                for (Integer integer : declarationMap.get(s)) {
                    answer[integer] += 1;
                }
            }
        }
        return answer;
    }

}
