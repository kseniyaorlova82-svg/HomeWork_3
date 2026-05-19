public class CarHW_3 {

        //fields
        private String brand;
        private String color;
        private int speed;
        private double price;

        //DEFAULT CONSTRUCTOR
        public CarHW_3()

        {
            System.out.println("DEFAULT CONSTRUCTOR");
        }

        //setters
        public void setBrand(String brand){
            if(brand != null)
                this.brand = brand;
        }

        public void setColor(String color){
            if(color != null)
                this.color = color;
        }

        public void setSpeed(int speed){
            if(speed > 0)
                this.speed = speed;
        }

        public void setPrice(double price){
            if(price > 0)
                this.price = price;
        }

        //getters
        public String getBrand() {
            return brand;
        }

        public String getColor() {
            return color;
        }

        public int getSpeed() {
            return speed;
        }

        public double getPrice() {
            return price;
        }

    @Override
    public String toString() {
        return super.toString();
    }
}
