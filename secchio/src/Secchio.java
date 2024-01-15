public class Secchio implements Comparable<Secchio>{

    private double cap;
    private double vol;

    public Secchio(double cap) {
        this.cap = cap;
    }

    public Secchio(double cap, double vol) {
        this.cap = cap;
        this.vol = vol;
    }

    public double getCap() {
        return cap;
    }

    public double getVol() {
        return vol;
    }

    public void svuota(){
        this.vol = 0;
    }

    public void svuota(double vol) throws Exception {
        if(vol>this.vol){
            throw new Exception("non puoi svuotare ciò che non hai");
        }
        this.vol-=vol;
    }

    public void riempi(){
        this.vol = this.cap;
    }

    public double riempi(double vol){
        if(vol>(this.cap-this.vol)){
            vol-=this.cap-this.vol;
            this.vol=this.cap;
        } else {
            this.vol+=vol;
            vol=0;
        }
        return vol;
    }

    public void travasa(Secchio s){
        this.vol=s.riempi(this.vol);
    }

    public void travasa(Secchio s, double vol) throws Exception {
        if(vol>this.vol){
            throw new Exception("volume richiesto non disponibile");
        }else if((vol+s.vol)>s.cap){
            throw new Exception("secchio da riempire non ha lo spazio disponibile");
        }

        this.vol-=vol;
        s.vol+=vol;
    }

    public String toString(){
        return "{ cap : " + this.cap + " , vol : " + this.vol + " }";
    }

    public Secchio clone(){
        return new Secchio(this.cap, this.vol);
    }

    @Override
    public int compareTo(Secchio s) {
        return (int)(this.cap-s.cap);
    }
}
