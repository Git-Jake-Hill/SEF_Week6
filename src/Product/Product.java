package Product;

public class Product {
    private int productId;
    private String productName;
    private int crYear;
    private String description;
    private String website;
    private double price;

    public Product(int id, String pn, int cr) {
        productId = id;
        productName = pn;
        crYear = cr;
    }

    public void updateDescription(String d) {
        description = d;
    }

    public void updateWebsite(String w) {
        website = w;
    }

    private boolean checkURL(String url) {
        return website == url;
    }

    public void setPrice(double p) {
        price = p;
    }
}
