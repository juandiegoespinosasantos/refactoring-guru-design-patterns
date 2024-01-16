package org.example.design_patterns.behavioral.iterator.profile;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Data;

/**
 * @author juandiegoespinosasantos@gmail.com
 * @version Jan 15, 2024
 * @see <a href="https://refactoring.guru/design-patterns/iterator">https://refactoring.guru/design-patterns/iterator</a>
 * @since 17
 */
@Data
public class Profile {

    private String name;
    private String email;
    private Map<String, List<String>> contacts = new HashMap<>();

    public Profile(String email, String name, String... contacts) {
        this.email = email;
        this.name = name;

        // Parse contact list from a set of "friend:email@gmail.com" pairs.
        for (String contact : contacts) {
            String[] parts = contact.split(":");
            String contactType = "friend";
            String contactEmail;

            if (parts.length == 1) {
                contactEmail = parts[0];
            } else {
                contactType = parts[0];
                contactEmail = parts[1];
            }

            if (!this.contacts.containsKey(contactType)) this.contacts.put(contactType, new ArrayList<>());

            this.contacts.get(contactType).add(contactEmail);
        }
    }

    public List<String> getContacts(final String contactType) {
        if (!this.contacts.containsKey(contactType)) this.contacts.put(contactType, new ArrayList<>());

        return contacts.get(contactType);
    }
}