package ch27.collectionframework.properties;

public class PropertiesThory {
    /*
        Map을 구현한 클래스이다.

        시스템 변수는 속성과 값으로 이루어져 있다.
        properties는 시스템 변수를 지정하는데 사용된다.

        소스에 설정값을 지정하면 소스를 변경해야만 설정값을 변경시킬 수 있다.
        하지만 외부 파일에 저장하면 외부 파일을 변경함으로써 설정값을 변경시킬 수 있다.

        리턴                  메서드                                 설명
        Object              put(Object key, Object value)           자료를 저장한다.
        Object              remove(Object key)                      자료를 삭제한다.
        void                clear()                                 전체 자료를 삭제한다.
        Object              get(Object key)                         자료를 조회한다.
        Set                 keySet()                                Set으로 된 key를 조회한다.
        Collection          values()                                Collection으로 된 value를 조회한다.
        boolean             containsKey(Object key)                 key를 포함하고 있는지 확인한다.
        int                 size()                                  자료의 수를 반환한다.
        void                putAll(Map map)                         자료를 일괄적으로 등록한다.
        String              getProperties(String key)               key를 이용하여 value를 찾아내어 반환한다.
        void                load(InputStream in)                    .properties 파일에 저장된 값을 읽어들여
                            load(Reader reader)                     Properties로 만들어진 객체에 값을 저장한다.
        void                store(OutputStream out, String title)   properties 파일에 저장된 값을 읽어들여
                                                                    .Properties로 만들어진 객체에 값을 저장한다.

     */
}
