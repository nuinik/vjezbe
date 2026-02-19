package Učilica;

public class Trokut {

    private String naziv;
    private double stranicaA;
    private double stranicaB;
    private double stranicaC;

    public Trokut(String naziv, double stranicaA, double stranicaB, double stranicaC) {
        this.naziv = naziv;
        this.stranicaA = stranicaA;
        this.stranicaB = stranicaB;
        this.stranicaC = stranicaC;
    }

    public String getNaziv() {
        return this.naziv;
    }

    public double getStranicaA() {
        return this.stranicaA;
    }

    public double getStranicaB() {
        return this.stranicaB;
    }

    public double getStranicaC() {
        return this.stranicaC;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public void setStranicaA(double stranicaA) {
        this.stranicaA = stranicaA;
    }

    public void setStranicaB(double stranicaB) {
        this.stranicaB = stranicaB;
    }

    public void setStranicaC(double stranicaC) {
        this.stranicaC = stranicaC;
    }
}
