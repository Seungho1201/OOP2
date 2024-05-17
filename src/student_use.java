// student class를 부모로 받는 자식 클래스 선언 extends
public class student_use extends student{
    void print(){
        System.out.println("부모 클래스 상속: " + id + name);
    }
}
