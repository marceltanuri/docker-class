# Usa a imagem do OpenJDK 22 como base
FROM openjdk:8

# Define o diretório de trabalho dentro do container
WORKDIR /app

# Copia todos os arquivos Java para o diretório de trabalho
COPY src/ /app/

# Compila todos os arquivos Java dentro de /app e mantém os .class na mesma pasta
RUN javac /app/*.java

# Comando para executar a aplicação (certifique-se de usar o caminho correto da classe principal)
CMD ["java", "HelloWorld"]
