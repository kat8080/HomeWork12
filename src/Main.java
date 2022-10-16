public class Main {
    public static void main(String[] args) {
        Author turgenev = new Author("Иван", "Тургенев");
        Author chexov = new Author("Антон", "Чехов");

        System.out.println("turgenev.getNameAuthor() = " + turgenev.getNameAuthor());
        System.out.println("turgenev.getSurnameAuthor() = " + turgenev.getSurnameAuthor());
        System.out.println("chexov.getNameAuthor() = " + chexov.getNameAuthor());
        System.out.println("chexov.getSurnameAuthor() = " + chexov.getSurnameAuthor());

        Book mumu = new Book("Муму", turgenev, 2015);
        Book kashtanka = new Book("Каштанка", chexov, 2012);

        System.out.println("mumu.getBookName() = " + mumu.getBookName());
        System.out.println("turgenev.getNameAuthor() = " + turgenev.getNameAuthor());
        System.out.println("turgenev.getSurnameAuthor() = " + turgenev.getSurnameAuthor());
        System.out.println("mumu.getYearPublication() = " + mumu.getYearPublication());

        System.out.println("kashtanka.getBookName() = " + kashtanka.getBookName());
        System.out.println("chexov.getNameAuthor() = " + chexov.getNameAuthor());
        System.out.println("chexov.getSurnameAuthor() = " + chexov.getSurnameAuthor());
        System.out.println("mumu.getYearPublication() = " + mumu.getYearPublication());

        mumu.setYearPublication(2020);
        kashtanka.setYearPublication(2017);
        System.out.println("mumu.getYearPublication() = " + mumu.getYearPublication());
        System.out.println("kashtanka.getYearPublication() = " + kashtanka.getYearPublication());
    }
}