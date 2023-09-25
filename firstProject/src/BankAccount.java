/**
 * @author XiangChen
 * @create 2023-09-19 11:00
 */
public class BankAccount {
    private int account = 123456;
    private String id;
    private String secret = "000000";
    double leftAmount = 0;
    private static double rate;
    private static double minAmount;

    public  BankAccount(){
        account ++;
        id = account + "";
        System.out.println("初始化密码为6个0");
    }

    public BankAccount( String secret) {
        account ++;
        id = account + "";
        this.account += 1;
        this.secret = secret;
    }

    public double getAccount() {
        return leftAmount;
    }

    public String getSecret() {
        return secret;
    }

    public void setSecret(String secret) {
        this.secret = secret;
    }

    public double getLeftAmount() {
        return leftAmount;
    }

    public void addLeftAmount(double amount) {
        this.leftAmount += amount;
    }
    public void decAmount(double amount) {
        if(this.leftAmount < amount){
            System.out.println("余额不足");
        }else {
            this.leftAmount -= leftAmount;
        }

    }

    public static double getRate() {
        return rate;
    }

    public static void setRate(double rate) {
        BankAccount.rate = rate;
    }

    public static double getMinAmount() {
        return minAmount;
    }

    public static void setMinAmount(double minAmount) {
        BankAccount.minAmount = minAmount;
    }

    public static void changeRate(double r){
        rate = r;
        System.out.println("利率修改成功");
    }

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("18727715091");
        System.out.println();
        b1.addLeftAmount(200);
        System.out.println(b1.getLeftAmount());

    }

}
