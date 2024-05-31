public class java1 {
    public static void main(String[] args) {

        String firstName = "Dong Hyun";
        String secondName = "Lee";
        String phone = "Galaxy";
        String status = "happy";
        String myDogName = "ggochi";
//        나는 이동현 입니다 를 출력하고싶다
        System.out.println("나는" + " " + secondName + " " + firstName);
        System.out.println("훌륭한" + phone);
//        코드작성하고 정렬 습관(컨트롤 alt L)
//        클래스는 행동과 필드(상태)으로 구성되어있다.
//        String firstName의 firstName도 행동이지 않을까 하나의 매서드 처럼? 여기에 점을 붙여보자
//        컨트롤 B 누르면 해당 매서드 설명해줌
//        toUpperCase 대문자로 바꾸기
        System.out.println(firstName.toUpperCase());
        System.out.println(firstName.equals(secondName)); // 말 그대로 문자열 비교하는것 펄스나온다.

        String a = "hello";
        String b = new String("hello");
        System.out.println(a.equals(b)); // True 결과값(?)을 비교한다.ㄴ
        System.out.println(a==(b)); //false 나온다 변수가 가지고 있는 주소를 비교한다

        String c = "Hello World!";
        System.out.println(c.indexOf(!));

    }
}
