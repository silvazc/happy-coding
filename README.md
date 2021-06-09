# Server tutorials

## Jetty
1. Create a directory that will serve as the *jetty-base* at the same level as the downloaded jetty zip

2. Inside your new *jetty-base* directory, do `java -jar ../jetty-home-10.0.3/start.jar --add-module=server,http,deploy`
The path might be different depending on where you put the files.

3. You should now have the following directories inside your *jetty-base* directory
    - resources/
    - start.d/
    - webapps/

