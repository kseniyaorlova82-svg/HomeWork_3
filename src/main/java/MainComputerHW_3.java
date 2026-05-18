public class MainComputerHW_3 {

        public static void main(String[] args){

            Computer c1 = new Computer();//DEFAULT CONSTRUCTOR
            c1.setCompany("Lenovo");
            c1.setRam(8);
            c1.setCpu("i5");
            c1.setSdd(500);

            System.out.println("Company: " + c1.getCompany());
            System.out.println("RAM: " + c1.getRam());
            System.out.println("CPU: " + c1.getCpu());
            System.out.println("SDD: " + c1.getSdd());


            Computer c2 = new Computer();
            c2.setCompany("HP");
            c2.setRam(16);
            c2.setCpu("i7");
            c2.setSdd(1000);

            System.out.println("Company: " + c2.getCompany());
            System.out.println("RAM: " + c2.getRam());
            System.out.println("CPU: " + c2.getCpu());
            System.out.println("SDD: " + c2.getSdd());


            Computer c3 = new Computer();
            c3.setCompany("Dell");
            c3.setRam(32);
            c3.setCpu("i9");
            c3.setSdd(2000);

            System.out.println("Company: " + c3.getCompany());
            System.out.println("RAM: " + c3.getRam());
            System.out.println("CPU: " + c3.getCpu());
            System.out.println("SDD: " + c3.getSdd());
        }
    }
