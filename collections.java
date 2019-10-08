import java.util.*;

public class Main_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//Une liste chaînée : LinkedList
		int i = 0;
		List list1 = new LinkedList();
		list1.add(12);
		list1.add("Chaîne");
		list1.add(0b111011);
		
		for(var l : list1)
			System.out.println("Eléments  :  " + l);
		
		System.out.println("\n \tParcours avec un itérateur ");
	    System.out.println("-----------------------------------");
	    ListIterator iterateur = list1.listIterator();
	    
	    while(iterateur.hasNext())
	    	System.out.println(iterateur.next());
	    
		//L'objet ArrayList
	    
	    List list2 = new ArrayList();
	    list2.add("Bienvenue");
	    list2.add(true);
	    list2.add(null);
	    
	    iterateur = list2.listIterator();
	    System.out.println("\tArrayList : ");
	    while(iterateur.hasNext())
	    	System.out.println(iterateur.next());
	    
	    /*
	     * Collection Map
	     */
	    
	    //Objet Hashtable
	    
	    Hashtable ht = new Hashtable();
	    
	    ht.put(1,true);
	    ht.put(32,"Steve-R");
	    ht.put(2,0xff);
	    
	    
	    Enumeration it = ht.elements(); //Notre enumeration pourra parcourir notre table
	    
	    System.out.println("\tHashtable : ");
	    while(it.hasMoreElements())
	    	System.out.println(it.nextElement());
	     
	    //L'objet HashMap
	    
	    System.out.println("\tHashMap : (presque équivalent à Hashtable) (N'est pas itérable !) ");
	    System.out.println("Sauf qu'il n'est pas Tread Safe et accepte la valeur null ");
	    
	    HashMap map = new HashMap();
	    map.put(3,"Une HashMap !");
	    
    	System.out.println(map.get(3));
    	
    	/*
    	 * Les Objets Set (Collection qui n'accepte pas de doublon)
    	 */
    	
    	//L'objet HashSet
    	
    	System.out.println("\tHashSet : ");
    	
    	HashSet hs = new HashSet();
    	hs.add("Mr");
    	hs.add("Mde");
    	hs.add(18 + "ans");
    	
    	Object[] obj = hs.toArray(); //On extrait un tableau d'Object
    	for(Object o : obj)
    		System.out.println(o);
    	
    	
    	System.out.println("Parcours avec un Iterator ! ");
    	Iterator ite = hs.iterator();
    	
    	while(ite.hasNext())
    		System.out.println(ite.next());
	    
	    sc.close();
		
		
	}

}  
