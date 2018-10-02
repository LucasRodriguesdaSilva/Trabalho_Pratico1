# Trabalho_Pratico1
Trabalho pratico de Java sobre contas bancarias

# <strong>MANUAL DO USUÁRIO</strong>

<strong>ATENÇÃO!!!</strong>

<p> Como se trata de um programa para cadastramento de contas e de
operações relacionadas (Versão 0.00.1), então pode surgir eventuais bugs no
programa, então sugiro que tente seguir à risca as instruções dadas nesse
manual para evitar eventuais erros.</p>


<h3> MANUAL DO USUÁRIO </h3>

<p>Ao entrar no repositorio no site do github, clicaremos em clonar or download e vamos copiar o URL. 

![capturar](https://user-images.githubusercontent.com/43484645/46360426-cc720b00-c641-11e8-949e-334cbd63234c.PNG)

Quando ja tivermos o URL, vamos abrir o Netbeans e clicaremos em Equipe>Git>Clonar

![1](https://user-images.githubusercontent.com/43484645/46360521-06431180-c642-11e8-849e-6e0269dfda69.PNG)

Assim vai aparecer uma tela igual a abaixo:

![2](https://user-images.githubusercontent.com/43484645/46360604-2ffc3880-c642-11e8-8586-d88e4f8599e9.PNG)

Na parte onde tem URL do Repositório vamos adicionar o URL ja copiado. Ai clicamos em próximo, vai aparecer uma tela 
mandando escolher as ramificações remotas, nesse caso vamos escolher somente a master*.

![3](https://user-images.githubusercontent.com/43484645/46360806-941efc80-c642-11e8-8f56-7a88ac078892.PNG)

Depois de clicarmos em proximo, vai aparecer essa tela, onde você pode escolher o diretório-pai do clone que fizemos
nesse caso vamos deixar do jeito que está.

![4](https://user-images.githubusercontent.com/43484645/46360923-d0525d00-c642-11e8-84b8-136aebd74de3.PNG)

Quando clicarmos em finalizar, vai aparecer essa janela, onde vai informar que o projeto foi clonado, e se você
deseja abri-lo. Assim clicaremos em Abrir Projeto.

![4 5](https://user-images.githubusercontent.com/43484645/46361052-1f988d80-c643-11e8-94d9-81211d589bf9.PNG)

Depois desse procedimento vamos execultar o programa, após ser execultado o programa vai criar e compilar os arquivos na pasta:

![5](https://user-images.githubusercontent.com/43484645/46252779-e6de9580-c443-11e8-8ab6-d0937ed86826.PNG)</p>

<p>Ao executar o programa <strong>Principal</strong> vai aparecer uma mensagem de
boas-vindas para o usuário, como na imagem abaixo:
  
![tela de boas vindas](https://user-images.githubusercontent.com/43484645/46252209-070a5680-c43c-11e8-9177-a4fbc88ee9d5.PNG)

Quando o usuário clicar em <strong>ok</strong> na caixa de mensagem, vai abrir uma
tela inicial onde vamos cadastrar clientes em três tipos de contas, na <strong>CONTA
NORMAL</strong>, na <strong>CONTA POUPANÇA</strong> e na <strong>CONTA ESPECIAL</strong>, como na
imagem abaixo:

![image](https://user-images.githubusercontent.com/43484645/46252231-518bd300-c43c-11e8-9e54-7003974dc262.png)

Quando o usuário for cadastrar um cliente em qualquer tipo de conta
mencionado acima, o usuário vai clicar no menu <strong>CADASTRAR CLIENTES</strong>, e
escolher a opção que o cliente desejar.

![image](https://user-images.githubusercontent.com/43484645/46252234-65373980-c43c-11e8-81f8-c3c3411ff136.png)

Tomando como exemplo que o cliente (que vamos chamar de João)
escolheu a opção <strong>Conta Normal</strong>, quando o usuário clicar em Cadastrar
<em>Clientes > Conta Normal</em>, vai aparecer uma tela de cadastro como a imagem
abaixo:

![image](https://user-images.githubusercontent.com/43484645/46252239-7d0ebd80-c43c-11e8-9cda-becbd2f055ee.png)

Assim o usuário vai digitar o nome, o número da conta e o saldo inicial
da conta do cliente. Como no exemplo abaixo:

![image](https://user-images.githubusercontent.com/43484645/46252244-96b00500-c43c-11e8-8a58-2319da8d58a5.png)

No exemplo temos o nome do cliente que é João, temos o seu número
da conta que é 001 e o seu saldo inicial que é R$ 50,00. Assim com todos os
campos preenchidos o usuário vai clicar em salvar, ao clicar em salvar vai
aparecer uma mensagem mostrando o tipo da conta que foi cadastrada.

![image](https://user-images.githubusercontent.com/43484645/46252259-d4ad2900-c43c-11e8-8534-3d54e55d723d.png)

Se o usuário tiver outro cliente (que vamos chamar de Maria) e esse
cliente escolher a opção <strong>Conta Poupança</strong>, quando o usuário clicar no menu
Cadastrar Clientes > Conta Poupança, vai aparecer uma tela de cadastro como
a imagem a seguir:

![image](https://user-images.githubusercontent.com/43484645/46252261-e989bc80-c43c-11e8-854f-6be22fac3114.png)

Assim o usuário vai digitar o nome, o número da conta o saldo inicial e a
taxa de reajuste do cliente

<strong>OBS:</strong> A taxa de reajuste tem que ser <strong>UM</strong> número entre 0 e n, (sendo n um
número inteiro positivo).

![image](https://user-images.githubusercontent.com/43484645/46252268-03c39a80-c43d-11e8-9335-2477c12ca971.png)

No exemplo temos o nome do cliente que é Maria, o número da conta
que é 002 o seu saldo inicial que é R$ 200,00 e a taxa de reajuste que é 10%.
Assim com todos os campos preenchidos o usuário vai clicar em salvar, ao
clicar em salvar vai aparecer uma mensagem mostrando o tipo da conta que foi
cadastrada.

<strong>OBS:</strong> Quando o usuário passar o valor 10 na taxa de reajuste o programa vai
pegar o valor e dividir por 100 assim o valor passa de 10 para 0.1 que é o valor
que o programa vai trabalhar.

Logo depois de transformar em 0.1 o programa vai pegar esse valor e
multiplicar com o saldo e depois vai adicionar esse valor ao saldo do cliente
(como exemplo passamos 10 assim temos 0.1, multiplicando com o saldo
temos 20 e finalmente adicionando ao saldo temos R$ 220,00.)

![image](https://user-images.githubusercontent.com/43484645/46252334-f3f88600-c43d-11e8-905f-ce54d77cf691.png)

Agora se o usuário tiver um terceiro cliente (que vamos chamar de José)
e ele escolher a opção <strong>Conta Especial</strong>, quando o usuário clicar no menu
<em>Cadastrar Clientes>Conta Especial</em>, vai aparecer uma tela igual a imagem
abaixo:

![image](https://user-images.githubusercontent.com/43484645/46252352-24402480-c43e-11e8-9134-c7a288b9d8ec.png)

Assim o usuário vai digitar o nome do cliente, o número da conta, o
saldo inicial, o limite que o cliente pode sacar usando cheque especial, e a
multa se caso o cliente use cheque especial.

![image](https://user-images.githubusercontent.com/43484645/46252356-31f5aa00-c43e-11e8-9628-468f7cca4295.png)

No exemplo temos o nome do cliente que é José, o seu número da conta
que é 003, o seu saldo inicial que é R$ 200,00, o limite de saque com cheque
especial que é R$ 500,00 e a multa caso o cheque especial seja usado que é
10%.

<strong>OBS:</strong> Como na taxa de reajuste, a multa tem que ser um número entre 0 e n
(sendo n um número inteiro e positivo).

Para todas as telas de cadastro de contas tem uma opção de cancelar,
assim quando clicar vai aparecer a mensagem “CANCELADO COM
SUCESSO! ”. Veja o exemplo a seguir:

![image](https://user-images.githubusercontent.com/43484645/46252366-4c2f8800-c43e-11e8-8ed1-66e4df344c27.png)

![image](https://user-images.githubusercontent.com/43484645/46252368-4e91e200-c43e-11e8-8e11-44a7312fdf6c.png)

![image](https://user-images.githubusercontent.com/43484645/46252371-52bdff80-c43e-11e8-874c-8b51824a6bfa.png)

Logo após a fase de cadastro, temos a fase de operações.

![image](https://user-images.githubusercontent.com/43484645/46252384-69fced00-c43e-11e8-8ee9-9972d09dc1da.png)

Quando o usuário clicar em <em>Mais>Operações</em>, vai exibir uma tela de
operações como a imagem abaixo:

<strong>OBS:</strong> Quando o usuário clicar em Sair na imagem acima o programa fecha.

![image](https://user-images.githubusercontent.com/43484645/46252399-96b10480-c43e-11e8-9e47-b8f13ef05e84.png)

A tela de contas contém várias opções para serem realizadas, como
saques, depósitos, transferências, reajuste para conta poupança e para ver os
saldos e a opção sair.

<strong>OBS:</strong> Nessa tela ao clicar em sair o programa não fecha ele simplesmente sair da tela
contas e volta para a tela inicial. E em todas as operações, quando finalizadas elas
voltam a tela de operações.

Ao clicar em Saques na tela de operações, vai abrir uma tela igual a
imagem abaixo:

![image](https://user-images.githubusercontent.com/43484645/46252407-ae888880-c43e-11e8-9461-3f1f0d6c8b11.png)

Se houver uma realização de saque e o cliente não tiver saldo suficiente
para a operação, vai exibir uma mensagem alertando que o saldo é
insuficiente. Tomando como exemplo o João, que tem o número da conta 001 e
Saldo inicial de R$ 50,00, e ele realizar um saque de R$ 100,00 vai aparecer a
mensagem dizendo saldo insuficiente.

![image](https://user-images.githubusercontent.com/43484645/46252418-bba57780-c43e-11e8-966b-12c49a4919fe.png)

Já a Maria, que tem saldo inicial de R$ 200,00 e número da conta 002,
realizar um saque de R$ 20,00, vai aparecer uma mensagem contendo o seu
nome e dizendo que a operação foi realizada com sucesso.

![image](https://user-images.githubusercontent.com/43484645/46252428-cc55ed80-c43e-11e8-9e09-83a1e8d0f802.png)

E se o José realizar um saque com um valor maior que o seu saldo
inicial vai aparecer uma mensagem contendo seu nome e dizendo que a
operação foi realizada com cheque especial.

![image](https://user-images.githubusercontent.com/43484645/46252433-d8da4600-c43e-11e8-9757-d5c032e015ae.png)

Na tela de saque vai ter a opção de cancelar, se for clicado nele vai
aparecer uma mensagem dizendo que a operação foi cancelada com sucesso.

![image](https://user-images.githubusercontent.com/43484645/46252435-e42d7180-c43e-11e8-9f32-073ae830d9dd.png)

Se a opção depósito for escolhida vai aparecer uma tela igual a imagem
a seguir:

![image](https://user-images.githubusercontent.com/43484645/46252438-ef809d00-c43e-11e8-9863-4e7b79318294.png)

Quando depositado um valor em tal conta, aparecera uma mensagem
contendo o nome do cliente e confirmando a realização da operação. Como
exemplo tomamos José que tem o número da conta 003 e realizou um depósito
de R$ 15,00.

![image](https://user-images.githubusercontent.com/43484645/46252442-fad3c880-c43e-11e8-8e65-c9cbe93cf9e3.png)

Na tela de depósito contém a opção de cancelar a operação, se clicado
nela vai aparecer a mensagem dizendo que a operação foi cancelada com
sucesso.

![image](https://user-images.githubusercontent.com/43484645/46252449-117a1f80-c43f-11e8-9a08-1dc9d71dda69.png)

Se a opção transferência for escolhida, vai exibir uma tela igual a
imagem abaixo:

![image](https://user-images.githubusercontent.com/43484645/46252456-1e970e80-c43f-11e8-8e45-98e456ca5cba.png)


<h4>Veja o exemplo abaixo de como funciona a transferência:</h4>

![image](https://user-images.githubusercontent.com/43484645/46252465-35d5fc00-c43f-11e8-8d99-2d06dbe82ec3.png)

No exemplo temos uma transferência do João para o José com o valor
de R$ 15,00, como João tinha saldo inicial de R$ 50,00 e não fez nenhum
saque e nenhum depósito então seu saldo permaneceu R$ 50,00, e José que
tem saldo R$ 200,00 e realizou um saque com cheque especial de R$ 500,00,
assim ela utilizou R$300,00 do limite, assim como a multa é 10% = 0.1, sobre
os R$ 300,00, assim o seu saldo ficou de R$ - 330,00, mais como ele realizou
um deposito de R$15,00 o seu saldo final é R$ - 315,00. Com a realização da
transferência de João para José o saldo do José ira ser R$ - 300 ,00. Logo ao
finalizar a operação vai aparecer os nomes dos titulares e a mensagem
confirmando a realização da operação.

Na tela de transferência contém a opção de cancelar a operação, se
clicado nela vai aparecer a mensagem dizendo que a operação foi cancelada
com sucesso.

![image](https://user-images.githubusercontent.com/43484645/46252473-438b8180-c43f-11e8-95c0-1ba00cdb49e2.png)

Se a opção reajuste for escolhida, vai exibir uma tela igual a imagem
abaixo:

![image](https://user-images.githubusercontent.com/43484645/46252474-4be3bc80-c43f-11e8-89f8-4b9ff97d5e74.png)

O reajuste serve para contas poupança, como a única conta poupança
que temos é a da Maria, vamos usá-la como exemplo.

![image](https://user-images.githubusercontent.com/43484645/46252476-59994200-c43f-11e8-846b-44617b2ae043.png)

Quando for digitado o número da conta poupança e a taxa do reajuste,
vai exibir uma mensagem com o nome do titular da conta e confirmando que a
operação foi realizada com sucesso.

Se o campo Taxa de Reajuste não for preenchida, o programa vai usar a
taxa padrão que é de 10%, logo após isso vai exibir a mesma mensagem.

Assim no exemplo a Maria tem saldo de R$ 175,00(pois ela tinha saldo
inicial de R$200,00 e realizou um saque de R$25,00 assim o seu saldo é de
R$175,00), com a taxa de reajuste de 10% o seu saldo passa a ser R$ 192,50.

Também há uma opção para cancelar a operação reajuste:

![image](https://user-images.githubusercontent.com/43484645/46252478-661d9a80-c43f-11e8-9fae-51c4639b50bd.png)

Se a opção ver saldos for escolhida vai aparecer uma tela exibindo todos
os saldos dos clientes, nos exemplos citados o João ficou com R$ 35,00, Maria
ficou com R$192,50 e José ficou com R$ - 300 ,00.

![image](https://user-images.githubusercontent.com/43484645/46252481-733a8980-c43f-11e8-9aed-42c74b1fd973.png)

Quando o botão OK for clicado ele volta para a tela de operações.</p>


### <strong>REFERÊNCIAS</strong>


<https://www.youtube.com/playlist?list=PLWd_VnthxxLfeEUK08gB7G3316OS5xIT3>

<http://www.guj.com.br/t/limitar-casa-decimal-como-faco-joptionpane/38157/4>

<http://www.guj.com.br/t/verificar-se-o-retorno-de-um-textfield-e-vazio/54465>

## AUTOR: LUCAS RODRIGUES DA SILVA – MATRICULA 428787


