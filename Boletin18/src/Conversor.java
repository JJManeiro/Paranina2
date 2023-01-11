public class Conversor {
    public static final float t= 80f;
    public void C2FnR (float n) throws HeatError{
        if (n<t){
            throw new HeatError ("Menor a 80");
        }
        float cf = (float) ((n*1.8)+32.4);
        float cr = (float) (n*0.8);
        System.out.println("Temperatura: "+n+" Celsius");
        System.out.println("Temperatura: "+cf+" Fahrenheit");
        System.out.println("Temperatura: "+cr+" Reamur");
    }
}
