package br.com.patterns.operacoes;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimulacaoAsync {
 //whenCompleteAsync  quando acaabar a execução.

  /**
   *     private void processCache(final CustomerVO customerPackage) {
   *         validateServicePackage(customerPackage);
   *         CompletableFuture.supplyAsync(() -> customerService.processCache(customerPackage))
   *                 .whenCompleteAsync(this::registerComplete);
   *     }
   *
   *     private void registerComplete(final CustomerVO customer, final Throwable throwable) {
   *         if (throwable == null) {
   *             log.info("customer={} status=cached ", customer.getCustomerId());
   *             NewRelic.addCustomParameter(NewRelicKey.CUSTOMER_CACHED.getValue(), 1);
   *         } else {
   *             log.error("customer={} status=not_cached ", customer.getCustomerId(), throwable);
   *             NewRelic.addCustomParameter(NewRelicKey.CUSTOMER_NOT_CACHED.getValue(), 1);
   *         }
   *     }
   * }
   * @param args
   * @throws InterruptedException
   * @throws ExecutionException
   */
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    Future<String> result = new SimulacaoAsync().calculateAsync();
    System.out.println(result.get());
    //new SimulacaoAsync().usandoApplyAssincrono();
  }

  private void comErro() throws ExecutionException, InterruptedException {
    String name = null;

    CompletableFuture<String> completableFuture
        =  CompletableFuture.supplyAsync(() -> {
      if (name == null) {
        throw new RuntimeException("Computation error!");
      }
      return "Hello, " + name;
    });

    System.out.println(completableFuture.get());

  }

  private void processandoTodosOsFuturuEdepoisMostrarOResultado(){
    CompletableFuture<String> future1
        = CompletableFuture.supplyAsync(() -> "Hello");
    CompletableFuture<String> future2
        = CompletableFuture.supplyAsync(() -> "Beautiful");
    CompletableFuture<String> future3
        = CompletableFuture.supplyAsync(() -> "World");

    String combined = Stream.of(future1, future2, future3)
        .map(CompletableFuture::join)
        .collect(Collectors.joining(" "));

    System.out.println(combined);
  }

  private void processandoTodosOsFuturus()
      throws ExecutionException, InterruptedException {
    CompletableFuture<String> future1
        = CompletableFuture.supplyAsync(() -> "Hello");
    CompletableFuture<String> future2
        = CompletableFuture.supplyAsync(() -> "Beautiful");
    CompletableFuture<String> future3
        = CompletableFuture.supplyAsync(() -> "World");

    CompletableFuture<Void> combinedFuture
        = CompletableFuture.allOf(future1, future2, future3);

    System.out.println(future1.isDone());
    System.out.println(future2.isDone());
    System.out.println(future3.isDone());
    System.out.println(combinedFuture.get());
  }

  /**
   *
   * O método thenCompose () é semelhante ao thenApply (),
   * pois ambos retornam um novo estágio de conclusão. No entanto, thenCompose () usa o estágio anterior como argumento. Ele achatará e retornará um futuro diretamente com o resultado, em vez de um futuro aninhado, como observamos em thenApply ()
   */

  private void usandoCompose() throws ExecutionException, InterruptedException {
    CompletableFuture<Integer> compose = CompletableFuture.supplyAsync(() -> 10);
    CompletableFuture<Integer> finalResult = compose.thenCompose(s -> compose);
    System.out.println(finalResult.get());
  }



  /*
  Este método é usado para trabalhar com um resultado da chamada anterior. No entanto, um ponto importante a ser lembrado é que o tipo de retorno será combinado de todas as chamadas.
  * */
  private void usandoApply() throws ExecutionException, InterruptedException {
    CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 1);
    CompletableFuture<Integer> future = completableFuture.thenApplyAsync(s -> s + 1);
    System.out.println(future.get());
  }

  /*
 Este método é usado para trabalhar com um resultado da chamada anterior. No entanto, um ponto importante a ser lembrado é que o tipo de retorno será combinado de todas as chamadas.
 * */
  private void usandoApplyAssincrono() throws ExecutionException, InterruptedException {
    CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> 1);
    CompletableFuture<Integer> future = completableFuture.thenApplyAsync(s -> s + 1);
    System.out.println(future.get());
  }

  /*
  Um caso mais simples é quando você deseja fazer algo com dois resultados futuros,
  mas não precisa passar nenhum valor resultante para uma cadeia futura. O método thenAcceptBoth existe para ajudar
  */
  private void combinandoSemRetorno() throws ExecutionException, InterruptedException {
    CompletableFuture future = CompletableFuture.supplyAsync(() -> "Hello")
        .thenAcceptBoth(CompletableFuture.supplyAsync(() -> " World"),
            (s1, s2) -> System.out.println(s1 + s2));

    future.get();
  }

  /*Se você deseja executar dois futuros independentes e fazer algo com seus resultados,
    use o método thenCombine que aceita um futuro e uma função com dois argumentos para processar os dois resultados
  */
  private void combinandoCompletableFuture() throws ExecutionException, InterruptedException {
    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello")
        .thenCombine(CompletableFuture.supplyAsync( () -> " World."), (s1, s2) -> s1 + " teste " + s2);
    System.out.println(future.get());
  }

  private void semNecessidadeRetornarValorNaCadeia()
      throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");
    CompletableFuture<Void> future = completableFuture.thenAccept(s -> System.out.println("Computation retorned: " + s));
    future.get();
  }

  private void valorRetornadoDeUmaFuncao() throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello");
    CompletableFuture<String> future = completableFuture.thenApply(s -> s + " World");
    System.out.println(future.get());
  }

  private void compondo2CompletableFuture() throws ExecutionException, InterruptedException {
    CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello")
        .thenCompose(s -> CompletableFuture.supplyAsync(() -> s + "World"));

    System.out.println(completableFuture.get());
  }


  private Future<String> calculateAsync() throws InterruptedException {
    /*CompletableFuture<String> completableFuture = new CompletableFuture<>();

    Executors.newCachedThreadPool().submit(() -> {
      Thread.sleep(500);
      completableFuture.complete("hello");
      return null;
    });

    return completableFuture;
  }*/
  //  return CompletableFuture.completedFuture("Hello");
    /*apenas executando um codigo de forma assincrona, sem os codigos cliche
    * */
    CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "Hello");
    return future;
  }

}
