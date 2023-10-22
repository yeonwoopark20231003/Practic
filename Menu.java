package Practic;


//메뉴 클래스는 이름, 설명 필드를 가지는 클래스로 만들어주세요.
//메뉴 클래스
public class Menu {

    //속성
    private String name;
    private String description;


    //함수 (생성자)

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }


    //메서드


    public String getName() {
        return name;
    }
    public String getDescription() {
        return description;
    }


}
