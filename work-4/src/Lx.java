
public class Lx extends Polx{
	private String min;
	private String max;

	public Lx(int Id, int nomer,int kolvochelovek,int price,String stand,String min,String max) {
        super(Id, nomer, kolvochelovek, price,min,max);
        	
   this.min=min;
   this.max=max;}	

	public String getmin() {
		return min;
}

	public String getmax() {
		return max;
}
	 public void setmin(String min) {
	        this.min = min;
	}
	 public void setmax(String max) {
	        this.max = max;
}
	 
@Override
public String toString() {
    return "����� " + getnomer() +
            '\n' +"����"+'\n'+"��� ���� �����-"+min+'\n'+"���� ���� �����-"+max+'\n';
    }// � ������� ������� ����� ������� � � ���
}
