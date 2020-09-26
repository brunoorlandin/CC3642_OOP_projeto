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
public abstract class Pessoa {
    private int x, y, cor;
    
    
    /**
     * metodo que devera ser implementado pelas classes Pessoa saudavel e PessoaDoente
     */
    public abstract void mover();
    
    //getters and setters

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        this.cor = cor;
    }
    
}
