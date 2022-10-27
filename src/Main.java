public class Main {

    public static void main(String[] args) {
        Author turgenev = new Author("Иван", "Тургенев");
        Author chexov = new Author("Антон", "Чехов");

        System.out.println(turgenev);
        System.out.println(chexov);

        Book mumu = new Book("Муму", turgenev, 2015);
        Book kashtanka = new Book("Каштанка", chexov, 2012);


        mumu.setYearPublication(2020);
        kashtanka.setYearPublication(2017);


        System.out.println(mumu);
        System.out.println(kashtanka);
    }
}