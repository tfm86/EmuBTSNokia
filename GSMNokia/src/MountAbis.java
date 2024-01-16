public class MountAbis {

Abis abis = new Abis();
Abis abis2 = new Abis();
Abis abis3 = new Abis();
Abis abis4 = new Abis();
	
public void MountAbis1(GetInformation Inf){

String pcm1 = Inf.sigPcmReal.get(0);
	
for(int i = 0; i < Inf.sigName.size(); i++){

abis.E1.setText("ET-"+pcm1.trim());
		    
//Sig 16
	if(Inf.onlyPcm.get(i).equals(pcm1)){

		if(Inf.sigBR.get(i).equals("16")){

			if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot1E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot1E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot1E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot1E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot2E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot2E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot2E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot2E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot3E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot3E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot3E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot3E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot4E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot4E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot4E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot4E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot5E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot5E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot5E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot5E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot6E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot6E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot6E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot6E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot7E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot7E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot7E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot7E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot8E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot8E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot8E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot8E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot9E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot9E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot9E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot9E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot10E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot10E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot10E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot10E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot11E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot11E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot11E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot11E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot12E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot12E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot12E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot12E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot13E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot13E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot13E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot13E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot14E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot14E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot14E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot14E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot15E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot15E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot15E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot15E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot16E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot16E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot16E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot16E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot17E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot17E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot17E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot17E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot18E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot18E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot18E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot18E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot19E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot19E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot19E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot19E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot20E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot20E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot20E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot20E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot21E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot21E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot21E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot21E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot22E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot22E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot22E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot22E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot23E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot23E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot23E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot23E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot24E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot24E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot24E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot24E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot25E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot25E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot25E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot25E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot26E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot26E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot26E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot26E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot27E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot27E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot27E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot27E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot28E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot28E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot28E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot28E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot29E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot29E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot29E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot29E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot30E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot30E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot30E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot30E1("sig16-6","","","",Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot31E1("sig16-0",Inf.sigTei.get(i),"","","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("2")){
				abis.setTimeslot31E1("sig16-2","",Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot31E1("sig16-4","","",Inf.sigTei.get(i),"");
			}
	
			if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("6")){
				abis.setTimeslot31E1("sig16-6","","","",Inf.sigTei.get(i));
			}

		}

		if(Inf.sigBR.get(i).equals("32")){

			if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot1E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot1E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot2E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot2E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot3E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot3E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot4E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot4E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot5E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot5E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot6E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot6E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot7E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot7E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot8E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot8E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot9E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot9E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot10E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot10E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot11E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot11E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot12E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot12E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot13E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot13E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot14E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot14E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot15E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot15E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot16E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot16E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot17E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot17E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot18E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot18E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot19E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot19E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot20E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot20E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot21E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot21E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot22E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot22E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot23E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot23E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot24E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot24E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot25E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot25E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot26E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot26E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot27E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot27E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot28E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot28E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot29E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot29E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot30E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot30E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}
	
			if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
				abis.setTimeslot31E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
			}
	
			if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
				abis.setTimeslot31E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
			}

		}
	}
}

//Omusing
for(int i = 0; i < Inf.sigName.size(); i++){
		
		if(Inf.onlyPcm.get(i).equals(pcm1)){

			if(Inf.sigSapi.get(i).equals("62")){

		          if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot1E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot1E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot1E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot2E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot2E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot2E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot3E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot3E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot3E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot4E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot4E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot4E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot5E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot5E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot5E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot6E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot6E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot6E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot7E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot7E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot7E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot8E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot8E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot8E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot9E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot9E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot9E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot10E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot10E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot10E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot11E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot11E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot11E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot12E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot12E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot12E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot13E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot13E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot13E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot14E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot14E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot14E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot15E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot15E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot15E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot16E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot16E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot16E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot17E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot17E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot17E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot18E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot18E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot18E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot19E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot19E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot19E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot20E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot20E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot20E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot21E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot21E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot21E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot22E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot22E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot22E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot23E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot23E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot23E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot24E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot24E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot24E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot25E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot25E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot25E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot26E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot26E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot26E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot27E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot27E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot27E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot28E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot28E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot28E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot29E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot29E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot29E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot30E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot30E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot30E1("omu64","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
		            abis.setTimeslot31E1("omu32-0","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
		            abis.setTimeslot31E1("omu32-4","","","","");
		          }

		          if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals(" ")){
		            abis.setTimeslot31E1("omu64","","","","");
		          }

		    }
		}
}

//TRX
for(int i = 0; i < Inf.trx.size(); i++){

		if(Inf.pcm.get(i).equals(pcm1)){

			
			if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot1E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

			if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot1E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot1E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot2E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot2E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }


		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot3E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot3E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot4E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot4E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot5E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot5E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot6E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot6E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot7E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot7E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot8E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot8E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot9E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot9E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot10E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot10E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot11E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot11E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot12E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot12E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot13E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot13E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot14E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot14E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot15E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot15E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot16E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot16E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot17E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot17E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot18E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot18E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot19E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot19E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot20E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot20E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot21E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot21E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot22E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot22E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot23E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot23E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot24E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot24E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot25E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot25E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot26E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot26E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot27E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot27E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot28E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot28E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot29E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot29E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("0")){
		      abis.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("1")){
		      abis.setTimeslot30E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("2")){
		      abis.setTimeslot30E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		}

}

//EDAP
Inf.RemoveEdapRepeat();

int ti;
int tf;
int t;

for(int i = 0; i < Inf.edappcm.size(); i++){

	if(Inf.edappcm.get(i).equals(pcm1)){

		ti = Integer.parseInt(Inf.edapti.get(i).trim());
		tf = Integer.parseInt(Inf.edaptf.get(i).trim());
		t = tf - ti;
		t = t + 1;

		for(int j = 0; j < t; j++){

		  if(ti == 1){
		  abis.setTimeslot1E1("dap","","","","");
		  //System.out.println(ti);
		  }

		  if(ti == 2){
		  abis.setTimeslot2E1("dap","","","","");
		  }

		  if(ti == 3){
		  abis.setTimeslot3E1("dap","","","","");
		  }

		  if(ti == 4){
		  abis.setTimeslot4E1("dap","","","","");
		  }

		  if(ti == 5){
		  abis.setTimeslot5E1("dap","","","","");
		  }

		  if(ti == 6){
		  abis.setTimeslot6E1("dap","","","","");
		  }

		  if(ti == 7){
		  abis.setTimeslot7E1("dap","","","","");
		  }

		  if(ti == 8){
		  abis.setTimeslot8E1("dap","","","","");
		  }

		  if(ti == 9){
		  abis.setTimeslot9E1("dap","","","","");
		  }

		  if(ti == 10){
		  abis.setTimeslot10E1("dap","","","","");
		  }

		  if(ti == 11){
		  abis.setTimeslot11E1("dap","","","","");
		  }

		  if(ti == 12){
		  abis.setTimeslot12E1("dap","","","","");
		  }

		  if(ti == 13){
		  abis.setTimeslot13E1("dap","","","","");
		  }

		  if(ti == 14){
		  abis.setTimeslot14E1("dap","","","","");
		  }

		  if(ti == 15){
		  abis.setTimeslot15E1("dap","","","","");
		  }

		  if(ti == 16){
		  abis.setTimeslot16E1("dap","","","","");
		  }

		  if(ti == 17){
		  abis.setTimeslot17E1("dap","","","","");
		  }

		  if(ti == 18){
		  abis.setTimeslot18E1("dap","","","","");
		  }

		  if(ti == 19){
		  abis.setTimeslot19E1("dap","","","","");
		  }

		  if(ti == 20){
		  abis.setTimeslot20E1("dap","","","","");
		  }

		  if(ti == 21){
		  abis.setTimeslot21E1("dap","","","","");
		  }

		  if(ti == 22){
		  abis.setTimeslot22E1("dap","","","","");
		  }

		  if(ti == 23){
		  abis.setTimeslot23E1("dap","","","","");
		  }

		  if(ti == 24){
		  abis.setTimeslot24E1("dap","","","","");
		  }

		  if(ti == 25){
		  abis.setTimeslot25E1("dap","","","","");
		  }

		  if(ti == 26){
		  abis.setTimeslot26E1("dap","","","","");
		  }

		  if(ti == 27){
		  abis.setTimeslot27E1("dap","","","","");
		  }

		  if(ti == 28){
		  abis.setTimeslot28E1("dap","","","","");
		  }

		  if(ti == 29){
		  abis.setTimeslot29E1("dap","","","","");
		  }

		  if(ti == 30){
		  abis.setTimeslot30E1("dap","","","","");
		  }

		  if(ti == 31){
		  abis.setTimeslot31E1("dap","","","","");
		  }

		ti++;

		}

	}
}
		
String n ="";
for(int i = 0; i < Inf.trx.size(); i++){

	if(Inf.pcm.get(i).equals(pcm1)){
		
	String e = Inf.dap.get(i).trim();

		if(Inf.gtrx.get(i).equals("Y") & !e.equals("N")){
			n += Inf.trx.get(i) + " ";
		}
	}
}

abis.EDAP.setText(n);

abis.ShowAbis();
	
}

public void MountAbis2(GetInformation Inf){

String pcm2 = Inf.sigPcmReal.get(1);

for(int i = 0; i < Inf.sigName.size(); i++){

abis2.E1.setText("ET-"+pcm2.trim());
      
//Sig 16
if(Inf.onlyPcm.get(i).equals(pcm2)){

  if(Inf.sigBR.get(i).equals("16")){

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot1E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot1E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot1E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot1E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot2E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot2E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot2E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot2E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot3E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot3E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot3E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot3E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot4E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot4E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot4E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot4E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot5E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot5E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot5E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot5E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot6E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot6E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot6E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot6E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot7E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot7E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot7E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot7E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot8E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot8E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot8E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot8E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot9E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot9E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot9E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot9E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot10E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot10E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot10E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot10E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot11E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot11E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot11E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot11E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot12E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot12E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot12E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot12E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot13E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot13E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot13E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot13E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot14E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot14E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot14E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot14E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot15E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot15E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot15E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot15E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot16E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot16E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot16E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot16E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot17E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot17E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot17E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot17E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot18E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot18E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot18E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot18E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot19E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot19E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot19E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot19E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot20E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot20E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot20E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot20E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot21E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot21E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot21E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot21E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot22E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot22E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot22E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot22E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot23E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot23E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot23E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot23E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot24E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot24E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot24E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot24E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot25E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot25E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot25E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot25E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot26E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot26E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot26E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot26E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot27E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot27E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot27E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot27E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot28E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot28E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot28E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot28E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot29E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot29E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot29E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot29E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot30E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot30E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot30E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot30E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot31E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("2")){
      abis2.setTimeslot31E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot31E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("6")){
      abis2.setTimeslot31E1("sig16-6","","","",Inf.sigTei.get(i));
    }

  }

  if(Inf.sigBR.get(i).equals("32")){

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot1E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot1E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot2E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot2E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot3E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot3E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot4E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot4E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot5E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot5E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot6E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot6E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot7E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot7E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot8E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot8E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot9E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot9E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot10E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot10E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot11E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot11E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot12E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot12E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot13E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot13E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot14E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot14E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot15E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot15E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot16E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot16E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot17E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot17E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot18E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot18E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot19E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot19E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot20E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot20E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot21E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot21E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot22E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot22E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot23E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot23E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot24E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot24E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot25E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot25E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot26E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot26E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot27E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot27E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot28E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot28E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot29E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot29E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot30E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot30E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
      abis2.setTimeslot31E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
      abis2.setTimeslot31E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

  }
}
}

//Omusing
for(int i = 0; i < Inf.sigName.size(); i++){
  
  if(Inf.onlyPcm.get(i).equals(pcm2)){

    if(Inf.sigSapi.get(i).equals("62")){

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot1E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot1E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot1E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot2E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot2E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot2E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot3E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot3E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot3E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot4E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot4E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot4E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot5E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot5E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot5E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot6E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot6E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot6E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot7E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot7E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot7E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot8E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot8E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot8E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot9E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot9E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot9E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot10E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot10E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot10E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot11E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot11E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot11E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot12E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot12E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot12E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot13E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot13E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot13E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot14E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot14E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot14E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot15E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot15E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot15E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot16E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot16E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot16E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot17E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot17E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot17E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot18E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot18E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot18E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot19E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot19E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot19E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot20E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot20E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot20E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot21E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot21E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot21E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot22E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot22E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot22E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot23E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot23E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot23E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot24E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot24E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot24E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot25E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot25E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot25E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot26E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot26E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot26E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot27E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot27E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot27E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot28E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot28E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot28E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot29E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot29E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot29E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot30E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot30E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot30E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
              abis2.setTimeslot31E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
              abis2.setTimeslot31E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals(" ")){
              abis2.setTimeslot31E1("omu64","","","","");
            }

      }
  }
}

//TRX
for(int i = 0; i < Inf.trx.size(); i++){

  if(Inf.pcm.get(i).equals(pcm2)){

			if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot1E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

			if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot1E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot1E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot2E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot2E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }


		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot3E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot3E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot4E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot4E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot5E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot5E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot6E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot6E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot7E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot7E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot8E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot8E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot9E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot9E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot10E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot10E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot11E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot11E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot12E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot12E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot13E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot13E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot14E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot14E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot15E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot15E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot16E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot16E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot17E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot17E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot18E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot18E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot19E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot19E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot20E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot20E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot21E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot21E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot22E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot22E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot23E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot23E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot24E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot24E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot25E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot25E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot26E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot26E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot27E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot27E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot28E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot28E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot29E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot29E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("0")){
		      abis2.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("1")){
		      abis2.setTimeslot30E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("2")){
		      abis2.setTimeslot30E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis2.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

  }

}

//EDAP
Inf.RemoveEdapRepeat();

int ti;
int tf;
int t;

for(int i = 0; i < Inf.edappcm.size(); i++){

if(Inf.edappcm.get(i).equals(pcm2)){

  ti = Integer.parseInt(Inf.edapti.get(i).trim());
  tf = Integer.parseInt(Inf.edaptf.get(i).trim());
  t = tf - ti;
  t = t + 1;

  for(int j = 0; j < t; j++){

    if(ti == 1){
    abis2.setTimeslot1E1("dap","","","","");
    //System.out.println(ti);
    }

    if(ti == 2){
    abis2.setTimeslot2E1("dap","","","","");
    }

    if(ti == 3){
    abis2.setTimeslot3E1("dap","","","","");
    }

    if(ti == 4){
    abis2.setTimeslot4E1("dap","","","","");
    }

    if(ti == 5){
    abis2.setTimeslot5E1("dap","","","","");
    }

    if(ti == 6){
    abis2.setTimeslot6E1("dap","","","","");
    }

    if(ti == 7){
    abis2.setTimeslot7E1("dap","","","","");
    }

    if(ti == 8){
    abis2.setTimeslot8E1("dap","","","","");
    }

    if(ti == 9){
    abis2.setTimeslot9E1("dap","","","","");
    }

    if(ti == 10){
    abis2.setTimeslot10E1("dap","","","","");
    }

    if(ti == 11){
    abis2.setTimeslot11E1("dap","","","","");
    }

    if(ti == 12){
    abis2.setTimeslot12E1("dap","","","","");
    }

    if(ti == 13){
    abis2.setTimeslot13E1("dap","","","","");
    }

    if(ti == 14){
    abis2.setTimeslot14E1("dap","","","","");
    }

    if(ti == 15){
    abis2.setTimeslot15E1("dap","","","","");
    }

    if(ti == 16){
    abis2.setTimeslot16E1("dap","","","","");
    }

    if(ti == 17){
    abis2.setTimeslot17E1("dap","","","","");
    }

    if(ti == 18){
    abis2.setTimeslot18E1("dap","","","","");
    }

    if(ti == 19){
    abis2.setTimeslot19E1("dap","","","","");
    }

    if(ti == 20){
    abis2.setTimeslot20E1("dap","","","","");
    }

    if(ti == 21){
    abis2.setTimeslot21E1("dap","","","","");
    }

    if(ti == 22){
    abis2.setTimeslot22E1("dap","","","","");
    }

    if(ti == 23){
    abis2.setTimeslot23E1("dap","","","","");
    }

    if(ti == 24){
    abis2.setTimeslot24E1("dap","","","","");
    }

    if(ti == 25){
    abis2.setTimeslot25E1("dap","","","","");
    }

    if(ti == 26){
    abis2.setTimeslot26E1("dap","","","","");
    }

    if(ti == 27){
    abis2.setTimeslot27E1("dap","","","","");
    }

    if(ti == 28){
    abis2.setTimeslot28E1("dap","","","","");
    }

    if(ti == 29){
    abis2.setTimeslot29E1("dap","","","","");
    }

    if(ti == 30){
    abis2.setTimeslot30E1("dap","","","","");
    }

    if(ti == 31){
    abis2.setTimeslot31E1("dap","","","","");
    }

  ti++;

  }

}
}
  
String n ="";
for(int i = 0; i < Inf.trx.size(); i++){

if(Inf.pcm.get(i).equals(pcm2)){
  
String e = Inf.dap.get(i).trim();

  if(Inf.gtrx.get(i).equals("Y") & !e.equals("N")){
    n += Inf.trx.get(i) + " ";
  }
}
}

abis2.EDAP.setText(n);

abis2.ShowAbis();

}

public void MountAbis3(GetInformation Inf){

String pcm3 = Inf.sigPcmReal.get(2);

for(int i = 0; i < Inf.sigName.size(); i++){

abis3.E1.setText("ET-"+pcm3.trim());
      
//Sig 16
if(Inf.onlyPcm.get(i).equals(pcm3)){

  if(Inf.sigBR.get(i).equals("16")){

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot1E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot1E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot1E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot1E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot2E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot2E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot2E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot2E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot3E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot3E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot3E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot3E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot4E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot4E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot4E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot4E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot5E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot5E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot5E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot5E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot6E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot6E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot6E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot6E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot7E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot7E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot7E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot7E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot8E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot8E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot8E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot8E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot9E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot9E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot9E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot9E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot10E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot10E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot10E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot10E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot11E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot11E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot11E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot11E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot12E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot12E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot12E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot12E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot13E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot13E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot13E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot13E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot14E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot14E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot14E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot14E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot15E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot15E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot15E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot15E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot16E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot16E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot16E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot16E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot17E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot17E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot17E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot17E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot18E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot18E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot18E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot18E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot19E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot19E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot19E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot19E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot20E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot20E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot20E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot20E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot21E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot21E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot21E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot21E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot22E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot22E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot22E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot22E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot23E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot23E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot23E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot23E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot24E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot24E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot24E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot24E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot25E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot25E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot25E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot25E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot26E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot26E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot26E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot26E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot27E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot27E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot27E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot27E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot28E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot28E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot28E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot28E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot29E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot29E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot29E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot29E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot30E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot30E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot30E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot30E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot31E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("2")){
      abis3.setTimeslot31E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot31E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("6")){
      abis3.setTimeslot31E1("sig16-6","","","",Inf.sigTei.get(i));
    }

  }

  if(Inf.sigBR.get(i).equals("32")){

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot1E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot1E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot2E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot2E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot3E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot3E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot4E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot4E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot5E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot5E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot6E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot6E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot7E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot7E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot8E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot8E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot9E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot9E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot10E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot10E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot11E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot11E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot12E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot12E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot13E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot13E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot14E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot14E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot15E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot15E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot16E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot16E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot17E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot17E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot18E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot18E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot19E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot19E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot20E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot20E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot21E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot21E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot22E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot22E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot23E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot23E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot24E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot24E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot25E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot25E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot26E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot26E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot27E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot27E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot28E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot28E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot29E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot29E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot30E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot30E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
      abis3.setTimeslot31E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
      abis3.setTimeslot31E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

  }
}
}

//Omusing
for(int i = 0; i < Inf.sigName.size(); i++){
  
  if(Inf.onlyPcm.get(i).equals(pcm3)){

    if(Inf.sigSapi.get(i).equals("62")){

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot1E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot1E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot1E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot2E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot2E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot2E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot3E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot3E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot3E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot4E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot4E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot4E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot5E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot5E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot5E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot6E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot6E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot6E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot7E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot7E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot7E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot8E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot8E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot8E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot9E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot9E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot9E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot10E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot10E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot10E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot11E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot11E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot11E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot12E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot12E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot12E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot13E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot13E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot13E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot14E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot14E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot14E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot15E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot15E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot15E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot16E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot16E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot16E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot17E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot17E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot17E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot18E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot18E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot18E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot19E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot19E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot19E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot20E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot20E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot20E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot21E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot21E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot21E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot22E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot22E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot22E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot23E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot23E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot23E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot24E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot24E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot24E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot25E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot25E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot25E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot26E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot26E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot26E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot27E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot27E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot27E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot28E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot28E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot28E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot29E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot29E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot29E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot30E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot30E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot30E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
              abis3.setTimeslot31E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
              abis3.setTimeslot31E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals(" ")){
              abis3.setTimeslot31E1("omu64","","","","");
            }

      }
  }
}

//TRX
for(int i = 0; i < Inf.trx.size(); i++){

  if(Inf.pcm.get(i).equals(pcm3)){

    		if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot1E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

			if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot1E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot1E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot2E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot2E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }


		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot3E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot3E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot4E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot4E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot5E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot5E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot6E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot6E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot7E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot7E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot8E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot8E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot9E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot9E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot10E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot10E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot11E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot11E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot12E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot12E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot13E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot13E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot14E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot14E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot15E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot15E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot16E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot16E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot17E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot17E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot18E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot18E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot19E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot19E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot20E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot20E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot21E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot21E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot22E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot22E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot23E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot23E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot24E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot24E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot25E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot25E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot26E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot26E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot27E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot27E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot28E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot28E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot29E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot29E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("0")){
		      abis3.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("1")){
		      abis3.setTimeslot30E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("2")){
		      abis3.setTimeslot30E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis3.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

  }

}

//EDAP
Inf.RemoveEdapRepeat();

int ti;
int tf;
int t;

for(int i = 0; i < Inf.edappcm.size(); i++){

if(Inf.edappcm.get(i).equals(pcm3)){

  ti = Integer.parseInt(Inf.edapti.get(i).trim());
  tf = Integer.parseInt(Inf.edaptf.get(i).trim());
  t = tf - ti;
  t = t + 1;

  for(int j = 0; j < t; j++){

    if(ti == 1){
    abis3.setTimeslot1E1("dap","","","","");
    //System.out.println(ti);
    }

    if(ti == 2){
    abis3.setTimeslot2E1("dap","","","","");
    }

    if(ti == 3){
    abis3.setTimeslot3E1("dap","","","","");
    }

    if(ti == 4){
    abis3.setTimeslot4E1("dap","","","","");
    }

    if(ti == 5){
    abis3.setTimeslot5E1("dap","","","","");
    }

    if(ti == 6){
    abis3.setTimeslot6E1("dap","","","","");
    }

    if(ti == 7){
    abis3.setTimeslot7E1("dap","","","","");
    }

    if(ti == 8){
    abis3.setTimeslot8E1("dap","","","","");
    }

    if(ti == 9){
    abis3.setTimeslot9E1("dap","","","","");
    }

    if(ti == 10){
    abis3.setTimeslot10E1("dap","","","","");
    }

    if(ti == 11){
    abis3.setTimeslot11E1("dap","","","","");
    }

    if(ti == 12){
    abis3.setTimeslot12E1("dap","","","","");
    }

    if(ti == 13){
    abis3.setTimeslot13E1("dap","","","","");
    }

    if(ti == 14){
    abis3.setTimeslot14E1("dap","","","","");
    }

    if(ti == 15){
    abis3.setTimeslot15E1("dap","","","","");
    }

    if(ti == 16){
    abis3.setTimeslot16E1("dap","","","","");
    }

    if(ti == 17){
    abis3.setTimeslot17E1("dap","","","","");
    }

    if(ti == 18){
    abis3.setTimeslot18E1("dap","","","","");
    }

    if(ti == 19){
    abis3.setTimeslot19E1("dap","","","","");
    }

    if(ti == 20){
    abis3.setTimeslot20E1("dap","","","","");
    }

    if(ti == 21){
    abis3.setTimeslot21E1("dap","","","","");
    }

    if(ti == 22){
    abis3.setTimeslot22E1("dap","","","","");
    }

    if(ti == 23){
    abis3.setTimeslot23E1("dap","","","","");
    }

    if(ti == 24){
    abis3.setTimeslot24E1("dap","","","","");
    }

    if(ti == 25){
    abis3.setTimeslot25E1("dap","","","","");
    }

    if(ti == 26){
    abis3.setTimeslot26E1("dap","","","","");
    }

    if(ti == 27){
    abis3.setTimeslot27E1("dap","","","","");
    }

    if(ti == 28){
    abis3.setTimeslot28E1("dap","","","","");
    }

    if(ti == 29){
    abis3.setTimeslot29E1("dap","","","","");
    }

    if(ti == 30){
    abis3.setTimeslot30E1("dap","","","","");
    }

    if(ti == 31){
    abis3.setTimeslot31E1("dap","","","","");
    }

  ti++;

  }

}
}
  
String n ="";
for(int i = 0; i < Inf.trx.size(); i++){

if(Inf.pcm.get(i).equals(pcm3)){
  
String e = Inf.dap.get(i).trim();

  if(Inf.gtrx.get(i).equals("Y") & !e.equals("N")){
    n += Inf.trx.get(i) + " ";
  }
}
}

abis3.EDAP.setText(n);

abis3.ShowAbis();

}

public void MountAbis4(GetInformation Inf){

String pcm4 = Inf.sigPcmReal.get(3);

for(int i = 0; i < Inf.sigName.size(); i++){

abis4.E1.setText("ET-"+pcm4.trim());
      
//Sig 16
if(Inf.onlyPcm.get(i).equals(pcm4)){

  if(Inf.sigBR.get(i).equals("16")){

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot1E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot1E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot1E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot1E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot2E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot2E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot2E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot2E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot3E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot3E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot3E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot3E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot4E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot4E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot4E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot4E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot5E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot5E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot5E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot5E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot6E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot6E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot6E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot6E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot7E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot7E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot7E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot7E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot8E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot8E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot8E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot8E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot9E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot9E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot9E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot9E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot10E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot10E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot10E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot10E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot11E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot11E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot11E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot11E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot12E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot12E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot12E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot12E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot13E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot13E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot13E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot13E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot14E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot14E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot14E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot14E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot15E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot15E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot15E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot15E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot16E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot16E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot16E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot16E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot17E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot17E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot17E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot17E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot18E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot18E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot18E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot18E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot19E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot19E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot19E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot19E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot20E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot20E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot20E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot20E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot21E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot21E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot21E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot21E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot22E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot22E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot22E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot22E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot23E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot23E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot23E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot23E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot24E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot24E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot24E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot24E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot25E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot25E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot25E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot25E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot26E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot26E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot26E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot26E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot27E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot27E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot27E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot27E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot28E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot28E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot28E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot28E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot29E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot29E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot29E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot29E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot30E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot30E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot30E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot30E1("sig16-6","","","",Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot31E1("sig16-0",Inf.sigTei.get(i),"","","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("2")){
      abis4.setTimeslot31E1("sig16-2","",Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot31E1("sig16-4","","",Inf.sigTei.get(i),"");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("6")){
      abis4.setTimeslot31E1("sig16-6","","","",Inf.sigTei.get(i));
    }

  }

  if(Inf.sigBR.get(i).equals("32")){

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot1E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot1E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot2E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot2E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot3E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot3E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot4E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot4E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot5E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot5E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot6E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot6E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot7E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot7E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot8E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot8E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot9E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot9E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot10E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot10E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot11E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot11E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot12E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot12E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot13E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot13E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot14E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot14E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot15E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot15E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot16E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot16E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot17E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot17E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot18E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot18E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot19E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot19E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot20E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot20E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot21E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot21E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot22E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot22E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot23E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot23E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot24E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot24E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot25E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot25E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot26E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot26E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot27E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot27E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot28E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot28E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot29E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot29E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot30E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot30E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
      abis4.setTimeslot31E1("sig32-0",Inf.sigTei.get(i),Inf.sigTei.get(i),"","");
    }

    if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
      abis4.setTimeslot31E1("sig32-4","","",Inf.sigTei.get(i),Inf.sigTei.get(i));
    }

  }
}
}

//Omusing
for(int i = 0; i < Inf.sigName.size(); i++){
  
  if(Inf.onlyPcm.get(i).equals(pcm4)){

    if(Inf.sigSapi.get(i).equals("62")){

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot1E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot1E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("01") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot1E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot2E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot2E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("02") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot2E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot3E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot3E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("03") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot3E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot4E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot4E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("04") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot4E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot5E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot5E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("05") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot5E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot6E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot6E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("06") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot6E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot7E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot7E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("07") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot7E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot8E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot8E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("08") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot8E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot9E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot9E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("09") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot9E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot10E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot10E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("10") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot10E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot11E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot11E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("11") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot11E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot12E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot12E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("12") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot12E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot13E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot13E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("13") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot13E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot14E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot14E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("14") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot14E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot15E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot15E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("15") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot15E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot16E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot16E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("16") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot16E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot17E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot17E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("17") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot17E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot18E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot18E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("18") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot18E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot19E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot19E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("19") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot19E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot20E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot20E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("20") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot20E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot21E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot21E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("21") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot21E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot22E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot22E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("22") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot22E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot23E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot23E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("23") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot23E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot24E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot24E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("24") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot24E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot25E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot25E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("25") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot25E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot26E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot26E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("26") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot26E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot27E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot27E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("27") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot27E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot28E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot28E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("28") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot28E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot29E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot29E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("29") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot29E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot30E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot30E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("30") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot30E1("omu64","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("0")){
              abis4.setTimeslot31E1("omu32-0","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals("4")){
              abis4.setTimeslot31E1("omu32-4","","","","");
            }

            if(Inf.sigTimeslot.get(i).equals("31") && Inf.sigTsl.get(i).equals(" ")){
              abis4.setTimeslot31E1("omu64","","","","");
            }

      }
  }
}

//TRX
for(int i = 0; i < Inf.trx.size(); i++){

  if(Inf.pcm.get(i).equals(pcm4)){

    		if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot1E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

			if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot1E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 1") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot1E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot2E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot2E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 2") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot2E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }


		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot3E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot3E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 3") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot3E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot4E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot4E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 4") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot4E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot5E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot5E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 5") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot5E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot6E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot6E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 6") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot6E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot7E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot7E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 7") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot7E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot8E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot8E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 8") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot8E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot9E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot9E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals(" 9") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot9E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot10E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot10E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("10") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot10E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot11E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot11E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("11") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot11E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot12E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot12E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("12") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot12E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot13E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot13E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("13") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot13E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot14E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot14E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("14") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot14E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot15E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot15E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("15") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot15E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot16E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot16E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("16") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot16E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot17E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot17E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("17") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot17E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot18E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot18E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("18") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot18E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot19E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot19E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("19") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot19E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot20E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot20E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("20") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot20E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot21E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot21E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("21") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot21E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot22E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot22E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("22") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot22E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot23E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot23E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("23") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot23E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot24E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot24E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("24") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot24E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot25E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot25E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("25") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot25E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot26E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot26E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("26") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot26E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot27E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot27E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("27") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot27E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot28E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot28E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("28") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot28E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot29E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot29E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("29") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot29E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("0")){
		      abis4.setTimeslot30E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("1")){
		      abis4.setTimeslot30E1("sig-1",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

		    if(Inf.rtsl.get(i).equals("30") && Inf.sign.get(i).equals("2")){
		      abis4.setTimeslot30E1("sig-2",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		      abis4.setTimeslot31E1("T",Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i),Inf.trx.get(i));
		    }

  }

}

//EDAP
Inf.RemoveEdapRepeat();

int ti;
int tf;
int t;

for(int i = 0; i < Inf.edappcm.size(); i++){

if(Inf.edappcm.get(i).equals(pcm4)){

  ti = Integer.parseInt(Inf.edapti.get(i).trim());
  tf = Integer.parseInt(Inf.edaptf.get(i).trim());
  t = tf - ti;
  t = t + 1;

  for(int j = 0; j < t; j++){

    if(ti == 1){
    abis4.setTimeslot1E1("dap","","","","");
    //System.out.println(ti);
    }

    if(ti == 2){
    abis4.setTimeslot2E1("dap","","","","");
    }

    if(ti == 3){
    abis4.setTimeslot3E1("dap","","","","");
    }

    if(ti == 4){
    abis4.setTimeslot4E1("dap","","","","");
    }

    if(ti == 5){
    abis4.setTimeslot5E1("dap","","","","");
    }

    if(ti == 6){
    abis4.setTimeslot6E1("dap","","","","");
    }

    if(ti == 7){
    abis4.setTimeslot7E1("dap","","","","");
    }

    if(ti == 8){
    abis4.setTimeslot8E1("dap","","","","");
    }

    if(ti == 9){
    abis4.setTimeslot9E1("dap","","","","");
    }

    if(ti == 10){
    abis4.setTimeslot10E1("dap","","","","");
    }

    if(ti == 11){
    abis4.setTimeslot11E1("dap","","","","");
    }

    if(ti == 12){
    abis4.setTimeslot12E1("dap","","","","");
    }

    if(ti == 13){
    abis4.setTimeslot13E1("dap","","","","");
    }

    if(ti == 14){
    abis4.setTimeslot14E1("dap","","","","");
    }

    if(ti == 15){
    abis4.setTimeslot15E1("dap","","","","");
    }

    if(ti == 16){
    abis4.setTimeslot16E1("dap","","","","");
    }

    if(ti == 17){
    abis4.setTimeslot17E1("dap","","","","");
    }

    if(ti == 18){
    abis4.setTimeslot18E1("dap","","","","");
    }

    if(ti == 19){
    abis4.setTimeslot19E1("dap","","","","");
    }

    if(ti == 20){
    abis4.setTimeslot20E1("dap","","","","");
    }

    if(ti == 21){
    abis4.setTimeslot21E1("dap","","","","");
    }

    if(ti == 22){
    abis4.setTimeslot22E1("dap","","","","");
    }

    if(ti == 23){
    abis4.setTimeslot23E1("dap","","","","");
    }

    if(ti == 24){
    abis4.setTimeslot24E1("dap","","","","");
    }

    if(ti == 25){
    abis4.setTimeslot25E1("dap","","","","");
    }

    if(ti == 26){
    abis4.setTimeslot26E1("dap","","","","");
    }

    if(ti == 27){
    abis4.setTimeslot27E1("dap","","","","");
    }

    if(ti == 28){
    abis4.setTimeslot28E1("dap","","","","");
    }

    if(ti == 29){
    abis4.setTimeslot29E1("dap","","","","");
    }

    if(ti == 30){
    abis4.setTimeslot30E1("dap","","","","");
    }

    if(ti == 31){
    abis4.setTimeslot31E1("dap","","","","");
    }

  ti++;

  }

}
}
  
String n ="";
for(int i = 0; i < Inf.trx.size(); i++){

if(Inf.pcm.get(i).equals(pcm4)){
  
String e = Inf.dap.get(i).trim();

  if(Inf.gtrx.get(i).equals("Y") & !e.equals("N")){
    n += Inf.trx.get(i) + " ";
  }
}
}

abis4.EDAP.setText(n);

abis4.ShowAbis();

}

}
