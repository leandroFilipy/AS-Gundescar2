# GundesCar

Um projeto comparando o uso do OCP.

### Código antigo

O código antigo utilizava de condições `if/else` para a verificação e aplicação dos descontos aos carros.

Isso viola o OCP, pois obriga o desenvolvedor alterar o seu código quando é preciso adicionar novos descontos.

Além disso, o SRP também estava sendo violado, já que todas as verificações e métodos estavam sendo chamados na `main`, sem organização.

### Código novo

O código refatorado foi pesadamente reescrito, onde foi usado o framework `Spring Boot`, que facilitou muito os processos.

#### Por que o padrão Strategy foi a melhor solução

O Pattern Strategy tornou o código fechado à modificação, mas aberto a extensão, além de ter simplificado muito o entendimento e a manutenção do código.

A interface `RegraDeDesconto` permitiu a implementação de descontos diferentes para cada ano, evitando modificações em código legado.