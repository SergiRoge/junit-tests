public class Prueba {

    private Comment comment;

    private String nombre;
    private String abreviatura;
    private String unidades;
    private Result result;

    public Prueba(String nombre, String abreviatura, String unidades)
    {
        this.nombre = nombre;
        this.abreviatura = abreviatura;
        this.unidades = unidades;
    }

    public Prueba() {

    }


    public void addComment(Comment comment) {
        this.comment = comment;
    }

    public Comment getComment() {
        return this.comment;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAbreviatura() {
        return abreviatura;
    }

    public void setAbreviatura(String abreviatura) {
        this.abreviatura = abreviatura;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public void addResult(Result result) {
        this.result = result;
    }

    public Result getResult() {
        return this.result;
    }

    public void setCommentario(Comment comentario) {
        this.comment = comentario;
    }
}
