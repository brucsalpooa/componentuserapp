# Aplicação Usuária do Componente SQL

Esta é uma aplicação que pode usar o componente de software da mesma organização para gerar consultas SQL dinâmicas.

## Descrição
Esta aplicação demonstra o uso do componente SQL em um contexto real. Ela inclui uma classe principal chamada `Main`, que utiliza o componente SQL para construir e executar consultas SQL.

## Configuração do Maven
Certifique-se de incluir o componente SQL como uma dependência em seu projeto Maven. Veja o exemplo de como adicionar a dependência ao arquivo `pom.xml`:

```
<dependency>
    <groupId>br.ucsal.pooa</groupId>
    <artifactId>sqlcomponent</artifactId>
    <version>1.0-SNAPSHOT</version>
</dependency>
```

## Uso
Você pode usar a classe SqlQueryBuilder do componente SQL em seu código Java.

## Documentação
A documentação Javadoc está disponível no diretório target/site/apidocs após a compilação do projeto. Você pode gerar a documentação usando o comando Maven mvn javadoc:javadoc.
