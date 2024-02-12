package entregas.puenteDaniel.Reto001;

import java.util.Scanner;

public class Carrefour{
    public static void main(String[] args) {
        int minuto, hora=0, nuevo;
        int caja1=0, caja2=0, caja3=0, caja4=0, cola=0;
        int ultimaHora=12, clientesAtendidos=0, productosVendidos=0, minutosSinCola=0;
        float porcentaje = 0.4f;

        boolean caja1Libre, caja2Libre, caja3Libre, caja4Libre;
        boolean superAbierto = true;

        Scanner s = new Scanner(System.in);
        System.out.println("Bienvenido administrador");
        System.out.println("Desea abrir la caja 1 (1=si, 0=no)");
            if(s.nextInt()==1){
                caja1Libre = true;
            }else
                caja1Libre = false;
        System.out.println("Desea abrir la caja 2 (1=si, 0=no)");
            if(s.nextInt()==1){
                caja2Libre = true;
            }else
                caja2Libre = false;
        System.out.println("Desea abrir la caja 3 (1=si, 0=no)");
            if(s.nextInt()==1){
                caja3Libre = true;
            }else
                caja3Libre = false;
        System.out.println("Desea abrir la caja 4 (1=si, 0=no)");
            if(s.nextInt()==1){
                caja4Libre = true;
            }else
                caja4Libre = false;
            
            if(!caja1Libre && !caja2Libre && !caja3Libre && !caja4Libre){
                System.out.println("No hay cajas abiertas");
                System.out.println("Desea cerrar el supermercado (1=si, 0=no)");
                    if(s.nextInt()==1){
                        superAbierto = false;
                }else{
                    superAbierto = true;
                    System.out.println("Caja1 abierta");
                    caja1Libre = true;
                }
            }
            if (superAbierto){
                for (hora=0; hora<=ultimaHora; hora++){
                    System.out.println("-----------------------------------------------------------------------------");
                    if (hora==0){
                        System.out.println("09:00 - Apertura del supermercado");
                    } else if (hora==1){
                        System.out.println("10:00");
                    } else if (hora==2){
                        System.out.println("11:00");
                    } else if (hora==3){
                        System.out.println("12:00");
                    } else if (hora==4){
                        System.out.println("13:00");
                    } else if (hora==5){
                        System.out.println("14:00");
                    } else if (hora==6){
                        System.out.println("15:00");
                    } else if (hora==7){
                        System.out.println("16:00");
                    } else if (hora==8){
                        System.out.println("17:00");
                    } else if (hora==9){
                        System.out.println("18:00");
                    } else if (hora==10){
                        System.out.println("19:00");
                    } else if (hora==11){
                        System.out.println("20:00");
                    } else if (hora==12){
                        System.out.println("21:00 - Cierre del supermercado");
                    }
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("");
                    for(minuto = 1; minuto <= 60 ;minuto++){
                        if (caja1Libre && caja1 > 0) {
                            caja1--;
                            productosVendidos++;
                            if (caja1 <=0 ){
                                caja1 = 0;
                                clientesAtendidos++;
                            }
                        }
                        if (caja2Libre && caja2 > 0) {
                            caja2--;
                            productosVendidos++;
                            if (caja2 <= 0){
                                caja2 = 0;
                                clientesAtendidos++;
                            }
                        }
                        if ( caja3Libre && caja3 > 0) {
                            caja3--;
                            productosVendidos++;
                            if (caja3 <= 0){
                                caja3 = 0;
                                clientesAtendidos++;
                            }
                        }
                        if ( caja4Libre && caja4 > 0) {
                            caja4--;
                            productosVendidos++;
                            if ( caja4 <= 0 ){
                                caja4 = 0;
                                clientesAtendidos++;
                            }
                        }
                        nuevo = 0;
                        if (Math.random() <= porcentaje) {
                            cola++;
                            nuevo = 1;
                        }
                        
                    }
                }
            }
    }
}