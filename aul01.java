
import java.util.Scanner;
import java.lang.Math;
import java.time.LocalTime;
public class aul01 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

     exe1();
     exe2();
     exe3();
     exe4();
     exe5();
     exe6();
     exe7();
     exe8();
     exe9();
     exe10();



    }


    private static void exe1(){
        // 1
        System.out.println("28*43=" + 28 * 43);

    }
    private static void exe2(){
        //2

        float media = media3(entrada.nextFloat(),
                entrada.nextFloat(),
                entrada.nextFloat());

        System.out.println("Media: " + media);
    }

    private static void exe3(){
        //3
        int num = entrada.nextInt();
        System.out.println((num-1) +" "+num+ " "+(num+1));

    }
    private static void exe4(){
        //4
        int num;
        num = entrada.nextInt();
        int num0 = entrada.nextInt();
        System.out.println(num+num0);

    }
    private static void exe5(){
        //5

        float fnum = entrada.nextInt();

        System.out.println((fnum/3));

    }
    private static void exe6(){

        //6
        double media;
        media = mediaPond(entrada.nextFloat(),
                entrada.nextFloat(),
                entrada.nextFloat(),
                entrada.nextFloat());

        System.out.println("Media Ponderada: " + media);
    }
    private static void exe7(){
        //7

        double saldo = entrada.nextDouble();
        System.out.println(saldo*1.1);

    }
    private static void exe8(){
        //8

        double base = entrada.nextDouble();
        double altura = entrada.nextDouble();

        System.out.println("Área: "+(base*altura));
        System.out.println("Perímetro: "+(base+altura)*2);

    }

    private static void exe9(){
        //9
        double raio = entrada.nextDouble();

        System.out.println("Perímetro: "+raio*Math.PI*2);
        System.out.println("Area: "+raio*raio*Math.PI);

    }

    private static void exe10(){
        //10
        LocalTime now = LocalTime.now();
        System.out.println(now.getHour()*60+now.getMinute());

    }



    private static float media3(float x, float y, float z){
        return (x+y+z)/3;
    }

    private static float mediaPond(float x, float y, float z, float k){
        return (x*1+y*2+z*3+k*4)/10;
    }

}
