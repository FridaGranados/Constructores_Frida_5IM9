/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

/**
 *
 * @author walmart
 */
public class JBieber {
    
    String anio, canción, album,Ig, Fb, novia;

    public JBieber(String anio, String canción, String album, String Ig, String Fb, String novia) {
        this.anio = anio;
        this.canción = canción;
        this.album = album;
        this.Ig = Ig;
        this.Fb = Fb;
        this.novia = novia;
    }
    
    
    public JBieber(String anio, String Ig, String Fb, String novia) {
        this.anio = anio;
        this.Ig = Ig;
        this.Fb = Fb;
        this.novia = novia;
    }

   
    public JBieber(String anio, String canción, String album) {
        this.anio = anio;
        this.canción = canción;
        this.album = album;
    }
    
    
    public JBieber(String canción) {
        this.canción = canción;
    }
    
     public JBieber(String Ig, String Fb) {
        this.Ig = Ig;
        this.Fb = Fb;
    }

    JBieber(String string, String boyfriend, String believe, String jbieber, String justinBieber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return "JBieber{" + "anio=" + anio + ", canci\u00f3n=" + canción + ", album=" + album + ", Ig=" + Ig + ", Fb=" + Fb + ", novia=" + novia + '}';
    }


    
   
    
    
    
    
}
