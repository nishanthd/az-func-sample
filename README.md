# az-func-sample
Sample application for Azure functions with Spring cloud features - Dependency injection in functions.

This project explains How to do a Dependency inject to azure functions in spring.

***Required tools***,

```
npm i azure-cli
npm i azure-functions-core-tools
```


***To run the project locally***
   
```
mvn clean package
mvn azure-functions:run
```
**To test**
   ```
   curl http://localhost:7071/api/login -d JohnWick`
   Hello JOHNWICK, you are successfully logged in!!!
   ```
   
   
***To deploy into Azure***
    
    `az login`
    `mvn azure-fucntions:deploy`
    
