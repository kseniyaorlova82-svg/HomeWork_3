public class MainCarHW_3 {

        public static void main(String[] args){

            CarHW_3 c1 = new CarHW_3();//DEFAULT CONSTRUCTOR
            c1.setBrand("Mercedes");
            c1.setColor("White");
            c1.setSpeed(250);
            c1.setPrice(110000);

            System.out.println("Brand: " + c1.getBrand());
            System.out.println("Color: " + c1.getColor());
            System.out.println("Speed: " + c1.getSpeed());
            System.out.println("Price: " + c1.getPrice());



            CarHW_3 c2 = new CarHW_3();
            c2.setBrand("BMW");
            c2.setColor("Black");
            c2.setSpeed(320);
            c2.setPrice(120000);

            System.out.println("Brand: " + c2.getBrand());
            System.out.println("Color: " + c2.getColor());
            System.out.println("Speed: " + c2.getSpeed());
            System.out.println("Price: " + c2.getPrice());


            CarHW_3 c3 = new CarHW_3();
            c3.setBrand("Tesla");
            c3.setColor("Gray");
            c3.setSpeed(300);
            c3.setPrice(95000);

            System.out.println("Brand: " + c3.getBrand());
            System.out.println("Color: " + c3.getColor());
            System.out.println("Speed: " + c3.getSpeed());
            System.out.println("Price: " + c3.getPrice());
        }
    }
