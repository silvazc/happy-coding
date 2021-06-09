# Server tutorials

## Jetty Setup

### Setup
1. Create a directory that will serve as the *jetty-base* at the same level as the downloaded jetty zip

2. Inside your new *jetty-base* directory, do `java -jar ../jetty-home-10.0.3/start.jar --add-module=server,http,deploy`
The path might be different depending on where you put the files.

3. You should now have the following directories inside your *jetty-base* directory
    - resources/
    - start.d/
    - webapps/

4. You should now be able to start your server by doing `java -jar ../jetty-home-10.0.3/start.jar` in your *jetty-base* directory.
    - You can check by going to `localhost:8080` and seeing "Powered by Eclipse Jetty:// Server"

### Creating a Simple Static Web App
*First, what is a static web app? It's a website that's just files*

1. Create a new directory for your webapp under `jetty-base/webapps/`.
2. Inside this new directory, you can create a new HTML file and name it *index.html* for example.
3. If you run the server and go to the appropriate URL (i.e. ` http://localhost:8080/HelloWorld/index.html`) you should see your HTML.

4. It's a good idea to create a top level web app called **root** inside your *webapps/* directory
    *Note: **root** is a keyword and you DO NOT need to put it in the URL path. i.e. to access this webapp you can simple go to `http://localhost:8080/index.html`*

## Servlets

`javac -cp ../../../../jetty-home-10.0.3/lib/jetty-servlet-api-4.0.6.jar -d ../WEB-INF/classes/ HelloWorldServlet.java`
1. Edit
2. Compile
3. Rerun server
4. Refresh page