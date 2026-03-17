package construct;

public class MemberThis {
    String nameField;

    void initMember(String nameParameter) {
        nameField = nameParameter; //이런 경우는 this 생략 가능 요즘은 IDE가 발전하여 색상으로 구분해주어서 이런 경우 꼭 this를 굳이 넣지 않아도 된다. (강사님 생각)
    }
}
