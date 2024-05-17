public class object {
    public static void main(String[] args) {
        // 테스트용
        System.out.println("객체지향 생성자 오버로딩 테스트 코드");
        student stdObj1 = new student();                // 생성자 호출

        stdObj1.id = 202002056;
        stdObj1.name = "seungho";
        stdObj1.printInfo();

        student stdObj2 = new student(202002057);    //일반 생성자 호출
        // 일반 생성자로 id를 넘겨주어 객체 생성
        // 즉, id 입력은 인자값으로 대신한 것
        stdObj2.name = "ohseungho";
        stdObj2.printInfo();

        student stdObj3 = new student(202002058, "SSSSS");    //일반 생성자 호출(오버로딩)
        // id와 name 둘 다 생성자로 넘겨주어 객체 생성
        stdObj3.printInfo();

        // 자식클래스 객체 생성
        student_use test = new student_use();
        test.print();
    }
}
