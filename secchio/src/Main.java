public class Main {
    public static void main(String[] args) {

        Secchio s1 = new Secchio(20,10);
        Secchio s2 = new Secchio(30,10);

        s1.riempi();
        System.out.println("s1: " + s1.getVol());
        s1.travasa(s2);
        System.out.println("s2: " + s2.getVol());
        System.out.println("s1: " + s1.getVol());
        try {
            s2.svuota(5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        s1.riempi(5);
        System.out.println("s2: " + s2.getVol());
        System.out.println("s1: " + s1.getVol());
        try {
            s1.travasa(s2, 10);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        s1.riempi();
        System.out.println("s2: " + s2.getVol());
        System.out.println("s1: " + s1.getVol());
        try {
            s1.travasa(s2, 20);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        s1.travasa(s2);
        System.out.println("s2: " + s2.getVol());
        System.out.println("s1: " + s1.getVol());

        System.out.println("differenza: " + s1.compareTo(s2));
        System.out.println(s1.toString());
    }
}