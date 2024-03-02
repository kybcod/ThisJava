package Check06.ex20;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.StringTemplate.STR;

public class BankApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int index = 0;

        Account[] account = new Account[100];
        for(int i = 0; i<account.length; i++){
            account[i] = new Account();
        }


        while (run){

            System.out.println("------------------------------------------------");
            System.out.println("1.계좌생성 | 2. 계좌목록 | 3.예금 | 4.출금 | 5. 종료");
            System.out.println("------------------------------------------------");
            System.out.print("선택> ");

            String menu = scanner.nextLine();

            switch (menu){
                case "1"->{
                    System.out.println("----------");
                    System.out.println("계좌생성");
                    System.out.println("----------");


                    System.out.print("계좌번호 : ");
                    String num = scanner.nextLine();
                    account[index].setNumber(num);
                    System.out.println(index);


                    System.out.print("계좌주 : ");
                    String name = scanner.nextLine();
                    account[index].setName(name);
                    System.out.println(index);


                    System.out.print("초기입금액 : ");
                    int InitialDeposit = scanner.nextInt();
                    account[index].setInitialDeposit(InitialDeposit);
                    System.out.println(index);

                    System.out.println("결과 : 계좌가 생성되었습니다.");
                    index++;
                    scanner.nextLine(); // 버퍼에 남아있는 개행 문자 소비
                }
                case "2" -> {
                    System.out.println("----------");
                    System.out.println("계좌목록");
                    System.out.println("----------");
                    for(int i = 0;i<index; i++){
                        System.out.println(STR."\{account[i].getNumber()}     \{account[i].getName()}    \{account[i].getInitialDeposit()}");
                    }
                }

                case "3" -> {
                    System.out.println("----------");
                    System.out.println("예금");
                    System.out.println("----------");

                    System.out.print("계좌번호 : ");
                    String num = scanner.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < index; i++) {
                        if (account[i].getNumber().equals(num)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if(foundIndex == -1){
                        System.out.println("없는 계좌입니다.");
                    }
                    else{
                        System.out.print("예금액 : ");
                        int deposit = scanner.nextInt();
                        account[foundIndex].setInitialDeposit(account[foundIndex].getInitialDeposit() + deposit);
                    }

                    scanner.nextLine(); // 버퍼에 남아있는 개행 문자 소비


                }

                case "4" -> {
                    System.out.println("----------");
                    System.out.println("출금");
                    System.out.println("----------");

                    System.out.print("계좌번호 : ");
                    String num = scanner.nextLine();

                    int foundIndex = -1;
                    for (int i = 0; i < index; i++) {
                        if (account[i].getNumber().equals(num)) {
                            foundIndex = i;
                            break;
                        }
                    }

                    if(foundIndex == -1){
                        System.out.println("없는 계좌입니다.");
                    }
                    else {
                        System.out.print("출금액 : ");
                        int withdraw = scanner.nextInt();
                        if(account[foundIndex].getInitialDeposit() < withdraw){
                            System.out.println("출금할 잔액이 없습니다.");
                        }else {
                            account[foundIndex].setInitialDeposit(account[foundIndex].getInitialDeposit() - withdraw);
                            System.out.println("결과 : 출금이 처리되었습니다.");
                        }
                    }
                    scanner.nextLine(); // 버퍼에 남아있는 개행 문자 소비

                }
                case "5" -> run = false;
            }
        }
        System.out.println("프로그램 종료");
    }
}