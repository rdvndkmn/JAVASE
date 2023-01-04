public class _20_CompoundAssignmentOperators {
    public static void main(String[] args){
        // sayıyya kendisi ile işlem  yapıp kendi içine geri atanıyor.

        int i = 90;
        double d = 80.70;
        float f = 70.60f;

        i +=1;
        System.out.println(i);
        d -= 5;
        System.out.println(d);
        f /= 2;
        System.out.println(f);
        i *= 2;
        System.out.println(i);
        f %= 3;
        System.out.println(f);
    }
}
