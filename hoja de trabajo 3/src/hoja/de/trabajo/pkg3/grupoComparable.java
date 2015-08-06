public class grupoComparable implements Comparable{

Integer num1;

public grupoComparable( Integer numrand){
num1= numrand;

}

public int compareTo (Object ot ){

 int result;
 
 Integer otroNum= ((grupoComparable)ot).getNumero();
 
 result = num1.compareTo(otroNum);
 
 return result;

}

public Integer getNumero(){
	return num1;	
}


}