public class VariableTypes {
    // class variables or static variable is common for all object this field will get memory only once
    static int staticNumber = 67;
    // instance variable
    int instanceNum = 56;

    VariableTypes(){
        System.out.println(instanceNum);
    }
    VariableTypes(int num){
        instanceNum = num;
    }
    public static void main(String[] args) {
        System.out.println(VariableTypes.staticNumber);
        VariableTypes varObj1 = new VariableTypes(45);
        System.out.println(varObj1.instanceNum);
        varObj1.add();

        VariableTypes varObj2 = new VariableTypes();
        System.out.println(varObj2.instanceNum);
        varObj2.add();
    }

    void add(){
        // local variable
        int res = 0;
        res = staticNumber + instanceNum;
        System.out.println(res);
    }
}
