public class _09_DynamicValueAssignment {
    public static void main(String[] args){

        int i1,i2 = 12;
        double d1 = 12.23131313,d2;
        float f1,f2 = 45.78f;

        i1 = (int) (f2 + 4.22f);
        System.out.println(i1);

        d2 =(double) (d1*f2);
        System.out.println(d2);

        f1=(float) (d1*f2);
        System.out.println(f1);

    }
}
