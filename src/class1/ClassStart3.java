package class1;

public class ClassStart3 {

    public static void main(String[] args) {
        /**
         * 객체 생성 시 동작 방식
         * student1 = new Student(); -> 1. Student 객체 생성
         * student1 = x001;          -> 2. new Student()의 결과로 x001 참조값 반환
         * student1 = x001;          -> 3. 최종결과
         *
         * 객체 값 대입
         * student1.name = "학생1"; -> 1. student1 객체의 name 멤버 변수에 값 대입
         * x001.name = "학생1";     -> 2. 변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 name 멤버 변수에 값 대입
         *
         * 객체 값 읽기
         * System.out.println("이름" + student1.name); -> 1. 객체 값 읽기
         * System.out.println("이름" + x001.name);     -> 2. 변수에 있는 참조값을 통해 실제 객체에 접근하고, name 멤버 변수에 접근한다.
         * System.out.println("이름" + "학생1");        -> 3. 객체의 멤버 변수의 값을 읽어옴
         */
        Student student1;
        student1 = new Student(); //x001
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student(); //x002
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println(student1); //출력값: class1.Student@5f184fc6 여기서 참조 값은 @뒤에 5f184fc6
        System.out.println(student2); //출력값: class1.Student@3feba861 여기서 참조 값은 @뒤에 3feba861

        System.out.println("이름" + student1.name + " 나이:" + student1.age + " 성적:" + student1.grade);
        System.out.println("이름" + student2.name + " 나이:" + student2.age + " 성적:" + student2.grade);
    }
}