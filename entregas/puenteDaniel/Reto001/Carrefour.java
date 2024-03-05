package entregas.puenteDaniel.Reto001;

import java.util.Scanner;

public class Carrefour{
    public static void main(String[] args) {
        int minuto, hora=0, nuevo;
        int caja1=0, caja2=0, caja3=0, caja4=0, cola=0;
        int ultimaHora=12, clientesAtendidos = 0, productosVendidos = 0, minutosSinCola = 0;
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
                        if (cola >= 1 && caja1 <= 0){
                            int articulo = (int) (Math.random()*10)+5;
                            caja1 += articulo;
                            cola--;
                        }
                        if (cola>=1 && caja2 <=0){
                            int articulo = (int) (Math.random()*10)+5;
                            caja2 += articulo;
                            cola--;
                        }
                        if (cola>=1 && caja3 <=0){
                            int articulo = (int) (Math.random()*10)+5;
                            caja3 += articulo;
                            cola--;
                        }
                        if (cola>=1 && caja4 <=0){
                            int articulo = (int) (Math.random()*10)+5;
                            caja4 += articulo;
                            cola--;
                        }
                        System.out.println("MINUTO"+ minuto);
                        if(nuevo !=0 ){
                            System.out.println("- Llega " + nuevo + "cliente");
                        } else {
                            System.out.println(" - No llega ningún cliente");
                        }
                        System.out.println("- Hay " + cola + "clientes en la cola");
                        if (caja1Libre){
                            System.out.println("Caja1: " + caja1);
                        } else System.out.println(" Caja1 : Cerrada");
                        if (caja2Libre){
                            System.out.println("Caja2: " + caja1);
                        } else System.out.println(" Caja2 : Cerrada");
                        if (caja3Libre){
                            System.out.println("Caja3: " + caja1);
                        } else System.out.println(" Caja3 : Cerrada");
                        if (caja4Libre){
                            System.out.println("Caja4: " + caja1);
                        } else System.out.println(" Caja4 : Cerrada");
                        System.out.println("-----------------------------------------------------------------------------");
                            if (cola == 0){
                                minutosSinCola++;
                            }
                        }
                        if (hora == ultimaHora) {
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("Resumen cierre de tienda");
                            System.out.println("Clientes atendidos: " + clientesAtendidos);
                            System.out.println("Productos vendidos: " + productosVendidos);
                            System.out.println("Clientes sin atender en la cola: " + cola);
                            System.out.println("Minutos sin cola: " + minutosSinCola);
                            System.out.println("-----------------------------------------------------------------------------");
                            System.out.println("CIERRE DE TIENDA");
                            System.out.println("-----------------------------------------------------------------------------");
                        }
        
                    }
                } else {
                    System.out.println("-----------------------------------------------------------------------------");
                    System.out.println("EL SUPERMERCADO HA PERMANECIDO CERRADO");
                    System.out.println("-----------------------------------------------------------------------------");
                }
                s.close();
                    
                
            
    }
}