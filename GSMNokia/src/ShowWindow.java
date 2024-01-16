import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ShowWindow {

JFrame JF = new JFrame();
JMenuBar BAR = new JMenuBar();
JTextArea JTA = new JTextArea();
JScrollPane ScrollPane = new JScrollPane(JTA);
JFileChooser Chooser = new JFileChooser();
ReadFile RFile = new ReadFile();
GetInformation GetInfo = new GetInformation();
Abis Abis1 = new Abis();
MountAbis Ma = new MountAbis();
String filename;


public void Window(){

JMenu menu1 = new JMenu("Option");
JMenu menu2 = new JMenu("Help");
JMenu menu3 = new JMenu("Abis");

JMenuItem item1 = new JMenuItem("Exit");
JMenuItem item2 = new JMenuItem("About");
JMenuItem item3 = new JMenuItem("Open File");
JMenuItem item4 = new JMenuItem("Quick Abis");
menu3.setEnabled(false);

JF.setJMenuBar(BAR);
BAR.add(menu1);
BAR.add(menu3);
BAR.add(menu2);
menu1.add(item3);
menu1.add(item1);
menu2.add(item2);
menu3.add(item4);

JF.add(ScrollPane);
JTA.setEditable(false);

JF.setTitle("TRX Script ");
JF.setSize(700,600);
JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JF.setLocationRelativeTo(null);
JF.setVisible(true);


JTA.setText("For use the program your need log of the Site. Follow step:\n\n"
+"ZEEI:BCF=XXX;\n"
+"ZERO:BCF=XXX;\n"
+"ZDSB:::PCM=XXXX;\n"
+"ZESI:ID=;  (Optional for EDAP)");

item1.addActionListener(new ActionListener() {
	public void actionPerformed(ActionEvent e){

    System.exit(0);

    }

});

item2.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){

    JOptionPane.showMessageDialog(null,
    "TRX Script for Nokia\n\n\n"
    +"Developed by Tiago Fernandes\n"
    +"Contact: tfmoraes@gmail.com\n"
    +"Version 1.1\n\n\n"
    +"All Right Reserved");

    }

});

item3.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){

    JTA.setText(" ");
    GetInfo.RemoveSig();//Clear data temp in ArrayList
    GetInfo.RemoveTrx();//Clear data temp in ArrayList

    Chooser.showOpenDialog(null);
    File path = Chooser.getSelectedFile();
    filename = path.getAbsolutePath();

    //RFile.ReadFileAll(filename); //Read File
    GetInfo.GetInfo(RFile.ReadFileAll(filename));//Save Information at Class GetInformation

    GetInfo.RemoveSigRepeat(); //Remove Duplicates Sig
    GetInfo.RemoveTrxRepeat();//Remove Duplicates TRXs

    JTA.append("\nBlock TRXS\n");
    JTA.append(GetInfo.PrintTrxBlock()+"\n");

    JTA.append("Delete TRXS\n");
    JTA.append(GetInfo.PrintDeleteTrx()+"\n");

    JTA.append("Modify Signaling\n");
    JTA.append(GetInfo.PrintModAd()+"\n");

    JTA.append("Delete Signaling\n");
    JTA.append(GetInfo.PrintDeleteSig()+"\n");

    JTA.append("Create Signaling\n");
    JTA.append(GetInfo.PrintCreteSig()+"\n");

    JTA.append("Modify Signaling\n");
    JTA.append(GetInfo.PrintModWo()+"\n");

    JTA.append("Create TRXS\n");
    JTA.append(GetInfo.PrintCreateTrx()+"\n");

    JTA.append("Unlock TRXS\n");
    JTA.append(GetInfo.PrintTrxUnlock()+"\n");

    menu3.setEnabled(true);

    }
});


item4.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e){

    GetInfo.RemovePcmRepeat();

    int i = GetInfo.sigPcmReal.size();

    //System.out.println(i);
    	if(i == 1){
    		Ma.MountAbis1(GetInfo);
    	}

    	if(i == 2){
    		Ma.MountAbis1(GetInfo);
    		Ma.MountAbis2(GetInfo);
    	}

    	if(i == 3){
    		Ma.MountAbis1(GetInfo);
    		Ma.MountAbis2(GetInfo);
    		Ma.MountAbis3(GetInfo);
    	}

    	if(i == 4){
    		Ma.MountAbis1(GetInfo);
    		Ma.MountAbis2(GetInfo);
    		Ma.MountAbis3(GetInfo);
    		Ma.MountAbis4(GetInfo);
    	}


    }

});



}

public static void main (String[] args){

ShowWindow sw = new ShowWindow();
sw.Window();

}



}
