package javaapplication1;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ContaCorrente{
    
	static double saldo_corrente;

	Banco_Frame frame = new Banco_Frame();
	
	//Declarando array para utilizar em extrato
	static ArrayList<String> transacoes = new ArrayList<>();
	
	
	public ContaCorrente(double saldo_corrente) {
		
		ContaCorrente.saldo_corrente = saldo_corrente;

	}	

	//Funcao para saque
	public static double saque(double saldo_corrente){
            
		if(saldo_corrente > 0){
			double valor;

                        Banco_Frame.play("ValorSaque");
			String aux = JOptionPane.showInputDialog(null, "Valor de Saque: ","Saque",JOptionPane.DEFAULT_OPTION);
                        
                        if(aux != null){
                            valor = Float.parseFloat(aux);
                        
                            if(valor > saldo_corrente){
				//Mensagem de saldo insuficiente
                                Banco_Frame.play("saldoInsuficiente");
				JOptionPane.showMessageDialog(null, "Saldo Insuficiente", "Erro Saque", JOptionPane.ERROR_MESSAGE); 
				return saldo_corrente;
                            }else{
				saldo_corrente = saldo_corrente - valor;
				transacoes.add("Saque: -" + valor);
                                Banco_Frame.play("ValorSacado");
				return saldo_corrente;                   
                            }//valor > saldo;
                       }else{
                           return saldo_corrente;
                        }//if aux null
		}else{
                        Banco_Frame.play("saldoZerado");
			return saldo_corrente;
		}
               
	}

        
	//Funcao para deposito
	public static double deposito(double saldo_corrente){
                double valor;
                
                Banco_Frame.play("valorDeposito");

                    String aux = JOptionPane.showInputDialog(null,"Valor de Deposito: ","Depósito",JOptionPane.DEFAULT_OPTION);
                    
                    if(aux != null){
                    valor = Float.parseFloat(aux);
                  
                      if(valor < 0){
                         JOptionPane.showMessageDialog(null,"ERRO: Deposito Inválido!","ERRO DEPÓSITO",JOptionPane.ERROR_MESSAGE);
                         return 0;
                      }
               
                     saldo_corrente = saldo_corrente + valor;
                     transacoes.add("Deposito: +" + valor);
                     Banco_Frame.play("depositoSucesso");
                     return saldo_corrente;                   
                    }
                 return 0;   
	}
        
	//Função para exibir o saldo da conta corrente
	public static void saldo(){
            JOptionPane.showMessageDialog(null, "R$ "+ContaCorrente.saldo_corrente, "Saldo", JOptionPane.DEFAULT_OPTION);

	}
        
        
        //Função para exibir o extrato da conta corrente
	public static void extrato(){

                String movimentos="";
                
                for(String nome : transacoes){
                    movimentos += nome+"\n";
                }
                movimentos += ("Saldo Conta Corrente: " + ContaCorrente.saldo_corrente+"\n");
                JOptionPane.showMessageDialog(null,movimentos,"Extrato",JOptionPane.DEFAULT_OPTION);

	}
	
}