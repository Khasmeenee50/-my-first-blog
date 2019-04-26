
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Menie Quickly
 */
public class JAttack extends javax.swing.JFrame {

    /**
     * Creates new form JAttack
     */
    private JFrame frame;
    JAttack JA;
    Main main;
    Start start = new Start();
    public Monster monsterFight;
    Novice  player = new Novice(start.getName());
    public JAttack() {
        initComponents();
        Player();
    }
    public void Monster(int index){
        Monster[] monsters = {
			new Monster("Ultron", 10, 1 , 50 , 50),
			new Monster("Red Skull", 50 , 10, 80 , 150),
			new Monster("Thanos", 100, 20 , 100 , 300)
	};
        LName.setText(monsters[index].getName());
        LHp.setText("HP: " +String.valueOf(monsters[index].getHP()));
        LDamage.setText("Damage: " +String.valueOf(monsters[index].getDamage()));
        monsterFight = monsters[index];
    }
    public void Player(){
        Lname.setText(player.getName());
        LHP.setText("HP: " +String.valueOf(player.getHP()));
        Ldamage.setText("Damage: " +String.valueOf(player.getDamage()));
    }
    private void Fight(){
			player.attack(monsterFight);
			if(!monsterFight.Dead())
				monsterFight.attack(player);
			else{
                                player.CountUp();
                                player.ExpUp(monsterFight.getExp());
                                player.CoinUp(monsterFight.getCoin());
				
			}
			LHP.setText(String.valueOf(player.getHP()));
			LHp.setText("HP: " +String.valueOf(monsterFight.getHP()));
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LName = new javax.swing.JLabel();
        Lname = new javax.swing.JLabel();
        LHp = new javax.swing.JLabel();
        LDamage = new javax.swing.JLabel();
        LHP = new javax.swing.JLabel();
        Ldamage = new javax.swing.JLabel();
        BTFight = new javax.swing.JButton();
        BTWith = new javax.swing.JButton();
        BTItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Lname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Lname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LHp.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LHp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LDamage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LDamage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        LHP.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        LHP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        Ldamage.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Ldamage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        BTFight.setText("FIGHT");
        BTFight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTFightActionPerformed(evt);
            }
        });

        BTWith.setText("WITHDRAW");
        BTWith.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTWithActionPerformed(evt);
            }
        });

        BTItem.setText("USE ITEM");
        BTItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTItemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LDamage, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LHp, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(BTFight, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(BTItem, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LHP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldamage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTWith, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LHp, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LHP, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LDamage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ldamage, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTFight, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTWith, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTItem, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTFightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTFightActionPerformed
        Fight();
        if(player.Dead()){
            JOptionPane.showMessageDialog(frame,"You are die . . . Game Over !!!");
        }else if(monsterFight.Dead()){
            JOptionPane.showMessageDialog(frame,"Monster " + monsterFight.getName() + " die .");
            JOptionPane.showMessageDialog(frame,"Taking Exp+" + monsterFight.getExp() + " Coin+" + monsterFight.getCoin());
            main = new Main(player);
            main.setVisible(true);
            setVisible(false);
            
        }
    }//GEN-LAST:event_BTFightActionPerformed

    private void BTItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTItemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTItemActionPerformed

    private void BTWithActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTWithActionPerformed
        int n = JOptionPane.showConfirmDialog(null,"Are you sure to WITHDRAW ?","An Inane Question",JOptionPane.YES_NO_OPTION);
        if(n==0){
            JA = new JAttack();
            main = new Main(player);
            main.setVisible(true);
            JA.setVisible(false);
        }
    }//GEN-LAST:event_BTWithActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JAttack.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new JAttack().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTFight;
    private javax.swing.JButton BTItem;
    private javax.swing.JButton BTWith;
    private javax.swing.JLabel LDamage;
    private javax.swing.JLabel LHP;
    private javax.swing.JLabel LHp;
    private javax.swing.JLabel LName;
    private javax.swing.JLabel Ldamage;
    private javax.swing.JLabel Lname;
    // End of variables declaration//GEN-END:variables
}