package ch28.exception;

public class ExceptionTheory {
    public static void main(String[] args) {
        /*
            예외처리

            프로그램의 잘못된 동작으로 발생할 수 있는 것에는
            예외 Exception
            오류 Error
            런타임예외 RuntimeException

            종류                      설명
            Exception               Error, RuntimeException을 제외한 모든 예외 관련 클래스들이 해당된다.
                                    예외처리를 하여 월활한 프로그램 구동이 가능하다.

            Error                   예외처리는 할 수 있다.
                                    하지만 Error의 경우 시스템에 치명적이라 정상적인 작동을 보장할 수 없다.

            RuntimeException        개발자의 실수로 인해 발생하는 오류이다.
                                    소스 수정을 통해 해결이 가능하다.

             예외처리의 이유는 Exception이 발생 시 프로그램이 중단되지 않고 원활하게 작동할 수 있도록 하기 위함함

             예외처리의 효과
             예외 처리를 통해 시스템이 정상 동작을 보장할 수 있다.
             예외 정보를 확인함으로써 예외의 원인을 파악할 수 있다.
             예외에 대한 정보를 기록하여 시스템에서 발생하는 예외의 이력을 남길 수 있다.

             예외처리 방법

             try-chtxh-finally
             try는 로직을 처리하는 부분이다.
             chatch는 예외가 발생 시 처리하는 부분이다.
             fially는 try, chatch 블롣이 모두 끝난 후 마지막에 실행되는 부분이다.
             finally는 무조건 실행된다는 특징을 가지고 있다.


             throws
             메서드에 throws를 입력하여 예외를 위임할 수 있다.

             throwable
             Throwable 클래스를 상속받아서 프로그래머가 직접 예외 타입을 만들어 낼 수 있다.
             그것을 통해 프로그래머가 의도한 방향으로 특정 예외 처리를 해줄 수 있다.
         */

        /*
           에러

            문법적인 요소에 의해서, 또는 업무적인 로직의 처리 방법에 의해서
            더 이상 프로그램을 작동시킬 수 없도록 만드는 원인이다.
         */
    }
}
