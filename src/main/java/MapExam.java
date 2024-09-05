import java.util.HashMap;
import java.util.Map;

public class MapExam {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("name", "이협건");
        map.put("email", "hglee@kopo.ac.kr");
        map.put("dept", "데이터분석과");
        // put(K, V) : 주어진 키-값을 저장하고 값을 반환

        System.out.println("조회 결과");
        System.out.println("name : " + map.get("name"));
        System.out.println("email : " + map.get("email"));
        System.out.println("dept : " + map.get("dept"));
        // get(K) : 주어진 키에 해당하는 값을 반환

        // 맵의 키는 중복되지 않으며, Set 데이터구조와 같이 중복을 허용하지 않음
        // entrySet은 Map 구조 데이터를 Set 구조로 변환하기 위해 개발된 데이터 구조
        // Map 저장된 데이터 한 개마다 Set 구조로 데이터를 저장함

        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + ":" + entry.getValue()));
        // getKey() : 원소에 해당하는 키를 반환, getValue() : 원소에 해당하는 값을 반환
    }
}
