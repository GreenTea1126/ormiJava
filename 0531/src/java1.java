public class java1 {
    private String name; // 전역변수 제일 바깥에 있는거 국가공무원...? tim anna 지역공무원...?(블록안에 있는)

    public static void main(String[] args) {
//
//        String firstName = "Dong Hyun";
//        String secondName = "Lee";
//        String phone = "Galaxy";
//        String status = "happy";
//        String myDogName = "ggochi";
////        나는 이동현 입니다 를 출력하고싶다
//        System.out.println("나는" + " " + secondName + " " + firstName);
//        System.out.println("훌륭한" + phone);
////        코드작성하고 정렬 습관(컨트롤 alt L)
////        클래스는 행동과 필드(상태)으로 구성되어있다.
////        String firstName의 firstName도 행동이지 않을까 하나의 매서드 처럼? 여기에 점을 붙여보자
////        컨트롤 B 누르면 해당 매서드 설명해줌
////        toUpperCase 대문자로 바꾸기
//        System.out.println(firstName.toUpperCase());
//        System.out.println(firstName.equals(secondName)); // 말 그대로 문자열 비교하는것 펄스나온다.
//
//        String a = "hello";
//        String b = new String("hello");
//        System.out.println(a.equals(b)); // True 결과값(?)을 비교한다.
//        System.out.println(a == (b)); //false 나온다 변수가 가지고 있는 주소를 비교한다
//
//        String c = "Hello World!";
//        System.out.println(c.indexOf("!")); // 해당 문자 자리값(0부터 ㅊㅊ시작한다!는 11번자리에 위치해있다.)
//
//        String d = "Hello World!";
//        System.out.println(d.contains("World"));
//
//        String e = "ESTSOFT";
//        System.out.println(e.contains("SOFT")); // SOFT가 포함되어있는지 참거짓
//
//        String findCha = "What is your hobby?";
//        System.out.println(findCha.charAt(5)); // 5번째 자리값 반환
//
//        String findcha = "What is your hobby?";
//        System.out.println(findcha.charAt(13) + "" + findcha.charAt(14) + findcha.charAt(15) + findcha.charAt(16) + findcha.charAt(17));
//        // 그대로 쓰면 숫자로 나옴 그래서 중간에 문자열을 넣어줘야함
//
//        String g = "Hello World!";
//        System.out.println(g.replaceAll("World", "Java"));
//        //해당하는 단어 전체 바꿔버림
//
//        String k = "WEEEE ASKE ;ND";
//        System.out.println(k.substring(0, 5));   //시작위치 <= 끝위치 +1 원본데이터를 살리기 위해서 훼손시키지 않고
//        System.out.println(k.substring(0, 3) + k.substring(8, 10) + k.substring(12, 14));
//
//        String j = "a:b:c:d";
////        a.split() 마우스 대면 지역변수 배열로 추천해준다 abcd 가 하나의 문자열이지만 수건 자르듯이 잘려있기때문에 해당방식 추천해줌
////        자른 그상태 그대로 독립적으로 나오기때문에 배열로 본다
//
//        String result = "hello";
//        System.out.println(result + "!");
//        result.concat("!"); // 헬로 뒤에 영구적으로 붙여버림
//        System.out.println(result + "!");
//
//
//        // 문자열 포맷팅 매서드
//        String name1 = "Tim1";
//        int age1 = 30;
//
//        String name2 = "Anna";
//        int age2 = 45;
//// 전역변수 제일 바깥에 있는거 국가공무원...? tim anna 지역공무원...?(블록안에 있는/ 다른곳에 영향 주지 못함)
//        System.out.println(String.format("%s의 나이는 %s세 입니다", name1, age1));
//        System.out.println(String.format("%s의 나이는 %s세 입니다", name2, age2));
//
////        StringBuffer ;
////        StringBuilder ;
////
//        String result = "";
//        result += "hello";
//        result += "java";
//        result += "world";
//        System.out.println(result);
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(("hello"));
//        sb.append("java");
//        sb.append("World");
//        System.out.println(sb);
//
//        StringBuffer sc = new StringBuffer();
//        sc.append(("hello"));
//        sc.append("java");
//        sc.append("World");
//        System.out.println(sc);
////        append는 따라다니는것
//
////        StringBuffer sd = new StringBuffer();
////        sd.append(("hello"));
////        sd.insert(0,"world")
////        System.out.println(sd);  //worldhello 로 나옴
////
////        StringBuffer se = new StringBuffer();
////        sd.append(("hello"));
////        sd.append(("java"));
////        sd.append(("world"));
////        System.out.println(sd);  //worldhello 로 나옴
//////        StringBuffer buffer = new StringBuffer();
//////        buffer.append("Hello ");
//////        buffer.append("Java ");
//////        buffer.append("World!");
//////        System.out.println(buffer.substring(6));      // Java World!
//////        System.out.println(buffer.substring(6, 7));   // J
//
//
////        배열타입 인덱스를 사용하여 엑세스 할 수 있다. 배열은 크기가 고정되어 있으며 생성 후 에는 변경할 수 없다.
////        100개 크기를 가진 정수형 배열 a를 만들어라
//        int[] numbers;
//        numbers = new int[100];

//        int[] arr = new int[100];
//        System.out.println(arr[0]);
//        System.out.println(arr[]);

//        int[] arr = new int[100];
//
//        String[] arr = new String[100];
//        System.out.println(arr[]);
//    }
//
////    연산자
////    //실습 배열의 가장 큰 값 구하기
//        int positive = 10;
//        int negative = -10;
//        System.out.println("양의 부호 연산자 적용: " + (+positive));
//        System.out.println("음의 부호 연산자 적용: " + (-positive));
//        System.out.println("음의 부호 연산자로 부호 반전: " + (+negative));


//        //  증감 연산자
//        int x = 5;
//        int y = 5;
//        System.out.println("전위 증가 연산자: " + (++x));
////         x앞에 ++가 있네 x에 더하고 출력해야할 준비하고 옮김
//        System.out.println("후위 증가 연산자: " + (y++));
////        후위 증가 연산자가 특이해. y가 있네? 출력하자 어 그러고 보니 뒤에 ++가 있었네
//
//        System.out.println("=================");
//        System.out.println("x는" + x);
//        System.out.println("y는" + y);
//
////        int a = 100;
////        int b = 100;
////        System.out.println("전위 감소 연산자: " + (--a));
////        System.out.println("후위 감소 연산자: " + (b--));
//////      a 전위 감소하고 그값을 반환한다
////        System.out.println("전위 감소 연산자: " + (b--));
////        System.out.println("후위 감소 연산자: " + (--a));
////
////        System.out.println("전위 감소 연산자: " + (--a));
////        System.out.println("후위 감소 연산자: " + (b--));

//        불리언

        boolean isRainning = true;
        if (isRainning) {
            System.out.println("하늘에서 비가와요");
        }
        if (!isRainning) {
            System.out.println("김태희가 안옵니다");
        }

        boolean isSunny = false;
        if (isSunny) {
            System.out.println("날씨가 맑아요");
        }
        if (!isSunny) {
            System.out.println("비가와요");
        }
    }
}
