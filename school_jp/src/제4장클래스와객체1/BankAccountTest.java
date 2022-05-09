package 제4장클래스와객체1;

class BankAccount{// 은행계좌
    int accountNumber;// 계좌번호
    String owner;// 예금주
    int balance;// 잔액을 표시하는 변수

    void deposit(int amount){           balance += amount;   }
    void withdraw(int amount){          balance -= amount;   }
    public String toString(){
        return "현재 잔액은 " + balance + "입니다.";
    }
}

public class BankAccountTest{
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        myAccount.deposit(10000);// 값 넣기
        System.out.println(myAccount);// 출력
        myAccount.withdraw(8000);// 값 넣기
        System.out.println(myAccount);// 출력
    }
}