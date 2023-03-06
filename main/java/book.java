public class book {
    private String cover;
    private String title;
    private String author;
    private int pageCount;
    private String isbn;
    private double price;


    // Konstruktor --> erstellt einen neuen Typen vom
    // jeweiligen Objekt (hier: Book)

    // Das Buch kann entweder ohne Variablen in der Main Methode
    // erstellt werden
    public book(){
        System.out.println("Konstruktor");
    }
    // oder es kann auf diese Art erstellt werden mit Eingabe
    // vordefinierter Variablen

    public book(String cover){
        this.cover = cover;
    }


    public String getCover(){
        return cover;
    }

    //Methoden können public, private, protected oder ohne sein

    public String getAuthor(){
        return author;
    }

    public int getPageCount(){
        return pageCount;
    }

    public void setCover(String cover){
        this.cover = cover;
    }

    public void setAuthor(String newAuthor){
        this.author = author;
    }

    public void setPageCount(int newPageCount){
        pageCount = newPageCount;
    }

    // alle Eigenschaften als String zurückgeben

    public String toString(){
        return cover + " " + author + " " + pageCount;
    }
}


