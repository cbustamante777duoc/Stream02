package creacionstream;


import clases.Estudiantes;
import java.util.ArrayList;
import java.util.stream.Stream;

public class main {

    public static void main(String[] args) {
       Stream<String> stream1 = Stream.of("Curso de programacion");
       
       stream1.forEach(n-> System.out.println(n));
       
        System.out.println("******************************");
       
       Stream<String> stream2 = Stream.of("curso 1","curso 2","curso 3","curso 4","curso 5");
       
       stream2.forEach(System.out::println);
       
       System.out.println("******************************");
       
       String [ ] arreglo = {"java","php","c#","python"};
       
       Stream<String> stream3 = Stream.of(arreglo);
       
       stream3.forEach(System.out::println);
       
       System.out.println("******************************");
       //creacion de Stream de estuadiante y se instacia la clase dentro del stream
       Stream<Estudiantes> streamEstudiante = Stream.<Estudiantes>builder()
               .add(new Estudiantes("1",27,165,63))
               .add(new Estudiantes("2",24,168,65))
               .add(new Estudiantes("3",24,168,59))
               .add(new Estudiantes("3",25,162,67))
               .build();
       
       
       System.out.println("******************************");

       streamEstudiante.forEach(estudiante -> System.out.println("estudiante "+estudiante.getIdentificacion() +" edad "+ estudiante.getEdad() ));
       
        
        
        
  
       
       
        
       
    }
    
}
