import java.util.Date;

public class Result {
    private int valorResultado;
    private Date fechaResultado;

    public Result(int valorResultado, Date fechaResultado) {
        this.valorResultado = valorResultado;
        this.fechaResultado= fechaResultado;
    }



    public int getValorResultado() {
        return valorResultado;
    }

    public void setValorResultado(int valorResultado) {
        this.valorResultado = valorResultado;
    }

    public Date getFechaResultado() {
        return fechaResultado;
    }

    public void setFechaResultado(Date fechaResultado) {
        this.fechaResultado = fechaResultado;
    }
}
