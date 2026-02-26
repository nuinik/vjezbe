package Ucilica;

public abstract class GeometrijskiLik implements Comparable<GeometrijskiLik> {

    private String naziv;

    public abstract double opseg();
    public abstract double povrsina();

    public GeometrijskiLik(String naziv) {
        this.naziv = naziv;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv){
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Naziv:%s, površina:%f, opseg:%f".formatted(naziv,povrsina(),opseg());
    }

    @Override
    public int compareTo(GeometrijskiLik other) {
        return Double.valueOf(povrsina()).compareTo(Double.valueOf(other.povrsina()));
    }
}
