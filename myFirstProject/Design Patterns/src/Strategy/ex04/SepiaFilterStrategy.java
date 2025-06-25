package Strategy.ex04;

public class SepiaFilterStrategy implements ImageFilterStrategy{
    @Override
    public void applyFilter() {
        System.out.println("Aplica o filtro Sépia");
    }
}
