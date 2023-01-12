public class Polymorphism {

    public static void main(String[] args) {
        Bank rbi = new Bank();
        Bank sbi = new Sbi();
        Bank hdfc = new Hdfc();
        System.out.println(rbi.repoRate);
        rbi.getRateOfIntrst();
        System.out.println(sbi.repoRate);
        sbi.getRateOfIntrst();
        System.out.println("Interest - " + sbi.calculateInterest(45000));
        System.out.println("Interest - " + sbi.calculateInterest(30000.0f));
        System.out.println(hdfc.repoRate);
        hdfc.getRateOfIntrst();
    }
}

class Bank {

    float repoRate = 5.0f;
    public void getRateOfIntrst(){
        System.out.println("rate of interest range from 7 - 15 % annum");
    }

    public int calculateInterest(int amount){
        int interest = (amount * 7) / 100;
        return interest;
    }
    // method overloading
    public float calculateInterest(float amount){
        float interest = amount * 0.07f;
        return interest;
    }
}

class Sbi extends Bank {
    // data member are not override like methods
    float repoRate = 6.0f;
     @Override
     public  void getRateOfIntrst(){
        System.out.println("roi - 7% p.a");
    }


}

class Hdfc extends Bank {
    // data member are not override like methods
    float repoRate = 5.5f;
    @Override
    public void getRateOfIntrst(){
        System.out.println("roi - 9% p.a");
    }
}