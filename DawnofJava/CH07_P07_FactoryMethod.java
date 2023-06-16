public class CH07_P07_FactoryMethod {
    public static void main(String[] args) {
        
    }
}
class Coin{

    private int value;

    public Coin(int value)
    {
        this.value = value;
    }

    int getCoinValue() //
    {
        
        return this.value;
    }

    Coin  add(Coin c1, Coin c2) // factory metho
    {
        int sum = c1.value+c2.value;

        return new Coin(sum);
    }

}
