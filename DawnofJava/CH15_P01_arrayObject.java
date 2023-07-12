public class CH15_P01_arrayObject {
    public static void main(String[] args) {

        Product products[] = new Product[12];

        products[0] = new Product("i Phone 12 Pro Max", 57900, "#0d0100");
        products[1] = new Product("i phone 14 pro max", 41500, "#301934");
        products[2] = new Product("i phone 11", 34900, "#FFFFFF");
        products[3] = new Product("i phone 11 pro", 39900, "#FFFFFF");
        products[4] = new Product("redmi note 9", 12850, "#000000");
        products[5] = new Product("redmi note 9 pro", 15900, "#000000");
        products[6] = new Product("1 pulse 8 pro", 28999, "#6E6D6D");
        products[7] = new Product("samsung s20", 34999, "#545151");
        products[8] = new Product("samsung s23", 74798, "#966B6B");
        products[9] = new Product("samsung s10", 71000, "#000000");
        products[10] = new Product("realme 10", 16882, "#E4AFEA");
        products[11] = new Product("realme 10 pro plus", 25999, "#000000");

        for (Product p : products) {
            if (p.getpPrice() > 25000 && p.getpName().contains("samsung"))
                System.out.println(p);
        }
    }
}

class Product {

    static int currentId = 0;

    private int pId;
    private String pName;
    private double pPrice;
    private String pColor;

    public Product(String pName, double pPrice, String pColor) {
        this.pId = currentId++;
        this.pName = pName;
        this.pPrice = pPrice;
        this.pColor = pColor;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public double getpPrice() {
        return pPrice;
    }

    public void setpPrice(double pPrice) {
        this.pPrice = pPrice;
    }

    public String getpColor() {
        return pColor;
    }

    public void setpColor(String pColor) {
        this.pColor = pColor;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pPrice=" + pPrice +
                ", pColor='" + pColor + '\'' +
                '}';
    }
}
