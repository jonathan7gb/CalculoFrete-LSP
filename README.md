O PedidoComFreteGratis quebra o LSP porque ele altera a pós-condição esperada pelo contrato da superclasse: o valor final deveria ser igual ou maior que o valor bruto após aplicar frete, mas ele força o valor final a não aumentar.
Quando a classe ProcessadorDePagamento usa essa subclasse, sua lógica quebra porque ela assume o comportamento da superclasse, e essa expectativa não é atendida.
