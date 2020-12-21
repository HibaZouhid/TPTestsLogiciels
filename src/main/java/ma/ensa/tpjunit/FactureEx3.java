package ma.ensa.tpjunit;

import lombok.Data;

@Data
public class FactureEx3 implements IFacture{


    @Override
    public double getFrais(double montant) {
        return 0;
    }

    @Override
    public double getMontant() {
        return 0;
    }
}
