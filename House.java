package entity;


import java.text.SimpleDateFormat;
import java.util.Date;


public class House extends Interface{
    private String type;
    private String address;

    public House() {
    }

    public House(String type, String address, int code, Date date, double price, double area) {
        super(code, date, price, area);
        this.type = type;
        this.address = address;
    }
    
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void printDetails() {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Code: " + code);
        System.out.println("Date: " + df.format(date));
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Address: " + address);
        System.out.println("Area: " + area);
        System.out.println("Total Price: " + calTotalPrice());
    }

    @Override
    public double calTotalPrice() {
        if(type.equals("Super")){
            totalPrice = area * price;
        }
        else{
            totalPrice = area * price * 0.9;
        }
        return totalPrice;
    }
}
