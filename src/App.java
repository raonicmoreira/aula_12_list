import java.util.ArrayList;
import java.util.List;

import modelo.Motorista;
import modelo.Passageiro;
import modelo.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {


        List<String> listaString = new ArrayList<>();
        List<Integer> listaInterger = new ArrayList<>();

          // lista de motorista só podemos add passageiros
        List<Motorista> motoristas = new ArrayList<>();
    
        // lista de passageiro só podemos add passageiros
        List<Passageiro> passageiros = new ArrayList<>();

        // lista generica pois Pessoa é superclass então 
        // podemos add Motorista e Passageiro que herdam de Pessoa
        List<Pessoa> pessoas = new ArrayList<>();

        // método add() adiciona objeto por objeto na lista
        pessoas.add(new Motorista("joão", "9999999999"));
        pessoas.add(new Passageiro("Maria", "2562626262"));


        // método size() retorna o tamanho da lista
        System.out.println("Tamanho da Lista é :" + pessoas.size());

        // método contains() verifica se o objeto já está na lista
        // lembrar de implementar o hashCode e equals, gerador da IDE
        if(pessoas.contains(new Motorista("Motorista 2", "9999999999"))){
            System.out.println("já existe pessoa com esse CPF!");
        }else{
            System.out.println("Pessoa não localizada");
        }

        // método remove() remove o elemento pelo index ou objeto.
        Pessoa p = pessoas.remove(0);
        System.out.printf("A pessoa %s foi removida! A lista agora possui %d pessoas. \n",
         p.getNome(), pessoas.size() );


         List<Pessoa> novasPessoas = new ArrayList<>();
         novasPessoas.add(new Motorista("motorista 3", "1111"));
         novasPessoas.add(new Motorista("motorista 4", "2222"));

         // método addAll() adiciona uma lista a outra.
         pessoas.addAll(novasPessoas);

         System.out.println("Qual o tamanho da lista depois de add a nova lista : " + pessoas.size());

         System.out.println("-----------------------------------------------------");;

         System.out.println("Qual o tamanho da nova lista : " + novasPessoas.size());


         // para verificar a forma de impressão da pessoa é no método toString da classe Pessoa
         for (Pessoa pessoa : pessoas) {
             System.out.println(pessoa + " e o tipo é : " + pessoa.getClass().getSimpleName());
         }





    }
}
