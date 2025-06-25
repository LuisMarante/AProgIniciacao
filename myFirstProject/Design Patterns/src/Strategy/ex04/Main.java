package Strategy.ex04;

public class Main {

    public static void main(String[] args) {

        ImageProcessor i1 = new ImageProcessor(new VintageFilterStrategy());
        ImageProcessor i2 = new ImageProcessor(new SepiaFilterStrategy());

        ImageProcessor i3 = new ImageProcessor(new BlackAndWhiteFilterStrategy());


        i1.applyFilter();
        i2.applyFilter();
        i3.applyFilter();

    }
}
