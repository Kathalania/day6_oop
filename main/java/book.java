public class book {
    private String cover;
    private String title;
    private String author;
    private int pageCount;
    private String isbn;

    public String getCover(){
        return cover;
    }

    public String getAuthor(){
        return author;
    }

    public int getPageCount(){
        return pageCount;
    }

    public void setCover(String newCover){
        cover = newCover;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public void setPageCount(int newPageCount){
        pageCount = newPageCount;
    }
}


