package com.dekapx.java.basics;

import com.dekapx.java.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ListAssertDemo {
    @Test
    @DisplayName("Verify All List Elements")
    public void verifyListElements() {
        Person person = getPerson();
        List<Person> people = getPersons(getPerson());

        assertThat(people).isNotEmpty().hasSize(1)
                .satisfiesAnyOf(persons -> {
                    persons.forEach(p -> {
                        assertThat(p.firstName()).isEqualTo("Foo");
                        assertThat(p.lastName()).isEqualTo("Bar");
                    });
                });
        assertThat(people)
                .contains(person)
                .filteredOn(p -> p.firstName().equals("Foo"));
    }

    private List<Person> getPersons(Person person) {
        return List.of(person);
    }

    private Person getPerson() {
        return new Person("Foo", "Bar");
    }
}
