public class valorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a;

        a++;
        b--;

        System.out.println(a + " " + b);
        Data d1 = new Data(1, 6, 2022);
        Data d2 = d1;

        d2.day = 31;
        d2.month = 12;

        System.out.println(d2.day + "/" + d2.month);
    }
}
