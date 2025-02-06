/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author anastasia
 */
public class Die {
    
    // making the dValue to be private, ensuring integrity
    private int dValue;
    
    // initialize the dValue to be 0
    public Die(){
        this.dValue = 0;
    }
    
    // accessor to get the dValue as it was set to be private
    public int getDValue(){
        return this.dValue;
    }
    
    //throw is a reserved keyword in Java, therefore using throw_die as the
    //name of the method instead.
    public int throw_die(){
        // parsing the randomized number to an integer will drop the numbers behind the decimal (.) point, 
        // multiplying by 7 instead to allow in the case of 6.xx is rolled out, brings the number to 6.
        int rolled = (int)((Math.random()*7));
        if(rolled == 0){
            //lowest number a die can roll is 1, setting the end of lower limit to 1 instead of 0
            this.dValue = 1; 
        }else{
            //otherwise, rolled value will be as per randomized number generated
            this.dValue = rolled;
        }
        // the method will then return the dValue
        return this.dValue;
    }
    
}
