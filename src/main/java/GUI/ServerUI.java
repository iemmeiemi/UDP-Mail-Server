package GUI;

import Model.Mail;
import Model.OnlineAccount;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author iemmeiemi
 */
public class ServerUI extends javax.swing.JFrame {
    private List<OnlineAccount> onlineAccount = new ArrayList<>();
    private DefaultTableModel model;

    public List<OnlineAccount> getOnlineAccount() {
        return onlineAccount;
    }

    public void setOnlineAccount(List<OnlineAccount> onlineAccount) {
        this.onlineAccount = onlineAccount;
        model.setRowCount(0);
        loadData();
    }
    
    
    /**
     * Creates new form ServerUI
     */
    public ServerUI() {
        initComponents();
        model = (DefaultTableModel) tbU.getModel();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbU = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        KickButton = new javax.swing.JButton();
        infoButton = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("SERVER ");
        jPanel1.add(jLabel1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.BorderLayout());

        tbU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IP", "Port", "Email", "TimeStamp"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbU);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        KickButton.setText("Kick");
        jPanel3.add(KickButton);

        infoButton.setText("Info");
        jPanel3.add(infoButton);

        jButton3.setText("jButton3");
        jPanel3.add(jButton3);

        jPanel2.add(jPanel3, java.awt.BorderLayout.PAGE_END);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public void loadData() {
        for (OnlineAccount o :onlineAccount) {
            model.addRow( new Object[] {
                o.getIPAddress(), o.getPort(), o.getEmail(), o.getDate()
            });
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton KickButton;
    private javax.swing.JButton infoButton;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbU;
    // End of variables declaration//GEN-END:variables
}
