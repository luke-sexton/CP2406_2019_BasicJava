package week7;

public class UsePackage {
    public static void main(String[] args) {
        Package packageOne = new Package(6,'A');
        Package packageTwo = new Package(14,'T');
        Package packageThree = new Package(18, 'M');

        InsuredPackage insuredPackageOne = new InsuredPackage(20, 'M');
        InsuredPackage insuredPackageTwo = new InsuredPackage(15, 'T');
        InsuredPackage insuredPackageThree = new InsuredPackage(4, 'A');

        packageOne.displayPackage();
        packageTwo.displayPackage();
        packageThree.displayPackage();

        insuredPackageOne.displayPackage();
        insuredPackageTwo.displayPackage();
        insuredPackageThree.displayPackage();
    }
}
