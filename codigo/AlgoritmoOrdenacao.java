package codigo;

public class AlgoritmoOrdenacao {

    private String metodo;
    private long tempo30;
    private long tempo50;
    private long tempo100;
    private long tempo200;
    private long tempo1000;
    private long tempo10000;
    private long tempo100000;

    public AlgoritmoOrdenacao() {}

    public AlgoritmoOrdenacao(String metodo) {
        this.metodo = metodo;
    }

    public AlgoritmoOrdenacao(String metodo, long tempo30, long tempo50, long tempo100, long tempo200,
                              long tempo1000, long tempo10000, long tempo100000) {
        this.metodo = metodo;
        this.tempo30 = tempo30;
        this.tempo50 = tempo50;
        this.tempo100 = tempo100;
        this.tempo200 = tempo200;
        this.tempo1000 = tempo1000;
        this.tempo10000 = tempo10000;
        this.tempo100000 = tempo100000;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public long getTempo30() {
        return tempo30;
    }

    public void setTempo30(long tempo30) {
        this.tempo30 = tempo30;
    }

    public long getTempo50() {
        return tempo50;
    }

    public void setTempo50(long tempo50) {
        this.tempo50 = tempo50;
    }

    public long getTempo100() {
        return tempo100;
    }

    public void setTempo100(long tempo100) {
        this.tempo100 = tempo100;
    }

    public long getTempo200() {
        return tempo200;
    }

    public void setTempo200(long tempo200) {
        this.tempo200 = tempo200;
    }

    public long getTempo1000() {
        return tempo1000;
    }

    public void setTempo1000(long tempo1000) {
        this.tempo1000 = tempo1000;
    }

    public long getTempo10000() {
        return tempo10000;
    }

    public void setTempo10000(long tempo10000) {
        this.tempo10000 = tempo10000;
    }

    public long getTempo100000() {
        return tempo100000;
    }

    public void setTempo100000(long tempo100000) {
        this.tempo100000 = tempo100000;
    }

    @Override
    public String toString() {
        return "AlgoritmoOrdenacao{" +
                "metodo='" + metodo + '\'' +
                ", tempo30=" + tempo30 +
                ", tempo50=" + tempo50 +
                ", tempo100=" + tempo100 +
                ", tempo200=" + tempo200 +
                ", tempo1000=" + tempo1000 +
                ", tempo10000=" + tempo10000 +
                ", tempo100000=" + tempo100000 +
                '}';
    }
}
