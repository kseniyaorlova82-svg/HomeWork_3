public class Computer {

        //fields
        private String company;
        private int ram;
        private String cpu;
        private int sdd;

        //DEFAULT CONSTRUCTOR
        public Computer()

        {
            System.out.println("DEFAULT CONSTRUCTOR");
        }

        //setters
        public void setCompany(String company){
            if(company != null)
                this.company = company;
        }

        public void setRam(int ram){
            if(ram > 0)
                this.ram = ram;
        }

        public void setCpu(String cpu){
            if(cpu != null)
                this.cpu = cpu;
        }

        public void setSdd(int sdd){
            if(sdd > 0)
                this.sdd = sdd;
        }

        //getters
        public String getCompany() {
            return company;
        }

        public int getRam() {
            return ram;
        }

        public String getCpu() {
            return cpu;
        }

        public int getSdd() {
            return sdd;
        }
    }
