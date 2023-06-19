public class CH07_P07_FactoryMethod {
    public static void main(String[] args) {
        
        Coin level1 = new Coin(100);
        Coin level2 = new Coin(134);

        Coin level3 = level1.add(level2);

        System.out.println("level 1 : "+level1); //this.value
        System.out.println("level 2 : "+level2.toString()); // this.value
        System.out.println("level 3 : "+level3);
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

    Coin  add(Coin c) // factory method
    {
        int sum = this.value+c.value;
        
        Coin c3 = new Coin(sum);

        return c3;
    }

    @Override
    public String toString(){
        return value+" coins";
    }

}
