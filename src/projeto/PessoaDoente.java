/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.Random;

/**
 *
 * @author BRUNOVALLONEORLANDIN
 */
public class PessoaDoente extends Pessoa{
    private Virus v;
    
    @Override
    public void mover () {
        int op[] = {0, 1, 2, 3};
        Random rand = new Random();
        int randomicoOpcao = rand.nextInt(4);
        if (op[randomicoOpcao] == 0) {
            moverCima();
        }
        else if (op[randomicoOpcao] == 1) {
            moverBaixo();
        }
        else if (op[randomicoOpcao] == 2) {
            moverEsquerda();
        } else{
            moverDireita();
        }
    }
    
    //getters and setters

    public Virus getV() {
        return v;
    }

    public void setV(Virus v) {
        this.v = v;
    }
    
        public void moverBaixo () {
        try {
            if (getY() == 29) {
                setY(getY() - 28);
            } else {
                setY(getY() + 1);
            }
            
        } catch (Exception e) {
            this.mover();
        }
    }
    
    public void moverCima () {
        try {
            if (getY() == 0) {
                setY(getY() + 29);
            } else {
                setY(getY() - 1);
            }
        } catch (Exception e) {
            this.mover();
        }
    }
    
    public void moverEsquerda () {
        try {
            if (getX() == 0) {
                setX(59);
            } else {
                setX(getX() - 1);
            }
        } catch (Exception e) {
            this.mover();
        }
    }
    
    public void moverDireita () {
        try {
            if (getX() == 59) {
                setX(getX() - 59);
            } else {
                setX(getX() + 1);
            }
        } catch (Exception e) {
            this.mover();
        }
    }
}
