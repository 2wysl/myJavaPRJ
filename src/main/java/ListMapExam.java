import java.util.*;

public class ListMapExam {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        // 최종 저장되는 List 구조
        List<Map<String, String>> list=new ArrayList<>();

        // List 구조 안에 저장될 Map 객체
        Map<String, String> map=null;

        // 3명 입력
        for(int i=0; i<3; i++){
            System.out.print("이름 : ");
            String name=scanner.next(); // 이름 입력

            System.out.print("이메일 : ");
            String email=scanner.next(); // 이메일 입력

            System.out.print("부서 : ");
            String dept=scanner.next(); // 부서 입력

            map=new HashMap<>(); // List 구조에 저장할 Map 메모리에 올리기

            map.put("name", name); // 입력받은 값을 name 키에 저장
            map.put("email", email); // 입력받은 값을 email 키에 저장
            map.put("dept", dept); // 입력받은 값을 dept 키에 저장

            list.add(map); // Map 구조를 List에 저장

            map=null; // 다 사용하면 메모리 비우기
        }

        // List 저장된 데이터 수
        int listsize=list.size();
        System.out.println("저장된 데이터 수 : "+listsize);

        // 일반적인 반복문 -- 1세대
        // 단점 : 반드시 반복의 횟수를 알고 있어야 사용 가능함
        System.out.println("1세대 반복문");

        for(int i=0; i<listsize; i++){
            Map<String, String> rMap=list.get(i);

            System.out.println("name : "+rMap.get("name"));
            System.out.println("email : "+rMap.get("email"));
            System.out.println("dept : "+rMap.get("dept"));

            rMap=null; // 다 사용하면 메모리 비우기
        }

        // 개선된 반복문 -- 2세대
        // 장점 : 1세대 반복문 단점 개선
        System.out.println("2세대 반복문");

        for (Map<String, String> rMAp:list){
            System.out.println("name : " + rMAp.get("name"));
            System.out.println("email : "+rMAp.get("email"));
            System.out.println("dept : "+ rMAp.get("dept"));
        }

        // 개선된 반복문 -- 3세대
        // 장점 : 2세대보다 코딩해야 하는 줄 감소, 람다식 적용, 자바 1.8부터 가능
        System.out.println("3세대 반복문");
        list.forEach(rMap->{ // 실행 문장 2줄 이상시 중괄호 사용
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : "+rMap.get("email"));
            System.out.println("dept : "+ rMap.get("dept"));
        });

        // 개선된 반복문 -- 4세대
        // 장점 : 3세대에 비동기식 처리 방법 적용
        // 단점 : 처리 완료가 누가 먼저 될지 알 수 없음. 따라서 모든 경우에 다 쓸 수 없음
        System.out.println("4세대 반복문");
        list.parallelStream().forEach(rMap->{
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : "+rMap.get("email"));
            System.out.println("dept : "+ rMap.get("dept"));
        });

        System.out.println("1.5세대 반복문");
        Iterator<Map<String, String>> it=list.iterator();

        while(it.hasNext()){
            Map<String, String>rMap=it.next();
            System.out.println("name : " + rMap.get("name"));
            System.out.println("email : "+rMap.get("email"));
            System.out.println("dept : "+ rMap.get("dept"));

            rMap=null;

        }
    }

}
