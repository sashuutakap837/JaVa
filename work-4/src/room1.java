import java.io.*;
import java.util.Scanner;
public class room1 extends rooms{
    public room1(int Id, int nomer,int kolvochelovek,int price) {
        super(Id, nomer, kolvochelovek, price);
    }

    public void show(){
        try {
            File file = new File("Room.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            System.out.println("—писок гостиницы: ");
            while (line != null) {
                System.out.println(line+"\n");
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String add() {
        Scanner in = new Scanner(System.in);
        System.out.println("¬ведите Id: ");
        String newPacient = in.nextLine();
        try (FileWriter writer = new FileWriter("Room.txt", true)) {
            writer.write(newPacient);
            writer.append('\n');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return newPacient;
    }
}