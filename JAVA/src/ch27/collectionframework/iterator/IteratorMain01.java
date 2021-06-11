package ch27.collectionframework.iterator;

import java.util.*;

public class IteratorMain01 {

    public static void main(String[] args) {
        /*
            Iterator의 사용이유는 자료구조에서 값을 순차적으로 출력하기위함
         */
        Map<String, Object> dataMap = new HashMap<>();
        dataMap.put("1", "모바일사업부");
        dataMap.put("2", "가전사업부");
        dataMap.put("3", "메모리반도채사업부");
        dataMap.put("4", "시스템반도체사업부");
        dataMap.put("5", "자동차전자장비사업부");

        System.out.println(dataMap);

        Set<Map.Entry<String, Object>> entrySetData = dataMap.entrySet();
        Iterator<Map.Entry<String, Object>> iteratorData = entrySetData.iterator();

        while (iteratorData.hasNext()) {
            Map.Entry<String, Object> nextData = iteratorData.next();
            System.out.println("키 : " + nextData.getKey() + ", [[[]]] 값 : " + nextData.getValue());
        }

        List dataList = new ArrayList();
        dataList.add("수원공장");
        dataList.add("파주공장");
        dataList.add("천안공장");
        dataList.add("울산공장");
        dataList.add("창원공장");

        System.out.println(dataList);

        ListIterator listIterator = dataList.listIterator();

        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            System.out.println("값 추출 : " + next);
        }
    }
}
