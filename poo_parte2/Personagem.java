public class Personagem{
     String nome;
     int energia = 10;
     int fome =0;
     int sono= 0;

 void cacar(){
    if(energia>=2) {
     System.out.printf("%s caçando\n", nome);
     energia -=2; //energia = energia -2
    }else{ 
        System.out.printf("%s sem energia para caçar", nome);

        // fome +=1 fome++ ++fome
        if(fome<10)
        fome = fome +1;

        //sono = sono +1 > ? sono : sono + 1;
        sono = sono == 10 ? sono  sono + 1;
    }
 }
 void comer(){
    if(fome>=1){
     System.out.printf(nome + " comendo\n");
     energia = Math.min(energia + 1,10);
     fome -=1;
    }
    else{
        System.out.printf(nome +" sem fome");
    }
 }
 void dormir(){
    if(sono>=1){
     System.out.printf(nome + " dormindo\n");
     //operaçao ternaria
     energia = energia == 10 ? energia : energia + 1;
     //energia = Math.min(energia + 1, 10);
     sono -=1;
    
    }
    else{
        System.out.printf(nome + " sem sono");
    }

 }
}