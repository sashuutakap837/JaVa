
public class standart extends rooms {
	private String stand;

	public standart(int Id, int nomer,int kolvochelovek,int price, String stand) {
        super(Id, nomer, kolvochelovek, price);
        	
   this.stand=stand;}
   
	public String getstandart() {
		return stand;
		
	}
	 public void setstand(String stand) {
	        this.stand = stand;}
@Override
public String toString() {
    return "Стандартный"+stand+'\n';}
}
