
public class Review01 {

    public static void main(String[] args) {
        int zeinuki = 1500;
        int zei = tax(zeinuki);
        int zeikomi = zeinuki + zei;
        System.out.println(zeinuki + "円の商品の税込価格は" + zeikomi + "円" + "(消費税は" + zei + "円)です。");

    }

    // public static int tax(int zeinuki) へ変更
    //taxメソッド  [アクセス修飾子] [その他の修飾子] 戻り値のデータ型 メソッド名( [引数リスト] )  {
    public static int tax (int zeinuki) {
        //double zeikomi = (double) zeinuki * 1.1;でなくて
        int zei = (int) (zeinuki * 0.1);
        return zei;
    }

}
