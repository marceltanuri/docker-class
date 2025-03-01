---
marp: true
theme: default
paginate: true
header: "Docker Meetup - ADA | MELI 1321 + 1322"
footer: "By [Marcel Tanuri]"
style: |
  section {
    background-color: #1e1e1e;
    color: white;
  }
---


# 📌 Plano de Aula: Introdução ao Docker  

**Duração:** 2 horas  
**Público-alvo:** Iniciantes em programação / backend com Spring Boot  
**Formato:** Meetup prático com conceitos básicos + hands-on  

---

![bg right:100% width:800px](https://upload.wikimedia.org/wikipedia/commons/4/4e/Docker_%28container_engine%29_logo.svg)

---

## 🎯 Objetivo Geral  
🛠️ Introduzir **Docker** de maneira prática para alunos iniciantes, sem exigir conhecimento prévio em backend.  

🎯 Demonstrar como ele será útil no desenvolvimento backend com **Spring Boot** no futuro.

---

## ✅ Objetivos Específicos
- Entender **o que é Docker e por que ele é útil**  
- Rodar containers básicos e explorar comandos  
- Criar um container simples para uma aplicação Java SE  
- Mostrar um **preview rápido** de como Docker será usado futuramente no backend  

---

## 🕒 Estrutura da Aula (2 horas)

1️⃣ **O que é Docker?** (20 min)  
2️⃣ **Criando um Container Java** (40 min)  
3️⃣ **Preview: Docker no Backend** (30 min)  
4️⃣ **Encerramento e Perguntas** (30 min)  

---

# 🐳 O que é Docker?  
**Problema:** "Funciona na minha máquina, mas não na sua!"  

💻 **Virtualização vs Containers**  

<div style="display: flex; justify-content: space-between;">
  <div>
    🖥️ <b>Máquinas Virtuais</b>  
    - Lentas e pesadas  
    - Independentes  
    - Uso de Hypervisor  
  </div>
  <div>
    📦 <b>Containers</b>  
    - Leves e rápidos  
    - Compartilham kernel  
    - Melhor uso de recursos  
  </div>
</div>

---

# 🛠️ Mão na Massa!  
### **Executando um container básico**  
```bash
docker run hello-world
docker run -d -p 80:80 nginx
```
📌 **Acesse:** `http://localhost` no navegador  

_(Demonstração de um servidor rodando sem instalação local)_  

---

# 2️⃣ Criando um Container Java  
Vamos rodar um **Java SE básico** sem precisar de Spring Boot.  

### **Criar um arquivo Java**
```java
public class HelloDocker {
    public static void main(String[] args) {
        System.out.println("Olá, Docker! Rodando Java dentro de um container!");
    }
}
```

---

## 📦 Criando um Dockerfile  
```dockerfile
FROM openjdk:17
WORKDIR /app
COPY HelloDocker.java .
RUN javac HelloDocker.java
CMD ["java", "HelloDocker"]
```

📌 **Comandos para build e execução:**  
```bash
docker build -t meu-java-container .
docker run meu-java-container
```
_(Saída esperada: `"Olá, Docker! Rodando Java dentro de um container!"`)_  

---

# 3️⃣ Docker no Backend  
Docker **facilita o uso de banco de dados** em desenvolvimento.  

Vamos criar um **PostgreSQL rodando em Docker** com `docker-compose`!  

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

---

# 🛠️ Executando o Banco de Dados  
```bash
docker-compose up -d
```
📌 **Testando a conexão** com **pgAdmin** ou **DBeaver**  

🎯 **No futuro:** Vamos conectar o banco a um backend Spring Boot!  

---

# 📌 Encerramento e Perguntas  
- ✅ Recapitulação dos conceitos principais  
- ❓ Perguntas dos alunos  
- 📚 Indicação de materiais extras sobre Docker  

---

# 📂 Materiais Necessários
- ✅ **Docker instalado** nos computadores  
- ✅ Código base para facilitar o hands-on  
- ✅ Acesso à internet para baixar imagens  

---

# 🚀 Próximos Passos  
🎯 O que estudar após este Meetup?  

✅ **Criar um backend simples com Spring Boot + Docker**  
✅ Aprender mais sobre **Docker Compose**  
✅ Explorar **deploy com Docker e Kubernetes**  
✅ Construir **imagens otimizadas para produção**  

---

# **🔥 Obrigado!**  
🐳 **Docker facilita sua vida no desenvolvimento!**  

📌 Dúvidas? Entre em contato!  

🚀 **Mãos à obra!**
