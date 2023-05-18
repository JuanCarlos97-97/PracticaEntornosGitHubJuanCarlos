public class V2 {
    public static String metodo(String n){
        String num = n;
        int numero = Integer.parseInt(n);
        if(numero%3 == 0)
            return "Gacha";
        if(numero % 5 == 0)
            return "Miga";
        return num;
    }
}
