package za.ac.cput.malikah;

import java.util.*;

/**
 * Created by Malikah Osmen on 2016-03-12.
 */
public class MyLists {
    public MyLists() {

    }

    public List<String> provinces(){

        List provinces = new ArrayList();
        provinces.add("Eastern Cape");
        provinces.add("Western Cape");
        provinces.add("Free State");
        provinces.add("Gauteng");
        provinces.add("KwaZulu-Natal");
        provinces.add("Limpopo");
        provinces.add("Mpumalanga");
        provinces.add("Northern Cape");
        provinces.add("North West");

        return provinces;
    }

    public Set<String> firstNames(){

        Set firstName = new HashSet();
        firstName.add("Gouwa");
        firstName.add("Yusrah");
        firstName.add("Salie");
        firstName.add("Malikah");
        firstName.add("Mushfeeqah");

        return firstName;
    }

    public Map<String, String> person()
    {
        Map person = new HashMap();
        person.put("1","Gouwa");
        person.put("2","Yusrah");
        person.put("3","Salie");
        person.put("4","Malikah");
        person.put("5","Mushfeeqah");

        return person;
    }
}
