package asdfasdfasdf;

import java.util.Scanner;

public class App {

public static void main(String[] args){ 
    Scanner leitor = new Scanner(System.in); 
    int t = leitor.nextInt(); 
   

        int[] vetor =  new int[10];

        for(int i = 0 ; i < vetor.length; i++ ){
          for(int j = 0; j < t; j++){
            if(2<= t && t <= 50){
            	if(i < vetor.length) {
            	vetor[i] = j;
            	System.out.println("N[" + i + "] = "+ vetor[i]);
            	}
                i++;                
            }
        }
          i--;
    }
        leitor.close();
}
}