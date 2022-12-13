/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex09truthcarandang;

/**
 *
 * @author TRUTH
 */
public class AlreadyCapturedException extends Exception{
    public AlreadyCapturedException(){
    }
    public AlreadyCapturedException(String msg){
        super(msg);
    }
}
