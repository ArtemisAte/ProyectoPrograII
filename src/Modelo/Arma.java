package Modelo;

import java.awt.image.BufferedImage;

public class Arma {
	private String nameArm;
    private int danno;
    private BufferedImage imagen;

    public Arma() {
        this.danno = 0;
        this.nameArm = "";
    }

    public Arma(String nameArm, int danno, BufferedImage imagen) {
        this.nameArm = nameArm;
        this.danno = danno;
        this.imagen = imagen;
    }

    public BufferedImage getImagen() {
		return imagen;
	}

	public void setImagen(BufferedImage imagen) {
		this.imagen = imagen;
	}

	public String getNameArm() {
        return nameArm;
    }

    public void setNameArm(String nameArm) {
        this.nameArm = nameArm;
    }

    public int getDanno() {
        return danno;
    }

    public void setDanno(int danno) {
        this.danno = danno;
      
    }
}
