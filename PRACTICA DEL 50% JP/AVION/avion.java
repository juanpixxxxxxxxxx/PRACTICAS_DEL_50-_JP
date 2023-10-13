package avion;

public class avion {
    private String fabricante;
    private int numeroMotores;

    public avion(String fabricante, int numeroMotores) {
        this.fabricante = fabricante;
        this.numeroMotores = numeroMotores;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getNumeroMotores() {
        return numeroMotores;
    }

    public void setNumeroMotores(int numeroMotores) {
        this.numeroMotores = numeroMotores;
    }

    public void imprimirFabricante() {
        System.out.println("Fabricante: " + fabricante);
    }

    public void cambiarFabricante(avion avion) {
        avion.setFabricante("Lockheed");
    }


}
