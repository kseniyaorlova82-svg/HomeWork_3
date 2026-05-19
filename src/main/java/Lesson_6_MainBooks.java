public class Lesson_6_MainBooks {

    public static void main(String[] args){
        Book bk =
                new Book("Buratino","Tolstoy",150,12345);
        System.out.println(bk);

        FictionBook fb =
                new FictionBook("Vii","Gogol",230,13567, "Drama");
        System.out.println(fb);

        EducationBook eb =
                new EducationBook("Math", "Pifagor",
                        300,18765, "Geometry" );
        System.out.println(eb);

        KidsFictionBook kfb =
                new KidsFictionBook("Kolobok", "Persons",
                        40, 14432, "fairytale", 3);
        System.out.println(kfb);
    }
}
/*
                                  Object toString()
                                       |
                                     Book  toString()
                              |                 |
                   FictionBook toString()     EducationBook toString()
                               |
                        KidsFictionBook toString()

 */

/*                              Person
                            [name, id, age]
                        |             |              |
                     Employee      SportsMan       Patient
             [company, salary]    [sport, status]     [idCardInsurance]
                     |
                SalesEmployee
                [bonus]

 */