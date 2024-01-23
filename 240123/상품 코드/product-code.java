import java.util.Scanner;

class ProductInf{
    String productName;
    int productCode;

    public ProductInf(String productName, int productCode){
        this.productName = productName;
        this.productCode = productCode;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ProductInf productInf1 = new ProductInf("codetree", 50);
        String productName = sc.next();
        int productCode = sc.nextInt();

        ProductInf productInf2 = new ProductInf(productName, productCode);

        System.out.println("product "+productInf1.productCode+" is "+productInf1.productName);
        System.out.println("product "+productInf2.productCode+" is "+productInf2.productName);


    }
}