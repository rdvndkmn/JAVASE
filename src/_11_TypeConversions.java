public class _11_TypeConversions {
    public static void main(String[] args){
        /*Büyük veri küçük veriye dönüştürülünce veri kaybı yaşanır*/
        byte sayi1;
        int sayi2 = 154;
        float sayi3 = 45.87f;
        double sayi4 = 78.65;

        sayi1 = (byte) sayi2;
        sayi4 = sayi2;
        sayi3 = sayi2;
        System.out.println("Sayı1 " + sayi1 + " Sayı4 " + sayi4 + "  " + sayi3);


    }
}
