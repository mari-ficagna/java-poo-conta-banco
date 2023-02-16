 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooaula5exercicio1;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Mari (48) 99618-5728
 */
public class ContaBanco {
    //Atributos:
    int numConta;          //variável: n
    protected String tipo; //variável: t
    private String dono;   //variável: d
    private float saldo;   //variável: s
    private boolean status;//variável: st

    //Método Especial Construtor:
    public ContaBanco(){//(float saldo, boolean status) {
        this.saldo = 0;
        this.status = false;
    }
    
    //Métodos personalizados:
    public void estadoAtual(){
        System.out.println("---------------------------");
        System.out.println("Conta: "+this.getNumConta());
        System.out.println("Tipo: "+this.getTipo());
        System.out.println("Dono: "+this.getDono());
        System.out.println("Saldo: R$ "+this.getSaldo());
        if (this.getStatus()) {
            System.out.println("Status: Conta aberta");
        } else if (this.getStatus()==false){
            System.out.println("Status: Conta fechada");
        }
        System.out.println("____________________________");
    }
    
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);    
        }
        System.out.println("Conta aberta com sucesso!");
        //double n = 10+Math.random(1*(10-1));
        //this.numConta = n;   
    }
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Não é possível encerrar a conta pois há valores "
                    + "na conta.");
        } else if (this.getSaldo() < 0){
            System.out.println("Não é possível encerrar a conta pois há debitos "
                    + "a serem pagos");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }
    public void depositar(float v){
        if (this.getStatus() == true){
            this.setSaldo(this.getSaldo()+ v); 
            System.out.println("Deposito realizado  na conta de "+ this.getDono());
        } else {
            System.out.println("ERRO! Essa conta está fechada ou errada!");
        }
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo()>= v){
                this.setSaldo(this.getSaldo()-v);
                System.out.println("Saque de R$"+v+" realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }
        } else {
            System.out.println("Impossível sacar de uma conta fechada.");
        }    
    }
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12; 
        } else if ("CP".equals(this.getTipo())){
            v=20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo()-v);
            System.out.println("Mensalidade paga com sucesso");
        } else {
            System.out.println("Impossível pagar uma conta fechada ou com saldo "
                    + "insuficiente.");
        }
        
    }
    /*
    public void numConta(){
        this.numConta = 10+Math.random(1*(10-1));
    }
*/
    //Método Especial Getter:
    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }

    //Método Especial Setter:
    public void setNumConta(int n) { //n é uma variável
        this.numConta = n;           //numConta é o atributo
    }

    public void setTipo(String t) {
        this.tipo = t;
    }

    public void setDono(String d) {
        this.dono = d;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }

    public void setStatus(boolean st) {
        this.status = st;
    }
    
    
}
