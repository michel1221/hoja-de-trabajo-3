//Michel Ramirez Najera 
//carné:14069
// Luis Eduardo Ruano
// carné: 
// Luis Pedro Velazques
// carné:
// Maria jose 
// Carné: 

import java.io.*;
import java.util.Random;
import java.lang.*;

public class generar2{


public static void main(String[] args) {
	BufferedReader bf = null;
	FileWriter fichas= null;
	PrintWriter pw = null;
	Random rand;
	rand =  new Random ();
	int x;
	grupoComparable [] arreNum= new grupoComparable[3000];
	try{
		fichas= new FileWriter("datos.txt");
		pw= new PrintWriter(fichas);
		
		for (int i=0; i< 3000; i++){
			x=rand.nextInt(3000-1);
			pw.println(x);
		}
	}
	catch (Exception e){
		System.err.println("no existe el archivo");
	}
	
	finally{
		try{
			if (null!= fichas)
				fichas.close();
		}
		catch(Exception e){
		 e.printStackTrace();
		}
	}
	
	try{
		bf= new BufferedReader(new FileReader("datos.txt"));
		String lector="";
		int y=0;
		while((lector= bf.readLine()) != null){
		Integer dat= Integer.parseInt(lector);
		arreNum [y]= new grupoComparable(dat);
		y=y+1;
		
		}
		
		}
	catch(Exception e ){
			System.err.println("no metiste un archivo correcto");
		}
		
	Sorting.quicksort(arreNum);
	try{
		fichas= new FileWriter("resultado.txt");
		pw= new PrintWriter(fichas);
		
		for (int i=0; i< 3000; i++){
			Integer z= arreNum[i].getNumero();
			pw.println(z);
		}
	}
	catch (Exception e){
		System.err.println("no existe el archivo");
	}
	
	finally{
		try{
			if (null!= fichas)
				fichas.close();
		}
		catch(Exception e){
		 e.printStackTrace();
		}
	}
	
		
	
}
}