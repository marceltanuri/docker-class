# 📌 Plano de Aula: Introdução ao Docker para Iniciantes  

**Duração:** 2 horas  
**Público-alvo:** Alunos iniciantes em programação, atualmente no módulo de POO, que seguirão para desenvolvimento backend com Spring Boot.  
**Formato:** Meetup prático com conceitos básicos + hands-on.  

---

## 🎯 Objetivo Geral  
Introduzir **Docker** de maneira prática para alunos iniciantes, sem exigir conhecimento prévio em backend, mas já demonstrando como ele será útil no futuro no desenvolvimento com Spring Boot.

---

## ✅ Objetivos Específicos
- Entender **o que é Docker e por que ele é útil**.
- Rodar containers básicos e explorar os principais comandos.
- Criar um container simples para uma aplicação Java SE.
- Mostrar um **preview rápido** de como Docker será usado futuramente em aplicações backend com banco de dados.

---

## 🕒 Estrutura da Aula (2 horas)

### **1. O que é Docker? (20 min)**
- O problema do "funciona na minha máquina, mas não na sua".
- Virtualização vs Containers.
- Como Docker ajuda desenvolvedores backend.
- **Demonstração prática:**  
  ```bash
  docker run hello-world
  ```
  ```bash
  docker run -d -p 80:80 nginx
  ```
  _(Acessar no navegador `http://localhost` para demonstrar um servidor rodando sem instalação local.)_

---

### **2. Primeiro Contato: Criando um Container Java (40 min)**
Aqui, sem precisar de Spring Boot, vamos rodar um **Java SE básico**.

1. Criando um pequeno programa em Java:
   ```java
   public class HelloDocker {
       public static void main(String[] args) {
           System.out.println("Olá, Docker! Rodando Java dentro de um container!");
       }
   }
   ```
2. Criando um `Dockerfile`:
   ```dockerfile
   FROM openjdk:17
   WORKDIR /app
   COPY HelloDocker.java .
   RUN javac HelloDocker.java
   CMD ["java", "HelloDocker"]
   ```
3. Construindo e rodando a imagem:
   ```bash
   docker build -t meu-java-container .
   docker run meu-java-container
   ```
   _(Saída esperada no terminal: `"Olá, Docker! Rodando Java dentro de um container!"`)_

---

### **3. Preview: Como Docker Será Útil no Backend (30 min)**
- Explicação rápida: Backend moderno usa **Docker + Banco de Dados**.
- Criando um `docker-compose.yml` para rodar PostgreSQL:
  ```yaml
  version: '3.8'
  services:
    db:
      image: postgres:14
      environment:
        POSTGRES_USER: user
        POSTGRES_PASSWORD: password
        POSTGRES_DB: exemplo
      ports:
        - "5432:5432"
  ```
- Rodando o banco de dados:
  ```bash
  docker-compose up -d
  ```
- **Demonstração:** Conectar via **DBeaver** ou **pgAdmin** para testar.
- Explicação rápida: "Futuramente, vocês aprenderão a conectar um backend Java a esse banco."

---

### **4. Encerramento e Perguntas (30 min)**
- Recapitulação dos conceitos principais.
- Perguntas dos alunos.
- Indicação de materiais extras sobre Docker.

---

## 📂 Materiais Necessários
- 📌 Docker instalado nos computadores dos alunos.
- 📌 Código base para facilitar o hands-on.
- 📌 Acesso à internet para baixar imagens.

---

## 🔥 Por que esse formato funciona melhor?
✅ **Acessível** para alunos sem experiência prévia em backend.  
✅ **Foco no Docker**, sem sobrecarregar com conceitos avançados.  
✅ **Preview do futuro**, conectando Docker ao aprendizado futuro de Spring Boot.  

---
