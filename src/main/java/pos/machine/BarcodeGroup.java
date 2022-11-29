package pos.machine;

public class BarcodeGroup {
    private String barcode;
    private int count;
    public String getBarcode() {
        return barcode;
    }
    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }
    public int getCount() {
        return count;
    }
    public void setCount(int count) {
        this.count = count;
    }
    public BarcodeGroup(String barcode, int count) {
        this.barcode = barcode;
        this.count = count;
    }
    
}