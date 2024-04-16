# Projeto Administrativo de Videos

## Tecnologias

    - Java versão 17
    - Git
    - Gradle (Versionamento de componente)
    - Docker
    - Banco de Dados: Postgres
    - Testes unitarios.

## O Arquivo build.gradle

    - É o arquivo de configuração do nosso projeto. Onde será adicionado novas dependencias e modulos.

## O Arquivo settings.gradle

    - Podemos adicionar novos sub modulos.

## O Projeto será trabalhado em três modulos.

    - doamin
        - Esse é o modulo de mais alto nivel que terá outros modulos como:
            - entidades
            - objetos que contenha as regras de negocio

    - application: Este modulo terá os casos de uso da aplicação e um pouco de regra de negocio e orquestra as entidades
        - useCase

    - infrastructure que liga os casos de uso aos entrypoints, que são as entradas externas que vem via restFull, mensagens e coliga ao useCase, domain e as interfaces de gateway.
        - Persistencia.
        - Cache em memoria

## Aquitetura para o projeto será TDD.

    - Podemos excluir a pasta SRC
    - domain
            - Criando a classe de category
            - Criando a classe de test para category

    - application
            - usecase
                - Criando a classe de category.
                    - Ao importar a classe para o usecase ele não será notado.
                        - É preciso que seja adicionado a dependencia dele dentro de appplication.
                            - build.gradle
                                - dependencies{
                                    implementation(project(":domain"))
                                    }
            -  test
                - Criado o pacote de test para a classe de UseCaseTest
                    - testCreateCategory
                        - UseCase()
                        - UseCase().execute() - Garantindo que seja criando a instancia de categoria.
    - infrastructure
        - É preciso que seja adicionado a dependencia dentro de infrastructure para a importação ser incluida.
                            - build.gradle
                                - dependencies{
                                    implementation(project(":domain"))
                                    implementation(project(":application"))
                                }
        - src > main
            - Será o metodo de entrada do projeto

            - test
                - Criando o pacote de test para o metodo Main
                    - Criando o test para chamada da classe main        