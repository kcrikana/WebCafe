package kr.mjc.minbeom.java.lambdaexception;

import java.util.ArrayList;
import java.util.List;

public class PersonEx {
    public void printPersons(List<Person> roster, CheckPerson checkPerson) {
        for(Person person : roster) {
            if(checkPerson.test(person))
                System.out.println(person.toString());
        }
    }
    
    public void go() {
        Person p1 = new Person("아이유", 1993, "iu@gmail.com");
        Person p2 = new Person("이선균", 1975, "sun@naver.com");
        Person p3 = new Person("이지아", 1978, "lee@naver.com");
        
        List<Person> roster = new ArrayList<>();
        roster.add(p1);
        roster.add(p2);
        roster.add(p3);

        // 성이 이씨인 사람 출력
        System.out.println("성이 이씨");
        printPersons(roster, new CheckPerson() {
            @Override
            public boolean test(Person p) {
                return p.getName().startsWith("이");
            }
        });

        // 1990년 이후 출생자 출력 (lambda expression 사용)
        System.out.println("1990년 이후 출생자");
        printPersons(roster, (Person p) -> p.getBirthyear() >= 1990);

        // 지메일을 사용하는 사람 출력 (lambda expression 간소화)
        System.out.println("지메일을 사용하는 사람");
        printPersons(roster, p -> p.getEmail().endsWith("gmail.com"));
    }

    public static void main(String[] args) {
        new PersonEx().go();
    }
}
