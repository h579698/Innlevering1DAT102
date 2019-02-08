package no.hvl.data102;
import no.hvl.data102.LinearNode;

//************************************************************
///  Representerer en node.
//************************************************************

public class LinearNode<T>{
  private LinearNode<T> next;
  private T element;
 
  /**********************************************************
    Oppretter en tom node
  **********************************************************/
  public LinearNode()  {
    next   =  null;
    element = null;
  }
 
  /**********************************************************
    Oppretter en node med et element.
  **********************************************************/
  public LinearNode (T elem) {
    next   = null;
    element = elem;
  }
 
  /**********************************************************
    Returnerer etterfølger.
  **********************************************************/
  public LinearNode<T> getNext()  {
    return next;
  }
 
  /**********************************************************
    Setter next til node
  **********************************************************/
  public void setNext (LinearNode<T> node)  {
    next = node;
  }
 
  /**********************************************************
    Returnerer elementet til denne noden
  **********************************************************/
  public T getElement() {
    return element;
  }
 
  /**********************************************************
    Setter nytt element i denne noden.
  **********************************************************/
  public void setElement (T elem) {
    element = elem;
  }
}