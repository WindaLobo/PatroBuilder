##   PATRON BUILDER

___

### ¿Cual es la función de este patrón?
  
>La función del patrón de diseño Builder es simplificar la construcción de objetos complejos,
 permitiendo la creación de objetos paso a paso y mejorando la legibilidad y mantenibilidad del código.
---
### ¿Podríamos combinarlo con el patrón Factory?
>Si, podriamos combianar ambos patrones dependerá de las necesidades específicas del proyecto y puede ser una buena opción
cuando se necesite crear objetos complejos y jerarquías de objetos al mismo tiempo.
---
````mermaid
classDiagram
    
      BuilderPizza "1" *-- "1..*" Pizza : association
          
      main "1" *-- "1..*" BuilderPizza : association
      
           class main{
       + Pizza creadaConBuilder = new BuilderPizzas().build();
       +Pizza sintaxisEncadenada = new BuilderPizzas()
     
      }
      
      class BuilderPizza{
      + Pizza _pizza;
      + Pizza build();
      - public BuilderPizzas() 
       _pizza = new Pizza();
      + setMasa(masa: String)            
      + setRelleno(relleno: boolean)     
      + setSize(size: TipoDePizza)       
      + setSalsa(salsa: boolean)         
      + setSalsa(salsa: TipoDeSalsa)  
      + setCebolla(cebolla: boolean)     
      + setSinGluten(sinGluten: boolean) 
      + setExtraQueso(extraQueso: boolean)
      + setPina(pina: boolean)           
      + setChampinones(champinones: boolean)
      + setJamon(jamon: boolean)
      + setRecogida(recogida: TipoDeEnvio)
      
       }
         class Pizza{
        - masa
        -relleno
        -size
        -salsa 
        - tipoDeSalsa 
        - cebolla
        - sinGluten 
        -extraQueso 
        -pina
        -champinones  
        - jamon       
        - recogida       
        +Pizza()
        +getter()
        +setter()
           } 
    
````

