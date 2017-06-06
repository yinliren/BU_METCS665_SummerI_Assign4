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
public class TOP extends Expression{
    @Override
    public double top(String keywords) {
       NameRepository namesRepository = new NameRepository();
       int index = 0;
       double top = 0;
       for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
           double numberofOrder = (double)iter.next();
           if(numberofOrder > top){
               top = index;
           }
           index++;
    }
       return top;
    }

    @Override
    public double average(String keywords) {
       throw new UnsupportedOperationException("Not exist."); //To change body of generated methods, choose Tools | Templates.
       
    }
}
