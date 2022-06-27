
package javaapplication1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class Cliente {
    
    private String login;
    private String senha;
    private String confirmaSenha;
    
    
    public String getConfirmaSenha(){
        return confirmaSenha;
    }
    
    public void setConfirmaSenha(String confirma){
        this.confirmaSenha = confirma;
    }
    
    public String getLogin(){
        return login;
    }
    
    public void setLogin(String login){
        this.login = login;
    }
    
    public String getSenha(){
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String salvar(){
       try{
            FileWriter fw = new FileWriter("cadastro.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(this.login);
            pw.println(this.senha);
            pw.flush();
            pw.close();
            fw.close();
            
            }catch(IOException ex){
                System.out.println("ERROR");
            }
          return "Salvo";
    }
    
}
