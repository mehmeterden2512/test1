package aggregation;

public class Ogrenci {

    private Hoca danisman;//hoca classından olusturulmus danışman(intance)
    public Ogrenci (Hoca d){

        danisman=d;
    }

    public Hoca getDanisman() {
        return danisman;
    }

    public void setDanisman(Hoca danisman) {
        this.danisman = danisman;
    }
}
