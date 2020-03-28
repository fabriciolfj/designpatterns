package br.com.patterns.operacoes;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimulacaoPeek {

  /**para o peek funcionar, ele nao pode ser a operaçao final do pipeline  e sim a intermediaria, o objeto dele e mostrar os dados durante o processo intermediario.
   * */
  public static void main(String[] args) {
    Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
    List<String> result  = nameStream.peek(System.out::println).collect(Collectors.toList());

    System.out.println(result.size());
  }
}
