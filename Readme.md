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
          
          
      Telepizza "1" *-- "1..*" BuilderPizza : association
       DominosPizza "1" *-- "1..*" BuilderPizza : association
     
       main "1" *-->"1..*" IPizzeria : association
      
           class main{
       + IPizzeria telepizza = new Telepizza();
       +IPizzeria dominoPizza = new DominosPizza()
     
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
              <<Interface>>IPizzeria
           class IPizzeria{
             String prepararPizza();
             Pizza  pizzaLista();
           
           }
           IPizzeria <|.. Telepizza: implements
           class Telepizza{
            String prepararPizza();
             Pizza  pizzaLista();
           
           }
            IPizzeria <|.. DominosPizza: implements
           class DominosPizza{
            String prepararPizza();
             Pizza  pizzaLista();
           
           }
           
    
````

