/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package superficies;

/**
 *
 * @author oracle
 */
public class Modelo {
    
    float num1,num2;
    float operacion;
    float resultado;
float resposta;


        
    
    public Modelo() {
    }

    
    public Modelo(float num1, float num2, float operacion, float resultado,float resposta) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
        this.resultado = resultado;
        this.resposta = resposta;
    }

    public float getResposta() {
        return resposta;
    }

    public void setResposta(float resposta) {
        this.resposta = resposta;
    }

    
    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getOperacion() {
        return operacion;
    }

    public void setOperacion(float operacion) {
        this.operacion = operacion;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
    
    
    
    
}
