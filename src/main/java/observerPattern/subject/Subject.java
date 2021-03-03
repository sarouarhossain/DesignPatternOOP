package observerPattern.subject;

import observerPattern.observer.Observer;

public interface Subject {

  /**
   * Method to add an observer to the subscription list
   *
   * @param observer
   */
  public void registerObserver(Observer observer);

  /**
   * Method to remove an observer from subscription list
   *
   * @param observer
   */
  public void removeObserver(Observer observer);

  /** Method to notify all observers when subject state is changed */
  public void notifyObservers();
}
