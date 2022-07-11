Algoritmo "Menu Site"
//
//
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a) Henrique Tavares
// Data atual  : 07/07/2022
Var
   // Seção de Declarações das variáveis
   nome,email,endereco:vetor[1..3] de caractere
   cidade,pais:vetor[1..3]de caractere
   cadastro,consulta,ltela,i,j:inteiro
   bdados:caractere

Inicio
   // Seção de Comandos, procedimento, funções, operadores, etc...
   para i de 1 ate 3 faca
      escreval("-- BEM VINDO! CADASTROS  --")
      escreval("[1] - DESTINO ")
      escreval("[2] - CLIENTE ")
      leia(cadastro)
      se (cadastro = 1) entao
         para i de 1 ate 3 faca
            escreval("Cidade:")
            leia(cidade[i])
            escreval("Pais: ")
            leia(pais[i])
            escreval("Deseja cadastrar outro destino?")
            escreval(" [1] - Sim")
            escreval(" [2] - Nao")
            leia(j)
            se j = 2 entao
               escreval("---- FIM CADASTRO ----")
               interrompa
            fimse
         fimpara
      senao
         se (cadastro = 2) entao
            para i de 1 ate 3 faca
               escreval("Digite o nome:")
               leia(nome[i])
               escreval("email:")
               leia(email[i])
               escreval("endereço: ")
               leia(endereco[i])
               escreval("Deseja cadastrar outro cliente?")
               escreval(" [1] - Sim")
               escreval(" [2] - Não")
               leia(j)
               se j = 2 entao
                  escreval("---- FIM CADASTRO ----")
                  interrompa
               fimse
            fimpara
         senao
            escreval ("---- ERRO ----")
         fimse
      fimse
      escreval("Deseja fazer outro cadastro de cliente ou destino?")
      escreval(" [1] - Sim")
      escreval(" [2] - Nao")
      leia(j)
      se j = 2 entao
         escreval("---- FIM CADASTRO ----")
         interrompa
      fimse
   fimpara

   escreval("")
   escreval("gostaria de limpar a tela? [1] - sim [2] - nao")
   leia(ltela)
   se (ltela = 1) entao
      limpatela
   fimse

   para i de 1 ate 2 faca
      escreval("---- CONSULTA ----")
      escreval("[1] - DESTINO ")
      escreval("[2] - CLIENTE ")
      leia(consulta)
      se (consulta = 1)entao
         escreval("Escolha um destino para a consulta")
         leia(bdados)
         para i de 1 ate 3 faca
            se lugar[i] = bdados entao
               escreval("---- RESULTADO ----")
               escreva("Cidade: ")
               escreval(cidade[i])
               escreva("Pais: ")
               escreval(pais[i])
               escreval("---- FINAL RESULTADO ----")
            fimse
         fimpara
      senao
         se (consulta = 2) entao
            escreval("Escolha um cliente para a consulta")
            leia(bdados)
            para i de 1 ate 3 faca
               se nome[i] = bdados entao
                  escreval("---- RESULTADO ----")
                  escreva("Nome: ")
                  escreval(nome[i])
                  escreva("E-mail: ")
                  escreval(email[i])
                  escreva("Endereco: ")
                  escreval(endereco[i])
                  escreval("---- FINAL RESULTADO ----")
               fimse
            fimpara
         fimse
      fimse
      escreval("Deseja fazer outra consulta?")
      escreval(" (1) - Sim")
      escreval(" (2) - Nao")
      leia(j)
      se j = 2 entao
         escreval("---- FIM CONSULTA ----")
         interrompa
      fimse
   fimpara




Fimalgoritmo