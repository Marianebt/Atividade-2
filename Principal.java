public class Principal {
 public static void main (String [] args){
     Aviao aviao = new Aviao(10, 900);
     aviao.mostraAltitude();
     aviao.diminuirAltitude(1);
     aviao.diminuirvelocidade(100);
     aviao.mostraAltitudevelocidade();
 }
}