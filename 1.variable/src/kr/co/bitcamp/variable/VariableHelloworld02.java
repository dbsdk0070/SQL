package kr.co.bitcamp.variable;

/*
 * (1) 메인메서드: main() --> 만약 다르게 작성하면 기본 메서드를 찾을 수 없다라고 에러 발생 
 *                         --> 기본 메서드(main) 작성하라고 함
 *                    -->  자바 프로그램이 실행되면 제일 먼저 메인 메서드를 찾아서 실행 
 *                    -->  시작점을 알려주는 용도 --> entry point(시작점) --> main()
 *  
 * (2) parameters: 메서드(함수) 호출시 한개 or 두개 이상의 파라미터 값을 넣어서 호출할 수 있음
 *                 --> 그러면 인수(파라미터, 매개변수)들의 값을 저장할 변수들을 명시
 *                 --> String --> 문자열 --> 배열[]. args --> arguments(논리,논쟁,언쟁,주장; 인수, 독립변수)
 *                 --> ars는 하나의 변수명일뿐이므로 임의의 이름을 지정해도 무방하다
 * 
 *  (3) 반환할타입: --> return type --> 변환할 값이 있냐? 없냐? --> 없으면 void(빈공간, 공허함, empty)
 *               --> 이 메서드를 호출하면 결과로써 특별히 반환되는 값이 없이 수행되는 메서드
 *               
 *  (4) static으로 선언된 메서드나 변수는 자바버추얼머신(JVM)에서 인스턴스(객체)의 생성없이 호출을 할 수 있다.
 *                --> 객체의 생성 없이 해당 메서드, 변수를 호출해서 사용할 수 있다.
 *                --> 자바 프로그램을 실행하면 static으로 지정된 메서드를 찾아서 먼저 메모리에 할당시킨다.
 *                --> static으로 지정된 메서드가 여러개인 경우에는 객체 생성하는것과 상관없이 모두 메모리에 할당시킨다.
 *                --> 그런후에, main()으로 이름지어진 메서드가 있는지 찾아서
 *                    그 메서드를 가장 먼저 시작점의 메서드로써 호출하게 되는것이다.
 *                             
 * 
 */

public class VariableHelloworld02 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

    }

}