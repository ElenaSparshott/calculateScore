public class Main {

    public static void dis(String name, int position) {
        System.out.println( name + " managed to get into position " + position + " on the high score table !");
    }


    public static int a( int score){
        if (score > 1000) {
            return 1;
        } else if (score > 500 && score < 1000) {
            return 2;
        } else if (score > 100 && score < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    public static void main(String[] args) {

        final int position1 = a(1500);
        final int position2 = a(3000);
        dis("Ellie", position1);

    }


}

