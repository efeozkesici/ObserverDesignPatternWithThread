
public class CompanyObserverTest{

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        CompanySubject subjectA = new CompanySubject();
        CompanySubject subjectB = new CompanySubject();
        CompanySubject subjectC = new CompanySubject();
        CompanySubject subjectD = new CompanySubject();
        CompanySubject subjectE = new CompanySubject();

        new A_Observer(subjectA);
        new B_Observer(subjectB);
        new C_Observer(subjectC);
        new D_Observer(subjectD);
        new E_Observer(subjectE);

        subjectA.start();
        subjectB.start();
        subjectC.start();
        subjectD.start();
        subjectE.start();
        System.out.println("Values updating per 5 seconds");
    }
}
