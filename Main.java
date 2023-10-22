package Practic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. 생성된 3개의 인스턴스를 리스트 자료구조에 담는다.
        //2. for문을 사용해서 출력하고싶은 문자 만들어서 출력 (문자 틀은 같고 변수만 바뀌게)

        //메뉴
        Menu coffee = new Menu("커피", "커피 샷이 들어간 음료");
        Menu softdrink = new Menu("탄산음료", "탄산이 들어간 음료");
        ArrayList<Menu> menuList = new ArrayList<>();
        menuList.add(coffee);
        menuList.add(softdrink);


        Menu order = new Menu("주문하기","장바구니를 확인 후 주문합니다." );
        Menu cancel = new Menu("취소하기", "진행중인 주문을 취소합니다.");

        //커피
        Product americano = new Product("커피", "아메리카노", "커피 음료", 3800);
        Product cafelatte = new Product("커피", "카페라떼", "우유에 샷이 들어간 커피 음료", 4500);
        Product cafemocha = new Product("커피", "카페모카", "초코맛이 나는 커피 음료", 4000);

        //탄산음료
        Product kola = new Product("탄산음료", "콜라", "검정색 탄산음료", 2000);
        Product sprite = new Product("탄산음료", "사이다", "무색 탄산음료", 2000);
        Product lemonade = new Product("탄산음료", "레몬에이드", "레몬맛 탄산음료", 4000);

        //커피 이름 카테고리에 담기
        //Order order = new Order();  //?? 왜쓰인거>??
        ArrayList<Product> products = new ArrayList<>();
        products.add(americano);
        products.add(cafelatte);
        products.add(cafemocha);
        products.add(kola);
        products.add(sprite);
        products.add(lemonade);

        ArrayList<Product> cart = new ArrayList<>();


        //메뉴 선택, 세부메뉴 출력
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("[메뉴를 선택 해 주세요.]");
            for (int i = 0; i < menuList.size(); i++) {
                int index = i + 1;
                System.out.println(index + "." + menuList.get(i).getName() + " | " + menuList.get(i).getDescription());
            }

            // 주문하기/취소하기
            System.out.println("\t");
            System.out.println("[주문 / 취소]");
            System.out.println("3." + order.getName()+" | "+order.getDescription());
            System.out.println("4." + cancel.getName()+" | "+cancel.getDescription());

            int choice = sc.nextInt();




            List<Product> selectedList = new ArrayList<>();


            if (choice<=2){
                String category = menuList.get(choice - 1).getName(); //커피 or 탄산 출력
                for (int i = 0; i < products.size(); i++) {
                    Product targetProduct = products.get(i);  //커피와 탄산음료 전체를 출력
                    String targetCategory = targetProduct.getCategory();
                    if (category.equals(targetCategory)) {
                        selectedList.add(targetProduct);
                    }
                }
                System.out.println("["+category+"]");
                for (int i = 0; i < selectedList.size(); i++) {
                    int index = i + 1;
                    System.out.println(index + "." + selectedList.get(i).getName() + " | " +
                            selectedList.get(i).getPrice() + "원  | " +
                            selectedList.get(i).getDescription());
                }

            } else if (choice==3) {
                //장바구니 전체 프린트
                System.out.println("장바구니 목록:");
                for (int a = 0; a < cart.size(); a++) {
                    System.out.println(cart.get(a).getName()+" | "+cart.get(a).getPrice()+"원");
                    //총 금액 추가
                }

            }else if(choice==4){
                cart.clear();
                System.out.println("주문이 취소되었습니다.\n");
                continue;
            }


            ///////
            //음료명 입력
            int choice2 = sc.nextInt();
            int c2 = choice2 - 1;

            String choice2name = selectedList.get(c2).getName();//세부 음료 이름 출력

            List<Product> choosedProduct = new ArrayList<>();

            for (int i = 0; i < selectedList.size(); i++) {
                //Product productChoice2 = products.get(i);  //커피와 탄산음료 전체를 출력
                if (choice2name.equals(selectedList.get(i).getName())) {
                    System.out.println(selectedList.get(i).getName() + " | " +
                            selectedList.get(i).getPrice() + "원" + " | " +
                            selectedList.get(i).getDescription()+"\n");

                    //System.out.println("+" + selectedList.get(i).getPrice()+"원");


                    System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                    System.out.println("1. 확인");
                    System.out.println("2. 취소");

                    int select = sc.nextInt();
                    if (select == 1) {
                        // 장바구니 담기
                        cart.add(selectedList.get(c2));
                        System.out.println(selectedList.get(c2).getName() + "가 장바구니에 추가되었습니다.\n");




                    } else if (select == 2) {
                        System.out.println("주문이 취소되었습니다.");
                        break;
                    }
                }
            }

        }
    }
}



