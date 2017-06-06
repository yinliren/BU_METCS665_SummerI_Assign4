/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorANDInterpreter_EmployeeManage;
/**
 *
 * @author Liren
 */
public class NameRepository implements Container{
   public int numOrders[] = {10 , 8, 12, 9,7};
     
   
   @Override
   public Iterator getIterator() {
      return new NameIterator();
   }
   
   
   public class NameIterator implements Iterator{
      int index;

      @Override
      public boolean hasNext() {
      
         if(index < numOrders.length){
            return true;
         }
         return false;
      }

      @Override
      public Object next() {
      
         if(this.hasNext()){
            return numOrders[index++];
         }
         return null;

     }

    }
}
