package fichaPraatica03;

public class ex08 {
    public static void main(String[] args) {

        int x = 20;

        int antecessor = x - 5;

        int sucessor = x + 5;

        while (antecessor <= sucessor) {
            if (antecessor != x) {
                System.out.println(antecessor);
            }
            antecessor++;
        }

    }
}

