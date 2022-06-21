
public class test {
	public static void main (String[] args){
		
        rooms pol1 = new rooms(555,55,2,2500);
        System.out.println(pol1);
        room1 Pol11=new room1(pol1.getId(), pol1.getnomer(),
                pol1.getkolvochelovek(),pol1.getprice());
        System.out.println(Pol11);
        standart Pol12 = new standart(pol1.getId(), pol1.getnomer(),
                pol1.getkolvochelovek(),pol1.getprice(),"-");
        System.out.println(Pol12);
        Polx pol13 = new Polx(pol1.getId(), pol1.getnomer(),
                pol1.getkolvochelovek(),pol1.getprice(),
                Pol12.getstandart(),
                "-");
        System.out.println(pol13);
        Lx l20 = new Lx(pol1.getId(), pol1.getnomer(),
                pol1.getkolvochelovek(),pol1.getprice(),
                pol13.getpolu(), 
                "1 день", "7дней");
        System.out.println(l20);
        
        String newRoom= Pol11.add();
        Pol11.show();
    }
}
