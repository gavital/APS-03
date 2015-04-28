/************************************************************************
 * Classe do objeto Sorts
 * Responsável Principal: Todo mundo
 * -- Cada um será responsável por criar um método dentro deste arquivo.
 *
 * Essa classe será a responsável por organizar os arquivos, independentemente
 * do tipo de sort.
 *
 * A classe é um conjunto de Métodos de Sort:
 *  -Recebe o ArrayList<imagem> imagens;
 *  -Retorna o ArrayList<imagem> imagensOrdenadas;
 ************************************************************************/
 import java.util.Arrays;
 import java.util.ArrayList;

public class Sorts{

  //método de exemplo
  //não se esqueça do "public static!"m mude apenas o nome exemplo sort e o comentario dentro do método...
  public static ArrayList<Imagem> exemploSort(ArrayList<Imagem> imagens){ //retorna um ArrayList de Imagem, mas usa 'imagens' como parametro
    //algoritimo de ordenação aqui
    imagens.get(0).getNome; //se você for ordenar por nome, use esse método, lembre-se de usar um for e ao invés de 0 use uma variável (lembre-se isso é igual a um array)
    imagens.get(0).getTamanhoBytes; //se for usar para ordenar por tamanho de arquivo (o mais fácil)
    return imagens;
  }

 // ********  ARRUMAR
 // shellsort: calcular o tamanho do salto inicial (tamanho total da lista/2) e comparar até chegar no fim da lista
 // divide de novo o valor do salto, compara até chegar no fim da lista. Faz isso até chegar no tamanho 1.
 public static void shellSort(ArrayList<Imagem> imagens){
	  // cria laço de repetição para calcular o valor dos "pulos" (gap)
	  for(int gap = imagens.size()/2; gap > 0; gap /= 2){
		  
		  // laço de repetição para comparar e organizar os valores
		  for (int i = gap; i < imagens.size(); i++){ // percorrendo a lista
		  // rever a partir daqui
			  long val = imagens.get(i).getTamanhoBytes();
			  int j;
			  for (j = i; j >= gap && imagens.get(j-gap).compareTo(val) > 0; j -= gap){ // arrumar essa linha
				  Imagem t = imagens.get(j - gap); 
			  }
		  }
	  }
	  
	  
  //coloque outros métodos aqui
}
