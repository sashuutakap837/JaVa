
public class Room {
	public class Room {
		private int cod;
		private String surname;
		private String name;
		private int number;
		private int type;
		private int data1;
		private int data2;
		private int quantity;
		private int price;

		public Room(int cod, String surname, String name, int number, int type, int data1, int data2, int quantity, int price){
		this.cod=cod;
		this.surname=surname;
		this.number=number;
		this.type=type;
		this.data1=data1;
		this.data2=data2;
		this.quantity=quantity;
		this.price=price;

		}
		public int getcod(){
		return cod;
		}
		public void setcod(int cod){
		this.cod=cod;
		}
		public int getsurname(){
		return surname;
		}
		public void setsurname(int surname){
		this.surname=surname;
		}
		public int getnumber(){
		return number;
		}
		public void setnumber(int number){
		this.number=number;
		}
		public int gettype(){
		return type;
		}
		public void settype(int type){
		this.type=type;
		}
		public int getdata1(){
		return data1;
		}

		public void setdata1(int data1){
		this.data1=data1;
		}
		public int getdata2(){
		return data2;
		}

		public void setdata2(int data2){
		this.data2=data2;
		}
		public int getquantity(){
		return quantity;
		}

		public void setquantity(int quantity) {
		this.quantity=quantity;
		}
		public int getprice(){
		return price;
		}

		public void setprice(int price) {
		this.price=price;
		}

		public String toString(){
		return "��� �������-"+cod+"\n"+"������� �������-"+surname+"\n"+"�������� ����������-"+name +"\n"+"�����-"+number+"\n"+"��� �����-"+type+"\n"+"���� ������-"+data1+"\n"+"���� ������-"+data2+"\n"+"���������� �������-"+quantity+"\n"+"����-"+price+"\n";
		}
		} 

}
