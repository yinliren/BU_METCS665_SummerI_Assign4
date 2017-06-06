/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IteratorANDInterpreter_EmployeeManage;

public class AVG extends Expression{

    @Override
    public double top(String keywords) {
        throw new UnsupportedOperationException("Not exist."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double average(String keywords) {
       NameRepository namesRepository = new NameRepository();
       int index = 0;
       double sum = 0;
       for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
           int numberofOrder = (int)iter.next();
           sum += numberofOrder;
           index++;
    }
       double avg = sum/(index+1);
       return avg;
    }
}
