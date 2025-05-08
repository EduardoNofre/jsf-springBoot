<p align="center">
  <img src="https://github.com/EduardoNofre/jsf-springBoot/blob/main/githubImg.png" alt="Sublime's custom image"/>  
</p>


<h1 align="left">
  Sumario  
</h1>
<p align="left">
• <a href="#---docker-compose-">O que é Spring boot?</a><br>
• <a href="#---keycloack-">O que é JSF?</a><br>
• <a href="#--requisito-mínimo-antes-de-começar">O que é PrimeFaces?</a><br>   
• <a href="#--arquivo-docker-composeyml">O que é JoinFaces?</a><br>  	  
• <a href="#--arquivo-init-schemasql">Pra que serve JoinFaces?</a><br>  			
• <a href="#--arquivo-init-schemasql">Porque usa?r</a><br>  
• <a href="#--arquivo-init-schemasql">Requisito mínimo antes de começa</a><br>  
• <a href="#--arquivo-init-schemasql">Exemplo de Projeto</a><br>  
• <a href="#--arquivo-init-schemasql">Requisito mínimo antes de começa</a><br>  
• <a href="#--arquivo-init-schemasql">Requisito mínimo antes de começa</a><br>  
</p>

<h1 align="center">
   O que é Spring boot?
</h1>

Spring Boot é um framework Java que facilita a criação de aplicações web e APIs de forma rápida e com pouca configuração.<br>Ele é uma ferramenta que faz parte do ecossistema do Spring Framework, mas com o foco em simplicidade e produtividade.<br>
Um servidor embutido (como Tomcat ou Jetty);<br>
Gerenciamento de dependências com o Maven ou Gradle;<br>
Configurações padrão para não precisar criar tudo<br>

<h1 align="center">
   O que é JSF? 
</h1>
JSF (JavaServer Faces) é um framework da plataforma Java usado para construir interfaces web baseadas em componentes. <br>Ele permite criar páginas web dinâmicas com Java, separando bem a lógica da aplicação da apresentação (HTML).<br>
JSF ajuda você a criar páginas web interativas com Java, usando componentes prontos como botões, tabelas e formulários.<br>
Ele facilita o vínculo entre a interface do usuário e o código Java, com suporte nativo para injeção de dependência e ciclo de vida dos componentes.<br>

<h1 align="center">
   O que é PrimeFaces?
</h1>
PrimeFaces é uma biblioteca de componentes gráficos para JSF (JavaServer Faces) que oferece uma grande variedade de componentes prontos e modernos, como tabelas, gráficos, menus, calendários, diálogos, entre outros.<br>
PrimeFaces deixa suas páginas JSF muito mais bonitas, interativas e fáceis de usar, sem que você precise escrever muito HTML, CSS ou JavaScript.<br>

<h1 align="center">
   O que é JoinFaces? 
</h1>
JoinFaces facilita o uso de JSF (JavaServer Faces) dentro de uma aplicação Spring Boot, cuidando da configuração automática e integração entre as duas tecnologias.<br>

<h1 align="center">
   Pra que serve JoinFaces? 
</h1>

Configura automaticamente o JSF dentro do Spring Boot.<br>
Permite usar bibliotecas como PrimeFaces, OmniFaces, BootsFaces, etc.<br>
Integra os beans do Spring com os managed beans do JSF, usando anotações como @Component e @Named sem conflito.<br>
Elimina a necessidade de configurar manualmente o web.xml, faces-config.xml e outros arquivos.<br>

<h1 align="center">
   Porque usa? 
</h1>

Facilita a criação de projetos spring boot com JSF evita configuração complexas.

<h1 align="center">
   Requisito mínimo antes de começa.
</h1>

Projeto passo a passo jsf.<br>
  - Projeto spring starter<br>
  - Java 17 +<br>
  - spring boot 3.4.5<br>
  - Eclipse STS 4.22<br>
  - JoinFaces<br>
  - Pagina jsf.<br>
  - Classe bean utilizando @Named e @RequestScoped.<br>
  - Utilizando o tomcat do proprio spring boot.<br>

<h1 align="center">
   HelloWorld-JoinFaces
</h1>

## Projeto spring starter + Eclipse STS<br>
  - Abra o seu Eclipse STS<br>
  - Vá em: File > New > Spring Starter Project<br>
  - Preencha:
    - Name: HelloWorld-JoinFaces
    - Type: Maven
    - Java Version: 17+
    - Packaging: jar
    - Dependencies: Adicione apenas Spring Web (o resto vamos configurar manualmente).

## imagem exemplo 01.
<p align="center">
  <img src="https://github.com/EduardoNofre/jsf-springBoot/blob/main/10.png" alt="Sublime's custom image"/>  
</p>

## imagem exemplo 02.
<p align="center">
  <img src="https://github.com/EduardoNofre/jsf-springBoot/blob/main/02.png" alt="Sublime's custom image"/>  
</p>

## Estrutura do projeto 03.
<p align="center">
  <img src="https://github.com/EduardoNofre/jsf-springBoot/blob/main/003.png" alt="Sublime's custom image"/>  
</p>


## Configurando o pom.xml

Configurar o pom.xml com JoinFaces e PrimeFaces.<br>
Vejamos o POM.xml apos a criação como esta?<br>

## Antes da inclusão de algumas libs/dependencias.<br>

              <?xml version="1.0" encoding="UTF-8"?>
              <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
              	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
              	<modelVersion>4.0.0</modelVersion>
              	<parent>
              		<groupId>org.springframework.boot</groupId>
              		<artifactId>spring-boot-starter-parent</artifactId>
              		<version>3.4.5</version>
              		<relativePath/> <!-- lookup parent from repository -->
              	</parent>
              	<groupId>br.com.JoinFaces.app</groupId>
              	<artifactId>HelloWorld-JoinFaces</artifactId>
              	<version>1.0.0</version>
              	<name>HelloWorld-JoinFaces</name>
              	<description>HelloWorld-JoinFaces estudo join faces</description>
              	<url/>
              	<licenses>
              		<license/>
              	</licenses>
              	<developers>
              		<developer/>
              	</developers>
              	<scm>
              		<connection/>
              		<developerConnection/>
              		<tag/>
              		<url/>
              	</scm>
              	<properties>
              		<java.version>17</java.version>
                 <joinfaces.version>5.0.0</joinfaces.version>
              	</properties>
              	<dependencies>
              		<dependency>
              			<groupId>org.springframework.boot</groupId>
              			<artifactId>spring-boot-starter-web</artifactId>
              		</dependency>
              
              		<dependency>
              			<groupId>org.springframework.boot</groupId>
              			<artifactId>spring-boot-starter-test</artifactId>
              			<scope>test</scope>
              		</dependency>
              	</dependencies>
              
              	<build>
              		<plugins>
              			<plugin>
              				<groupId>org.springframework.boot</groupId>
              				<artifactId>spring-boot-maven-plugin</artifactId>
              			</plugin>
              		</plugins>
              	</build>
              </project>

## Vamos incluir algumas libs/dependencias.<br>
  - São elas:
      - thymeleaf
      - JoinFaces (inclui JSF, CDI e PrimeFaces) 
      - JSF Bean Management (CDI) 
      - Servlet API 

## Veja como ficou o POM.xml

		        <project xmlns="http://maven.apache.org/POM/4.0.0"
			xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
			xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
		
			<modelVersion>4.0.0</modelVersion>
		
			<parent>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-starter-parent</artifactId>
				<version>3.4.5</version>
				<relativePath /> <!-- lookup parent from repository -->
			</parent>
		
			<groupId>br.com.JoinFaces.app</groupId>
			<artifactId>HelloWorld-JoinFaces</artifactId>
			<version>1.0.0</version>
			<name>HelloWorld-JoinFaces</name>
			<description>HelloWorld-JoinFaces estudo join faces</description>
		
			<properties>
				<java.version>17</java.version>
				<joinfaces.version>5.0.0</joinfaces.version>
				<spring-cloud.version>2024.0.1</spring-cloud.version>
			</properties>
		
			<dependencies>
				<!-- Spring Boot -->
				<dependency>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-web</artifactId>
				</dependency>
		
				<dependency>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-test</artifactId>
					<scope>test</scope>
				</dependency>
		
				<!--  projectlombok -->
				<dependency>
					<groupId>org.projectlombok</groupId>
					<artifactId>lombok</artifactId>
					<optional>true</optional>
				</dependency>
		
				<!-- JoinFaces para integração com JSF + Spring Boot -->
				<dependency>
					<groupId>org.joinfaces</groupId>
					<artifactId>jsf-spring-boot-starter</artifactId>
					<version>${joinfaces.version}</version>
				</dependency>
		
				<!-- PrimeFaces -->
				<dependency>
					<groupId>org.joinfaces</groupId>
					<artifactId>primefaces-spring-boot-starter</artifactId>
					<version>${joinfaces.version}</version>
				</dependency>
		
				<!-- JSF Bean Management (CDI) -->
				<dependency>
					<groupId>jakarta.enterprise</groupId>
					<artifactId>jakarta.enterprise.cdi-api</artifactId>
					<version>4.0.1</version>
					<scope>provided</scope>
				</dependency>
		
				<!-- thymeleaf -->
				<dependency>
					<groupId>org.springframework.boot</groupId>
					<artifactId>spring-boot-starter-thymeleaf</artifactId>
				</dependency>
			</dependencies>
		
			<dependencyManagement>
				<dependencies>
					<dependency>
						<groupId>org.springframework.cloud</groupId>
						<artifactId>spring-cloud-dependencies</artifactId>
						<version>${spring-cloud.version}</version>
						<type>pom</type>
						<scope>import</scope>
					</dependency>
				</dependencies>
			</dependencyManagement>
		
			<build>
				<plugins>
					<plugin>
						<groupId>org.apache.maven.plugins</groupId>
						<artifactId>maven-compiler-plugin</artifactId>
						<configuration>
							<annotationProcessorPaths>
								<path>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</path>
							</annotationProcessorPaths>
						</configuration>
					</plugin>
					<plugin>
						<groupId>org.springframework.boot</groupId>
						<artifactId>spring-boot-maven-plugin</artifactId>
						<configuration>
							<excludes>
								<exclude>
									<groupId>org.projectlombok</groupId>
									<artifactId>lombok</artifactId>
								</exclude>
							</excludes>
						</configuration>
					</plugin>
				</plugins>
			</build>
		</project>

            

<h1 align="center">
   Vamos criar um pacote e a classe bean no eclipse.
</h1>

  - **Pacote**.
      - O pacote **br.com.JoinFaces.app.bean.**
      - Ainda nesse pacote iremos criar a nossa classe bean.
      
  - **Vamos criar a classe HelloWorldBean.java**.
      - A classe deve ser craida na raiz do **br.com.JoinFaces.app.bean**.
      - Deve ficar assim **src/main/java/br/com/JoinFaces/app/bean/HelloWorldBean.java**.
      
  **A classe:** 
    
              	package br.com.JoinFaces.app.bean;

		import jakarta.enterprise.context.RequestScoped;
		import jakarta.inject.Named;
		
		@Named("helloWorldBean")
		@RequestScoped
		public class HelloWorldBean {
		    private String nome;
		
		    public String saudacao() {
			return "Nome recebido: " + nome + "!";
		    }
		
		
		    public String getNome() {
			return nome;
		    }
		
		    public void setNome(String nome) {
			this.nome = nome;
		    }
		}


  - **Deve ficar dentro src/main/java/br/com/JoinFaces/app/bean/HelloWorldBean.java**

## Imagem da estrutura:
<p align="center">
  <img src="https://github.com/EduardoNofre/jsf-springBoot/blob/main/beans.png" alt="Sublime's custom image"/>  
</p>
  
<h1 align="center">
    Vamos criar uma pasta e a pagina index.xhtml no eclipse.
</h1>

  - **Pasta**.
      - **webapp** nessa paste ire ficar as suas paginas.
      -  A pasta **src/main/webapp**

   - **Vamos criar a pagina index.xhtml**.
      - A pagina deve ser craida na raiz do **webapp**.
      - Deve ficar assim **src/main/webapp/index.xhtml**.

 **A pagina:** 

		<!DOCTYPE html>
		<html xmlns="http://www.w3.org/1999/xhtml"
		      xmlns:h="http://xmlns.jcp.org/jsf/html"
		      xmlns:p="http://primefaces.org/ui">
		<h:head>
		    <title>Exemplo JSF</title>
		</h:head>
		<h:body>
		    <h:form>
		        <p:inputText value="#{helloWorldBean.nome}" placeholder="Digite seu nome" />
		        <p:commandButton value="Dizer olá" update="mensagem" action="#{helloWorldBean.saudacao}" />
		        <h:outputText id="mensagem" value="#{helloWorldBean.saudacao()}" />
		    </h:form>
		</h:body>
		</html>

  ## Imagem da estrutura:
<p align="center">
  <img src="https://github.com/EduardoNofre/jsf-springBoot/blob/main/pagina01.png" alt="Sublime's custom image"/>  
</p>

<h1 align="center">
  Configurar aplicação no application.properties
</h1>h1>

Ai vai do seu gosto usar **.properties** ou **.Yaml**.
Mas para este exemplo será usado um **.properties**

Abaixo explico o que cada linhas faz:

			# Nome da aplicacao
			spring.application.name=HelloWorld-JoinFaces
			
			# Porta onde a aplicacao sera executada
			server.port=8090
   
			# contexto
   			server.servlet.context-path=/HelloWorld
			
			# Ignora comentarios no codigo XHTML para melhorar performance de renderizacao
			joinfaces.servlet.initial-parameters.faces-config.FACELETS_SKIP_COMMENTS=true
			        
			# Define o mapeamento das paginas JSF para terminarem com .xhtml
			joinfaces.faces-servlet-mapping=*.xhtml
			        
			# Define que os arquivos com extensao .xhtml sao tratados como paginas JSF
			joinfaces.faces-view-suffix=.xhtml
			        
			# Define o tema visual do PrimeFaces (neste caso, "saga", que e um tema moderno e claro)
			joinfaces.primefaces.theme=saga
			        
			# Habilita o uso do Font Awesome nos componentes do PrimeFaces (icones)
			joinfaces.primefaces.font-awesome=true

  ## Imagem .properties e sua localização:
<p align="center">
  <img src="https://github.com/EduardoNofre/jsf-springBoot/blob/main/propert01.png" alt="Sublime's custom image"/>  
</p>

<h1 align="center">
 Vamos executar o projeto
</h1>h1>
 - Podemos executar de duas manieras.<br>  
   - Via eclipse.<br> 
   - Via linha de comando Maven.<br> 
   
## Via eclipse..<br> 
  - **botão Direito no projeto > Run AS > Spring boot app**.<br>
    
## Imagem

## Via linha de comando Maven.
  - **botão Direito no projeto > show in Local Terminal**
  - 
## Imagem
