public class Main {

    public static void main(String[] args) {
        // Gehört zu Java class book

        book abdulsBook = new book();

        abdulsBook.setCover("Gebäude");
        abdulsBook.setAuthor("Elisabeth Jung");

        System.out.println(abdulsBook.getCover());
        System.out.println(abdulsBook.getAuthor());
        //System.out.println(abdulsBook.isbn);


        book robinsBook = new book();
        robinsBook.setCover("Galaxy");
        robinsBook.setAuthor("Dr.");
        System.out.println(robinsBook.getAuthor());

        // gehört zu Java class student

        student hansDampf = new student();

        hansDampf.setDegree("Forstwirtschaft");
        hansDampf.setUniversity("Weihenstephan");
        hansDampf.setSemester(3);
        hansDampf.setEnrolled(true);

        System.out.println(hansDampf.getDegree());
        System.out.println(hansDampf.getUniversity());
        System.out.println(hansDampf.getSemester());
        System.out.println(hansDampf.getEnrolled());
    }
}
