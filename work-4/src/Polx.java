
public class Polx extends Standart{
private String polu;

	public Polx(int Id, int nomer,int kolvochelovek,int price,String stand, String polu) {
        super(Id, nomer, kolvochelovek, price, polu);
        	
   this.polu=polu;}
   
	public String getpolu() {
		return polu;
		
}
	 public void setpolu(String polu) {
	        this.polu = polu;
	        
}

	 @Override
	 public String toString() {
	     return "Полулюкс"+polu+'\n';}
}
