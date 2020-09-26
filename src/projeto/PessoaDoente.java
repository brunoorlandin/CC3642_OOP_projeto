/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

/**
 *
 * @author BRUNOVALLONEORLANDIN
 */
public class PessoaDoente extends Pessoa{
    private Virus v;
    
    @Override
    public void mover () {
        
    }
    
    //getters and setters

    public Virus getV() {
        return v;
    }

    public void setV(Virus v) {
        this.v = v;
    }
    
}
