package aggregation;

public class Hoca {
    private String hocaAdi;
    public Hoca(){

    }

    public Hoca(String hocaAdi) {
        super();
        this.hocaAdi = hocaAdi;
    }
    public String getHocaAdi(){
        return hocaAdi;
    }

    @Override
    public String toString() {
        return hocaAdi ;

    }

    public void setHocaAdi(String hocaAdi){
        this.hocaAdi=hocaAdi;
    }


}
