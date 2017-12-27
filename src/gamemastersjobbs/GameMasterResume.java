/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamemastersjobbs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author B
 */
public class GameMasterResume extends javax.swing.JFrame {

    List<String> elephantList;
    File fout;
    FileOutputStream fos;
    BufferedWriter bw;
    ArrayList<String> names = new ArrayList<String>();

    public GameMasterResume() throws IOException {
        initComponents();
        jTextArea1.append("sep=, \n");
        jTextArea1.append("Name , Game, Brief , Hint , Picture , Reset \n");
Date date = new Date() ;
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH-mm-ss") ;


 String username = System.getProperty("user.name");
        String FILENAME = "C:\\Users\\" + username + "\\Desktop\\Export\\names.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                names.add(sCurrentLine);
                openFile(sCurrentLine);
            }

        } catch (IOException ex) {
            System.out.println("WRONG");
        }
      //  openFile("Amir");
        //openFile("Shaghayegh");
       // openFile("AshkanK");
        
        //writeFile1();
        File a = new File("C:\\Users\\" + username + "\\Desktop\\Export\\"+dateFormat.format(date)+  ".csv");
  FileWriter writer = new FileWriter( a);
 
BufferedWriter bw = new BufferedWriter( writer );
   jTextArea1.write( bw );
bw.close();

    }

    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GameMasterResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GameMasterResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GameMasterResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GameMasterResume.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new GameMasterResume().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(GameMasterResume.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });

    }

    public void openFile(String S) throws IOException {
        int[] Tesla = {0, 0, 0, 0};
        int[] Haber = {0, 0, 0, 0};
        int[] Motel = {0, 0, 0, 0};
        int[] Zendan = {0, 0, 0, 0};
        String username = System.getProperty("user.name");
        String FILENAME = "C:\\Users\\" + username + "\\Desktop\\Export\\Transitions.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                // System.out.println(sCurrentLine);

                elephantList = Arrays.asList(sCurrentLine.split(","));
                //System.out.println(elephantList.get(2));
                System.out.println(elephantList.get(4)+ " ==??" + S);
               
                if (S.equals(elephantList.get(4))) {

                    if ('T' == elephantList.get(1).charAt(1)) {
                        switch (elephantList.get(2)) {
                            case "Brief":
                                Tesla[0] += 1;
                                System.out.println(S + elephantList.get(1) + " Brief: " + Tesla[0]);
                                break;
                            case "Hint":
                                Tesla[1] += 1;
                                break;
                            case "Picture":
                                Tesla[2] += 1;
                                break;
                            case "Reset":
                                Tesla[3] += 1;
                                break;

                        }
                    } else if (elephantList.get(1).charAt(1) == 'H') {
                        switch (elephantList.get(2)) {
                            case "Brief":
                                Haber[0] += 1;
                                break;
                            case "Hint":
                                Haber[1] += 1;
                                break;
                            case "Picture":
                                Haber[2] += 1;
                                break;
                            case "Reset":
                                Haber[3] += 1;
                                break;

                        }

                    } else if (elephantList.get(1).charAt(1) == 'M') {
                        switch (elephantList.get(2)) {
                            case "Brief":
                                Motel[0] += 1;
                                break;
                            case "Hint":
                                Motel[1] += 1;
                                break;
                            case "Picture":
                                Motel[2] += 1;
                                break;
                            case "Reset":
                                Motel[3] += 1;
                                break;

                        }
                    } else if (elephantList.get(1).charAt(1) == 'M') {
                        switch (elephantList.get(2)) {
                            case "Brief":
                                Zendan[0] += 1;
                                break;
                            case "Hint":
                                Zendan[1] += 1;
                                break;
                            case "Picture":
                                Zendan[2] += 1;
                                break;
                            case "Reset":
                                Zendan[3] += 1;
                                break;

                        }
                    }

                }
            }

            jTextArea1.append((S + ", Haber , " + Haber[0]) + " , " + Haber[1] + " , " + Haber[2] + " , " + Haber[3] + "\n");
            jTextArea1.append((S + ", Tesla , " + Tesla[0]) + " , " + Tesla[1] + " , " + Tesla[2] + " , " + Tesla[3] + "\n");

            jTextArea1.append((S + ", Motel , " + Motel[0]) + " , " + Motel[1] + " , " + Motel[2] + " , " + Motel[3] + "\n");

            jTextArea1.append((S + ", Zendan , " + Zendan[0]) + " , " + Zendan[1] + " , " + Zendan[2] + " , " + Zendan[3] + "\n");

            for (int i = 0; i < 4; i++) {
                Haber[i] = 0;
                Tesla[i] = 0;
                Motel[i] = 0;
                Zendan[i] = 0;
            }

        } catch (IOException ex) {

        }
        ///System.out.println("abbas");
       // fout = new File("C:\\Users\\" + username + "\\Desktop\\output.txt");
        //fos = new FileOutputStream(fout);
        //bw = new BufferedWriter(new OutputStreamWriter(fos));
        //bw.write(S);
        //bw.close();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
