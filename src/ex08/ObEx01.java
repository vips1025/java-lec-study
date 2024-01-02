package ex08;

class Account extends Object {
    private String author;
    private int number;
    private int balance;

    public Account(String name, int number, int balance) {
        this.author = name;
        this.number = number;
        this.balance = balance;
    }

    public String getAuthor() {
        return author;
    }

    public int getNumber() {
        return number;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "author='" + author + '\'' +
                ", number=" + number +
                ", balance=" + balance +
                '}';
    }
}

public class ObEx01 {
    public static void main(String[] args) {
        Account account = new Account("홍길동", 1111, 1000);
        Account account2 = new Account("홍길동", 1111, 1000);
        System.out.println(account);
        System.out.println(account2);
//        System.out.println(account.toString());
//        System.out.println(account.getClass());
//        System.out.println(account.hashCode());

        // 메모리 값 비교, (주소 비교)
        if (account == account2) {
            System.out.println("같은가요?");
        }
        // account -> equals() (오브젝트) (주소비교)
        // account.toString -> equals() (주소비교 and 값비교)
        if(account.toString().equals(account2.toString())) {
            System.out.println("같은가요??");
        }
    }
}
