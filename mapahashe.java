import java.util.*; 
  
public class mapahashe { 
  
    public static void main(String[] args) 
    { 
        // inicializando hashmap
        AbstractMap<Integer, String> absMap 
            = new HashMap<Integer, String>(); 
  
        
        // adicionando exemplos
        absMap.put(1, "um"); 
        absMap.put(2, "exemplo"); 
        absMap.put(3, "simples"); 
        absMap.put(4, "6"); 
  
        
        // entryset() para demonstrar o hashmap todo
        System.out.println("The Set view of the mappings:"); 
        System.out.println(absMap.entrySet()); 
    } 
}