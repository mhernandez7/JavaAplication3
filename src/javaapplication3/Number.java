
package javaapplication3;
/**
 *
 * @author Miguel
 */
public class Number {
    
    private float number1;
    
    public Number(float number1){
    
        this.number1 = number1;
    }

    public Number(){
        this.number1 = 0;
    }
    
    public float getNumber(){
       return number1;
    
    }
    public void setNumber(float number1){
        this.number1 = number1;
    }
    
    public float NumberCubo(){
    
    this.number1 = (float) Math.pow(number1, 3);
    return number1;
    }
    
             
}
