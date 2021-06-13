package ch29.Thread;

public class ThreadTheory {
    public static void main(String[] args) {
        /*
            쓰레드

            쓰레드는 프로세스의 구성 요소이다.
            프로그램을 실핼하면 컴퓨터의 자원을 할당 받아 하나의 프로세스를 만든다.
            그런 프로세스의 구성 요소 중 하나가 쓰레드이다.

            하나의 프로세스에는 여러 개의 쓰레드가 동작할 수 있다.

            쓰레드를 실행하는 데는 자원이 필요하다.


         */

        /*
            컴퓨터의 자원은 유한하므로 쓰레드를 실행시키는 것에는 한계가 있다.

            쓰레드는 어떤 처리를 하나 수행할 수 있는데
            막연하게 여러 개의 처리를 수행하면 유리할 수 있을 것이라 생각하지만,
            필요한 것 이상의 쓰레드를 사용하면 오히려 프로그램에 악영향을 끼친다.
         */

        /*
            OS, 그 중에서도 대표적으로 윈도우 OS는 멀티태스킹이 가능하다.

            다중 작업이 가능하다는 의미인데 하나의 프로그램을 실행하면
            하나의 프로세스가 동작한다고 이해하면 좋다.

            윈도우 OS를 사용하면 여러 개의 작업을 동시에 한다.

            그리고 이 여러개의 프로세스들 중 각각의 프로세스 내부에는 여러개의 쓰레드가 동작이 가능하다.
         */

        /*
            단순 계산이 가능하다.

            2개의 프로세스가 구동되고 각각의 프로세스에서 2개의 쓰레드가 동작한다면,
            4개의 쓰레드가 동작하는 효과를 낸다.

            한 번에 4개의 쓰레드가 동작하면 좋을 것으로 생각할 수 있다.
            하지만 CPU는 코어로 구성되어 있고 코어는 한 번에 하나의 작업이 가능하다.
            쓰레드는 여러 개가 동작하지만 실질적으로는 CPU가 고속 연산을 하면서
            작업을 바꿔가면서 동시 작업을 하는 것처럼 보이는 것 뿐이다.

            그래서 단일 쓰레드로 작업하는 것보다 다중 쓰레드가 더 느릴 때가 있다.
         */

        /*
            쓰레드가 단점만 있는 것은 아니다.

            코어가 순간적으로 작업을 바꿔가면서 다중 작업을 처리하니까
            CPU의 사용률을 올릴 수 있고 한정된 자원의 사용률을 극대화시키니까
            자원을 더 효율적으로 사용할 수 있는 것이다.

            멀티 쓰레드의 대표적인 프로그램으로는 메신저가 있다.

            사용자가 채팅을 주고받으며 파일을 서로 업로드, 다운로드를 할 수 있는 것은
            멀티 쓰레드 프로그램이기 때문이다.

            멀티쓰레드에는 또 다른 단점이 존재한다.

            동기화나 교착 상태라는 단점도 존재하는데 이것은 하나의 자원을
            여러 쓰레드가 순간적으로 바꿔가면서 사용하기 때문에 발생한다.
         */

        /*
            쓰레드를 구연하는 두 가지 방법이 있다.

            Thread 클래스를 상속받는 방법과
            Runnable 인터페이스를 구현하는 방법이 있다.

            자바는 객체지향언어이면서 다중 상속을 허용하지 않기 때문에
            다른 부모 클래스를 상속받아서 쓰레드 작업을 구현해야 한다면
            Thread 클래스를 상속받아 구현하는 것은 비효율적인 방법이 될 것이다.

            보통 하나의 프로세스에는 하나의 쓰레드가 존재한다.
            우리가 주로 쓰는 main메서드도 일종의 메인 쓰레그라 할 수 있다.
            자바로 프로그램을 작성하고 최초 구동시키면 메인 쓰레드가 메인 메서드를 실행시키는 역활을 한다.
         */

        /*
            쓰레드 사용목적

            쓰레드를 사용하는 가장 큰 목적은 동시작업처리이다.

            한 번에 동시에 교체되면서 여러 작업을 수행하는데 사람은 느끼지 못하는 사이에 고속으로 연산을 수행하므로
            동시 작업이 처리되는 것으로 느껴지는 것이다.

            프로그램 중에는 동시 작업이 필요한 것들이 있는데
            여러 명의 사용자가 입출력 작업을 하는 것들이 그러하다.
         */

        /*
            쓰레드 구분

            쓰레드는 일반 쓰레드와 데몬 쓰레드로 구분할 수 있다.

            데몬 쓰레드는 일반 쓰레드에 종속되어, 일반 쓰레드가 모두 종료되면 같이 종료된다.

            데몬 쓰레드의 설정은 일반 쓰레드를 사용하기 전에 끝내야 하며
            데몬 쓰레드의 설정을 일반 쓰레드를 시작하고 난 후에 하려고 하면 예외를 발생시킨다.
         */

        /*
            쓰레드 우선순위

            쓰레드에 우선 순위를 부여하여 중요한 쓰레드 작업일 경우엔 작업 시간을 늘릴 수 있다.
            중요한 쓰레드의 작업 시간을 늘리면 다중 작업을 처리하면서도 중요한 작업은
            가장 많은 자원을 할당시켜 더 빨리 끝낼 수 있다.

            쓰레드의 우선 순위의 주요 사용 목적은 중요 작업을 우선 순위를 높게 두는 것이다.

            쓰레드의 우선 순위 값은 1부터 10까지 있으면 5가 기본값이다.
            10이면 가장 중요하고 1이면 중요도가 가장 낮다.
         */

        /*
            쓰레드에는 동기화 문제가 존재한다.

            동일한 데이터 저장소에 여러 쓰레드가 동시에 접근하여 작업을 처리할 때 주로 발생하곤 한다.
            다중 작업을 처리하지만 쓰레드는 미묘하게 엇갈리고 겹치는 부분이 있다.
            그리고 컴퓨터 연산 속도는 엄청 빠르기 때문에 이것이 문제되는 경우가 있다.

            이미 삭제된 데이터인데 있는 데이터로 인식하고 다른 쓰레드에서는 조회하려는 것이 그언 문제를 발생시킬 수 있다.

            그럴 때 동기화, synchronized를 실행시켜 주어 특정 쓰레드가 접근하여 있을 때는
            다른 쓰레드들은 대기시키는 방법이 있다. 특정 쓰레드가 자료에 접근하여 작업 시에는 다른 쓰레드가 접근하지 못하도록 막는 것이다.
         */
        /*
            쓰레드 풀

            쓰레드의 실행 가능 개수를 제한하여 최대 가능한 횟수를 넘어가지 않도록 하는 기법이다.
            쓰레드를 사용하려고 하면 쓰레드 풀에서 대기 중인 쓰레드들 중 작업이 가능한 쓰레드가 맡아서 처리한다.


            쓰레드 풀 장점

            미리 일정 개수의 쓰레드를 생성시켜 풀에 대기시켜 놓는 것이 장점이다.

            일정개수의 쓰레드를 생성시켜 대기시켜 놓았다가,
            사용하는 쓰레드만 사용하고 더 많은 요청이 오면 대기시켰다가 사용이 끝난 쓰레드를 재사용한다.

            쓰레드를 생성하는데는 자원이 든다.
            그렇기 때문에 무한정 생성하는 것보다 일정 개수만 생성하는 것이 자원을 아끼는 방법이고
            무한한 연결을 맺는 것보다 제한된 연결을 생성하고 있는 것이
            한정된 컴퓨터 자원을 사용하는 프로그램에 훨씬 안정적이다.

         */
    }
}