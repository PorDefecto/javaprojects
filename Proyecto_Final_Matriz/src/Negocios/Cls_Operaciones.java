/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocios;


import javax.swing.table.DefaultTableModel;

/**
 *
 * @author PorDefecto
 */
public class Cls_Operaciones {

 public void datotabla(int nf, int nc,String m[][],DefaultTableModel modelo){
         for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                m[i][j]=String.valueOf(modelo.getValueAt(i,j));
            }
        } 
    }
 //////////////
 public void datotablados(int nf, int nc,double m[][],DefaultTableModel modelo){
         for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                m[i][j]=Double.parseDouble(String.valueOf(modelo.getValueAt(i,j)));
            }
        } 
    }
 /////////
    public void sumar(int nf, int nc,String m[][],String mm[][],String suma[][] ){
       
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                suma[i][j]=String.valueOf(Integer.parseInt(m[i][j])+Integer.parseInt(mm[i][j]));
            }
        }
    }
     public void restar(int nf, int nc,String m[][],String mm[][],String suma[][] ){
       
        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                suma[i][j]=String.valueOf(Integer.parseInt(m[i][j])-Integer.parseInt(mm[i][j]));
            }
        }
    }
     public void multiplicar(int Afila,int Bcol,int Acol,String A[][],String B[][],String C[][]){                
                for(int i = 0; i <  Bcol; i++){
                    for(int j = 0; j < Afila ; j++){
                        for(int k = 0; k < Acol ; k++){
                            if(C[j][i] == null){
                                C[j][i]="0";
                            }
                             C[j][i] = String.valueOf(Double.parseDouble(C[j][i]) + (Double.parseDouble(A[j][k]) * Double.parseDouble(B[k][i]))); 
                        }
                    }
                }

     }
     public void inversa(int Afila,int Bcol,int Acol,double A[][],double B[][],String C[][]){                
                for(int i = 0; i <  Bcol; i++){
                    for(int j = 0; j < Afila ; j++){
                        for(int k = 0; k < Acol ; k++){
                            if(C[j][i] == null){
                                C[j][i]="0";
                            }
                             C[j][i] = String.valueOf(Double.parseDouble(C[j][i]) + ((A[j][k]) * B[k][i])); 
                        }
                    }
                }
                
                
               

     }
      public void escalar(int nf, int nc,String m[][],DefaultTableModel modelo,double scalar,String divide[][]){
                     for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                 divide[i][j]=String.valueOf(Double.parseDouble(m[i][j])/scalar);
            }
        } 
                }
}
