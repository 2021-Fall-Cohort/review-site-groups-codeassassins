package org.wecancodeit.reviews;

import org.springframework.stereotype.Repository;
import org.wecancodeit.reviews.model.Phone;

import java.util.HashMap;

@Repository
public class PhoneList {

    HashMap<String, Phone> phones;

    public PhoneList() {
       Phone phone1 = new Phone ("Samsung", "Flip Phone", "Z-Flip","Samsung","$$$");
       Phone phone2 = new Phone ("Apple","Smart Phone", "iPhone 12 Pro Max", "Apple", "$$$$");
       Phone phone3 = new Phone("Motorola", "Flip Phone", "Razr", "Motorola","$$");
       phones.put(phone1.getName(), phone1 );
       phones.put(phone2.getName(), phone2);
       phones.put(phone3.getName(),phone3);

    }

    public HashMap<String, Phone> getPhoneList() {

        return phones;
    }
}
