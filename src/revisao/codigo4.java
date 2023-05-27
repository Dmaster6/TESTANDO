package revisao;

import javax.swing.JOptionPane;  
class codigo4{  

	public static void main (String []args){  
		  
		int x = 0, impar=0;
		int i, mp, si, totalPar;
		Long par = new Long(0);
		  
		for(i=0; i<30; i++){  
		  
		if(i%2==0){  
		  
		    if(i>2){  
		  
		    par = par*i;  
		  
		    }  
		      
		    else{  
		    par = new Long(i);  
		    }  
		  
		}  
		  
		else{  
		  
		impar = impar+i;  
		}  
		  
		  
		}  
		  
		JOptionPane.showMessageDialog(null, "Soma dos �mpares �: "+impar);  
		JOptionPane.showMessageDialog(null, "Multiplica��o dos pares �: "+par); 
	}
	}
	