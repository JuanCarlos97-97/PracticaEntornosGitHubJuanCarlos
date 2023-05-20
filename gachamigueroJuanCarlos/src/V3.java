public class V3 {
    public static String cocinar(String n){
        String num = n;
        int numero = Integer.parseInt(n);
        if(numero%3==0 && numero%5==0)
            return "Gachamiga";
        if(numero%3 == 0)
            return "Gacha";
        if(numero % 5 == 0)
            return "Miga";
        return num;
    }
}
