package com.programacion.funcional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TestPF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("#### Hola Java 8 #### "+"\n");
		System.out.print("#### Collection SET #### "+"\n");
		//Collection SET...
		final Set hashSet = new HashSet();
		final Long startHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
		    hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		//System.out.println("Time spent by HashSet: " + (endHashSetTime - startHashSetTime));
		
		final Set treeSet = new TreeSet();
		final Long startTreeSetTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
		    treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		//System.out.println("Time spent by TreeSet: " + (endTreeSetTime - startTreeSetTime));
		 
		final Set linkedHashSet = new LinkedHashSet();
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
		    linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		//System.out.println("Time spent by LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
		System.out.print("#### Collection LIST #### "+"\n");
		ArrayList arrayList = new ArrayList();
		final Long startArrayListTime = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
		    arrayList.add(i);
		}
		final Long endArrayListTime = System.currentTimeMillis();
		//System.out.println("Time spent by ArrayList: " + (endArrayListTime - startArrayListTime));	
		LinkedList linkedList = new LinkedList();
		
		final Map hashMap = new HashMap();
		final Map treeMap = new TreeMap();
		final Map linkedHashMap = new LinkedHashMap();
		
		 Map<Integer, String> HOSTING = new HashMap();
	       
	        HOSTING.put(1, "linode.com");
	        HOSTING.put(2, "heroku.com");
	        HOSTING.put(3, "digitalocean.com");
	        HOSTING.put(4, "aws.amazon.com");
	        
	
	     //System.out.print("Out Map Valor: "+ HOSTING.get(1)+"\n");
	        
	     System.out.print("#### STREAM ArrayList #### "+"\n");
	    
	     List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
	     List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
	     //strings.forEach(System.out::println);
	     System.out.print("#### forEach #### "+"\n");
	    // Random random = new Random();
	    // random.ints().limit(4).forEach(System.out::println);
	     
	     List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
	     //get list of unique squares
	     //numbers.forEach(System.out::println);
	     final Long startsquareListTime = System.currentTimeMillis();
	     List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());
	     final Long endsquareListTime = System.currentTimeMillis();
	     //System.out.println("Time spent by List Stream: " + (endsquareListTime - startsquareListTime));
	     //squaresList.forEach(System.out::println);
		 //System.out.print("\n");
		 List<Integer> squaresListFilter = squaresList.stream().filter(Integer -> Integer.equals(25)).collect(Collectors.toList());
		 //squaresListFilter.forEach(System.out::println);
		 
		 List<String> strings_para = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		 //get count of empty string
		 long count = strings_para.parallelStream().filter(string -> !string.isEmpty()).count();
		 //System.out.println(count);
		 
		 System.out.print("#### STREAM MAPS #### "+"\n");
		 
		 //Map -> Stream -> Filter -> Map
	     final int a=2;
		 Map<Integer, String> collect1 = HOSTING.entrySet().stream()
	                .filter(map -> map.getKey() == a)
	                .collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
	     //System.out.print(collect1.get(a)+"\n");

	     Map<Integer, String> collect2 = HOSTING.entrySet().stream()
	                .filter(map -> map.getKey() <= 3)
	                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

	     //System.out.println(collect2+"\n");
	   //HashMap -> Bolsa de Servidores
	        Map<Integer, String> SERVIDOR = new HashMap<>();
	        
	        SERVIDOR.put(1, "SMTP");
	        SERVIDOR.put(2, "WebApp");
	        SERVIDOR.put(3, "MovilApp");
	        SERVIDOR.put(4, "RDS");
	        
	        Map<Integer,String> collect3 = SERVIDOR.entrySet().stream()
	        		.filter(map -> (map.getKey() > 2 && map.getKey() <= 4))
	        		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	        
	        //System.out.print(collect3.get(3));
	        
	        System.out.print("#######ParallelStream#######");
	        int total=0;
	        /*long numero1=System.currentTimeMillis();
	        for (int j=0; j<10 ; j++) {
	            total+=duplicar(j);
	            //System.out.print("-"+total);
	        }
	        long numero2=System.currentTimeMillis();
	        //System.out.println("\n"+(numero2-numero1));
	        //System.out.println(total);
	       
	        long numero3=System.currentTimeMillis();
	        IntStream lista2= IntStream.range(1, 10);
	        int total2=lista2.map(TestPF::duplicar).sum();
	        long numero4=System.currentTimeMillis();*/
	        //System.out.println("\n"+(numero4-numero3));
	        //System.out.println(total2);
	        Map<String, String> books = new HashMap<>();
	        books.put("978-0201633610", "Design patterns : elements of reusable object-oriented software");
	        books.put("978-1617291999", "Java 8 in Action: Lambdas, Streams, and functional-style programming");
	        books.put("978-0134685991", "Effective Java");
	        books.put("978-0321356680", "Effective Java: Second Edition");

	       // System.out.print("\n"+books.get("978-0201633610"));
	        
	        Optional<String> optionalIsbn = books.entrySet().stream()
	        		  .filter(e -> "Effective Java".equals(e.getValue()))
	        		  .map(Map.Entry::getKey)
	        		  .findFirst();
	       // System.out.print("\n"+optionalIsbn.get());
	        
	        List<String> isbnCodes = books.entrySet().stream()
	        		  .filter(e -> e.getValue().startsWith("Effective Java"))
	        		  .map(Map.Entry::getKey)
	        		  .collect(Collectors.toList());
	        
	        //isbnCodes.forEach(System.out::println);
	        
	        ServicioPersonas sp= new ServicioPersonas();
	        Optional<Persona> op=sp.buscar("medea");
	        if (op.isPresent()) {
	       // System.out.println("\n"+op.get().getNombre());
	        }else { 
	       // System.out.println("\n"+"no hay registros");
	        }
	       
	        List<String> titles = books.entrySet().stream()
	        		.filter(e -> e.getKey().startsWith("978-0"))
	        		.map(Map.Entry::getValue)
	        		.collect(Collectors.toList());
	        
	       // titles.forEach(System.out::println);
	        titles.forEach((p) -> {
	        	System.out.print("\n");
	        	System.out.print(p);
	        });
	  
	        
	        Set<Cliente> hashCliente = new HashSet<Cliente>();
		       
		    ArrayList<Cliente> arraycls = new ArrayList<Cliente>();
		    Cliente cl1 = new Cliente("Jorge Rios", "12343","Calle 10","314543");
		    Cliente cl2 = new Cliente("Allan Poo", "65646","Calle 11","314543");
		    arraycls.add(cl1);
		    arraycls.add(cl2);
		    
		    //System.out.print("\n"+arraycls);
		    System.out.print("\n"+"#######Recorridos con Stream#######");
		    for (Cliente cl: arraycls) {
		    	System.out.print("\n");   
		    	System.out.print(cl.nid + " - "+ cl.fullname);
		    }
		    
		    arraycls.stream().forEach((p) -> {
		    	System.out.print("\n");   
		    	System.out.print(p.getFullname()+ " "+p.getNid()+" "+p.getTelefono());
		    	   
		    	   });
	
	}
	
public static  int duplicar( int numero) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return numero*2;
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
