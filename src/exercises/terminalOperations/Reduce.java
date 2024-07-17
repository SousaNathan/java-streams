package exercises.terminalOperations;

import entity.Client;
import entity.Product;
import mock.Mock;

// Utilizando a operação terminal 'REDUCE', desenvolva as soluções para:
public class Reduce {

    // 1) Retornar a soma das idades de todos os clientes
    public static void exercise1() {
        var clients = Mock.clients();

        var result = clients.stream()
                .map(Client::getAge)
                .reduce(Integer::sum);
//                .orElse(0); utilizando orElse

        result.ifPresent(System.out::println);

//        System.out.println(result);
    }

    // 2) Retornar a soma dos preços de todos os produtos que custam menos de 100
    public static void exercise2() {
        var products = Mock.products();

        var result = products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 100)
                .reduce(0.0, Double::sum);

        System.out.println();
    }


    public static void main(String[] args) {
        exercise1();
//        exercise2();
    }

}
