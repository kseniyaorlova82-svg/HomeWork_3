 public class MainPerson {
    public static void main(String[] args){
        Person p1 = new Person();//DEFAULT CONSTRUCTOR//создание обьекта персон
        p1.setName("Oksana Hanzii");
        p1.setId(12345);
        p1.setAge(44);
        System.out.println("Name: " + p1.getName());
        System.out.println("Id: " + p1.getId());
        System.out.println("Age: " + p1.getAge());

        Person p2 = new Person();// создание обьекта персон 2
        p2.setName("Dasha Abalmasova");
        p2.setId(25720);
        p2.setAge(18);
        System.out.println("Name: " + p2.getName());
        System.out.println("Id: " + p2.getId());
        System.out.println("Age: " + p2.getAge());
    }
}
/*

p1->[name='Oksana Hanzii' id = 12345 age = 44]
p2->[name 'Dasha Abalmasova' id = 25720 age = 18]
 */


 /*. HW 3
 1.     Computer

        -----------


        company(String) "Lenovo"
        ram(int)         8 or 16
        cpu(String)     i5, i9
        sdd(int)        500 GB
        ser/get

        MainComputer -> main
        create 3 objects Computer
        use setters and getters for printing


        2. Advance
        for your choose
  */