import com.javapractice.*;

public class JavaPackage {
    public static void main(String[] args) {
        HelperClass hlpObj = new HelperClass();
        String formatValue = hlpObj.getFormatDollar(23000);
        System.out.println(formatValue);
    }
}
