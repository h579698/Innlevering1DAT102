package no.hvl.data102;
//********************************************************************
//  EmptyCollectionException.java   //
//  Representerer situasjonen n�r samlingen er tom
//********************************************************************
public class EmptyCollectionException extends RuntimeException{
   /******************************************************************
     Setter opp et unntak med passende melding.
   ******************************************************************/
   public EmptyCollectionException (String collection) {
      super ("" + collection + " er tom.");
   }
}
