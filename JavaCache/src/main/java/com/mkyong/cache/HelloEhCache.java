
package com.mkyong.cache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;
import net.sf.ehcache.Element;

public class HelloEhCache{
	
	public static void main(String[] args) throws InterruptedException {
		//use the Runtime to get a rough estimation of memory cost as a whole 
		
		//long startMemory = Runtime.getRuntime().totalMemory(); 
		//Modifique esta linea
		//Modifique esta otra linea
		//1. Create a cache manager
		CacheManager cm = CacheManager.newInstance();
		
		//2. Get a cache called "cache1", declared in ehcache.xml
		Cache cache = cm.getCache("cache1");
		
		//3. Put few elements in cache
		for (int i=0; i<9999; i++){
		cache.put(new Element(""+i+"","ABC"+i));
	
		}
		
		//4. Get element from cache
		Element ele = cache.get("2");
		
		//5. Print out the element
		String output = (ele == null ? null : ele.getObjectValue().toString());
		System.out.println(output);
		
		//6. Is key in cache?
		System.out.println(cache.isKeyInCache("3"));
		System.out.println(cache.isKeyInCache("10"));
		
		//long endMemory = Runtime.getRuntime().totalMemory(); 
		//System.out.println("Memory used: " + ((endMemory - startMemory) / 1000000) + " MBytes"); 
		System.out.println();
		
		Thread.sleep(10000);
		
		
		
		//7. shut down the cache manager
		cm.shutdown();
	}
	
}
