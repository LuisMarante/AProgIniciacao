package Strategy.ex04;

public class VintageFilterStrategy implements ImageFilterStrategy{
    @Override
    public void applyFilter() {

        System.out.println("Aplica o filtro Vintage");
    }
}
