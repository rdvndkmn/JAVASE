public class _10_LifetimesOfVariables {
    public static void main(String[] args){
        /*İki kırlangıç arası bir yaşam döngüsüdür dışarıda değişken kullanılamaz ve iki tane sayı1 olması bellekte de iki farklı yerde tutulduğunu gösterir
        çünkü yaşam alanları farklıdır*/
        int sayi = 1997;
        if (sayi == 1997){
            int sayı1 = 12;
            System.out.println("eşit " + sayı1);
        }
        else {
            int sayı1 = 12;
            System.out.println("eşit değil " + sayı1);
        }


    }
}
