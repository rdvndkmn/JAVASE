public class _08_DeclareVariables {

    public static void main(String[] args){

     /*
     Byte 127 ye kadar değer alır
     */
        int i1, i2=4, i3 = 15;
        double d1, d2 = 10.78;
        float f1 =(float) 34.45, f2=78.02f;
        byte b1 = 120;
        char c1 = 'a';

        System.out.println((int) ((i1=1 + i2) + d2));
        System.out.println((double) ((i1=1 + i2) + d2));
        System.out.println(++c1);
        System.out.println((int)(b1*b1+f1));

    }
}
