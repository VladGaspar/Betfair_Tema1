import java.util.ArrayList;
import java.util.List;

public class Store implements Observable{

    private String reducere;

    List<Observer> users = new ArrayList<>();
    @Override
    public void add(Observer observer) {
        this.users.add(observer);
    }

    @Override
    public void delete(Observer observer) {
        this.users.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : this.users)
            observer.update();
    }

    public String getNotifcation(){
        return reducere;
    }

    public void setReducere(String reducere){
        this.reducere = reducere;
        notifyObservers();
    }
}
