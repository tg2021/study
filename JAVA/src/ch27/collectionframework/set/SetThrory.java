package ch27.collectionframework.set;

public class SetThrory {
    /*
        Set

        중복된 자료를 허용하지 않는 자료구조이다.
        Set은 부분적으로 중복 조사를 하기 때문에 중복 조사 속도가 매우 빠르다.
        순서대로 들어가는 인덱스가 존재하지 않는다.

        Set 메서드

        리턴                  메서드                     설명
        boolean             add(Object o)              중복 여부를 확인한 후 중복되지 않았으면 자료를 저장한다.
        boolean             remove(Object o)           자료를 삭제하고 성공했을 때  true를 리턴한다.
        void                clear()                    Set에 담겨 있는 모든 자료를 삭제한다.
        int                 size()                     Set에 담긴 총 자료 개수를 반환한다.
        boolean             contains(Object o)         Set에 해당 자료가 포함되었는지 확인한다.
        boolean             addAll(Collection c)       Collection을 Set에 일괄 등록한다.
        booleanc            containsAll(Collection c)  Collection이 Set에 모두 포함될 경우 true를 반환한다.
        boolean             removeAll(Collection c)    Collection과 동일한 자료를 가진 것이 있으면 삭제한다.
        Iterator            iterator                   Set에 순서대로 접근하기 위한 iterator를 반환한다.
     */

    /*
        HashSet

        Set 타입으로 가장 많이 사용된다.
        해시코드로 분류하여 값을 비교하여 저장한다.

        TreeSet

        오름차순으로 트리 구조로 자료를 분류하여 저장한다.

        LinkedHashSet

        해시코드로 값을 분류하여 저장하는데 순차적으로 저장된 자료에 접근한다.
     */
}
