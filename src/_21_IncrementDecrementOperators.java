public class _21_IncrementDecrementOperators {
    public static void main(String[] args){
        //arttırma azaltma operatörleri
        //öncesinde olursa hemen yansır işleme sonunda olursa bir sonraki işlemde yansır.

        int sayı = 10, sayı1;
        sayı1 = sayı++;
        System.out.println(sayı1);
        sayı1 = ++sayı;
        System.out.println(sayı1);

    }
}
