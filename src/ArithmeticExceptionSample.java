
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        // int型10をint型0で徐算
        double a = 10.0 / 0.0; //この場合は、例外が発生しない!
        
        //　この下の出力は実行される!
        System.out.println(a);

    }

}
