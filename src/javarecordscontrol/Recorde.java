package javarecordscontrol;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Recorde {
        private Date dataRecorde;
        private String nome;
        private double tempo;

    public Date getDataRecorde() {
        return dataRecorde;
    }

    public void setDataRecorde(Date dataRecorde) {
        this.dataRecorde = dataRecorde;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getTempo() {
        return tempo;
    }
 
    public void setTempo(double tempo) {
        this.tempo = tempo;
    }
    
    @Override
    public String toString() {
     SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    return "Recorde [nome=" + nome + ", dataRecorde=" + sdf.format(dataRecorde) + ", tempo=" + tempo + " segundos]";
}
            

}
