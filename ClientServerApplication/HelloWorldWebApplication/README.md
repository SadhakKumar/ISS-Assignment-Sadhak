# HelloWorld Web Application

A basic Java EE web application that displays **"Hello, World!"** using **Servlets** and **JSP**. This project helps beginners understand the foundational structure of a Java web app using **Maven** and **Tomcat**.

---

## Features

- Serves a simple HTML page
- Uses Servlets and JSP
- Follows Maven folder structure
- Deployable on Apache Tomcat server
---

## 🗂️ Folder Structure

```plaintext
HelloWorldWebApplication/
│
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── example/
│       │           └── HelloWorldServlet.java   # Main servlet
│       ├── webapp/
│       │   ├── index.jsp                        # Welcome JSP page
│       │   └── WEB-INF/
│       │       └── web.xml                      # Deployment descriptor
│
├── pom.xml                                      # Maven build file
└── README.md                                    # Project documentation
```

---

## 💡 How It Works

### 🚦 Servlet Logic

- **HelloWorldServlet.java**
  - Handles HTTP GET request
  - Responds with “Hello, World!” in plain text or forwards to a JSP

### 🖼️ JSP Page

- **index.jsp**
  - Optional welcome page
  - Can be configured as the landing page in `web.xml`

   ### Homepage
   ![homepage](assets/Screenshot%202025-06-08%20005445.png)

   ### Response back from servlet
   ![Response](assets/response.png)
---

---

## ⚙️ Maven Setup

Add this to your `pom.xml` to support servlet APIs:

```xml
<dependencies>
    <dependency>
        <groupId>jakarta.servlet</groupId>
        <artifactId>jakarta.servlet-api</artifactId>
        <version>5.0.0</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

---

## 🚀 How to Run

1. **Clone the Repository**
   - Clone the repository and go to `ClientServerApplication > HelloWorldWebApplication`

2. **Open in IDE**
   - Use IntelliJ IDEA, Eclipse, or any Java IDE

3. **Build with Maven**
   ```bash
   mvn clean package
   ```

4. **Deploy to Tomcat**
   - Copy the generated `.war` file to `TOMCAT_HOME/webapps/`

5. **Visit in Browser**
   ```
   http://localhost:8080/HelloWorldWebApplication/hello
   ```

---

## 🔧 Tools & Technologies

| Tech        | Purpose                      |
|-------------|------------------------------|
| Java        | Core programming language    |
| Servlet     | Handles HTTP requests        |
| JSP         | Optional view layer          |
| Maven       | Build and dependency manager |
| Tomcat      | Servlet container            |
| HTML/CSS    | Basic frontend styling       |

---
