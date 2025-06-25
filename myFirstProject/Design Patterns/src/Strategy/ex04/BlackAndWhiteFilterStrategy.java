package Strategy.ex04;

public class BlackAndWhiteFilterStrategy implements ImageFilterStrategy{


    @Override
    public void applyFilter() {
        System.out.println("Aplica um filtro preto e branco");
    }
}
