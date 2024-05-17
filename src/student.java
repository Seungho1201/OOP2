public class student {
    int id = 0;
    String name = "기본값";
    //생성자는 정의된 클래스와 이름이 같아야 하며 갹체 생성시 자동 호출
    // 생성자는 어떤 유형도 return X
    // 메서드는 return이 있읏수도 있고 없을수도 있음
    // 생성자는 객체 생성시 단 한번만, 메서드는 여러번 호출 가능


    // 기본생성자 (매개변수가 없는 생성자)
    student(){
        System.out.println("기본 생성자 호출");
    }
    // 일반 생성자 (매개변수 있음)
    student(int id){
        // 일반 생성자를 호출하며 객체 생성
        this.id = id;
        System.out.println("일반 생성자 호출 id : " + id);
    }
    student(int id, String name){
        this.id = id;
        this.name = name;
        System.out.println("일반 생성자(오버로딩)호출 id : " + this.id);
        System.out.println("일반 생성자(오버로딩)호출 name : " + this.name);
    }

    void insertRecord(int id, String name){
        this.id = id;
        this.name = name;
    }

    void printInfo(){
        System.out.println("아이디 : " + id);
        System.out.println("이름 : " + name);
    }
}
