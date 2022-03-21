import java.util.Scanner;
public class TabuadaFor {
    public static void main(String[] args){
        int idades[] = new int[11];

        Scanner sc=new Scanner(System.in);
        System.out.println("Digite o número");
        int tabuada=sc.nextInt();
        for (int i=0; i< idades.length; i++){
            idades[i]=tabuada*i;
        }

        for(int i: idades){
            System.out.println(i);
        }
    }
    
}
//Tabuada com For mais simples com usuario digitando o número