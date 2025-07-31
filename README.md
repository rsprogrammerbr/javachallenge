# Conversor de Moedas - Challenge ONE

![Badge](https://img.shields.io/badge/STATUS-CONCLUÍDO-green)

## Descrição do Projeto
Este projeto é um conversor de moedas desenvolvido como parte do Challenge de Java do programa ONE (Oracle Next Education). A aplicação funciona via console, permitindo ao usuário escolher entre diferentes opções de conversão de moedas. As taxas de câmbio são obtidas em tempo real através do consumo de uma API externa, garantindo que os valores sejam sempre atuais.

## Funcionalidades
- **Conversão de Moedas:** Permite a conversão entre 6 pares de moedas diferentes, incluindo Dólar Americano (USD), Real Brasileiro (BRL), Peso Argentino (ARS) e Peso Colombiano (COP).
- **Interação via Console:** A interface com o usuário é feita através de um menu de texto simples e intuitivo no console.
- **Taxas de Câmbio em Tempo Real:** Utiliza a API da [ExchangeRate-API](https://www.exchangerate-api.com/) para buscar as cotações mais recentes.
- **Histórico de Conversões:** Ao final da execução, a aplicação salva um arquivo `conversoes.json` com o registro de todas as conversões realizadas durante a sessão.

## Tecnologias Utilizadas
- **Java 17:** Versão da linguagem Java utilizada no desenvolvimento.
- **Google GSON:** Biblioteca para converter objetos Java em sua representação JSON e vice-versa.

## Como Executar o Projeto

### Pré-requisitos
- Ter o Java Development Kit (JDK) na versão 17 ou superior instalado e configurado no seu sistema.

### Passo a Passo
1. **Clone o repositório:**
   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git
   ```
2. **Navegue até o diretório do projeto:**
   ```bash
   cd javachallenge
   ```
3. **Compile os arquivos Java:**
   O projeto inclui a dependência GSON na pasta `lib`. Use o seguinte comando para compilar todas as classes para o diretório `target/classes`:
   ```bash
   javac -cp "lib/gson-2.10.1.jar" -d target/classes src/main/java/com/aluracursos/conversordemoedas/*.java
   ```
4. **Execute a aplicação:**
   Após a compilação, execute a classe principal com o comando abaixo. Lembre-se de incluir tanto as classes compiladas quanto a biblioteca GSON no classpath.
   ```bash
   java -cp "target/classes;lib/gson-2.10.1.jar" com.aluracursos.conversordemoedas.Principal
   ```

## Autor
Desenvolvido por **Rodrigo Silva**.
