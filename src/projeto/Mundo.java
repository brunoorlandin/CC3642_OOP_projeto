/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author BRUNOVALLONEORLANDIN
 */
public class Mundo {
    private PessoaSaudavel pessoaSaudavel;
    private PessoaDoente pessoaDoente;
    private Hospital hosp1;
    private Hospital hosp2;
    private Hospital hosp3;
    
    ArrayList<PessoaSaudavel> pessoasSaudavies = new ArrayList<>();
    ArrayList<PessoaDoente> pessoasDoentes = new ArrayList<>();
    
    public void criaPessoas () {
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            pessoasSaudavies.add(new PessoaSaudavel());
            int x = rand.nextInt(60);
            int y = rand.nextInt(30);
            pessoasSaudavies.get(i).setX(x);
            pessoasSaudavies.get(i).setY(y);
            mapa[pessoasSaudavies.get(i).getY()][pessoasSaudavies.get(i).getX()] = 3;
        }
        pessoasDoentes.add(new PessoaDoente());
            int x = rand.nextInt(60);
            int y = rand.nextInt(30);
            pessoasDoentes.get(0).setX(x);
            pessoasDoentes.get(0).setY(y);
            mapa[pessoasDoentes.get(0).getY()][pessoasDoentes.get(0).getX()] = 4;
    }
    
    public void movePessoas () {
        for (int i = 0; i < this.pessoasSaudavies.size(); i++) {
            PessoaSaudavel pessoaSaudavel = this.pessoasSaudavies.get(i);
            mapa[pessoaSaudavel.getY()][pessoaSaudavel.getX()] = 0;
            pessoaSaudavel.mover();
            mapa[pessoaSaudavel.getY()][pessoaSaudavel.getX()] = 3;
        }
        
        for (int i = 0; i < this.pessoasDoentes.size(); i++) {
            PessoaDoente pessoaDoente = this.pessoasDoentes.get(i);
            mapa[pessoaDoente.getY()][pessoaDoente.getX()] = 0;
            pessoaDoente.mover();
            mapa[pessoaDoente.getY()][pessoaDoente.getX()] = 4;
        }
    }
    
    public void verificaBordas () {
        for (int i = 0; i < 1; i++){
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 0) {
                        mapa[i][j] = 1;
            }
        }
    }
        for (int i = 29; i < 30; i++){
            for (int j = 0; j < mapa[i].length; j++) {
                if (mapa[i][j] == 0) {
                        mapa[i][j] = 1;
            }
        }
    }
        
        for (int i = 0; i <  mapa.length; i++) {
            for (int j = 0; j < 1; j++) {
                if (mapa[i][j] == 0) {
                        mapa[i][j] = 1;
                }
            }
        }
        
        for (int i = 0; i <  mapa.length; i++) {
            for (int j = 59; j < 60; j++) {
                if (mapa[i][j] == 0) {
                        mapa[i][j] = 1;
                }
            }
        }
}
    

    //constructors

    public Mundo() {
        this.pessoaSaudavel = new PessoaSaudavel();
        this.pessoaDoente = new PessoaDoente();
        this.hosp1 = new Hospital(2);
        this.hosp2 = new Hospital(2);
        this.hosp3 = new Hospital(2);
    }
    
    
    public int mapa[][] = {
     {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1},
     {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1},
    };
    
    public void desenhaMundo() {
        desenhaHospital();
        sep();
         for (int i = 0; i < mapa.length; i++) {
             for(int j = 0; j < mapa[i].length; j++) {
                 if (mapa[i][j] == 1) {
                     System.out.print("\033[47m \033[0m");
                 }
                 else if (mapa[i][j] == 2) {
                     
                     System.out.print("\033[42m \033[0m");
                 }
                 else if (mapa[i][j] == 3) {
                     
                     System.out.print("\033[43m \033[0m");
                 }
                 else if (mapa[i][j] == 4) {
                     
                     System.out.print("\033[41m \033[0m");
                 }
                 else {
                     System.out.print("\033[40m \033[0m");
                 }
             }
             System.out.println("");
         }
         movePessoas();
         verificaBordas();
    }
    
    public void desenhaHospital() {
        for (int i = 6; i < 11; i ++) {
            for (int j = 10; j < 19; j++) {
                mapa[i][j] = hosp1.getCor();
            }
        }
        
        for (int i = 6; i < 11; i ++) {
            for (int j = 42; j < 51; j++) {
                mapa[i][j] = hosp2.getCor();
            }
        }
        
        for (int i = 20; i < 25; i ++) {
            for (int j = 25; j < 35; j++) {
                mapa[i][j] = hosp3.getCor();
            }
        }   
    }
    
    /**
     * 
     */
    public void sep() {
        System.out.println("Mapa de infectados");
        System.out.print("\033[43m \033[0m " + "Pessoas saudaveis: " + this.pessoasSaudavies.size());
        System.out.print("  \033[41m \033[0m " + "Pessoas infectadas: " + this.pessoasDoentes.size());
        System.out.println("");
        System.out.println("\n================================================="
                + "===========\n");
    }
    
    public void limpaMapa () {
        
    }
}
