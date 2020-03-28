package br.com.patterns.operacoes;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Optional;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class SimulacaoOptional {

  public static void main(String[] args) {
    new SimulacaoOptional().optionalNulo();
  }


  private void optionalNulo() {

    String value = "n\\Isgalamido\\t\\model\\uriel/zael\\";
    String[] test = value.split("n\\\\")[1].split("\\\\t");

    for(int i = 0; i< test.length; i ++) {
      System.out.println(test[i]);
    }


    /*YearMonth yearMonth = YearMonth.parse("2020-03");
    System.out.println(yearMonth);
    System.out.println(YearMonth.now());*/
    //LocalDate antes = LocalDate.of(2020, 1, 1);
    /*Instant date = Instant.now();
    System.out.println(date);
    LocalDate localDate = LocalDate.ofInstant(date, ZoneOffset.UTC);
    YearMonth teste = YearMonth.from(localDate);
    System.out.println(teste);*/

    //Optional<Long> result = Optional.of(1L).filter(d -> d == 1L);

//    System.out.println(result.isEmpty());

    //Optional.ofNullable(getNome()).flatMap(this::print).orElseThrow(() -> new RuntimeException("Valor nulo"));
    //Optional.of("teste").flatMap(this::print).orElseThrow(() -> new RuntimeException("Valor nulo"));
    //Optional.of("teste").map(this::print2).orElseThrow(() -> new RuntimeException("Valor nulo2"));
    //Optional.of("teste").stream().forEach(System.out::println);
    //Optional.ofNullable(getNome()).ifPresentOrElse(c -> System.out.println(c), () -> printError());
    //getName().map(this::print).orElseGet(() -> print("Sem nome"));
    /*Pattern pattern = Pattern.compile("((w{8})(w{4})(w{4})(w{4})(w{12}))");
    String value = "6277c89da16c4524bb8cadcafae08cb7";
    //String value = customerId.split(":")[1];
    String result = UUID.fromString(String.format("%s-%s-%s-%s-%s", value.substring(0,8), value.substring(8,12), value.substring(12,16), value.substring(16,20), value.substring(20,32))).toString();

    Matcher result2 = pattern.matcher(value);
    System.out.println(result);
    System.out.println(result2);*/
  }

  private void printError() {
    System.out.println("Falha, objeto nulo.");
  }

  private String getNome(){
    return "teste";
  }

  private Optional<String> print(String nome){
    System.out.println(nome);
    return Optional.of(nome);
  }

  private Optional<String> getName(){
    return Optional.ofNullable(null);
  }

  private String print2(String nome){
    System.out.println(nome);
    return nome;
  }



}
