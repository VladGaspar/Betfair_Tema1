public interface Observable {
    public void add(Observer observer);
    public void delete(Observer observer);
    public void notifyObservers();
}
