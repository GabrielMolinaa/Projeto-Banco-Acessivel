
package javaapplication1;

import static javaapplication1.ContaCorrente.saldo_corrente;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.JFrame;


public class Banco_Frame extends JFrame {

    private static Banco_Frame janela;
    
    
    int xMouse,yMouse;
    
    public Banco_Frame(){
        initComponents();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
       
        //Mostrando Saldo em tempo Real;
        Thread th;
        th = new Thread(() -> {
            while(true) { //roda indefinidamente
                atualizaSaldo();
                try {
                    Thread.sleep(1000); //espera 1 segundo para fazer a nova evolução
                } catch(InterruptedException ex){
                }
            }
        } //cria uma thread
        );
        th.start();
        
        
    }
    
    //Inicia apenas uma vez (Singleton)
    public static Banco_Frame iniciar(){

        if(janela==null){
            janela = new Banco_Frame();         
            janela.addWindowListener(new WindowAdapter(){
                @Override
                public void windowClosing(WindowEvent e){                   
                    janela=null;                    
                }                
            });
            return janela;        
        } else
            return null;
    }//fim iniciar
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fundo = new javax.swing.JPanel();
        Saque = new javax.swing.JButton();
        Saldo = new javax.swing.JButton();
        Extrato = new javax.swing.JButton();
        RetanguloEsquerdo = new javax.swing.JPanel();
        Versao = new javax.swing.JLabel();
        UTFBank = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        MostrarSaldo = new javax.swing.JLabel();
        Sair = new javax.swing.JLabel();
        MeuPerfil = new javax.swing.JLabel();
        saldo2 = new javax.swing.JLabel();
        Deposito = new javax.swing.JButton();
        SaqueIcone = new javax.swing.JLabel();
        ExtratoIcone = new javax.swing.JLabel();
        SaldoIcone = new javax.swing.JLabel();
        DepositoIcone = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        botaoFechar = new javax.swing.JPanel();
        XFechar = new javax.swing.JLabel();
        senhaIcone = new javax.swing.JLabel();
        userIcon = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        nomeUsuariotxt = new javax.swing.JLabel();
        senhatxt = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UTFBank");
        setUndecorated(true);
        setResizable(false);

        Fundo.setBackground(new java.awt.Color(11, 35, 45));
        Fundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Saque.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Saque.setText("SAQUE");
        Saque.setBorderPainted(false);
        Saque.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Saque.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaqueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaqueMouseExited(evt);
            }
        });
        Saque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaqueActionPerformed(evt);
            }
        });
        Fundo.add(Saque, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, 129, 40));

        Saldo.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Saldo.setText("SALDO");
        Saldo.setBorderPainted(false);
        Saldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Saldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SaldoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SaldoMouseExited(evt);
            }
        });
        Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoActionPerformed(evt);
            }
        });
        Fundo.add(Saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 129, 40));

        Extrato.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Extrato.setText("EXTRATO");
        Extrato.setBorderPainted(false);
        Extrato.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Extrato.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ExtratoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ExtratoMouseExited(evt);
            }
        });
        Extrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtratoActionPerformed(evt);
            }
        });
        Fundo.add(Extrato, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 320, 129, 40));

        RetanguloEsquerdo.setBackground(new java.awt.Color(15, 25, 35));
        RetanguloEsquerdo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Versao.setBackground(new java.awt.Color(255, 255, 255));
        Versao.setForeground(new java.awt.Color(255, 255, 255));
        Versao.setText("Versão 0.0.1");
        RetanguloEsquerdo.add(Versao, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        UTFBank.setBackground(new java.awt.Color(255, 255, 255));
        UTFBank.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        UTFBank.setForeground(new java.awt.Color(255, 255, 255));
        UTFBank.setText("UTFBank");
        UTFBank.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UTFBankMouseEntered(evt);
            }
        });
        RetanguloEsquerdo.add(UTFBank, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, 42));

        Home.setBackground(new java.awt.Color(255, 255, 255));
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        RetanguloEsquerdo.add(Home, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 83, 92, 19));

        MostrarSaldo.setBackground(new java.awt.Color(255, 255, 255));
        MostrarSaldo.setForeground(new java.awt.Color(255, 255, 255));
        MostrarSaldo.setText("Mostrar Saldo");
        MostrarSaldo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        MostrarSaldo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarSaldo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MostrarSaldoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MostrarSaldoMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MostrarSaldoMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                MostrarSaldoMouseReleased(evt);
            }
        });
        RetanguloEsquerdo.add(MostrarSaldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 249, 92, 19));

        Sair.setBackground(new java.awt.Color(255, 255, 255));
        Sair.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        Sair.setForeground(new java.awt.Color(255, 255, 255));
        Sair.setText("Sair");
        Sair.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        Sair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Sair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SairMouseExited(evt);
            }
        });
        RetanguloEsquerdo.add(Sair, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 334, 92, 19));

        MeuPerfil.setBackground(new java.awt.Color(255, 255, 255));
        MeuPerfil.setForeground(new java.awt.Color(255, 255, 255));
        MeuPerfil.setText("Meu Perfil");
        MeuPerfil.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(255, 255, 255)));
        MeuPerfil.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MeuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MeuPerfilMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MeuPerfilMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MeuPerfilMouseExited(evt);
            }
        });
        RetanguloEsquerdo.add(MeuPerfil, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 120, 92, 19));

        saldo2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        saldo2.setForeground(new java.awt.Color(255, 255, 255));
        saldo2.setText(String.valueOf(ContaCorrente.saldo_corrente));
        saldo2.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                saldo2PropertyChange(evt);
            }
        });
        RetanguloEsquerdo.add(saldo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 130, 30));

        Fundo.add(RetanguloEsquerdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 400));

        Deposito.setFont(new java.awt.Font("DialogInput", 1, 11)); // NOI18N
        Deposito.setText("DEPOSITO");
        Deposito.setBorderPainted(false);
        Deposito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deposito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DepositoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DepositoMouseExited(evt);
            }
        });
        Deposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositoActionPerformed(evt);
            }
        });
        Fundo.add(Deposito, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 129, 40));
        Deposito.getAccessibleContext().setAccessibleDescription("Deposito");

        SaqueIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Saque.png"))); // NOI18N
        Fundo.add(SaqueIcone, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, 100, 100));

        ExtratoIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Test.png"))); // NOI18N
        Fundo.add(ExtratoIcone, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 100, 100));

        SaldoIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Saldo.png"))); // NOI18N
        Fundo.add(SaldoIcone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 100, 100));

        DepositoIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/Deposito.png"))); // NOI18N
        Fundo.add(DepositoIcone, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 50, 100, 100));

        jPanel1.setBackground(new java.awt.Color(11, 35, 45));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });

        botaoFechar.setBackground(new java.awt.Color(11, 35, 45));
        botaoFechar.setForeground(Color.white);

        XFechar.setBackground(new java.awt.Color(255, 255, 255));
        XFechar.setFont(new java.awt.Font("DialogInput", 0, 24)); // NOI18N
        XFechar.setForeground(new java.awt.Color(255, 255, 255));
        XFechar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XFechar.setText("X");
        XFechar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        XFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XFecharMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                XFecharMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                XFecharMouseExited(evt);
            }
        });

        javax.swing.GroupLayout botaoFecharLayout = new javax.swing.GroupLayout(botaoFechar);
        botaoFechar.setLayout(botaoFecharLayout);
        botaoFecharLayout.setHorizontalGroup(
            botaoFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(XFechar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );
        botaoFecharLayout.setVerticalGroup(
            botaoFecharLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(XFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(712, 712, 712)
                .addComponent(botaoFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(botaoFechar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        Fundo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 40));

        senhaIcone.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/senha.png"))); // NOI18N
        senhaIcone.setLabelFor(MeuPerfil);
        senhaIcone.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                senhaIconePropertyChange(evt);
            }
        });
        Fundo.add(senhaIcone, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 130, 110));

        userIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication1/perfil.png"))); // NOI18N
        userIcon.setLabelFor(MeuPerfil);
        userIcon.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                userIconPropertyChange(evt);
            }
        });
        Fundo.add(userIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, 90));

        Password.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                PasswordPropertyChange(evt);
            }
        });
        Fundo.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 180, 30));

        nomeUsuariotxt.setForeground(new java.awt.Color(255, 255, 255));
        nomeUsuariotxt.setText("Nome de Usuário");
        nomeUsuariotxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                nomeUsuariotxtPropertyChange(evt);
            }
        });
        Fundo.add(nomeUsuariotxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 110, -1));

        senhatxt.setForeground(new java.awt.Color(255, 255, 255));
        senhatxt.setText("Senha");
        senhatxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                senhatxtPropertyChange(evt);
            }
        });
        Fundo.add(senhatxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 150, 210, -1));

        Username.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Username.setForeground(new java.awt.Color(255, 255, 255));
        Username.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                UsernamePropertyChange(evt);
            }
        });
        Fundo.add(Username, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 180, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, 751, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fundo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
//Ação extrato--------------------------------------------------------------
    private void ExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtratoActionPerformed
        ContaCorrente.extrato();
    }//GEN-LAST:event_ExtratoActionPerformed

    private void ExtratoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExtratoMouseEntered
        play("Extrato");
        Extrato.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_ExtratoMouseEntered
//Ação extrato--------------------------------------------------------------
    
//Ação Saldo----------------------------------------------------------------
    private void SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoActionPerformed
        ContaCorrente.saldo();
    }//GEN-LAST:event_SaldoActionPerformed

    private void SaldoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaldoMouseEntered
        play("Saldo");
        Saldo.setBackground(new Color(153,204,255));
        
    }//GEN-LAST:event_SaldoMouseEntered
    
    private void atualizaSaldo(){
        saldo2.setText("R$: "+String.valueOf(ContaCorrente.saldo_corrente));
    }
//Ação Saldo---------------------------------------------------------------- 
    
//Ação Depósito-------------------------------------------------------------
    private void DepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositoActionPerformed

        ContaCorrente.saldo_corrente = ContaCorrente.deposito(ContaCorrente.saldo_corrente);
       
    }//GEN-LAST:event_DepositoActionPerformed

    private void DepositoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositoMouseEntered
        play("Deposito");
        Deposito.setBackground(new Color(153,204,255));
        
    }//GEN-LAST:event_DepositoMouseEntered
 //Ação Depósito-------------------------------------------------------------
 
 //Ação Saque----------------------------------------------------------------
    private void SaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaqueActionPerformed
        ContaCorrente.saldo_corrente = ContaCorrente.saque(ContaCorrente.saldo_corrente);
    }//GEN-LAST:event_SaqueActionPerformed

    private void SaqueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaqueMouseEntered
        play("Saque");
        Saque.setBackground(new Color(153,204,255));
    }//GEN-LAST:event_SaqueMouseEntered
 //Ação Saque----------------------------------------------------------------
    
    private void UTFBankMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UTFBankMouseEntered
        play("Escolha");
    }//GEN-LAST:event_UTFBankMouseEntered

 //Ação Botão Home-----------------------------------------------------------
    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        Deposito.setVisible(true);
        Saque.setVisible(true);
        Extrato.setVisible(true);
        Saldo.setVisible(true);
        DepositoIcone.setVisible(true);
        SaqueIcone.setVisible(true);
        SaldoIcone.setVisible(true);
        ExtratoIcone.setVisible(true);   
        senhaIcone.setVisible(false);
        userIcon.setVisible(false);
        Password.setVisible(false);
        Username.setVisible(false);
        nomeUsuariotxt.setVisible(false);
        senhatxt.setVisible(false);
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
      Home.setForeground(Color.GRAY);
      play("home");
      
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home.setForeground(Color.WHITE);
        
    }//GEN-LAST:event_HomeMouseExited
//Ação Botão Home-----------------------------------------------------------

//Ação MeuPerfil------------------------------------------------------------
    private void MeuPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeuPerfilMouseClicked
        Deposito.setVisible(false);
        Saque.setVisible(false);
        Extrato.setVisible(false);
        Saldo.setVisible(false);
        DepositoIcone.setVisible(false);
        SaqueIcone.setVisible(false);
        SaldoIcone.setVisible(false);
        ExtratoIcone.setVisible(false);
        userIcon.setVisible(true);
        senhaIcone.setVisible(true);
        Password.setVisible(true);
        Username.setVisible(true);
        nomeUsuariotxt.setVisible(true);
        senhatxt.setVisible(true);       
    }//GEN-LAST:event_MeuPerfilMouseClicked

    private void MeuPerfilMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeuPerfilMouseEntered
        MeuPerfil.setForeground(Color.GRAY);
        play("meuPerfil");
        
    }//GEN-LAST:event_MeuPerfilMouseEntered

    private void MeuPerfilMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MeuPerfilMouseExited
        MeuPerfil.setForeground(Color.WHITE);
    }//GEN-LAST:event_MeuPerfilMouseExited
//Ação MeuPerfil------------------------------------------------------------

//Ação Botão Sair-----------------------------------------------------------
    private void SairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseClicked
        System.exit(0);
    }//GEN-LAST:event_SairMouseClicked

    private void SairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseEntered
        Sair.setForeground(Color.GRAY);
        play("Sair");
    }//GEN-LAST:event_SairMouseEntered

    private void SairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SairMouseExited
        Sair.setForeground(Color.WHITE);
    }//GEN-LAST:event_SairMouseExited
//Ação Botão Sair-----------------------------------------------------------
    
//Ação Botão MostrarSaldo---------------------------------------------------     
    private void MostrarSaldoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarSaldoMouseEntered

        MostrarSaldo.setForeground(Color.GRAY);
    }//GEN-LAST:event_MostrarSaldoMouseEntered
    
    private void MostrarSaldoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarSaldoMouseExited
        saldo2.setVisible(false);
        MostrarSaldo.setForeground(Color.WHITE);
    }//GEN-LAST:event_MostrarSaldoMouseExited

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanel1MousePressed

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanel1MouseDragged

    private void XFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XFecharMouseClicked
        System.exit(0);
    }//GEN-LAST:event_XFecharMouseClicked

    private void XFecharMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XFecharMouseEntered
        botaoFechar.setBackground(Color.RED);
       // jLabel1.setForeground(Color.white);
    }//GEN-LAST:event_XFecharMouseEntered

    private void XFecharMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XFecharMouseExited
        botaoFechar.setBackground(new Color(11,35,45));
        
    }//GEN-LAST:event_XFecharMouseExited

    private void DepositoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DepositoMouseExited
        Deposito.setBackground(Color.white);
    }//GEN-LAST:event_DepositoMouseExited

    private void SaqueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaqueMouseExited
        Saque.setBackground(Color.white);
    }//GEN-LAST:event_SaqueMouseExited

    private void SaldoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SaldoMouseExited
        Saldo.setBackground(Color.white);
    }//GEN-LAST:event_SaldoMouseExited

    private void ExtratoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExtratoMouseExited
        Extrato.setBackground(Color.white);
    }//GEN-LAST:event_ExtratoMouseExited

    private void senhaIconePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_senhaIconePropertyChange
        senhaIcone.setVisible(false);
    }//GEN-LAST:event_senhaIconePropertyChange

    private void MostrarSaldoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarSaldoMousePressed
        saldo2.setVisible(true);
    }//GEN-LAST:event_MostrarSaldoMousePressed

    private void MostrarSaldoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarSaldoMouseReleased
        saldo2.setVisible(false);
    }//GEN-LAST:event_MostrarSaldoMouseReleased

    private void userIconPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_userIconPropertyChange
        userIcon.setVisible(false);
    }//GEN-LAST:event_userIconPropertyChange

    private void PasswordPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_PasswordPropertyChange
        Password.setVisible(false);
        Password.setText(String.valueOf(TelaLogin.senha));
    }//GEN-LAST:event_PasswordPropertyChange

    private void UsernamePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_UsernamePropertyChange
        Username.setVisible(false);
        Username.setText(String.valueOf(TelaLogin.usuario));
    }//GEN-LAST:event_UsernamePropertyChange

    private void senhatxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_senhatxtPropertyChange
        senhatxt.setVisible(false);
    }//GEN-LAST:event_senhatxtPropertyChange

    private void nomeUsuariotxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_nomeUsuariotxtPropertyChange
        nomeUsuariotxt.setVisible(false);
    }//GEN-LAST:event_nomeUsuariotxtPropertyChange

    private void saldo2PropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_saldo2PropertyChange
        saldo2.setVisible(false);
    }//GEN-LAST:event_saldo2PropertyChange
//Ação Botão MostrarSaldo---------------------------------------------------    

    // Metodo para soltar o áudio
    public static void play(String nomeDoAudio) {
        URL url;
        url = Banco_Frame.class.getResource(nomeDoAudio + ".wav");
        AudioClip audio;
        audio = Applet.newAudioClip(url);
        audio.play();
    }

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Banco_Frame().setVisible(true);
                
                
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deposito;
    private javax.swing.JLabel DepositoIcone;
    private javax.swing.JButton Extrato;
    private javax.swing.JLabel ExtratoIcone;
    private javax.swing.JPanel Fundo;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel MeuPerfil;
    private javax.swing.JLabel MostrarSaldo;
    private javax.swing.JLabel Password;
    private javax.swing.JPanel RetanguloEsquerdo;
    private javax.swing.JLabel Sair;
    private javax.swing.JButton Saldo;
    private javax.swing.JLabel SaldoIcone;
    private javax.swing.JButton Saque;
    private javax.swing.JLabel SaqueIcone;
    private javax.swing.JLabel UTFBank;
    private javax.swing.JLabel Username;
    private javax.swing.JLabel Versao;
    private javax.swing.JLabel XFechar;
    private javax.swing.JPanel botaoFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nomeUsuariotxt;
    private javax.swing.JLabel saldo2;
    private javax.swing.JLabel senhaIcone;
    private javax.swing.JLabel senhatxt;
    private javax.swing.JLabel userIcon;
    // End of variables declaration//GEN-END:variables
}
