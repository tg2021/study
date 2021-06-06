package ch27.collectionframework.list;

public class ListClassTheory {

    public static void main(String[] args) {
        /*
            List

            List 인터페이스는 중복을 허용한다.
            저장순서가 유지되며 이런 종류의 데이터를 저장할 때 사용한다.

            리턴                  메서드                                     설명
            boolean             add(Object o)                              자료를 등록하고 성공 시 true를 반환.
                                                                           가장 마지막 자리에 자료를 등록
            boolean             add(int index, Object o)                   해당 인덱스에 자료를 등록하고 성공 시 true를 반환
            Object              set(int index, Object o)                   해당 인덱스의 자료를 수정하여, 수정되지 전의 자료를 반환한다.
            Object              remove(int index)                          해당 인덱스의 자료를 삭제하고 삭제되는 자료를 반환한다.
            boolean             remove(Object o)                           해당 자료를 삭제 후 성공하면 true를 반환한다.
            void                clear()                                    자료 구조의 모든 자료를 삭제한다.
            Object              get(int index)                             해당 인덱스의 자료를 반환한다.
            int                 size()                                     자료 구조에 저장된 개수를 반환한다.
            boolean             contains(Object o)                         리스트에 자료가 포함되어 있는지를 반환한다.
            List<Object>        subList(int startIndex, int endIndex)      시작 인덱스 이상, 종료 인덱스 미만에 해당하는 자료를
                                                                           추출하여 List로 반환한다.
            boolean             addAll(Collection c)                       해당 리스트에 Collection 타입의 객체를 한 번에 등록한다.
         */

        /*
            ArrayList

            기본적으로 배열 형대로 데이터를 저장합니다.
            자료를 순서대로 저장하며 각각의 인덱스 정보를 가지고 있습니다.
            특정 길이를 넘어설 경우, 그 길이만큼 배열을 더 생성합니다.
            순차적으로 데이터를 넣고 빼는 형태일 때 유리합니다.

            LinkedList

            자신의 앞에 존재하는 자료의 주소와 뒤의 자료의 주소 정보를 가지고 배열로 데이터가 저장된다.
            첫번째 자료는 자신의 앞의 자료 주소가, 마지막 자료는 자신의 뒤의 자료 주소가 앖다.
            자료의 삽입, 삭제가 빈번한 데이터를 저장할 때 유리하다.
         */

        /*
            ArrayList 와 LinkedList

            자료를 순차적으로 저장할 때는 ArrayList가 빠르다.
            LinkedListsms 선행, 후행자료주소를 가지고 있기 때문에
            순차적 저장에서는 ArrayList보다는 느리지만,
            자료의 중간에서의 저장, 삭제가 빈번할 때는 ArrayList보다 빠르다.

            ArrayList는 전체를 순차적으로 검색하여 삭제한 후
            뒤의 데이터를 앞으로 인덱스를 하나씩 옮기는 구조라면
            LinkedList는 단순히 선행, 후행주소정보만 바꾸면 된기 때문이다.
         */
    }
}
