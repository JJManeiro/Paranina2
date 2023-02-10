/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Library;
import boletin24.Methods;
import boletin24.NullTextException;
import com.yo.datos.PedirDatos;
import java.util.ArrayList;

/**
 *
 * @author dam1
 */
public class Boletin24 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        Methods L = new Methods();
        ArrayList Lib= new ArrayList();
        int option=0;   
            do{
               try{ 
                option=PedirDatos.pedirInt("1 add\n2 show\n3 look\n4 sell\n5 delete\n6 check\n0 leave.");
                switch(option){
                    case 1: L.Alist(Lib);
                        break;
                    case 2: L.show(Lib);
                        break;
                    case 3: L.consult(Lib);
                        System.out.print("\n");
                        break;
                    case 4: L.sell(Lib);
                        System.out.print("\n");
                        break;
                    case 5: L.delete(Lib);
                        break;
                    case 6: L.check(Lib);
                        break;
                }
            }
            catch (NullTextException ex){
                System.out.println(ex.getMessage());
            }
            catch (Exception e){
            System.out.println("Parameter/Search error"); 
            }
        } while(option!=0);
            System.out.println("Have a good day!");
    }
}
