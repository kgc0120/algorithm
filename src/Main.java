import programmers.DeclarationReturn;

import java.util.*;

/**
 * @author bumblebee
 */
public class Main {

    public static void main(String[] args) {

        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

        String[] id_list2 = {"con", "ryan"};
        String[] report2 = {"ryan con", "ryan con", "ryan con", "ryan con"};
        int k = 3;

        DeclarationReturn declarationReturn = new DeclarationReturn();
        int[] solution = declarationReturn.solution(id_list2, report2, k);
//        int[] solution = solution(id_list, report, k);
        System.out.println(Arrays.toString(solution));

    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

//        1. report 반복문 돌리며 정지된 id를 key값으로 Map 자료형에 신고한 id value 값으로 저장(value에 신고한 id 체크 후 저장)
//        2. Map 자료형을 돌면서 value가 k 이상이면 id_list를 돌면서 +1

        int[] ret = new int[id_list.length];
        Map<String, Integer> index = new HashMap<>();
        Map<String, List<Integer>> list = new HashMap<>();

        for(int i=0 ; i<id_list.length ; i++) {
            index.put(id_list[i],i);
        }

        for(String rep : report) {
            String[] ids = rep.split(" ");
            String fromId=ids[0], toId=ids[1];
            if(!list.containsKey(toId)) list.put(toId, new ArrayList<>());
            List<Integer> tmp = list.get(toId);
//            System.out.println(tmp +", "+index.get(fromId));
            if(!tmp.contains(index.get(fromId))) tmp.add(index.get(fromId));
        }

        for(int i=0 ; i<id_list.length ; i++) {
            String id = id_list[i];
            if(list.containsKey(id) && list.get(id).size()>=k) {
                for(int idx : list.get(id)) {
                    ret[idx]++;
                }
            }
        }

        return ret;
    }

}
