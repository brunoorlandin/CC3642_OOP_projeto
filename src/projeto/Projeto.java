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
public class Projeto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        System.out.print("\033[46m \033[0m");
//        System.out.print(" \033[45m \033[0m\n");
//        System.out.print("\033[32m Projeto Corona! \033[0m" + "\n");

    Mundo mundo = new Mundo(){};
    
    mundo.criaPessoas();
    
    while (true) {
        mundo.desenhaMundo();
        
        try{
        Thread.sleep(300);
        }
        catch (Exception e) {
        e.printStackTrace();
        }
    }
    
    
    
    }
    
}
