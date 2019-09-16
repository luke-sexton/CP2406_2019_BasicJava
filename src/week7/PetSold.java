package week7;

public class PetSold extends ItemSold {
    boolean isVaccinated = false;
    boolean isNeutered = false;
    boolean isHousebroken = false;

    public PetSold(int invoiceNumber, String itemDescription, double itemPrice, boolean isVaccinated, boolean isNeutered,
                   boolean isHousebroken) {
        super(invoiceNumber, itemDescription, itemPrice);
        setVaccinated(isVaccinated);
        setNeutered(isNeutered);
        setHousebroken(isHousebroken);
    }

    public boolean getVaccinationStatus() {
        return isVaccinated;
    }

    public void setVaccinated(boolean vaccinated) {
        isVaccinated = vaccinated;
    }

    public boolean getNeuteredStatus() {
        return isNeutered;
    }

    public void setNeutered(boolean neutered) {
        isNeutered = neutered;
    }

    public boolean getHousebrokenStatus() {
        return isHousebroken;
    }

    public void setHousebroken(boolean housebroken) {
        this.isHousebroken = housebroken;
    }
}
