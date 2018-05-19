import java.util.Date;

public class Comment {

    private String textComment;
    private Date date;
    public Comment(String textComment, Date date) {
        this.textComment = textComment;
        this.date = date;
    }

    public Comment() {

    }

    public Comment(String comentario) {
        textComment = comentario;
    }

    public String getTextComment() {
        return this.textComment;
    }

    public Boolean save() {
        return false;
    }
}
