import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CompanySubject extends Thread {
    //Instance variables
    private List<CompanyObserver> observers = new ArrayList<>();
    private int companyState;

    Random rand = new Random();

    //Getter and Setter of State
    public int getCompanyState() {
        return companyState;
    }
    public void setCompanyState() {
        this.companyState  = rand.nextInt(50) + 1;
        notifyAllObservers();
    }

    public void attach(CompanyObserver observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for(CompanyObserver observer : observers){
            observer.update();
        }
    }

    @Override
    public void run(){
        try {
            while(true){
                setCompanyState();
                sleep(5000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
