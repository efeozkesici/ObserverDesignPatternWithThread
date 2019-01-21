import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class E_Observer extends CompanyObserver{


    public E_Observer(CompanySubject subject){
        this.subject = subject;
        this.subject.attach(this);
    }

    public void update() {
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(new File("sonuclar.txt"),true));
            writer.write("E Company: ");
            writer.write(String.valueOf(subject.getCompanyState()));
            writer.newLine();
            writer.close();
        }catch(Exception e){
            System.out.println("There is no txt file.");
        }
    }
}
