import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        float f = Float.parseFloat(JOptionPane.showInputDialog("Dame un numero"));
        Conversor obx = new Conversor();
        try{
            obx.C2FnR(f);
        }
        catch (HeatError e){
            System.out.println(e.getMessage());
        }
    }
}