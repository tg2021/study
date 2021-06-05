package ch28.collectionframework.map;

public class MapTheory {
    public static void main(String[] args) {
        /*
            Map

            key와 value로 구성되어 있다.
            key와 value를 하나의 쌍으로 묶어서 저장하는 컬렉션 클래스를 만드는데 사용한다.
            키는 중복이 불가능하지만 값은 중복해서 넣을 수 있다.
            기존에 존재한느 키와 값으로 다시 중복해서 저장하면 기존의 것이 사라지고
            새롭게 입력된 것들이 저장되게 된다.

            hash : 단방향 암호화 기법으로 해시함수(해시 알고리즘)를 이용하여 고정된 길이의 암호화된 문자열로 바꿔버리는 것을 의미합니다.

            Map의 메서드

            리턴                메서드                                  설명
            void                clear()                                Map의 모든 객체를 삭제한다.
            boolean             containsKey(Object key)                지정된 key객체와 일치하는 Map의 key객체가 있는가?
            boolean             containsValue(Object value)            지정된 value객체와 일치하는 Map의 value객체가 있는가?
            set                 entrySet()                             Map에 저장되어 있는 key-value를 Map.Entry타입의 객체로 저장한 Set으로 변환.
            boolean             equals(Object o)                       동일한 Map인지 비교한다.
            Object              get(Object key)                        지정한 key객체에 대응하는 value객체를 찾아서 반환.
            int                 hashCode()                             해시코드를 반환.
            boolean             isEmpty()                              Map이 비어있는지 확인.
            Set                 keySet()                               Map에 지정된 모든 key 객체를 반환.
            Object              put(Object Key, Object value)          Map에 Value객체를 Key객체와 연결하여 하나의 세트로 저장.
            void                putAll(Map t)                          지정된 Map의 모든 key-value 세트를 추가.
            Object              remove(Object key)                     key와 일치하는 key-value 세트를 삭제.
            int                 size()                                 Map에 저장된 key-value세트의 개수를 반환.
            Collection          values()                               Map에 저장된 모든 value객체를 반환.


            Map의 메서드
            keySet()과 values()의 차이.
            keySet()은 Set을 반환하고 values()는 Collection을 반환한다.

            Set은 중복을 허용하지 않는 컬렉션이고
            Collection은 중복을 허용하는 컬렉션이다.

            Map에서 key는 중복되지 않아야 하고,
            value는 중복된 수 있다.
        */
    }
}
