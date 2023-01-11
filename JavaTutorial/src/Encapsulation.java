public class Encapsulation {
    public static void main(String[] args) {
        Account sachinAccnt = new Account();
        sachinAccnt.setAccNo(123456789l);
        sachinAccnt.getAccNo();
        sachinAccnt.setName("Sachin");
        sachinAccnt.getName();
        sachinAccnt.setAmount(4500);
        sachinAccnt.getAmount();
    }
}

// an encapsulated class has some private member and getter and setter methods.

class Account {
    private long accNo;
    private String accName;
    private float accAmount = 0.0f;

    public void setAccNo(long number){
        accNo = number;
        System.out.println("account number set successfully");
    }
    public void setName(String name){
        accName = name;
        System.out.println("Name set successfully");
    }

    public void setAmount(float amount){
        accAmount += amount;
        System.out.println("amount set successfully");
    }

    public void getAccNo(){
        System.out.println("Acc No - " + accNo);
    }

    public void getName(){
        System.out.println("Account Name - " + accName);
    }

    public void getAmount(){
        System.out.println("Amount -" + accAmount);
    }
}