package ch26.opp.anonymousclass;

public class AnonymousClass {
    
    public String companyName;

    AnonymousClass() {

    }

    AnonymousClass(String companyName) {
        this.companyName = companyName;
    }

    public String returnCompanyName() {
        return this.companyName;
    }
}
