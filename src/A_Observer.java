import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class A_Observer extends CompanyObserver{

    public A_Observer(CompanySubject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("sonuclar.txt"),true));
            writer.write("A Company: ");
            writer.write(String.valueOf(subject.getCompanyState()));
            writer.newLine();
            writer.close();
        }catch(Exception e){
            System.out.println("There is no txt file.");
        }
    }

}
