package ref;

public class Method2 {

    public static void main(String[] args) {
        Student student1 = createStudent("학생1", 15, 90);
        System.out.println("student1=" + student1);
        Student student2 = createStudent("학생2", 16, 80);
        System.out.println("student2=" + student2);

        printStudent(student1);
        printStudent(student2);
    }

    static Student createStudent(String name, int age, int grade) {
        Student student = new Student();
        System.out.println("student=" + student);
        student.name = name;
        student.age = age;
        student.grade = grade;
        return student;
    }

    static void printStudent(Student student){
        System.out.println("이름:" + student.name + " 나이:" +  student.age + " 성적:" + student.grade);
    }

    /**
     * 실행결과
     * student=ref.Student@5f184fc6
     * student1=ref.Student@5f184fc6
     * student=ref.Student@6f496d9f
     * student2=ref.Student@6f496d9f
     * 이름:학생1 나이:15 성적:90
     * 이름:학생2 나이:16 성적:80
     */
}
