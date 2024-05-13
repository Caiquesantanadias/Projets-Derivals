public class Caneta {

 String modelo;
 String cor;
 float ponta;
 int carga;
 boolean tampada;

 void rabiscar () {

  if (tampada == true) {
   System.out.println("Erro , impossivel rasbiscar, a caneta esta tampada ");
  } else {

   System.out.println("Otimo, voce pode rabiscar avontade ");
  }
 }

  void tampar() {
   this.tampada = true;
  }

  void destampar () {
  this.tampada = false;
  }


  void estatos () {
   System.out.println("a caneta e da marca : " + modelo);
   System.out.println("a cor da caneta e : " + cor);
   System.out.println("A caneta esta tampada ? "+ tampada);
   System.out.println(" Preciso saber qual e a carga da caneta, qual e a quantidade de carga ? " + carga);
  }



 }









//  void rabiscar () {
//  if (tampada == true) {
//   System.out.println("erro nao posso Rabiscar , por que a caneta esta Tampada");
//  } else {
//   System.out.println("aeee , estou rasbiscando !!!");
//  }
// }





