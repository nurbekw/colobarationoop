public class Car {
    private String marca;
    private String model;
    private String color;
    private int price;
    private int maxSpeed;
//    public  (){
//        merseds,toyota,hyundai,honda,waz.
//    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxspeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void auto() {
        this.model = null;
        if (this.marca.equals("Toyota")) {
            model = "Land Cruiser Prado";
            System.out.println("Result:" + "\n" + "Marca: " + marca + " Model: " + model);
        } else if (this.marca.equals("Honda")) {
            model = "Accord";
            System.out.println("Result:" + "\n" + "Marca: " + marca + " Model: " + model);
        } else if (this.marca.equals("Hyindai")) {
            model = "Solaris";
            System.out.println("Result:" + "\n" + "Marca: " + marca + " Model: " + model);
        } else if (this.marca.equals("Lexus")) {
            model = "GX 470";
            System.out.println("Result:" + "\n" + "Marca: " + marca + " Model: " + model);
        } else if (this.marca.equals("Nissan")) {
            model = "Murano";
            System.out.println("Result:" + "\n" + "Marca: " + marca + " Model: " + model);
        } else {
            System.out.println("try again");

        }
    }

}