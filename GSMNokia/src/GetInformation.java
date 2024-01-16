import java.util.ArrayList;
import java.util.Scanner;

public class GetInformation {

ArrayList<String> sigName = new ArrayList<String>();
ArrayList<String> sigBcsu = new ArrayList<String>();
ArrayList<String> sigNbcsu = new ArrayList<String>();
ArrayList<String> sigSapi = new ArrayList<String>();
ArrayList<String> sigTei = new ArrayList<String>();
ArrayList<String> sigBR = new ArrayList<String>();
ArrayList<String> sigPcm = new ArrayList<String>();
ArrayList<String> sigPcmReal = new ArrayList<String>();
ArrayList<String> onlyPcm = new ArrayList<String>();
ArrayList<String> sigTimeslot = new ArrayList<String>();
ArrayList<String> sigTsl = new ArrayList<String>();
ArrayList<String> sigParset = new ArrayList<String>();

ArrayList<String> segName = new ArrayList<String>();
ArrayList<String> trx = new ArrayList<String>();
ArrayList<String> gtrx = new ArrayList<String>();
ArrayList<String> pref = new ArrayList<String>();
ArrayList<String> freq = new ArrayList<String>();
ArrayList<String> tsc = new ArrayList<String>();
ArrayList<String> dap = new ArrayList<String>();
ArrayList<String> edappcm = new ArrayList<String>();
ArrayList<String> edap = new ArrayList<String>();
ArrayList<String> edapti = new ArrayList<String>();
ArrayList<String> edaptf = new ArrayList<String>();
ArrayList<String> sign = new ArrayList<String>();
ArrayList<String> dname = new ArrayList<String>();
ArrayList<String> pcm = new ArrayList<String>();
ArrayList<String> tsl = new ArrayList<String>();
ArrayList<String> rtsl = new ArrayList<String>();
ArrayList<String> ch0 = new ArrayList<String>();
ArrayList<String> ch1 = new ArrayList<String>();
ArrayList<String> ch2 = new ArrayList<String>();
ArrayList<String> ch3 = new ArrayList<String>();
ArrayList<String> ch4 = new ArrayList<String>();
ArrayList<String> ch5 = new ArrayList<String>();
ArrayList<String> ch6 = new ArrayList<String>();
ArrayList<String> ch7 = new ArrayList<String>();



public void GetInfo(Scanner n){

while(n.hasNextLine()){

String line = n.nextLine();
int j = line.length();

		if(j == 76){
			if(line.charAt(0) == 'T' || line.charAt(0) == 'R' || line.charAt(0) == 'O'
					|| line.charAt(0) == 'D' || line.charAt(0) == 'M'  ){
				sigName.add(line.substring(0,5));
				sigBcsu.add(line.substring(42,46));
				sigNbcsu.add(line.substring(47,48));
				sigSapi.add(line.substring(13,15));
				sigTei.add(line.substring(17,19));
				sigBR.add(line.substring(22,24));
				sigPcm.add(line.substring(25,32));
				onlyPcm.add(line.substring(25,29));
				sigPcmReal.add(line.substring(25,29));
				sigTimeslot.add(line.substring(30,32));
		    sigTsl.add(line.substring(33,34));
		    sigParset.add(line.substring(75,76));
			}
		}

		if(j == 17 ){
			if(line.charAt(0) == 'S'){
				this.segName.add(line.substring(10,17));
				
			}
		}
		
		if(j == 25 ){ // Correcao Bug xShell
			if(line.charAt(0) == 'S'){
				this.segName.add(line.substring(10,17));
			}
		}
	

		if(j == 47 || j == 51 || j == 66 ){ //Corecão bug xShell
			if(line.charAt(0) == 'T'){
				this.trx.add(line.substring(4,7));
			}
		}

		if(j == 48){
			if(line.charAt(0) == 'G'){
				this.gtrx.add(line.substring(10,11));
			}
		}

		if(j == 18){
			if(line.charAt(0) == 'G'){
				gtrx.add(line.substring(10,11));
			}
		}

		if(j == 11){
			if(line.charAt(0) == 'G'){
				gtrx.add(line.substring(10,11));
			}
		}

		if(j == 51){
			if(line.charAt(0) == 'G'){
				gtrx.add(line.substring(10,11));
			}
		}
		
		if(j == 73){ // Correćão bug xShell
			if(line.charAt(0) == 'G'){
				gtrx.add(line.substring(10,11));
			}
		}

		if(j == 66){
			if(line.charAt(59) == 'P'){
				pref.add(line.substring(65,66));
			}
		}

		if(j == 77){
			if(line.charAt(0) == 'F'){
				freq.add(line.substring(8,11));
				tsc.add(line.substring(25,26));
			}
		}

		if(j == 77){
			if(line.charAt(34) == 'D'){
				dap.add(line.substring(41,45));
			}
		}

		if(j == 33){
			edap.add(line.substring(1,6));
			edappcm.add(line.substring(8,12));
			edapti.add(line.substring(13,15));
			edaptf.add(line.substring(18,20));
			}

		if(j == 66 || j == 45){
			if(line.charAt(34) == 'S' && line.charAt(35) == 'I' && line.charAt(36) == 'G' ){
				sign.add(line.substring(44,45));
			}
		}

		if(j == 35){
			if(line.charAt(0) == 'D'){
				dname.add(line.substring(30,35));
			}
		}

		//Get TCHD, MBCCH, SDCCH, SDCCB
		if(line.contains("  ") == true){
			if(line.charAt(2) == '0'){
				if(line.charAt(24) == 'T' || line.charAt(24) == 'S' || line.charAt(24) == 'M'
				|| line.charAt(24) == 'N'){
					ch0.add(line.substring(24,31));
					pcm.add(line.substring(5,9));
				}
			}
		}

		 if(line.contains("  ") == true){
			 if(line.charAt(2) == '1'){
				 if(line.charAt(24) == 'T' || line.charAt(24) == 'S' || line.charAt(24) == 'M'
				 || line.charAt(24) == 'N'){
					 ch1.add(line.substring(24,31));
				 }
			 }
		}

		if(line.contains("  ") == true){
			if(line.charAt(2) == '2'){
				if(line.charAt(24) == 'T' || line.charAt(24) == 'S' || line.charAt(24) == 'M'
				|| line.charAt(24) == 'N'){
					ch2.add(line.substring(24,31));
					tsl.add(line.substring(5,13));
					rtsl.add(line.substring(11,13));
				}
			}
		}

		if(line.contains("  ") == true){
			if(line.charAt(2) == '3'){
				if(line.charAt(24) == 'T' || line.charAt(24) == 'S' || line.charAt(24) == 'M'
				|| line.charAt(24) == 'N'){
					ch3.add(line.substring(24,31));
				}
			}
		}

		if(line.contains("  ") == true){
			if(line.charAt(2) == '4'){
				if(line.charAt(24) == 'T' || line.charAt(24) == 'S' || line.charAt(24) == 'M'
				|| line.charAt(24) == 'N'){
					ch4.add(line.substring(24,31));
				}
			}
		}

		if(line.contains("  ") == true){
			if(line.charAt(2) == '5'){
				if(line.charAt(24) == 'T' || line.charAt(24) == 'S' || line.charAt(24) == 'M'
				|| line.charAt(24) == 'N'){
					ch5.add(line.substring(24,31));
				}
			}
		}

		if(line.contains("  ") == true){
			if(line.charAt(2) == '6'){
				if(line.charAt(24) == 'T' || line.charAt(24) == 'S' || line.charAt(24) == 'M'
				|| line.charAt(24) == 'N'){
					ch6.add(line.substring(24,31));
				}
			}
		}

		if(line.contains("  ") == true){
			if(line.charAt(2) == '7'){
				if(line.charAt(24) == 'T' || line.charAt(24) == 'S' || line.charAt(24) == 'M'
				|| line.charAt(24) == 'N'){
					ch7.add(line.substring(24,31));
				}
			}
		}
	}
}

public String PrintCreteSig(){
String line ="\n";

	for(int i = 0; i  < sigName.size(); i++){
		line += "ZDSE:"+sigName.get(i)+":"+sigBcsu.get(i)
		+","+sigNbcsu.get(i)+":"+sigSapi.get(i)
		+","+sigTei.get(i)+":"+sigBR.get(i)+","+sigPcm.get(i)+","
		+sigTsl.get(i)+":,"+sigParset.get(i)+";"+"\n";

	}

return line;

}

public String PrintCreateTrx() {
String line ="\n";

	for(int i = 0; i  < segName.size(); i++){
		line += "ZERC:NAME="+segName.get(i)+",TRX="+trx.get(i)+":PREF="
		+pref.get(i)+",GTRX="+gtrx.get(i)
		+",DAP="+dap.get(i)+":FREQ="+freq.get(i)+",TSC="+tsc.get(i)+",PCMTSL="+tsl.get(i)
		+":DNAME="+dname.get(i)+":SIGN="+sign.get(i)+",CH0="+ch0.get(i)
		+",CH1="+ch1.get(i)+",CH2="+ch2.get(i)+",CH3="+ch3.get(i)+",CH4="+ch4.get(i)
		+",CH5="+ch5.get(i)+",CH6="+ch6.get(i)+",CH7="+ch7.get(i)+";"+"\n";
	}

return line;

}

public String PrintTrxBlock(){
String line = "\n";

	for(int i = 0; i  < segName.size(); i++){
		line += "ZERS:NAME="+segName.get(i)+",TRX="+trx.get(i)+":L;"+"\n";
	}

return line;

}

public String PrintDeleteTrx(){
String line="\n";

	for(int i = 0; i  < segName.size(); i++){
		line += "ZERD:NAME="+segName.get(i)+",TRX="+trx.get(i)+";"+"\n";
	}

return line;

}

public String PrintModAd(){
String line = "\n";

	for(int i = 0; i  < sigName.size(); i++){
		line += "ZDTC:"+sigName.get(i)+":AD;"+"  "+sigTei.get(i)+"\n";
	}

return line;

}

public String PrintDeleteSig(){
String line = "\n";

	for(int i = 0; i  < sigName.size(); i++){
		line += "ZDSD:"+sigName.get(i)+";"+"  "+sigTei.get(i)+"\n";
	}

return line;

}


public String PrintModWo(){
String line = "\n";

	for(int i = 0; i  < sigName.size(); i++){
		line += "ZDTC:"+sigName.get(i)+":WO;"+"  "+sigTei.get(i)+"\n";
	}

return line;

}

public String PrintTrxUnlock(){
String line = "\n";

	for(int i = 0; i  < segName.size(); i++){
		line += "ZERS:NAME="+segName.get(i)+",TRX="+trx.get(i)+":U;"+"\n";
	}

return line;

}

public void RemoveSig(){

sigName.clear();
sigBcsu.clear();
sigNbcsu.clear();
sigSapi.clear();
sigTei.clear();
sigBR.clear();
sigPcm.clear();
sigTsl.clear();
sigParset.clear();

}

public void RemoveTrx(){

segName.clear();
trx.clear();
gtrx.clear();
pref.clear();
freq.clear();
tsc.clear();
dap.clear();
sign.clear();
dname.clear();
pcm.clear();
tsl.clear();
ch0.clear();
ch1.clear();
ch2.clear();
ch3.clear();
ch4.clear();
ch5.clear();
ch6.clear();
ch7.clear();

}

public void RemoveSigRepeat(){

	for(int i = 0; i < sigName.size(); i++){
        for(int j = i + 1; j < sigName.size(); j++){
            if(sigName.get(i).equals(sigName.get(j))){
            sigName.remove(j);
            sigBcsu.remove(j);
            sigNbcsu.remove(j);
            sigSapi.remove(j);
            sigTei.remove(j);
            sigBR.remove(j);
            sigPcm.remove(j);
            sigPcmReal.remove(j);
            sigTsl.remove(j);
            sigParset.remove(j);
            j--;
            }
        }
    }
}

public void RemoveTrxRepeat(){

	for(int i = 0; i < dname.size(); i++){
        for(int j = i + 1; j < dname.size(); j++){
            if(dname.get(i).equals(dname.get(j))){
            segName.remove(j);
            trx.remove(j);
            gtrx.remove(j);
            pref.remove(j);
            freq.remove(j);
            tsc.remove(j);
            dap.remove(j);
            sign.remove(j);
            dname.remove(j);
            pcm.remove(j);
            tsl.remove(j);
            ch0.remove(j);
            ch1.remove(j);
            ch2.remove(j);
            ch3.remove(j);
            ch4.remove(j);
            ch5.remove(j);
            ch6.remove(j);
            ch7.remove(j);
            j--;
            }
        }
    }
}

public void RemovePcmRepeat(){

    for(int i = 0; i < sigPcmReal.size(); i++){
        for(int j = i + 1; j < sigPcmReal.size(); j++){
            if(sigPcmReal.get(i).equals(sigPcmReal.get(j))){
            sigPcmReal.remove(j);
            j--;
            }
        }
    }

}

public void RemoveEdapRepeat(){
    for(int i = 0; i < edappcm.size(); i++){
        for(int j = i + 1; j < edappcm.size(); j++){
            if(edappcm.get(i).equals(edappcm.get(j))){
            edappcm.remove(j);
            j--;
            }
        }
    }
}


}
