package ma.ensa.tpjunit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
public class Facture {

    private double montant;
    private double transport;

    public Facture(){
    }
    public Facture(double m,double t){
        this.montant=m;
        this.transport=t;
    }
    double getFraisTransport(double montant){
        if (montant>0){
        if(montant<600){
            this.transport=45;
        }
        else this.transport=0;}
        else throw new IllegalArgumentException("Le montant doit être positif");
        return this.transport;
    }
}
