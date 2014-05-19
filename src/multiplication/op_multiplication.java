/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiplication;

/**
 *
 * @author Екатерина
 */
public class op_multiplication {
    private int value;
    
    
    
    public op_multiplication(int v){
          value = v;
          
    }
    
    public op_multiplication mult(op_multiplication v1){
        return new op_multiplication (value*v1.getValue());
    }
    public int getValue(){
        return value;
    }
     public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        op_multiplication other = (op_multiplication) obj;
        if (value != other.value)
            return false;
        
        return true;
    }
}
