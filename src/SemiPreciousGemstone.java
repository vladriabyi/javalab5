public class SemiPreciousGemstone extends Gemstone {
    public SemiPreciousGemstone(String name, double weight, double value, double transparency) {
        super(name, weight, value, transparency);
    }

    @Override
    public double calculateValue() {
        return getValue();
    }
}
