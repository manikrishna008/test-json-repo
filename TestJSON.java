import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
public class TestJSON {
	public static void main(String[] args){
			LinkedHashMap <String,Double> Import1=new < String,Double>LinkedHashMap();
				    // add grocery items in import rate;
			Import1.put("potato", (double) 20);
			Import1.put("brinjal", (double) 15);
			Import1.put("bitter gourd",(double) 18);
			Import1.put("ladies",(double) 21);
			Import1.put("onion",(double) 95);
			Set s1=Import1.keySet();
			Collection c1=Import1.values();
			Set s2=Import1.entrySet();
			Iterator i=s2.iterator();
			System.out.println(" Import rate :");
			while(i.hasNext()){
						//upcasting 
					Map.Entry me1=(Map.Entry)i.next();
									// update the values 
					if(me1.getKey().equals("potato")){
						me1.setValue(15);
						System.out.println(" Vegitable name (Potato) ="+me1.getValue());
					}
					else if(me1.getKey().equals("brinjal")){
						me1.setValue(8);
						System.out.println(" vegitable name (Brinjal ) ="+me1.getValue());
					}
					else if(me1.getKey().equals("bitter gourd")){
						me1.setValue(9);
						System.out.println(" Vegitable name (Bitter Gourd) ="+me1.getValue());
					}
					else if(me1.getKey().equals("ladies")){
						me1.setValue(10);
						System.out.println(" Vegitable name (Ladies Finger ) ="+me1.getValue());
					}
					else if(me1.getKey().equals("onion")){
						me1.setValue(75);
						System.out.println(" Vegitable name (Onion) ="+me1.getValue());
					}
			}
			LinkedHashMap <String,Double> Export1=new <String,Double>LinkedHashMap();
			     // we add export item rate 
			Export1.put("potato", (double) 60);
			Export1.put("brinjal", (double) 45);
			Export1.put("bitter gourd",(double) 55);
			Export1.put("ladies",(double) 60);
			Export1.put("onion",(double) 275);
			Set st1=Export1.keySet();
			Collection cc1=Export1.values();
			Set st2=Export1.entrySet();     
			Iterator i2=st2.iterator();
			System.out.println(" Export Rate :");
			while(i2.hasNext()){
					Map.Entry me= (Map.Entry)i2.next();
				if(me.getKey().equals("potato")){
					me.setValue(66);
					System.out.println(" Vegitable name (Potato) ="+me.getValue());
				}
				else if(me.getKey().equals("brinjal")){
					me.setValue(49.50);
					System.out.println(" Vegitable name (brinjal) ="+me.getValue());
				}
				else if(me.getKey().equals("bitter gourd")){
					me.setValue(61.50);
					System.out.println(" Vegitable name (Bitter Gourd) ="+me.getValue());
				}
				else if(me.getKey().equals("ladies")){
					me.setValue(66);
					System.out.println(" Vegitable name (Ladies finger) ="+me.getValue());
				}
				else if(me.getKey().equals("onion")){
					me.setValue(302.5);
					System.out.println(" Vegitable name (Onion) ="+me.getValue());
				}				
			}
	}
}