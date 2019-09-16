package week7;

public class DemoItemsAndPets {
    public static void main(String[] args) {
        ItemSold itemOne = new ItemSold(1, "Cushion", 9.99);
        ItemSold itemTwo = new ItemSold(2, "Hat", 14.99);

        PetSold neuteredCat = new PetSold(3, "Cat", 199.00,
                false, true, false);
        PetSold goodDog = new PetSold(4, "Dog", 299.00,
                true, true, true);

        StringBuilder cushionInvoice = invoiceDescription(itemOne);
        StringBuilder hatInvoice = invoiceDescription(itemTwo);
        System.out.println(cushionInvoice);
        System.out.println(hatInvoice);

        StringBuilder catInvoiceDescription = invoiceDescription(neuteredCat);
        StringBuilder catPetDescription = petDescription(neuteredCat);
        catInvoiceDescription.append(catPetDescription);
        System.out.println(catInvoiceDescription);

        StringBuilder dogInvoice = invoiceDescription(goodDog);
        StringBuilder dogPetDescription = petDescription(goodDog);
        dogInvoice.append(dogPetDescription);
        System.out.println(dogInvoice);



    }
    private static StringBuilder invoiceDescription(ItemSold item) {
        String newLine = "\n";
        StringBuilder invoice = new StringBuilder();
        invoice.append("Invoice Number: ").append(item.getInvoiceNumber()).append(newLine)
                .append("Invoice Description: ").append(item.getItemDescription()).append(newLine)
                .append("Invoice Price: $").append(item.getItemPrice()).append(newLine);
        return invoice;
    }

    private static StringBuilder petDescription(PetSold pet) {
        String newline = "\n";
        StringBuilder petInvoice = new StringBuilder();
        petInvoice.append("Vaccinated: ").append(pet.getVaccinationStatus()).append(newline)
                .append("Neutered: ").append(pet.getNeuteredStatus()).append(newline)
                .append("Housebroken: ").append(pet.getHousebrokenStatus()).append(newline);
        return petInvoice;
    }
}
