##   PATRON BUILDER

___

### ¿Cual es la función del patrón builder?

>En este ejemplo, la clase FactoryCoche utiliza el patrón Factory para crear un objeto Coche utilizando el patrón Builder. 
>La función createCoche() toma como parámetros los valores requeridos para construir el objeto Coche y devuelve
>Un nuevo objeto Coche con esos valores configurados utilizando el patrón Builder.
---
### ¿Podríamos combinarlo con el patrón Factory?
>De esta manera, se puede combinar el patrón Builder y el patrón Factory para crear objetos complejos de manera más eficiente y flexible en Java.
---
````mermaid
classDiagram
    
      BuilderCoche "1" *-- "1..*" Coche : association
          
          
      Toyota "1" *-- "1..*" BuilderCoche : association
       Citroen "1" *-- "1..*" BuilderCoche : association
     
       main "1" *-->"1..*" IFabrica : association
      
           class main{
       + FabricaCitroen coche = new FabricaCitroen();
       + FabricaToyota coche2 = new FabricaToyota();
     
      }
      
      class BuilderCoche{
      + Coche_coche
      + Coche build();
      - public BuilderCoche() 
       _coche = new Coche();
      + setMarca(marca: String)            
      + setAno(año: int)     
      + setTapizadoDeCuero(tapiceriaDeCuero: boolean)       
      + setModelo(modelo: string)         
      + setNumeroDePuertas(numeroDePuertas: int )  
      + setAireAcondicionado(acondicionado: boolean) 
      + setColor(color:String)   
    
     
       }
         class Coche{
        - color
        -aireAcondicionado
        -numeroDePuertas
        -tapizadoDeCuero 
        - ano 
        - marca
        - modelo 
        +Coche()
        +getter()
        +setter()
           } 
              <<Interface>>IFabrica
           class IFabrica{
             Coche  fabricar();
           
           }
           IFabrica <|.. Toyota: implements
           class Toyota{
            Coche  fabricar();
         
           }
            IFabrica <|.. Citroen: implements
           class Citroen{
           Coche  fabricar();
           
           }
           
    
````

